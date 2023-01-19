/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Model.FilesFolder;
import Model.Users;
import SQL.Select;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
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
    Select sl = new Select();
    
    public void add_Info_Table_Menu(DefaultTableModel model,JTable Table, String nombre_Nube){
         String [] datos = new String[3];
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Nombre Archivo","Peso (Kb)", "Tipo"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }        
        
        ArrayList<FilesFolder> archivos = new  ArrayList<FilesFolder>();
        archivos = sl.filesFolder(Users.getID(), nombre_Nube);
        int numero = 0;
        for (FilesFolder archivo : archivos) {
            datos[0] = archivo.getNAME();
            datos[1] = archivo.getSIZE();
            datos[2] = "Archivo";
            
            model.addRow(datos);
            numero = numero + 1;
        }
       Table.setModel(model);
    }
    
//    public void add_Info_Table_Files(DefaultTableModel model,JTable Table){
//        model = (DefaultTableModel) Table.getModel();
//        Object[] newIdentifiers = new Object[]{"Nombre Archivo","Peso", "Tipo"};
//        model.setColumnIdentifiers(newIdentifiers);
//        Table.setFillsViewportHeight(true);
//        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
//        for (int x = 0; x < Table.getColumnCount(); x++) {
//            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
//        }        
//        
//        ArrayList<Object[]> archivos = new  ArrayList<Object[]>();
//        archivos = bus.create_ArrayList_Table_Menu(nombre_Nube, ip_number, userName, contrasena);
//        int numero = 0;
//        for (Object []archivo : archivos) {
//            model.addRow(archivo);
//            numero = numero + 1;
//        }
//       Table.setModel(model);
//    }
    
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
    
        public void Interfaz( JFrame nueva, int ancho, int largo){
        nueva.setResizable(false); 
        nueva.setVisible(true);
        nueva.setSize(ancho,largo);     
        nueva.setLocationRelativeTo(null); 
    }
        
        public void limpiarTabla(JTable tabla){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        for (int i = model.getRowCount()-1; i>=0;i--)
            model.removeRow(i);
    }
}
