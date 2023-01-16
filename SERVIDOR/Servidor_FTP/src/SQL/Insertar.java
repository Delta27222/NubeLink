
package SQL;

import Tools.Buscador;
import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Insertar {
    
    
    
    public boolean insertCloud(String value){            
        boolean guardado = true;
        try {
            SQLConnection conexion= new SQLConnection();
            Connection con = conexion.connected();  
            java.sql.Statement st = con.createStatement();
            String sql = "insert into CLOUD (name, IP_ADDRESS, USERNAME, PASSWORD, REMOTE_FILE_PATH, T_STATUS) values("+value+")";       
            
            st.execute(sql);
            st.close();
            con.close();
            JOptionPane.showMessageDialog(null, "La nube se ha creado con exito", "Completado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            guardado = false;
            JOptionPane.showMessageDialog(null, "La direccion IP ya posee una nube creada.");
        }
        return guardado;
    }
    
    
    public void onServer(){
        Buscador bs = new Buscador();
        try {
            SQLConnection conexion= new SQLConnection();
            Connection con = conexion.connected();  
            java.sql.Statement st = con.createStatement();
            String sql = "update CLOUD set t_status = 'ON' where IP_ADDRESS = '"+bs.getIP()+"'";       
            
            st.execute(sql);
            st.close();
            con.close();
            JOptionPane.showMessageDialog(null, "La nube se ha activado con exito", "Completado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
 
            JOptionPane.showMessageDialog(null, "La nube ya se encuentra activa.");
        }
    }
    
    public void offServer(){
        Buscador bs = new Buscador();
        try {
            SQLConnection conexion= new SQLConnection();
            Connection con = conexion.connected();  
            java.sql.Statement st = con.createStatement();
            String sql = "update CLOUD set t_status = 'OFF' where IP_ADDRESS = '"+bs.getIP()+"'";       
            
            st.execute(sql);
            st.close();
            con.close();
            JOptionPane.showMessageDialog(null, "La nube se ha desactivado con exito", "Completado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
 
            JOptionPane.showMessageDialog(null, "La nube ya se encuentra desactiva.");
        }
    }
}
