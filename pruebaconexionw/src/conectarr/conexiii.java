package conectarr;

/**
 *
 * @author ADMIN
 */
import java.sql.*;
public class conexiii {
    //conexion al a base
    public static Connection conectarb(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/psergiobd", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " +e);
        }
        return(null);
    }
}