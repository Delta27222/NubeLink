
package SQL;

import Model.Cloud;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Select {
    
    public ArrayList<Cloud> Clouds() {
        Statement st;
        ArrayList<Cloud> clouds = new ArrayList<Cloud>();
        SQLConnection con = new SQLConnection();

        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("select * from CLOUD");
            while (rs.next()) {
                clouds.add(new Cloud(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
            }
            st.close();
            con.disconnect();
            return clouds;
        } catch (Exception e) {
            con.disconnect();
            return null;
        }
    }
    
    
}
