
package SQL;

import Model.FilesFolder;
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
    
    public ArrayList<FilesFolder> filesFolder(int ID_USER, String NOMBRE_NUBE){
        ArrayList<FilesFolder> lista = new ArrayList<FilesFolder>();
        Statement st;
        SQLConnection con = new SQLConnection();
        try {
            st = con.connected().createStatement();
            String sql = "SELECT * FROM `FILE` WHERE ID_USER ="+ID_USER+" AND ID_CLOUD = (SELECT ID FROM CLOUD WHERE NAME = '"+NOMBRE_NUBE+"')";
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
    
    public String getRouteRemoteFile(String ip_address, String filename){
        String ruta = "";
        Statement st;
        SQLConnection con = new SQLConnection();
        try {
            st = con.connected().createStatement();
            String sql = "SELECT REMOTE_PATH FROM FILE WHERE ID_CLOUD = (SELECT ID FROM CLOUD WHERE IP_ADDRESS = '"+ip_address+"') AND NAME = '"+filename+"'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                ruta = rs.getString(1);
            }
            st.close();
            con.disconnect();

            
        } catch (Exception e) {
            con.disconnect();
            
        }
        return ruta;
        
    }
            
}
