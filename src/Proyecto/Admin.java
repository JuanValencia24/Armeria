
package Proyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Admin extends javax.swing.JFrame {
Ventana v = new Ventana();
MostrarUsuario mu = new MostrarUsuario();

    
    public Admin() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon fondo = new ImageIcon("src/imagenes/Pass 2.jpeg");
        ImageIcon volv = new ImageIcon("src/imagenes/volv.png");
        Icon Fondo = new ImageIcon(fondo.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        Icon F = new ImageIcon(volv.getImage().getScaledInstance(jButton2.getWidth(), jButton2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(Fondo);
        jButton2.setIcon(F);
        this.repaint();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botusers = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botarms = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botusers.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botusers.setForeground(new java.awt.Color(204, 204, 204));
        botusers.setText("Gestion de usuarios");
        botusers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botusersActionPerformed(evt);
            }
        });
        getContentPane().add(botusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 190, 170));

        jButton2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        botarms.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botarms.setForeground(new java.awt.Color(204, 204, 204));
        botarms.setText("Activacion");
        botarms.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botarms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botarmsActionPerformed(evt);
            }
        });
        getContentPane().add(botarms, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 180, 170));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botusersActionPerformed
        dispose();
        mu.setVisible(true);
        mu.setLocationRelativeTo(null);
    }//GEN-LAST:event_botusersActionPerformed

    private void botarmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botarmsActionPerformed
        AggArms adda = new AggArms();
        dispose();
        adda.setVisible(true);
        adda.setLocationRelativeTo(null);
    }//GEN-LAST:event_botarmsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        v.setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botarms;
    private javax.swing.JButton botusers;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
