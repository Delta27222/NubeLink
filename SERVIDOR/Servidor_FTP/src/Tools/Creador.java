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

    public void add_Info_Table_Menu(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Username","Ultima Conexión"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }        
        
        Object[]info1 = new Object[]{"ANGEL1","fecha1"};     
        Object[]info2 = new Object[]{"MIGUEL1","fecha 2"};                 
        Object[]info3 = new Object[]{"SAMUEL","fecha 3"};     
        Object[]info4 = new Object[]{"MILENA","fecha 4"};     
        Object[]info5 = new Object[]{"CARLOS","fecha 5"};     

        ArrayList<Object[]> archivos = new  ArrayList<Object[]>();
        archivos.add(info1);
        archivos.add(info2);
        archivos.add(info3);
        archivos.add(info4);
        archivos.add(info5);
        
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
