package ProgramacionGenerica;
import java.text.SimpleDateFormat;
import java.util.*;

public class UsoEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleados> listaEmpeados = new ArrayList<Empleados>();
        listaEmpeados.add(new Empleados("Leonardo", 2000, 2014, 10, 8));
        listaEmpeados.add(new Empleados("Leonardo", 2000, 2014, 10, 8));
        listaEmpeados.add(new Empleados("Leonardo", 2000, 2014, 10, 8));
        listaEmpeados.add(new Empleados("Leonardo", 2000, 2014, 10, 8));
        listaEmpeados.add(new Empleados("Leonardo", 2000, 2014, 10, 8));


        //Reemplazo de elemento
        //listaEmpeados.set(1, new Empleados("Iván", 1900,2010,5,3));

        //Obtener los datos del empleado.
      //  System.out.println(listaEmpeados.get(1).getDatosEmpleado());

        //Recorrer los datos del ArrayList.
//        for (Empleados empleados:
//             listaEmpeados) {
//            System.out.println(empleados.getDatosEmpleado());
//        }

        //Clonar el arrayList a un Array convencional.
//        Empleados empleadoArray[] = new Empleados[listaEmpeados.size()];
//
//        listaEmpeados.toArray(empleadoArray);
//
//        for (Empleados obj:
//             empleadoArray) {
//            System.out.println("La concha de tu madre All boys");
//        }
                            //**********************ITERADORES********************************

        Iterator <Empleados> iteratorEmpleados = listaEmpeados.iterator();
        while (iteratorEmpleados.hasNext()) System.out.println(iteratorEmpleados.next().getDatosEmpleado());
    }
}


class Empleados{
    public Empleados(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        calendario = new GregorianCalendar(agno, mes -1, dia);
        id = IdSiguiente;
        IdSiguiente ++;
    }

    public double getSueldo() {
        return sueldo;
    }

    public GregorianCalendar getCalendario() {
        return calendario;
    }

    public String getDatosEmpleado(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "El empleado " + nombre + " tiene un sueldo de " + sueldo +
                " y su fecha de ingreso es " + sdf.format(calendario.getTime());
    }


    public static String getIdSiguiente (){
        return "El ID siguiente Empleado es " + IdSiguiente;
    }

    private String nombre;
    private double sueldo;
    private GregorianCalendar calendario;
    private int id = 0;
    private static int IdSiguiente = 1;

}
