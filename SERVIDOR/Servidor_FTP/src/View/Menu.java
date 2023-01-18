/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cloud;
import SQL.Eliminar;
import SQL.Insertar;
import SQL.Select;
import Tools.Buscador;
import Tools.Creador;
import Tools.StringHandling;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel
 */
public class Menu extends javax.swing.JFrame {
    
    Creador crea = new Creador();
    DefaultTableModel model;
    String nombre_nube;
    Buscador bs = new Buscador();
        Select sl = new Select();
        Insertar is = new Insertar();
    
    /**
     * Creates new form Menu
     */
 
    public Menu() throws UnknownHostException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        label_ip.setText(bs.getIP());
        label_cloud_name.setText(sl.getCloudName(label_ip.getText()));
        label_status.setText(sl.getCloudStatus(label_ip.getText()));

        Atras.setToolTipText("Cerrar sesión");
        btn_add_user.setToolTipText("Agregar User");
        btn_icon_OFF.setToolTipText("Activar Nube");          
        btn_icon_ON.setToolTipText("Desactivar Nube");  
        btn_add_server.setToolTipText("Agregar Nube"); 
        btn_delete_server.setToolTipText("Eliminar Nube"); 
        
        crea.add_Info_Table_Users(model, jTable_Users);
        crea.add_Info_Table_Cloud(model, jTable_Clouds);
        
