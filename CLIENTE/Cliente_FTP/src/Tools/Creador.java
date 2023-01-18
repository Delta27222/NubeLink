/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import SQL.Select;
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
    
    public void add_Info_Table_Menu(DefaultTableModel model,JTable Table, String nombre_Nube, String ip_number, String userName, String contrasena){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Id","Nombre Archivo","Peso (Kb)", "Tipo"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }        
        
        ArrayList<Object[]> archivos = new  ArrayList<Object[]>();
        archivos = bus.create_ArrayList_Table_Menu(nombre_Nube, ip_number, userName, contrasena);
        int numero = 0;
        for (Object []archivo : archivos) {
            model.addRow(archivo);
            numero = numero + 1;
        }
       Table.setModel(model);
    }
    
    public void llenando_JComboBox_Nubes(JComboBox jComboBoxNubes){
        ArrayList<String> lista_nubes = new ArrayList<String>();
        Select ls = new Select();
        
        lista_nubes = ls.Clouds();
        
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
