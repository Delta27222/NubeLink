
package SQL;

import Model.Cloud;
import Model.FilesFolder;
import Model.LogConnection;
import Model.Users;
import Tools.Buscador;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Select {
    
    public ArrayList<FilesFolder> filesFolder(String username, String NOMBRE_NUBE){
        ArrayList<FilesFolder> lista = new ArrayList<FilesFolder>();
        Statement st;
        SQLConnection con = new SQLConnection();
        try {
            st = con.connected().createStatement();
            String sql = "SELECT * FROM `FILE` WHERE ID_USER = (SELECT ID FROM USERS WHERE username='"+username+"') AND ID_CLOUD = (SELECT ID FROM CLOUD WHERE NAME = '"+NOMBRE_NUBE+"')";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(new FilesFolder(Integer.parseInt(rs.getString(1)),Integer.parseInt(rs.getString(2)),
                        Integer.parseInt(rs.getString(3)),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
            st.close();
            con.disconnect();

            
        } catch (Exception e) {
            con.disconnect();
            
        }
        return lista;
    }
    
    public int Login(String username, String password){
        Insertar in = new Insertar();
        Statement st;
        SQLConnection con = new SQLConnection();
        int response = 0;
        try {
            st = con.connected().createStatement();
            String sql = "select * from USERS WHERE USERNAME ='"+username.toUpperCase()+"' AND PASSWORD = '"+password+"' and ROL = 'admin'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
               new Users(rs.getInt(1), rs.getString(2)+" GB",rs.getString(3),rs.getString(4),rs.getString(5));
               response = rs.getInt(1);
               in.insertLog(String.valueOf(rs.getInt(1)));
            }else response = 0;
            
            st.close();
            con.disconnect();

            
        } catch (Exception e) {
            con.disconnect();
            
        }
        return response;
    }
    
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
    
    public ArrayList<LogConnection> reporteNormalUsers() {
        Statement st;
        ArrayList<LogConnection> logs = new ArrayList<LogConnection>();
        SQLConnection con = new SQLConnection();

        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("SELECT L.ID, S.USERNAME, L.F_INIT, L.F_FIN, L.DIFF FROM LOG L JOIN USERS S ON S.ID = L.ID_USER WHERE S.ROL = 'normal'");
            while (rs.next()) {
                logs.add(new LogConnection(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            st.close();
            con.disconnect();
            return logs;
        } catch (Exception e) {
            con.disconnect();
            return null;
        }
    }
    
    public ArrayList<LogConnection> reporteAdminUsers() {
        Statement st;
        ArrayList<LogConnection> logs = new ArrayList<LogConnection>();
        SQLConnection con = new SQLConnection();

        try {
            st = con.connected().createStatement();
            ResultSet rs = st.executeQuery("SELECT L.ID, S.USERNAME, L.F_INIT, L.F_FIN, L.DIFF FROM LOG L JOIN USERS S ON S.ID = L.ID_USER WHERE S.ROL = 'admin'");
            while (rs.next()) {
                logs.add(new LogConnection(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            st.close();
            con.disconnect();
            return logs;
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
