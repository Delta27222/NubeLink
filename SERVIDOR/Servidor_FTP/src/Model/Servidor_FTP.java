
package Model;

import SQL.Insertar;
import SQL.SQLConnection;
import View.Create_cloud;
import View.Login;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.FtpServerFactory;
import org.apache.ftpserver.ftplet.Authority;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.UserManager;
import org.apache.ftpserver.listener.ListenerFactory;
import org.apache.ftpserver.usermanager.impl.BaseUser;
import org.apache.ftpserver.usermanager.impl.WritePermission;
import org.apache.log4j.PropertyConfigurator;


public class Servidor_FTP {

    public static void main(String[] args) {
       SQLConnection con = new SQLConnection();
       con.connected();
//
//        Cloud nube = new Cloud();
//        
//                Insertar is = new Insertar();
//        nube.activateServer();
//        is.onServer();
//        nube.turnOffServer(nube.getServer());
//
//            Login open = null;
//            open = new Login();
//            open.setVisible(true);
//        
//        
//        
//        System.out.println("Se activo esa mielda");

//File directorio = new File("C:\\Users\\Ricardo Fanghella\\Documents\\Arduino\\Javier");
//        if (!directorio.exists()) {
//            if (directorio.mkdirs()) {
//                System.out.println("Directorio creado");
//            } else {
//                System.out.println("Error al crear directorio");
//            }
//        }
    }
}
    

