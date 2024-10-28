package SerializacionObj;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializado {

    public static void main(String[] args)  {
        Administrador jefe = new Administrador("Leoanrdo", 15.000, 2014, 8, 14);
        jefe.setIncentivo(10000);

        Empleado[] personal = new Empleado[3];
        personal[0] = new Empleado("Lucy", 15.000, 2014, 8, 14);
        personal[1] = new Empleado("Marisol", 15.000, 2014, 8, 14);
        personal[2] = new Empleado("Mimi", 15.000, 2014, 8, 14);

        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("C:/Users/Leo/Desktop/JAVA/ObjetoSerializado/Empleados.txt"));
            flujoSalida.writeObject(personal);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
    class Empleado implements Serializable {
        public Empleado(String n, double s, int agno, int mes, int dia) {

            nombre = n;

            sueldo = s;

            GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);

            fechaContrato = calendario.getTime();

        }

        public String getNombre() {
            return nombre;
        }

        public double getSueldo() {
            return sueldo;
        }

        public Date getFechaContrato() {
            return fechaContrato;
        }


        public void subirSueldo(double porcentaje) {

            double aumento = sueldo * porcentaje / 100;

            sueldo += aumento;

        }

        public String toString() {

            return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;

        }

        private String nombre;

        private double sueldo;

        private Date fechaContrato;

    }

//--------------------------------------------------------------------------------------------------------

    class Administrador extends Empleado {
        private static final long serialVersionUID = 2L;

        public Administrador(String n, double s, int agno, int mes, int dia) {

            super(n, s, agno, mes, dia);

            incentivo = 0;

        }

        public double getSueldo() {

            double sueldoBase = super.getSueldo();

            return sueldoBase + incentivo;

        }

        public void setIncentivo(double b) {

            incentivo = b;
        }


        public String toString() {

            return super.toString() + " Incentivo=" + incentivo;

        }

        private double incentivo;

    }


