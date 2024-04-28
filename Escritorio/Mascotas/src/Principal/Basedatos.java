package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Basedatos {

    Connection conexion;
    Statement manipularDB; //
    String hostname;
    String puerto;
    String databasename;
    String user;
    String password;

    public Basedatos() {

        String hostName = "127.0.0.1";//10.199.208.30
        puerto = "3306";
        databasename = "mascotas";
        user = "root";
        password = "";

        String url = "jdbc:mysql://" + hostName + ":" + puerto + "/" + databasename;

        try {
            conexion = DriverManager.getConnection(url, user, password);// le mandamos la url usuario contraseña etamaos mandando rut y contraseña vacia 
            manipularDB = conexion.createStatement();///si todo sale bien llega asta el System.out.println("Conexion Exitosa a Base de Datos "+databasename); si no se va por el catch
            System.out.println("Conexion Exitosa a Base de Datos " + databasename);
        } catch (SQLException ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());

        }
    }
}
