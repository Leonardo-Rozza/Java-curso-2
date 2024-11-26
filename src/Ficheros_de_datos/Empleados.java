package Ficheros_de_datos;

public class Empleados {
  public static void main(String[] args) {
    Empleados [] empleados = new Empleados [10];

    for (int i = 0; i < empleados.length; i++) {
      empleados[i] = new Empleados();
      empleados[i].trabaja();
    }
  }

  public void trabaja(){
    System.out.println("El empleado trabaja.");
  }
}
