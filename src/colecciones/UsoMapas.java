package colecciones;

import java.util.HashMap;
import java.util.Map;

public class UsoMapas {
  public static void main(String[] args) {
    HashMap<String, Empleado> listaEmpleados = new HashMap<String, Empleado>();

    listaEmpleados.put("10", new Empleado("Leo"));
    listaEmpleados.put("11", new Empleado("Juan"));
    listaEmpleados.put("12", new Empleado("Antonio"));
    listaEmpleados.put("13", new Empleado("Pedro"));

    listaEmpleados.remove("12");

    for(Map.Entry<String, Empleado> empleado : listaEmpleados.entrySet()) {
      String clave = empleado.getKey();
      Empleado emp = empleado.getValue();
      System.out.println("Clave: " + clave + "\nEmpleado: " + emp);
    }


  }
}



class Empleado{

  private String nombre;
  private double salario;

  public Empleado(String nombre) {
    this.nombre = nombre;
    this.salario = 2000;
  }

  @Override
  public String toString() {
    return "Empleado{" +
            "nombre='" + nombre + '\'' +
            ", salario=" + salario +
            '}';
  }
}