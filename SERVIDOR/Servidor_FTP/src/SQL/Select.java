
package SQL;

import Model.Cloud;
import Model.Users;
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
    
    public ArrayList<Users> Users() {
        Statement st;
        ArrayList<Users> users = new ArrayList<Users>();
        SQLConnection con = new SQLConnection();

        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("SELECT U.*, L.FECHA FROM USERS U LEFT JOIN ( SELECT ID_USER, MAX(F_INIT) FECHA FROM LOG GROUP BY ID_USER ) L ON L.ID_USER = U.ID ORDER BY L.FECHA DESC");
            while (rs.next()) {
                users.add(new Users(rs.getInt(1), rs.getString(2)+" GB",rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
            st.close();
            con.disconnect();
            return users;
        } catch (Exception e) {
            con.disconnect();
            return null;
        }
    }
    
        public String getCloudName(String ip_address){
        String cloudName="La IP no se encuentra registrada como nube.";
        Statement st;
        SQLConnection con = new SQLConnection();
        
        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("select NAME from CLOUD where IP_ADDRESS = '"+ip_address+"'");
            if (rs.next()) {
                cloudName = rs.getString(1);
            }
            st.close();
            con.disconnect();
            return cloudName;
        } catch (Exception e) {
            con.disconnect();
            return cloudName;
        }
    }
        
        public ArrayList<String> getStorages(){
        Statement st;
        SQLConnection con = new SQLConnection();
        ArrayList<String> storages = new ArrayList<String>();
        
        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("select * from STORAGE_SIZE");
            while (rs.next()) {
                storages.add(rs.getString(1)+" GB");
            }
            st.close();
            con.disconnect();
            return storages;
        } catch (Exception e) {
            con.disconnect();
            return storages;
            }
        }
        
        public String getCloudStatus(String ip_address){
        String cloudName="";
        Statement st;
        SQLConnection con = new SQLConnection();
        
        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("select t_status from CLOUD where IP_ADDRESS = '"+ip_address+"'");
            if (rs.next()) {
                cloudName = rs.getString(1);
            }
            st.close();
            con.disconnect();
            return cloudName;
        } catch (Exception e) {
            con.disconnect();
            return cloudName;
        }
    }
        public ArrayList<String> searchUsers(){
            ArrayList<String> users = new ArrayList<String>();
            Statement st;
            SQLConnection con = new SQLConnection();
            try {
                st = con.connected().createStatement();
                ResultSet rs = st.executeQuery("select username from USERS");
                while (rs.next()) {
                    users.add(rs.getString(1));
                }

                st.close();
                con.disconnect();
                return users;
            } catch (Exception e) {
                con.disconnect();
                return users;
            }
        }
        
        public String searchRuta(String direccion_ip){
            String file_path="";
            Statement st;
            SQLConnection con = new SQLConnection();
            try {
                st = con.connected().createStatement();
                ResultSet rs = st.executeQuery("select REMOTE_FILE_PATH from CLOUD "
                                                                        + "WHERE IP_ADDRESS = '"+direccion_ip+"'");
                if (rs.next()) {
                    file_path=rs.getString(1);
                }
                st.close();
                con.disconnect();
                file_path.replace("/","\\");
                return file_path;
            } catch (Exception e) {
                con.disconnect();
                return file_path;
            }
        }
   
}
