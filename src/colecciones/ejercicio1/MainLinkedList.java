package colecciones.ejercicio1;

import java.util.*;

public class MainLinkedList {
  public static void main(String[] args) {

    LinkedList<String> paises = new LinkedList<String>();
    LinkedList<String> capitales = new LinkedList<String>();


    paises.add("España");
    paises.add("Colombia");
    paises.add("Brasil");
    paises.add("Argentina");

    capitales.add("Madrid");
    capitales.add("Bogota");
    capitales.add("Rio de Janeiro");
    capitales.add("Buenos Aires");

    ListIterator<String> itPaises = paises.listIterator();
    ListIterator<String> itCapitales = capitales.listIterator();

    while (itCapitales.hasNext()) {
      if (itPaises.hasNext()) itPaises.next();
      itPaises.add(itCapitales.next());
    }

    itCapitales = capitales.listIterator();
    while (itCapitales.hasNext()) {
      itCapitales.next();
      if (itCapitales.hasNext()) {
        itCapitales.next();
        itCapitales.remove();
      }

    }


    System.out.println(paises);
    System.out.println(capitales);




  }
}
