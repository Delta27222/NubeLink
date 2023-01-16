
package SQL;

import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Insertar {
    
    
    
    public boolean guardadoPersona(String value){            
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
}
