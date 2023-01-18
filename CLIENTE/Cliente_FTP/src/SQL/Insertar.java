
package SQL;

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
            JOptionPane.showMessageDialog(null, "La direccion IP ya posee una nube creada.");
        }
        return guardado;
    }
    
}
