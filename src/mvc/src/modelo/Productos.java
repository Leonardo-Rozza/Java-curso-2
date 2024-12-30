package mvc.src.modelo;

public class Productos {

  private String nombreArticulo;
  private String seccion;
  private String fecha;
  private String precio;
  private String paisOrigen;

  public Productos(){
    nombreArticulo = "";
    seccion = "";
    fecha = "";
    precio = "";
    paisOrigen = "";
  }

  public String getNombreArticulo() {
    return nombreArticulo;
  }

  public void setNombreArticulo(String nombreArticulo) {
    this.nombreArticulo = nombreArticulo;
  }

  public String getSeccion() {
    return seccion;
  }

  public void setSeccion(String seccion) {
    this.seccion = seccion;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getPrecio() {
    return precio;
  }

  public void setPrecio(String precio) {
    this.precio = precio;
  }

  public String getPaisOrigen() {
    return paisOrigen;
  }

  public void setPaisOrigen(String paisOrigen) {
    this.paisOrigen = paisOrigen;
  }
}
