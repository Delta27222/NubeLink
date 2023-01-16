/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Angel
 */
public class Buscador {
    
    public String getIP() throws UnknownHostException{
        
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
            
            return numero;
    }           
    
    
}
