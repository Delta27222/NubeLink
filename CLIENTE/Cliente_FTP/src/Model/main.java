package Model;
import View.Login;
import SQL.SQLConnection;
import Tools.FTPConnection;
import java.io.File;
import java.io.PrintStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;

    import org.apache.commons.net.ftp.FTPClient;

public class main {
    public static void main(String[] args) throws IOException {
           SQLConnection con = new SQLConnection();
           con.connected();
    
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
    }
}