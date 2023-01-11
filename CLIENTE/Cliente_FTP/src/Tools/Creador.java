/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.util.ArrayList;
import javax.swing.JComboBox;
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
    
    public void llenando_JComboBox_Nubes(JComboBox jComboBoxNubes){
        ArrayList<String> lista_nubes = new ArrayList<String>();

        //crea.add_Info_Table_Menu(model,jTable_Archivos);
        String info1 = new String("UCAB");             
        String info2 = new String("UCV");     
        String info3 = new String("UBV");     
        String info4 = new String("UNIMET");     
              
        //Sacar de algun lugar los nombres de las nubes que se encuentran disponibles
        lista_nubes.add(info1);        
        lista_nubes.add(info2);
        lista_nubes.add(info3);
        lista_nubes.add(info4);
        
        //Para poder hacer el llenado del combo box
        for (int i=0; i<lista_nubes.size();i++){            
            jComboBoxNubes.addItem(lista_nubes.get(i));
        }
    }
    
    public void llenando_JComboBox_Users(JComboBox jComboBoxUser){
        ArrayList<String> lista_users = new ArrayList<String>();

        //crea.add_Info_Table_Menu(model,jTable_Archivos);
        String info1 = new String("Angel");             
        String info2 = new String("Javier");     
        String info3 = new String("Carlos");     
        String info4 = new String("Miguel");     
              
        //Sacar de algun lugar los nombres de las nubes que se encuentran disponibles
        lista_users.add(info1);        
        lista_users.add(info2);
        lista_users.add(info3);
        lista_users.add(info4);
        
        //Para poder hacer el llenado del combo box
        for (int i=0; i<lista_users.size();i++){            
            jComboBoxUser.addItem(lista_users.get(i));
        }
    }
}