        if(label_status.getText().toString().equals("")){
            btn_icon_OFF.setVisible(false);            
            btn_icon_ON.setVisible(false);
        }
        if(label_status.getText().toString().equals("ON")){
            btn_icon_OFF.setVisible(false);            
            btn_icon_ON.setVisible(true);
        }
        if(label_status.getText().toString().equals("OFF")){
            btn_icon_OFF.setVisible(true);            
            btn_icon_ON.setVisible(false);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Atras = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Users = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Clouds = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_cloud_name = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_ip = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        btn_icon_OFF = new javax.swing.JButton();
        btn_icon_ON = new javax.swing.JButton();
        btn_add_server = new javax.swing.JButton();
        btn_add_user = new javax.swing.JButton();
        btn_info_server = new javax.swing.JButton();
        btn_delete_server = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Atras.setBackground(new java.awt.Color(10, 144, 203));
        Atras.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_icon.png"))); // NOI18N
        Atras.setBorder(null);
        Atras.setBorderPainted(false);
        Atras.setContentAreaFilled(false);
        Atras.setFocusPainted(false);
        Atras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_icon_G.png"))); // NOI18N
        Atras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_icon_G.png"))); // NOI18N
        Atras.setVerifyInputWhenFocusTarget(false);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 40, 30));

        jPanel5.setBackground(new java.awt.Color(205, 205, 205));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Aplicación SERVIDOR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 660, 20));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nube_Link.png"))); // NOI18N
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jLabel1.setBackground(new java.awt.Color(10, 144, 203));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(10, 144, 203));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "IPServer", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UsersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Users);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 530, 140));

        jTable_Clouds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Ultima Conexion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_Clouds);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 530, 140));

        jLabel3.setText("Servidores:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel4.setText("Usuarios:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Nombre de la nube:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        label_cloud_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label_cloud_name.setText("IP no asignada a un Servidor.");
        jPanel3.add(label_cloud_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Estatus:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        label_ip.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label_ip.setText("255.255.255.255");
        jPanel3.add(label_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("IP:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        label_status.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label_status.setText("OFF");
        jPanel3.add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        btn_icon_OFF.setBackground(new java.awt.Color(10, 144, 203));
        btn_icon_OFF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_icon_OFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_OFF.png"))); // NOI18N
        btn_icon_OFF.setBorder(null);
        btn_icon_OFF.setBorderPainted(false);
        btn_icon_OFF.setContentAreaFilled(false);
        btn_icon_OFF.setFocusPainted(false);
        btn_icon_OFF.setVerifyInputWhenFocusTarget(false);
        btn_icon_OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_icon_OFFActionPerformed(evt);
            }
        });
        jPanel3.add(btn_icon_OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 110, 90));

        btn_icon_ON.setBackground(new java.awt.Color(10, 144, 203));
        btn_icon_ON.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_icon_ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_ON.png"))); // NOI18N
        btn_icon_ON.setBorder(null);
        btn_icon_ON.setBorderPainted(false);
        btn_icon_ON.setContentAreaFilled(false);
        btn_icon_ON.setFocusPainted(false);
        btn_icon_ON.setVerifyInputWhenFocusTarget(false);
        btn_icon_ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_icon_ONActionPerformed(evt);
            }
        });
        jPanel3.add(btn_icon_ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 110, 90));

        btn_add_server.setBackground(new java.awt.Color(10, 144, 203));
        btn_add_server.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_add_server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_server.png"))); // NOI18N
        btn_add_server.setBorder(null);
        btn_add_server.setBorderPainted(false);
        btn_add_server.setContentAreaFilled(false);
        btn_add_server.setFocusPainted(false);
        btn_add_server.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_server_G.png"))); // NOI18N
        btn_add_server.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_server_G.png"))); // NOI18N
        btn_add_server.setVerifyInputWhenFocusTarget(false);
        btn_add_server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_serverActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 90, 70));

        btn_add_user.setBackground(new java.awt.Color(10, 144, 203));
        btn_add_user.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_add_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_user1.png"))); // NOI18N
        btn_add_user.setBorder(null);
        btn_add_user.setBorderPainted(false);
        btn_add_user.setContentAreaFilled(false);
        btn_add_user.setFocusPainted(false);
        btn_add_user.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_user1_G.png"))); // NOI18N
        btn_add_user.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_user1_G.png"))); // NOI18N
        btn_add_user.setVerifyInputWhenFocusTarget(false);
        btn_add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_userActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 90, 70));

        btn_info_server.setBackground(new java.awt.Color(10, 144, 203));
        btn_info_server.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_info_server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/info_server.png"))); // NOI18N
        btn_info_server.setBorder(null);
        btn_info_server.setBorderPainted(false);
        btn_info_server.setContentAreaFilled(false);
        btn_info_server.setFocusPainted(false);
        btn_info_server.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/info_server_G.png"))); // NOI18N
        btn_info_server.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/info_server_G.png"))); // NOI18N
        btn_info_server.setVerifyInputWhenFocusTarget(false);
        btn_info_server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_info_serverActionPerformed(evt);
            }
        });
        jPanel3.add(btn_info_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 90, 70));

        btn_delete_server.setBackground(new java.awt.Color(10, 144, 203));
        btn_delete_server.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_delete_server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_server.png"))); // NOI18N
        btn_delete_server.setBorder(null);
        btn_delete_server.setBorderPainted(false);
        btn_delete_server.setContentAreaFilled(false);
        btn_delete_server.setFocusPainted(false);
        btn_delete_server.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_server_G.png"))); // NOI18N
        btn_delete_server.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_server_G.png"))); // NOI18N
        btn_delete_server.setVerifyInputWhenFocusTarget(false);
        btn_delete_server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_serverActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 90, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 660, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir cerrar sesión?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta == 0){
            Login open = null;
            open = new Login();
            if (label_status.getText().toString().equals("ON")){
                Cloud nube = new Cloud();
                nube.turnOffServer(nube.getServer());
                is.offServer();
            }
            open.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_AtrasActionPerformed

    private void jTable_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UsersMouseClicked

        model = (DefaultTableModel) jTable_Users.getModel();
        String username = model.getValueAt(jTable_Users.getSelectedRow(), 0).toString();
        String ultima_conexion = model.getValueAt(jTable_Users.getSelectedRow(), 1).toString();

        
        Modal_file_options_user open = null;
        open = new Modal_file_options_user(this, true, username, ultima_conexion);
        open.setVisible(true);

    }//GEN-LAST:event_jTable_UsersMouseClicked

    private void btn_icon_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_icon_OFFActionPerformed
        Cloud nube = new Cloud();

            nube.activateServer();
            is.onServer();
            label_status.setText("ON");
            btn_icon_OFF.setVisible(false);
            btn_icon_ON.setVisible(true);
            crea.limpiarTabla(jTable_Clouds);
            crea.add_Info_Table_Cloud(model, jTable_Clouds);

    }//GEN-LAST:event_btn_icon_OFFActionPerformed

    private void btn_icon_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_icon_ONActionPerformed
        Cloud nube = new Cloud();

            nube.turnOffServer(nube.getServer());
            is.offServer();
            label_status.setText("OFF");
            btn_icon_OFF.setVisible(true);
            btn_icon_ON.setVisible(false);
            crea.limpiarTabla(jTable_Clouds);
            crea.add_Info_Table_Cloud(model, jTable_Clouds);

    }//GEN-LAST:event_btn_icon_ONActionPerformed

    private void btn_add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_userActionPerformed
        Create_user open = null;
        open = new Create_user(this,true);
        open.setVisible(true);
    }//GEN-LAST:event_btn_add_userActionPerformed

    private void btn_add_serverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_serverActionPerformed
            Create_cloud open = null;
            open = new Create_cloud(this,true);
            open.setVisible(true);
        try {
            label_ip.setText(bs.getIP());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
            label_cloud_name.setText(sl.getCloudName(label_ip.getText()));
            crea.limpiarTabla(jTable_Clouds);
            label_status.setText(sl.getCloudStatus(label_ip.getText()));
            crea.add_Info_Table_Cloud(model, jTable_Clouds);
            

        if(label_status.getText().toString().equals("ON")){
            btn_icon_OFF.setVisible(false);            
            btn_icon_ON.setVisible(true);
        }
        if(label_status.getText().toString().equals("OFF")){
            btn_icon_OFF.setVisible(true);            
            btn_icon_ON.setVisible(false);
        }
    }//GEN-LAST:event_btn_add_serverActionPerformed

    private void btn_delete_serverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_serverActionPerformed
        try {
            model = (DefaultTableModel) jTable_Clouds.getModel();
            Eliminar eli = new Eliminar();
            if (jTable_Clouds.getSelectedRow() != -1){
                eli.deleteCloud(model.getValueAt(jTable_Clouds.getSelectedRow(),1).toString());
                label_ip.setText(bs.getIP());
                label_cloud_name.setText(sl.getCloudName(label_ip.getText()));
                 label_status.setText(sl.getCloudStatus(label_ip.getText()));
                JOptionPane.showMessageDialog(null, "Nube eliminada exitosamente","Aviso",INFORMATION_MESSAGE);
                crea.limpiarTabla(jTable_Clouds);
                crea.add_Info_Table_Cloud(model, jTable_Clouds);
                btn_icon_OFF.setVisible(false);            
                btn_icon_ON.setVisible(false);
            }else JOptionPane.showMessageDialog(null, "Debe seleccionar una nube para ser elimianda","Aviso",INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Nube eliminada exitosamente","Aviso",INFORMATION_MESSAGE);
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_delete_serverActionPerformed

    private void btn_info_serverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_info_serverActionPerformed

        if (jTable_Clouds.getSelectedRow() != -1){
            Modal_server_options open = null;
            open = new Modal_server_options(this,true,label_cloud_name.getText(), label_ip.getText());
            open.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una nube para ver los resportes","Aviso",INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_info_serverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btn_add_server;
    private javax.swing.JButton btn_add_user;
    private javax.swing.JButton btn_delete_server;
    private javax.swing.JButton btn_icon_OFF;
    private javax.swing.JButton btn_icon_ON;
    private javax.swing.JButton btn_info_server;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_Clouds;
    private javax.swing.JTable jTable_Users;
    private javax.swing.JLabel label_cloud_name;
    private javax.swing.JLabel label_ip;
    private javax.swing.JLabel label_status;
    // End of variables declaration//GEN-END:variables
}
