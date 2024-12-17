package colecciones;

public class UsoLibro {
  public static void main(String[] args) {
    Libros libro1 = new Libros("Java SE", "Leonardo", 838929784);
    Libros libro2 = new Libros("Java EE", "Leonardo", 838929784);

  if (libro1.equals(libro2)) {
    System.out.println("Los libros son iguales");
  } else {
    System.out.println("Los libros son diferentes");
  }
  }
}
