package jdbc;

import java.sql.*;

public class ConectaGestion {
  public static void main(String[] args) {

    try {

      //1. Crear Conexión.
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_db","user","user_password");

      //2. crear statement.
      Statement statement = connection.createStatement();

      //3. Ejecutar instruccion SQL.
      ResultSet resultSet = statement.executeQuery("select * from productos");

      //4. Leer la tabla virtual. El resultSet.
      while (resultSet.next()) {
        System.out.println(resultSet.getString(1) +  " " + resultSet.getString("NOMBRE ARTÍCULO") );
      }

      resultSet.close();
      connection.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }
}
