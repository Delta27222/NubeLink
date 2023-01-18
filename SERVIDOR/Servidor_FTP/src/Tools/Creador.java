/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Model.Cloud;
import Model.Users;
import SQL.Select;
import java.io.File;
import java.net.UnknownHostException;
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
    
    public void Interfaz( JFrame nueva, int ancho, int largo){
        nueva.setResizable(false); 
        nueva.setVisible(true);
        nueva.setSize(ancho,largo);     
        nueva.setLocationRelativeTo(null); 
    }
    
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
    
    
    public void add_Info_Table_Cloud(DefaultTableModel model,JTable Table){
        String [] datos = new String[3];
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Nombre","Direccion IP","Estatus"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }        
        
        Select sl = new Select();
        
        ArrayList<Cloud> clouds = new ArrayList<Cloud>();
        
        clouds= sl.Clouds();
        
       
        for (Cloud cloud : clouds) {
            
            datos[0] = cloud.getName();
            datos[1] = cloud.getIP_ADDRESS();
            datos[2] = cloud.getSTATUS();
            
            model.addRow(datos);
            
        }
       Table.setModel(model);
    }
    
    public void add_Info_Table_Users(DefaultTableModel model,JTable Table){
        String [] datos = new String[3];
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Nombre de usuario","Espacio asignado","Ultima conexion"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }        
        
        Select sl = new Select();
        
        ArrayList<Users> users = new ArrayList<Users>();
        
        users= sl.Users();
        
       
        for (Users user : users) {
            
            datos[0] = user.getUSERNAME();
            datos[1] = user.getID_STORAGE();
            datos[2] = user.getLast_log();
            
            model.addRow(datos);
            
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
    
    public void llenando_JComboBox_Storage(JComboBox jComboBoxNubes){
        Select sl = new Select();
        ArrayList<String> lista_storages = new ArrayList<String>();
        lista_storages = sl.getStorages();
        
        //Para poder hacer el llenado del combo box
        for (int i=0; i<lista_storages.size();i++){            
            jComboBoxNubes.addItem(lista_storages.get(i));
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
    
    
    public void limpiarTabla(JTable tabla){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        for (int i = model.getRowCount()-1; i>=0;i--)
            model.removeRow(i);
    }
    
    public void addUsersFolder() throws UnknownHostException{ //Al crear una nube, se debe crear para todos los usuarios, una carpeta con su nombre
        String ip = new Buscador().getIP(); //Obtengo la ip para buscar la ruta de la nube de la ip
        String ruta = new Select().searchRuta(ip); //Obtengo la ruta de la ip
        
        ArrayList<String> users = new ArrayList<String>();
        users = new Select().searchUsers(); //Obtengo todos los usuarios creados del sistema
        
        for(String username:users){
            File directorio = new File(ruta+"\\"+username);
            //System.out.println(ruta+"/"+username)
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {
                    System.out.println("Error al crear directorio");
            }
        }
        }
        
        System.out.println("Se crearon todos los directorios.");
        
        
    }
    
}
