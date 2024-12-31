package mvc.src.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CargaMenus {

  private Conexion miConexion;
  private ResultSet [] resultadosConsultas;

  public CargaMenus() {
    miConexion = new Conexion();
  }

  public ResultSet[] ejecutarConsulta(){

    Connection accesoBBDD = miConexion.getConnection();
    ResultSet rsSeccion = null;
    ResultSet rsPaises = null;

    try {

      Statement secciones = accesoBBDD.createStatement();
      Statement paises = accesoBBDD.createStatement();

      rsSeccion = secciones.executeQuery("select distinct seccion from productos");
      rsPaises = paises.executeQuery("select distinct paisdeorigen from productos");

    } catch (SQLException e) {
      System.out.println("Hay un error al ejecutar la conexion: " + e.getMessage());
    }

    resultadosConsultas = new ResultSet[2];
    resultadosConsultas[0] = rsSeccion;
    resultadosConsultas[1] = rsPaises;

    return resultadosConsultas;
  }


}
