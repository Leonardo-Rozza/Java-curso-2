package colecciones;

import java.util.HashSet;
import java.util.Set;

class UsoCliente{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Leonardo", "001", 2000);
        Cliente cliente2 = new Cliente("Federico", "002", 2300);
        Cliente cliente3 = new Cliente("Leopardo", "003", 2600);
        Cliente cliente4 = new Cliente("Lupita", "004", 2900);

        Set<Cliente> clientesDelBanco = new HashSet<Cliente>();

        clientesDelBanco.add(cliente1);
        clientesDelBanco.add(cliente2);
        clientesDelBanco.add(cliente3);
        clientesDelBanco.add(cliente4);

        for (Cliente clientes: clientesDelBanco){
            System.out.println(clientes.getNombre() + " " + clientes.getnCuenta() + " " + clientes.getSaldo());
        }

    }
}


public class Cliente {
    public Cliente(String nombre, String nCuenta, double saldo) {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.saldo = saldo;
    }
    public String getNombre() {
        return nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String nombre;
    private String nCuenta;
    private double saldo;
}
