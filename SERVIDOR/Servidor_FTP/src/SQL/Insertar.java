
package SQL;

import Tools.Buscador;
import View.cargando;
import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Insertar {
    
    public boolean insertUser(String value){            
        boolean guardado = true;
        try {
            SQLConnection conexion= new SQLConnection();
            Connection con = conexion.connected();  
            java.sql.Statement st = con.createStatement();
            String sql = "INSERT INTO `USERS` (`ID_STORAGE`, `ROL`, `USERNAME`, `PASSWORD`) VALUES("+value+")";       
            
            st.execute(sql);
            st.close();
            con.close();
            //JOptionPane.showMessageDialog(null, "La nube se ha creado con exito", "Completado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            guardado = false;
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya se encuentra registrado en el sistema", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return guardado;
    }
    
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
                                                        //Timer para mostrar cargasion
                                                        cargando open = null;
                                                        open = new cargando(5);
                                                        open.setVisible(true);
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
                                                        //Timer para mostrar cargasion
                                                        cargando open = null;
                                                        open = new cargando(5);
                                                        open.setVisible(true);        
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
