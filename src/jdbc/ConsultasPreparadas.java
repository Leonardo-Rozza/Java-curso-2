package jdbc;

import java.sql.*;
/*
public class ConsultasPreparadas {
  public static void main(String[] args) {
    try {

      //1. Crear Conexión.
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_db","user","user_password");

      //2. Crear el preparesStatement
      String sentenciaSql = "select `CÓDIGO ARTÍCULO`, `NOMBRE ARTÍCULO`, `PRECIO`, `PAÍS DE ORIGEN` from productos where SECCIÓN=? AND `PAÍS DE ORIGEN`=?";

      PreparedStatement preparedStatement = connection.prepareStatement(sentenciaSql);
      preparedStatement.setString(1,"DEPORTES");
      preparedStatement.setString(2,"usa");

      //3. Ejecutar la instruccion SQL
      ResultSet resultSet = preparedStatement.executeQuery();

      //4. Recorrer el resultSet
      while(resultSet.next()){
        System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " "
                + resultSet.getString(3)  + " " + resultSet.getString(4));
      }

      connection.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }
}
*/