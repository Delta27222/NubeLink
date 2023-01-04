/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Modal_file_options extends javax.swing.JDialog {
    
    String username;
    String ultima_conexion;

    /**
     * Creates new form 
     */
    
    public Modal_file_options(JFrame padre, boolean modo) {
        super(padre,modo);
        initComponents();
        this.setLocationRelativeTo(null);
                
        btn_delete.setToolTipText("Eliminar");
    }
    
    public Modal_file_options(JFrame padre, boolean modo, String username, String ultima_conexion) {
        super(padre,modo);
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.username = username;
        this.ultima_conexion = ultima_conexion;
        
        //Colocamos el nombre del Archivo y de la Nube
        jLabel_Username.setText("Username: "+username);
        jLabel_ultima_conexion.setText("Última conexión: "+ultima_conexion);
        
        //Info de lo que hace el boton
        btn_delete.setToolTipText("Eliminar");
        btn_edit.setToolTipText("Editar");
        Atras.setToolTipText("Volver");

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
        jPanel3 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jLabel_ultima_conexion = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Atras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_delete.setBackground(new java.awt.Color(10, 144, 203));
        btn_delete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_icon.png"))); // NOI18N
        btn_delete.setBorder(null);
        btn_delete.setBorderPainted(false);
        btn_delete.setContentAreaFilled(false);
        btn_delete.setFocusPainted(false);
        btn_delete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_icon_G.png"))); // NOI18N
        btn_delete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_icon_G.png"))); // NOI18N
        btn_delete.setVerifyInputWhenFocusTarget(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(10, 144, 203));
        btn_edit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit_user.png"))); // NOI18N
        btn_edit.setBorder(null);
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);
        btn_edit.setFocusPainted(false);
        btn_edit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit_user_G.png"))); // NOI18N
        btn_edit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit_user_G.png"))); // NOI18N
        btn_edit.setVerifyInputWhenFocusTarget(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 400, 110));

        jLabel_ultima_conexion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_ultima_conexion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ultima_conexion.setText("ultima_conexion");
        jPanel1.add(jLabel_ultima_conexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, -1));

        jLabel_Username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setText("UserName");
        jPanel1.add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, -1));

        jPanel4.setBackground(new java.awt.Color(205, 205, 205));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, 20));

        Atras.setBackground(new java.awt.Color(10, 144, 203));
        Atras.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back_icon.png"))); // NOI18N
        Atras.setBorder(null);
        Atras.setBorderPainted(false);
        Atras.setContentAreaFilled(false);
        Atras.setFocusPainted(false);
        Atras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back_icon_G.png"))); // NOI18N
        Atras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back_icon_G.png"))); // NOI18N
        Atras.setVerifyInputWhenFocusTarget(false);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, 30));

        jLabel3.setBackground(new java.awt.Color(10, 144, 203));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("    Opciones de Archivo:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 80));

        jLabel4.setBackground(new java.awt.Color(10, 144, 203));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro desea borrar a el usuario de nombre '"+username+" para no dar mas acceso a la nube?","Borrar archivo",JOptionPane.YES_NO_OPTION);
        if (respuesta == 0){

            //Aca va la logica para eliminar el archivo, y luego se cierra esta pantalla
            
            this.dispose();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        Edit_user open = null;
        open = new Edit_user(this,true,username);
        open.setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

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
            java.util.logging.Logger.getLogger(Modal_file_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modal_file_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modal_file_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modal_file_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modal_file_options dialog = new Modal_file_options(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_ultima_conexion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}