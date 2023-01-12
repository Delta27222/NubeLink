
package Tools;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream; // Abrir y leer el fichero
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;  
import org.apache.commons.net.ftp.FTPFile;

public class FTPConnection {
    
    static FTPClient client;   
    static String ftp; 
    static String user;
    static String password;
    static String nombre = "";

    public FTPConnection(FTPClient client, String ftp, String user, String password) {
        FTPConnection.client = client;
        FTPConnection.ftp = ftp;
        FTPConnection.user = user;
        FTPConnection.password = password;
    }
    
    public FTPConnection() {}

    public boolean conectar(){
        try {
            // Conactando al servidor
            client.connect(ftp);
            System.out.println(client.getReplyString());

            // Logueado un usuario (true = pudo conectarse, false = no pudo
            // conectarse)
            boolean login = client.login(user, password);
            if (login){
                JOptionPane.showMessageDialog(null,"Conexión exitosa. Mensaje del servidor: \n"+client.getReplyString(), "Mensaje",JOptionPane.INFORMATION_MESSAGE);
                return true;
            //System.out.println(client.getReplyString());
            }else{
                JOptionPane.showMessageDialog(null,"Credenciales incorrectas.", "Error",JOptionPane.ERROR_MESSAGE);
       
            }
        } catch (IOException ioe) {
                JOptionPane.showMessageDialog(null,"Error al intentar conectar con el servidor especificado.", "Error",JOptionPane.ERROR_MESSAGE);
       
        }
        return false;
    }

    public void desconectar(){
        // Cerrando sesión
        try {
            client.logout();
            System.out.println(client.getReplyString());
            // Desconectandose con el servidor
            client.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(FTPConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void subirArchivo(String local_filepath, String remote_filename){
        String remote_working_dir_path = "C:\\Users\\Maria\\Documents\\carpetaftp";

        try {
            FileInputStream fis = new FileInputStream(local_filepath);
            client.enterLocalPassiveMode(); // IMPORTANTE!!!! 
            client.setFileType(FTP.BINARY_FILE_TYPE);
            client.changeWorkingDirectory(remote_working_dir_path);
            boolean uploadFile = client.storeFile(remote_filename,fis);

            if ( uploadFile == false ) {
                throw new Exception("Error al subir el fichero");
            }else{
                 JOptionPane.showMessageDialog(null,"El archivo "+remote_filename+" fue cargado con exito", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
       
            }
            fis.close();
        } catch (Exception eFTPClient) {
                System. out. println(eFTPClient);
        }
    }
    
    public void descargarArchivo(String remoteFile1, String localFilePath){
        try {
            client.enterLocalPassiveMode();
            client.setFileType(FTP.BINARY_FILE_TYPE);
 
             //APPROACH #1: using retrieveFile(String, OutputStream)
            //String remoteFile1 = "presupuesto.docx"; //Solo se coloca el nombre del archivo, no hace falta con la ruta completa
            File downloadFile1 = new File(localFilePath); //Donde voy a guardar el archivo
            OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1));
            boolean success = client.retrieveFile(remoteFile1, outputStream1);
            outputStream1.close();
 
            if (success) {
                System.out.println("El archivo ha sido descargado con exito");
            }else{
                System.out.println("Falla.");
            }

           
           
        }catch (IOException io){
            System.out.println(io);
        }
    }
    
    public void crearCarpeta(){
        String dirToCreate = "/upload123";
            boolean success;
        try {
            success = client.makeDirectory(dirToCreate);
        
            //showServerReply(client);
            if (success) {
                System.out.println("Successfully created directory: " + dirToCreate);
            } else {
                System.out.println("Failed to create directory. See server's reply.");
            }
            } catch (IOException ex) {
            Logger.getLogger(FTPConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Object[]> llenar_array_archivos_raiz(){
        ArrayList<Object[]> lista_archivos = new ArrayList<Object[]>();
        StringHandling localFile = new StringHandling();
        int number=0;
        
        try {
                client.enterLocalPassiveMode();
                client.setFileType(FTP.BINARY_FILE_TYPE);
                
                FTPFile[] archivos = client.listFiles();
                for (FTPFile archivo : archivos) {
                    number = number + 1;                    
                    
                    if (archivo.isFile() == true){
                        Object[]info = new Object[]{number,archivo.getName(),String.valueOf(archivo.getSize()),"Archivo"}; 
                        lista_archivos.add(info);
                    }
                    if(archivo.isDirectory()== true){
                        Object[]info = new Object[]{number,archivo.getName(),String.valueOf(archivo.getSize()),"Carpeta"};     
                        lista_archivos.add(info);
                    }
                }
                return lista_archivos;
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return lista_archivos;
    } 
}
