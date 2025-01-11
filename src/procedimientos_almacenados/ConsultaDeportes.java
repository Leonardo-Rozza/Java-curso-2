package procedimientos_almacenados;

import java.sql.*;

public class ConsultaDeportes {
  public static void main(String[] args) {
    try {
      Connection miConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_db", "user", "user_password");

      CallableStatement miStatement = miConn.prepareCall("{call MUESTRADEPORTES}");

      ResultSet resultado = miStatement.executeQuery();

      while (resultado.next()) {
        System.out.println(resultado.getString("SECCION") + " " +
        resultado.getString("nombrearticulo")  + " " +
        resultado.getString("precio")) ;
      }

      miStatement.close();
      miConn.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
