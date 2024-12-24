package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClientesBancarios {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Leonardo", "001", 2000);
    Cliente cliente2 = new Cliente("Federico", "002", 2300);
    Cliente cliente3 = new Cliente("Ana", "003", 2600);
    Cliente cliente4 = new Cliente("Rafael", "004", 2900);
    Cliente cliente5 = new Cliente("Lucas", "005", 2000);
    Cliente cliente6 = new Cliente("Leonardo", "001", 2000);

    Set<Cliente> clientesDelBanco = new HashSet<Cliente>();

    clientesDelBanco.add(cliente1);
    clientesDelBanco.add(cliente2);
    clientesDelBanco.add(cliente3);
    clientesDelBanco.add(cliente4);
    clientesDelBanco.add(cliente5);
    clientesDelBanco.add(cliente6);



   //Para recorrer colecciones sigue siendo mejor el bucle for each.
    Iterator<Cliente> it = clientesDelBanco.iterator();
  /*  while (it.hasNext()) {
      String nombre = it.next().getNombre();
      System.out.println(nombre);
    }
   */

    //Pero para la eliminacion es mejor usarlo con los iteradores.
    while (it.hasNext()) {
      String nombreCliente = it.next().getNombre();
      if (nombreCliente.equals("Leonardo")) it.remove();
    }

    for (Cliente clientes: clientesDelBanco){
      System.out.println("Nombre: " + clientes.getNombre() + "\nN° de cuenta: " + clientes.getnCuenta() +
              "\nSaldo: " +clientes.getSaldo() + "\n");
    }




  }
}
