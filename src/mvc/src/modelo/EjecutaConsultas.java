package mvc.src.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjecutaConsultas {

  private String seleccion;
  private Connection miConexion;
  private ResultSet rs;
  private PreparedStatement enviaConsulta;
  private final String CONSULTASECCION = "select NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN from productos where SECCION = ?";

  public EjecutaConsultas() {
    miConexion = new Conexion().getConnection();
  }




  public ResultSet consultaBBDD(String seccion, String pais ) {
    seleccion = "";

    try {
    if (!seccion.equals("Todas") && pais.equals("Todos")) {

        enviaConsulta = miConexion.prepareStatement(CONSULTASECCION);
        enviaConsulta.setString(1, seccion);

        rs = enviaConsulta.executeQuery();


    } else if (seccion.equals("Todas") && !pais.equals("Todos")) {
      seleccion = "Has escogido un pais";
    } else {
      seleccion = "Has escogido una seccion y un pais";
    }} catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return rs;
  }

}
