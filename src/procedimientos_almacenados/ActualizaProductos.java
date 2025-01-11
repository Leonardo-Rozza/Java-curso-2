package procedimientos_almacenados;

import java.sql.*;

public class ActualizaProductos {
  public static void main(String[] args) {

    try {
      Connection miConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_db", "user", "user_password");

      CallableStatement miStatement = miConn.prepareCall("{call actualiza_articulo(?, ?)}");

      miStatement.setString(1, "200 e");
      miStatement.setString(2, "tubos");
      miStatement.execute();

      System.out.println("Actualizado exitosamente");

      miConn.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  }

