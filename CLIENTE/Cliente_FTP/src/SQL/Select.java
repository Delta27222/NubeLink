
package SQL;

import Model.Users;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Select {
    public boolean Login(String username, String password){
        Insertar in = new Insertar();
        Statement st;
        SQLConnection con = new SQLConnection();
        boolean response = false;
        try {
            st = con.connected().createStatement();
            String sql = "select * from USERS WHERE USERNAME ='"+username.toUpperCase()+"' AND PASSWORD = '"+password+"'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
               new Users(rs.getInt(1), rs.getString(2)+" GB",rs.getString(3),rs.getString(4),rs.getString(5));
               response = true;
               in.insertLog(String.valueOf(rs.getInt(1)));
            }
            
            st.close();
            con.disconnect();

            
        } catch (Exception e) {
            con.disconnect();
            
        }
        return response;
    }
    
    public ArrayList<String> Clouds(){
        ArrayList<String> nubes = new ArrayList<String>();
        Statement st;
        SQLConnection con = new SQLConnection();
        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("select NAME from CLOUD WHERE t_status = 'ON'");
            
            while (rs.next()) {
               nubes.add(rs.getString(1));
            }
            st.close();
            con.disconnect();

            
        } catch (Exception e) {
            con.disconnect();
            
        }
        
        return nubes;
    }
    
    public String[] getCloudInfo(String cloud_name){
        Statement st;
        SQLConnection con = new SQLConnection();
        String[] info = new String[2];
        try {
            st = con.connected().createStatement();
            String sql = "select IP_ADDRESS, REMOTE_FILE_PATH from CLOUD WHERE NAME ='"+cloud_name+"'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                info[0]=rs.getString(1);
                info[1]=rs.getString(2);
            }
            
            st.close();
            con.disconnect();

            
        } catch (Exception e) {
            con.disconnect();
            
        }
        return info;
    }
            
}
