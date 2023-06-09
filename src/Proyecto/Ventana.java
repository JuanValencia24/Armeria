/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {


    public Ventana() {
        initComponents();
        this.setTitle("Pistoleria FerRicGuns");
        setLocationRelativeTo(null);
        this.setSize(596, 369);
        this.setResizable(false);
        ImageIcon main = new ImageIcon("src/Imagenes/Menu 2.jpeg");
        ImageIcon log = new ImageIcon("src/Imagenes/Logo.jpg");
        Icon mainicon = new ImageIcon(main.getImage().getScaledInstance(Main.getWidth(), Main.getHeight(), Image.SCALE_DEFAULT));
        Icon logicon = new ImageIcon(log.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        Main.setIcon(mainicon);
        logo.setIcon(logicon);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JButton();
        compra = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registro.setBackground(new java.awt.Color(0, 0, 0));
        Registro.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        Registro.setForeground(new java.awt.Color(204, 204, 204));
        Registro.setText("Admin");
        Registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 140, 30));

        compra.setBackground(new java.awt.Color(0, 0, 0));
        compra.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        compra.setForeground(new java.awt.Color(204, 204, 204));
        compra.setText("Compra");
        compra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraActionPerformed(evt);
            }
        });
        getContentPane().add(compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, 30));

        logo.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, 110));

        Main.setMaximumSize(new java.awt.Dimension(620, 340));
        Main.setMinimumSize(new java.awt.Dimension(620, 340));
        Main.setPreferredSize(new java.awt.Dimension(620, 340));
        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 596, 369));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraActionPerformed
        Sesion s = new Sesion();
        dispose();
        s.setVisible(true);
    }//GEN-LAST:event_compraActionPerformed
    String dp="";
    byte trys;
    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        VenPass vp = new VenPass();
        Transfer tr = new Transfer();
        if(tr.getBlock().equals("bloqueado")){
            JOptionPane.showMessageDialog(null, "Se bloqueo esta funcion por exeso de intentos"
                    + "", "ERROR", JOptionPane.ERROR_MESSAGE);
            do{
                dp = JOptionPane.showInputDialog("Ingrese la contraseña de desbloqueo");
            }while(!dp.equals("123"));
            setVisible(false);
            vp.setVisible(true);
            vp.setLocationRelativeTo(null);
        }
        else{
            setVisible(false);
            vp.setVisible(true);
            vp.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_RegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Main;
    private javax.swing.JButton Registro;
    private javax.swing.JButton compra;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
