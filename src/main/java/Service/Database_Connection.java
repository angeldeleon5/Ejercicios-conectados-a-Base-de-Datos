package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_Connection {
    static public Connection queryN2 ()throws SQLException {
        String url= "jdbc:mysql://localhost:3306/universidad";
        String nombreUsuario= "root";
        String password= "niverga1286";
        Connection conexion= null;

        conexion= DriverManager.getConnection(url, nombreUsuario, password);
        return conexion;
    }
}
