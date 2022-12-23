/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.util.ArrayList;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Angel
 */
public class Buscador {
    
        
    public ArrayList<Object[]> create_ArrayList_Table_Menu(){
        FTPConnection nuevo = new FTPConnection(new FTPClient(), "192.168.0.102", "Angel", "redes");
        nuevo.conectar();
        //ArrayList de los Archivos en la nube
        ArrayList<Object[]> lista_archivos = new ArrayList<Object[]>();
            //Inserta Nombre y peso de los archivos en el arrayList
            lista_archivos = nuevo.llenar_array_archivos_raiz();
        
        nuevo.desconectar();
        
        return lista_archivos;
    }
}
