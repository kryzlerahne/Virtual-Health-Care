
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Kryzle Rahne
 */
public class connection {
    //function to connect
    public static Connection getConnection(){
    
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login_register", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
