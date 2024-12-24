package colecciones;

import java.util.*;

public class PruebaLinkList {
  public static void main(String[] args) {

    LinkedList<String> personas = new LinkedList<String>();

    personas.add("Jose");
    personas.add("Ana");
    personas.add("Bob");
    personas.add("Jack");

    System.out.println(personas.size());

    //Creamos el iterador de tipo ListIterator.
    ListIterator<String> it = personas.listIterator();

    it.next();
    it.add("Pedro");

    for (String persona : personas) {
      System.out.println(persona);
    }


  }
}
