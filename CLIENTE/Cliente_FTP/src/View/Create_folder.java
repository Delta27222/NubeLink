/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Create_folder extends javax.swing.JDialog {

    /**
     * Creates new form Create_folder
     */
    public Create_folder(JFrame padre, boolean modo){
        super(padre, modo);
        initComponents();
        this.setLocationRelativeTo(null);
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
        btn_create = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        name_folder = new LIB.JTexfieldPH_FielTex();
        jPanel5 = new javax.swing.JPanel();
        ruta = new LIB.JTexfieldPH_FielTex();
        btn_abrir = new javax.swing.JButton();
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

        btn_create.setBackground(new java.awt.Color(10, 130, 203));
        btn_create.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_create.setForeground(new java.awt.Color(0, 0, 0));
        btn_create.setText("Cargar");
        btn_create.setToolTipText("");
        btn_create.setBorderPainted(false);
        btn_create.setContentAreaFilled(false);
        btn_create.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_create.setFocusPainted(false);
        btn_create.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_create.setName(""); // NOI18N
        btn_create.setOpaque(true);
        btn_create.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_createMouseExited(evt);
            }
        });
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        jPanel3.add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 90, 40));

        jPanel6.setBackground(new java.awt.Color(230, 230, 230));

        name_folder.setBackground(new java.awt.Color(230, 230, 230));
        name_folder.setBorder(null);
        name_folder.setToolTipText("");
        name_folder.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        name_folder.setOpaque(false);
        name_folder.setPhColor(new java.awt.Color(10, 144, 203));
        name_folder.setPlaceholder("Nombre carpeta");
        name_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_folderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_folder, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_folder, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        jPanel5.setBackground(new java.awt.Color(230, 230, 230));

        ruta.setBackground(new java.awt.Color(230, 230, 230));
        ruta.setBorder(null);
        ruta.setToolTipText("");
        ruta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ruta.setOpaque(false);
        ruta.setPhColor(new java.awt.Color(10, 144, 203));
        ruta.setPlaceholder("Ruta destino");
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

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btn_abrir.setBackground(new java.awt.Color(158, 163, 165));
        btn_abrir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_abrir.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanel3.add(btn_abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 90, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 400, 200));

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

        jLabel4.setBackground(new java.awt.Color(10, 144, 203));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 10));

        jLabel3.setBackground(new java.awt.Color(10, 144, 203));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("  Creación de carpeta:");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 330));

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

    private void name_folderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_folderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_folderActionPerformed

    private void btn_createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createMouseEntered
        btn_create.setBackground(new Color(8,105,165));
    }//GEN-LAST:event_btn_createMouseEntered

    private void btn_createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createMouseExited
        btn_create.setBackground(new Color(10,130,203));
    }//GEN-LAST:event_btn_createMouseExited

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        String file_dir = this.ruta.getText();
        File fRuta = new File(file_dir);
        
        String folder_Name = this.name_folder.getText();
        
        if(!folder_Name.equals("")){
            if(fRuta.exists()){  
                
                //Logica para la creacion de la nueva carpeta
                //Tambien hay que verificar si ya existe una carpeta con ese nombre
                //DUDA-> Donde se esta creando la carpeta? En el servidor o en la maquina del cliente?? Lo estoy haciendo para que se pueda crear desde la maquina del CLIENTE
                
                //Me imagino que es que se cree una carpeta en el servidor, pero que ladilla xd
                
                File directorio = new File(fRuta+"/"+folder_Name);
                if (!directorio.exists()) {
                    if (directorio.mkdirs()) {
                        JOptionPane.showMessageDialog(null, "Directorio creado.", "Exito",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al crear el directorio.", "Error 👀",JOptionPane.ERROR_MESSAGE);
                    }
                }
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "La ruta especificada no es permitida.", "Precaución 👀",JOptionPane.WARNING_MESSAGE);
            }  
        }else{
            JOptionPane.showMessageDialog(null, "Coloque un nombre a su nueva carptea.", "Precaución 👀",JOptionPane.WARNING_MESSAGE);
        }
        
        
       
    }//GEN-LAST:event_btn_createActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Create_folder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_folder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_folder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_folder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Create_folder dialog = new Create_folder(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_create;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private LIB.JTexfieldPH_FielTex name_folder;
    private LIB.JTexfieldPH_FielTex ruta;
    // End of variables declaration//GEN-END:variables
}
