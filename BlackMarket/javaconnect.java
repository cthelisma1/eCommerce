
package BlackMarket;
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    Connection conn = null;
    public static Connection ConnecrDb(){
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:blackmarket.sqlite");
        return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
