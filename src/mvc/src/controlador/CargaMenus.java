package mvc.src.controlador;

import mvc.src.modelo.Conexion;
import mvc.src.modelo.Productos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CargaMenus {

  private Conexion miConexion;
  public ResultSet rsSeccion;
  private ResultSet rsPaises;

  public CargaMenus() {
    miConexion = new Conexion();
  }

  public String ejecutarConsulta(){

    Connection accesoBBDD = miConexion.getConnection();
    Productos miProducto = null;

    try {

      Statement secciones = accesoBBDD.createStatement();

      rsSeccion = secciones.executeQuery("select distinct seccion from productos");

      miProducto = new Productos();


      miProducto.setSeccion(rsSeccion.getString(1));


      //miProducto.setSeccion(rsSeccion.getString(1));


      rsSeccion.close();
      accesoBBDD.close();

    } catch (SQLException e) {
      System.out.println("Hay un error al ejecutar la conexion: " + e.getMessage());
    }

    return miProducto != null ? miProducto.getSeccion() : null;
  }


}
