/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Angel
 */
public class Creador {
    
    Buscador bus = new Buscador();
    
    public ArrayList<Object[]> create_ArrayList_Table_Menu(){
        FTPConnection nuevo = new FTPConnection(new FTPClient(), "192.168.0.104", "Angel", "redes");
        nuevo.conectar();
        //ArrayList de los Archivos en la nube
        ArrayList<Object[]> lista_archivos = new ArrayList<Object[]>();
            //Inserta Nombre y peso de los archivos en el arrayList
            lista_archivos = nuevo.llenar_array_archivos_raiz();
        
        nuevo.desconectar();
        
        return lista_archivos;
    }
    
    public void add_Info_Table_Menu(DefaultTableModel model,JTable Table, String nombre_Nube){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Nombre Archivo","Peso", "Type"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }        
        
        ArrayList<Object[]> archivos = new  ArrayList<Object[]>();
        archivos = bus.create_ArrayList_Table_Menu(nombre_Nube);
        
        for (Object []archivo : archivos) {
            model.addRow(archivo);
        }
       Table.setModel(model);
    }
}
