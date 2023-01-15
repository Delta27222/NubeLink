
package Model;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.FtpServerFactory;
import org.apache.ftpserver.ftplet.Authority;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.listener.ListenerFactory;
import org.apache.ftpserver.usermanager.impl.BaseUser;
import org.apache.ftpserver.usermanager.impl.WritePermission;

public class Cloud {
    
    private Integer ID;
    private String Name;
    private String IP_ADDRESS;
    private String USERNAME;
    private String PASSWORD;
    private String REMOTE_FILE_PATH;
    private String STATUS;

    public Cloud() {
    }

    public Cloud(Integer ID, String Name, String IP_ADDRESS, String USERNAME, String PASSWORD, String REMOTE_FILE_PATH, String STATUS) {
        this.ID = ID;
        this.Name = Name;
        this.IP_ADDRESS = IP_ADDRESS;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.REMOTE_FILE_PATH = REMOTE_FILE_PATH;
        this.STATUS = STATUS;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getIP_ADDRESS() {
        return IP_ADDRESS;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getREMOTE_FILE_PATH() {
        return REMOTE_FILE_PATH;
    }

    public String getSTATUS() {
        return STATUS;
    }

 

    public void activateServer(){
                //            Login open = null;
          //            open = new Login();
          //            open.setVisible(true);

           FtpServerFactory serverFactory = new FtpServerFactory();
           ListenerFactory factory = new ListenerFactory();

           // set the port of the listener
           factory.setPort(2221);

           // replace the default listener
           serverFactory.addListener("default", factory.createListener());
           //    String log4jConfPath = "src\\apacheftp\\log4j.properties";
           //    PropertyConfigurator.configure(log4jConfPath);
           org.apache.log4j.BasicConfigurator.configure();
           // start the server
           FtpServer server = serverFactory.createServer();    


               BaseUser user = new BaseUser();
               user.setName("test");
               user.setPassword("test");
               user.setHomeDirectory("C:/Users/Angel/Desktop/nube");
               ArrayList<Authority> authorities = new ArrayList<Authority>();
               authorities.add(new WritePermission());
               user.setAuthorities(authorities);
       //        UserManager um = userManagerFactory.createUserManager();
               try {
                   serverFactory.getUserManager().save(user);
               } catch (FtpException ex) {
                   Logger.getLogger(Servidor_FTP.class.getName()).log(Level.SEVERE, null, ex);
               }

       //        try
       //        {
       //            um.save(user1);//Save the user to the user list on the filesystem
       //        }
       //        catch (FtpException e1)
       //        {
       //            e1.printStackTrace();
       //        }
               try {
                   server.start();
               } catch (FtpException ex) {
       //            Logger.getLogger(ApacheFTP.class.getName()).log(Level.SEVERE, null, ex);
               }

    }
    
    public String addServer(String username, String password, String directiva_path, String name) throws UnknownHostException{

    //  Bloque de codigo para obtener la IP
           InetAddress address = InetAddress.getLocalHost();
            byte[] bIPAddress = address.getAddress();
            String numero = "";

            for (int x=0; x < bIPAddress.length; x++) {
                if (x > 0) {
                  numero += ".";
                  } 
                 numero += (bIPAddress[x]<0)?Integer.toString(bIPAddress[x]+256):Integer.toString(bIPAddress[x]);
         }
         System.out.println(numero);
         
         return "'"+name+"',"+"'"+numero+"',"+"'test',"+"'test',"+"'"+directiva_path+"',"+"'off'";
    }
}
