package colecciones;
import java.util.*;

public class ColectionTreeSet {

  public static void main(String[] args) {

//    TreeSet<String> ordenaGente = new TreeSet<String>();
//
//    ordenaGente.add("Leonardo");
//    ordenaGente.add("Ana");
//    ordenaGente.add("Maria");
//
//    for(String gente : ordenaGente) {
//      System.out.println(gente);
//    }

    Productos comparadorPr = new Productos();
    TreeSet<Productos> ordenaProductos = new TreeSet<Productos>(comparadorPr);

    Productos producto1 = new Productos(10, "Tv");
    Productos producto2 = new Productos(8, "Decodificador");
    Productos producto3 = new Productos(4, "Celular-Iphone-14-pro");

    ordenaProductos.add(producto1);
    ordenaProductos.add(producto2);
    ordenaProductos.add(producto3);

    for(Productos producto : ordenaProductos) {
      System.out.println(producto.getDescription());
    }

  }

}

class Productos implements Comparable<Productos>, Comparator<Productos> {
  private int numeroProducto;
  private String descripcion;

  public Productos(int numeroProducto, String descripcion) {
    this.numeroProducto = numeroProducto;
    this.descripcion = descripcion;
  }

  public Productos() {
  }



  public String getDescription() {
    return this.descripcion;
  }

  @Override
  public int compareTo(Productos o) {
    return this.numeroProducto - o.numeroProducto;
  }

  @Override
  public int compare(Productos o1, Productos o2) {
    int caract1 = o1.descripcion.length();
    int caract2 = o2.descripcion.length();

    if (caract1 < caract2) return -1;
    else if (caract1 > caract2) return 1;
    else return 0;
  }
}
