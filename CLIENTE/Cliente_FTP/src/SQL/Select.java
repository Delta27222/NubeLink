
package SQL;

import Model.Users;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Select {
    public boolean Login(String username, String password){
        Statement st;
        SQLConnection con = new SQLConnection();
        boolean response = false;
        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("select * from USERS WHERE USERNAME ='"+username.toUpperCase()+"' AND PASSWORD = '"+password+"'");
            if (rs.next()) {
               new Users(rs.getInt(1), rs.getString(2)+" GB",rs.getString(3),rs.getString(4),rs.getString(5));
               response = true;
            }
            
            st.close();
            con.disconnect();

            
        } catch (Exception e) {
            con.disconnect();
            
        }
        return response;
    }
}
