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
public class Modal_server_options extends javax.swing.JDialog {
    
    String server;
    String ip;

    /**
     * Creates new form 
     */
    
    public Modal_server_options(JFrame padre, boolean modo) {
        super(padre,modo);
        initComponents();
        this.setLocationRelativeTo(null);
                
//        btn_delete.setToolTipText("Eliminar");
    }
    
    public Modal_server_options(JFrame padre, boolean modo, String serverName, String ipServer) {
        super(padre,modo);
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.server = serverName;
        this.ip = ipServer;
        
        //Colocamos el nombre del Archivo y de la Nube
        jLabel_Server.setText("Nombre : "+serverName);
        jLabel_ip.setText("Ip : "+ipServer);
        
        //Info de lo que hace el boton

        btn_Reporte1.setToolTipText("Reporte 1");        
        btn_Reporte2.setToolTipText("Reporte 2");
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
        jLabel_Server1 = new javax.swing.JLabel();
        btn_Reporte1 = new javax.swing.JButton();
        btn_Reporte2 = new javax.swing.JButton();
        jLabel_ip = new javax.swing.JLabel();
        jLabel_Server = new javax.swing.JLabel();
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
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Server1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel_Server1.setForeground(java.awt.Color.black);
        jLabel_Server1.setText("Reportes del servidor:");
        jPanel3.add(jLabel_Server1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));

        btn_Reporte1.setBackground(new java.awt.Color(10, 144, 203));
        btn_Reporte1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_Reporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1.png"))); // NOI18N
        btn_Reporte1.setBorder(null);
        btn_Reporte1.setBorderPainted(false);
        btn_Reporte1.setContentAreaFilled(false);
        btn_Reporte1.setFocusPainted(false);
        btn_Reporte1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1_G.png"))); // NOI18N
        btn_Reporte1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1_G.png"))); // NOI18N
        btn_Reporte1.setVerifyInputWhenFocusTarget(false);
        btn_Reporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Reporte1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Reporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 28, 92, 77));

        btn_Reporte2.setBackground(new java.awt.Color(10, 144, 203));
        btn_Reporte2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_Reporte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/2.png"))); // NOI18N
        btn_Reporte2.setBorder(null);
        btn_Reporte2.setBorderPainted(false);
        btn_Reporte2.setContentAreaFilled(false);
        btn_Reporte2.setFocusPainted(false);
        btn_Reporte2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/2_G.png"))); // NOI18N
        btn_Reporte2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/2_G.png"))); // NOI18N
        btn_Reporte2.setVerifyInputWhenFocusTarget(false);
        btn_Reporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Reporte2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Reporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 28, 92, 77));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 400, 110));

        jLabel_ip.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_ip.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ip.setText("Ip");
        jPanel1.add(jLabel_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, -1));

        jLabel_Server.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Server.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Server.setText("Server");
        jPanel1.add(jLabel_Server, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, -1));

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
        jLabel3.setText("    Opciones de Servidor:");
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

    private void btn_users_filesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        //No se porque no se eleiminar esto, pero no esta dando problemas...por lo tanto no lo toquemos
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_Reporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Reporte1ActionPerformed
        Modal_Reporte_1 open = null;
        open = new Modal_Reporte_1(this,true,"Delta27222");
        open.setVisible(true);
    }//GEN-LAST:event_btn_Reporte1ActionPerformed

    private void btn_Reporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Reporte2ActionPerformed
        Modal_Reporte_2 open = null;
        open = new Modal_Reporte_2(this,true,jLabel_Server.getText());
        open.setVisible(true);
    }//GEN-LAST:event_btn_Reporte2ActionPerformed

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
            java.util.logging.Logger.getLogger(Modal_server_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modal_server_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modal_server_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modal_server_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modal_server_options dialog = new Modal_server_options(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Reporte1;
    private javax.swing.JButton btn_Reporte2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Server;
    private javax.swing.JLabel jLabel_Server1;
    private javax.swing.JLabel jLabel_ip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
