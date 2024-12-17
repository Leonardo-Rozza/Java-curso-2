package colecciones;

public class UsoLibro {
  public static void main(String[] args) {
    Libros libro1 = new Libros("Java SE", "Leonardo", 47);
    Libros libro2 = new Libros("Java EE", "Leonardo", 32);

  if (libro1.equals(libro2)) {
    System.out.println("Los libros son iguales");
    System.out.println(libro1.hashCode());
    System.out.println(libro2.hashCode());
  } else {
    System.out.println("Los libros son diferentes");
    System.out.println(libro1.hashCode());
    System.out.println(libro2.hashCode());
  }
  }
}
