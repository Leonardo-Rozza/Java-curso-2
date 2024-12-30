package mvc.src.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
  Connection miConn = null;

  public Conexion() {

  }

  public Connection getConnection() {
    try {
      miConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_db", "user", "user_password");

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return miConn;
  }
}
