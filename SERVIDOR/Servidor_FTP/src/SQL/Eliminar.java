
package SQL;

import java.sql.Statement;

public class Eliminar {
    public void deleteCloud(String ip_address){
        Statement st;
        SQLConnection con = new SQLConnection();
        try {
            st = con.connected().createStatement();
            st.executeUpdate("delete from CLOUD where IP_ADDRESS='"+ip_address+"'");
            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
