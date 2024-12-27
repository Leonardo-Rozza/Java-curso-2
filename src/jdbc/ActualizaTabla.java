package jdbc;

import java.sql.*;

public class ActualizaTabla {
    public static void main(String[] args) {

      try {

        //1. Crear Conexión.
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_db","user","user_password");

        //2. crear statement.
        Statement statement = connection.createStatement();

        //3. Crear instruccion SQL.
        // String sql = "INSERT INTO productos (`CÓDIGO ARTÍCULO`, `NOMBRE ARTÍCULO`, `PRECIO`) \n" +
        //        "VALUES ('AR42', 'PALETA PADEL', '320€')";
        //String sql = "UPDATE PRODUCTOS SET PRECIO = 70 WHERE `CÓDIGO ARTÍCULO` = 'AR42 '";
        String sql = "DELETE FROM PRODUCTOS WHERE `CÓDIGO ARTÍCULO` = 'AR42'";

        //4. Ejecutar instruccion SQL
        statement.executeUpdate(sql);

      } catch (SQLException e) {
        throw new RuntimeException(e);
      }

    }
}
