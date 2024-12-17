package colecciones;


import java.util.Objects;

public class Cliente {

    private String nombre;
    private String nCuenta;
    private double saldo;


    public Cliente(String nombre, String nCuenta, double saldo) {
      this.nombre = nombre;
      this.nCuenta = nCuenta;
      this.saldo = saldo;
    }

    public String getNombre() {
    return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getnCuenta() {
      return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
      this.nCuenta = nCuenta;
    }

    public double getSaldo() {
      return saldo;
    }

    public void setSaldo(double saldo) {
      this.saldo = saldo;
    }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Cliente cliente = (Cliente) o;
    return Objects.equals(nCuenta, cliente.nCuenta);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nCuenta);
  }
}
