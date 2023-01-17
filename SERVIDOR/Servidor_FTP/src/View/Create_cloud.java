/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cloud;
import SQL.Insertar;
import Tools.Creador;
import Tools.StringHandling;
import Tools.Verificador;
import java.awt.Color;
import java.io.File;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Create_cloud extends javax.swing.JDialog {
    
    String file_Name;
    String nube_Name;
    Creador crea = new Creador();

    /**
     * Creates new form Download_file
     */
    public Create_cloud(JFrame padre, boolean modo) {
        super(padre, modo);
        initComponents();
        this.setLocationRelativeTo(null);

    }
    
    public Create_cloud(JDialog padre, boolean modo, String fileName, String nubeName) {
        super(padre, modo);
        initComponents();
        this.file_Name = fileName;
        this.nube_Name = nubeName;

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
        jPanel5 = new javax.swing.JPanel();
        ruta = new LIB.JTexfieldPH_FielTex();
        btn_abrir = new javax.swing.JButton();
        btn_descargar = new javax.swing.JButton();
        JPanel_users = new javax.swing.JPanel();
        name_cloud = new LIB.JTexfieldPH_FielTex();
        Jtext_nombre_user = new javax.swing.JLabel();
        Jtext_nombre_user1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Atras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(230, 230, 230));

        ruta.setBackground(new java.awt.Color(230, 230, 230));
        ruta.setBorder(null);
        ruta.setToolTipText("");
        ruta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ruta.setOpaque(false);
        ruta.setPhColor(new java.awt.Color(10, 144, 203));
        ruta.setPlaceholder("Ruta descarga");
        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 40));

        btn_abrir.setBackground(new java.awt.Color(158, 163, 165));
        btn_abrir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_abrir.setText("Abrir");
        btn_abrir.setToolTipText("");
        btn_abrir.setBorderPainted(false);
        btn_abrir.setContentAreaFilled(false);
        btn_abrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_abrir.setFocusPainted(false);
        btn_abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_abrir.setName(""); // NOI18N
        btn_abrir.setOpaque(true);
        btn_abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_abrirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_abrirMouseExited(evt);
            }
        });
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });
        jPanel3.add(btn_abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 90, 40));

        btn_descargar.setBackground(new java.awt.Color(10, 130, 203));
        btn_descargar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_descargar.setText("Crear");
        btn_descargar.setToolTipText("");
        btn_descargar.setBorderPainted(false);
        btn_descargar.setContentAreaFilled(false);
        btn_descargar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_descargar.setFocusPainted(false);
        btn_descargar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_descargar.setName(""); // NOI18N
        btn_descargar.setOpaque(true);
        btn_descargar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_descargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_descargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_descargarMouseExited(evt);
            }
        });
        btn_descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descargarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_descargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, 40));

        JPanel_users.setBackground(new java.awt.Color(230, 230, 230));

        name_cloud.setBackground(new java.awt.Color(230, 230, 230));
        name_cloud.setBorder(null);
        name_cloud.setToolTipText("");
        name_cloud.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        name_cloud.setOpaque(false);
        name_cloud.setPhColor(new java.awt.Color(10, 144, 203));
        name_cloud.setPlaceholder("Nombre de la nube");
        name_cloud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_cloudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel_usersLayout = new javax.swing.GroupLayout(JPanel_users);
        JPanel_users.setLayout(JPanel_usersLayout);
        JPanel_usersLayout.setHorizontalGroup(
            JPanel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_usersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_cloud, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        JPanel_usersLayout.setVerticalGroup(
            JPanel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_usersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_cloud, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanel3.add(JPanel_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        Jtext_nombre_user.setText("Ruta local en el servidor:");
        jPanel3.add(Jtext_nombre_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Jtext_nombre_user1.setText("Nombre de la nube:");
        jPanel3.add(Jtext_nombre_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 400, 230));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 20));

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

        jLabel4.setBackground(new java.awt.Color(10, 144, 203));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 10));

        jLabel3.setBackground(new java.awt.Color(10, 144, 203));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("    Crear nube:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaActionPerformed

    private void btn_abrirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abrirMouseEntered
        btn_abrir.setBackground(Color.gray);
    }//GEN-LAST:event_btn_abrirMouseEntered

    private void btn_abrirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abrirMouseExited
        btn_abrir.setBackground(new Color(158,163,165));
    }//GEN-LAST:event_btn_abrirMouseExited

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        //Creamos el objeto JFileChooser
        JFileChooser fc = new JFileChooser();

        //-------------------------------------------
        //Podemos seleccionar SOLO DIRECTORIOS
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //-------------------------------------------

        //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion = fc.showOpenDialog(this);

        //Si el usuario, pincha aceptar
        if(seleccion == JFileChooser.APPROVE_OPTION){
            //Seleccionamos el fichero
            File fichero = fc.getSelectedFile();

            //Escribe la ruta del fichero seleccionado en el campo de texto
            this.ruta.setText(fichero.getAbsolutePath());

        }
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_descargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_descargarMouseEntered
        btn_descargar.setBackground(new Color(8,105,165));
    }//GEN-LAST:event_btn_descargarMouseEntered

    private void btn_descargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_descargarMouseExited
        btn_descargar.setBackground(new Color(10,130,203));
    }//GEN-LAST:event_btn_descargarMouseExited

    private void btn_descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descargarActionPerformed
        
        String file_dir = this.ruta.getText();
        File fRuta = new File(file_dir);
        Verificador veri = new Verificador();
        Insertar insert = new Insertar();
        
        
        //Verifica que es un directorio
        //if(fRuta.isDirectory()){
        if(fRuta.exists() && veri.noVacio(name_cloud.getText())){   
            int respuesta= JOptionPane.showConfirmDialog(null,"Seguro que desea crear la nube "+name_cloud.getText()+"?","Descargar",JOptionPane.YES_NO_OPTION);
            if (respuesta == 0){
                Cloud nube = new Cloud();
                try {
                    String file_path = file_dir.replace("\\", "/");
                    String value = nube.addServer("test","test",file_path,name_cloud.getText());
                    insert.insertCloud(value);
                    
                    crea.addUsersFolder();
                    
                } catch (UnknownHostException ex) {
                    Logger.getLogger(Create_cloud.class.getName()).log(Level.SEVERE, null, ex);
                }

                this.dispose();
            }   
        }else{
            this.ruta.setText("");
            JOptionPane.showMessageDialog(null, "Complete todos los campos he intente nuevamente.", "Precaución 👀",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_descargarActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void name_cloudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_cloudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_cloudActionPerformed

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
            java.util.logging.Logger.getLogger(Create_cloud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_cloud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_cloud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_cloud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Create_cloud dialog = new Create_cloud(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel JPanel_users;
    private javax.swing.JLabel Jtext_nombre_user;
    private javax.swing.JLabel Jtext_nombre_user1;
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_descargar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private LIB.JTexfieldPH_FielTex name_cloud;
    private LIB.JTexfieldPH_FielTex ruta;
    // End of variables declaration//GEN-END:variables
}
