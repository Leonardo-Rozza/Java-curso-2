package mvc.src.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjecutaConsultas {

  private Connection miConexion;
  private ResultSet rs;
  private PreparedStatement enviaConsulta;
  private final String CONSULTASECCION = "select NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN from productos where SECCION = ?";
  private final String CONSULTAPAISES = "select NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN from productos where paisdeorigen = ?";
  private final String CONSULTAPAISESYSECCIONES = "select NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN from productos where paisdeorigen = ? AND SECCION = ?";

  public EjecutaConsultas() {
    miConexion = new Conexion().getConnection();
  }

  public ResultSet consultaBBDD(String seccion, String pais ) {
    try {
    if (!seccion.equals("Todas") && pais.equals("Todos")) {

        enviaConsulta = miConexion.prepareStatement(CONSULTASECCION);
        enviaConsulta.setString(1, seccion);

        rs = enviaConsulta.executeQuery();


    } else if (seccion.equals("Todas") && !pais.equals("Todos")) {

      enviaConsulta = miConexion.prepareStatement(CONSULTAPAISES);
      enviaConsulta.setString(1, pais);

      rs = enviaConsulta.executeQuery();

    } else {

      enviaConsulta = miConexion.prepareStatement(CONSULTAPAISESYSECCIONES);
      enviaConsulta.setString(1, pais);
      enviaConsulta.setString(2, seccion);

      rs = enviaConsulta.executeQuery();
    }} catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return rs;
  }

}
