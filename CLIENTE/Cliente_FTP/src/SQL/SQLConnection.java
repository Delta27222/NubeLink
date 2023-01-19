
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SQLConnection {
    Connection con = null;
    String url = "jdbc:mysql://uakxgv7fr3ipyteh:xI4bsiKvF0a6hFX7njcw@b9zucnm8znqjogrqynqh-mysql.services.clever-cloud.com:3306/b9zucnm8znqjogrqynqh";
    String user = "uakxgv7fr3ipyteh";
    String pass = "xI4bsiKvF0a6hFX7njcw";
    
    public Connection connected (){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(url,user,pass);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa", "conexion",JOptionPane.INFORMATION_MESSAGE);
            
       }catch(SQLException e){
           System.out.println("Error sql: "+e.getMessage());
            //JOptionPane.showMessageDialog(null, "Conexion no exitosa", "conexion",JOptionPane.INFORMATION_MESSAGE);
            
       }catch (Exception e){
           System.out.println("Error: "+e.getMessage());
           //JOptionPane.showMessageDialog(null, "Conexion no exitosa 2", "conexion",JOptionPane.INFORMATION_MESSAGE);
            
       }
        return con;
    }
    
    public void disconnect(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconexion exitosa", "conexion",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Desconexion fallida", "conexion",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
