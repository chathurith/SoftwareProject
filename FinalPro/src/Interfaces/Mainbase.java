
package Interfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pct
 */
public class Mainbase {
   //connect database
    public static Connection getConnection(){
    
    Connection con = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/finalpro","root","");
       } catch (ClassNotFoundException | SQLException ex) {
        System.out.println(ex.getMessage());
       }
    
    return con;
    
    }

   public static Connection getConnection(String jdbcmysqllocalhostfinallogin, String root, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
