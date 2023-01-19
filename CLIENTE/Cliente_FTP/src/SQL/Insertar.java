
package SQL;

import Model.Users;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Insertar {
    
    public boolean insertLog(String ID_USER){            
        boolean guardado = true;
        try {
            SQLConnection conexion= new SQLConnection();
            Connection con = conexion.connected();  
            java.sql.Statement st = con.createStatement();
            String sql = "INSERT INTO `LOG`(`ID_USER`, `F_INIT`) VALUES ("+ID_USER+",(SELECT DATE_SUB(SYSDATE(), INTERVAL 4 HOUR)))";       
            
            st.execute(sql);
            st.close();
            con.close();
            //JOptionPane.showMessageDialog(null, "La nube se ha creado con exito", "Completado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            guardado = false;
            JOptionPane.showMessageDialog(null, "Ocurrio un error al registrar el archivo.");
        }
        return guardado;
    }
    
    public boolean insertF_fin(int ID_USER){            
        boolean guardado = true;
        try {
            SQLConnection conexion= new SQLConnection();
            Connection con = conexion.connected();  
            java.sql.Statement st = con.createStatement();
            String sql = "UPDATE LOG SET F_FIN = (SELECT DATE_SUB(SYSDATE(), INTERVAL 4 HOUR)), DIFF= (select SEC_TO_TIME(TIMESTAMPDIFF(SECOND,f_init,F_FIN))) WHERE ID_USER = "+ID_USER+" ORDER BY F_INIT DESC LIMIT 1";       
            
            st.execute(sql);
            st.close();
            con.close();
            //JOptionPane.showMessageDialog(null, "La nube se ha creado con exito", "Completado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            guardado = false;
            JOptionPane.showMessageDialog(null, "Ocurrio un error al registrar el archivo.");
        }
        return guardado;
    }
    
    public boolean insertFile(String file_path, String ip, String filename){            
        boolean guardado = true;
        try {
            SQLConnection conexion= new SQLConnection();
            Connection con = conexion.connected();  
            java.sql.Statement st = con.createStatement();
            String sql = "INSERT INTO `FILE`(`ID_USER`, `ID_CLOUD`, `NAME`, `SIZE`, `REMOTE_PATH`) VALUES ("+Users.getID()+",(SELECT ID FROM CLOUD WHERE IP_ADDRESS = '"+ip+"'),'"+filename+"',10,'"+file_path+"')";       
            
            st.execute(sql);
            st.close();
            con.close();
            //JOptionPane.showMessageDialog(null, "La nube se ha creado con exito", "Completado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            guardado = false;
            JOptionPane.showMessageDialog(null, "La direccion IP ya posee una nube creada.");
        }
        return guardado;
    }
    
}
