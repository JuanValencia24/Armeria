
package Proyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class VenPass extends javax.swing.JFrame {


    public VenPass() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("src/Imagenes/butom2.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(passb.getWidth(), passb.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon imgFondo = new ImageIcon("src/Imagenes/Pass 2.jpeg");
        Icon fondo = new ImageIcon(imgFondo.getImage().getScaledInstance(pass.getWidth(), pass.getHeight(), Image.SCALE_DEFAULT));
        /*passb.setIcon(icono);*/
        pass.setIcon(fondo);
        this.repaint();
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passb = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        volver = new javax.swing.JButton();
        cappass1 = new javax.swing.JButton();
        pass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passb.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        passb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passb.setText("PASSWORD");
        passb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(passb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, 80));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 230, 30));

        volver.setBackground(new java.awt.Color(0, 0, 0));
        volver.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(204, 204, 204));
        volver.setText("Volver");
        volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        cappass1.setBackground(new java.awt.Color(0, 0, 0));
        cappass1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        cappass1.setForeground(new java.awt.Color(204, 204, 204));
        cappass1.setText("Continuar");
        cappass1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cappass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappass1ActionPerformed(evt);
            }
        });
        getContentPane().add(cappass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 140, 30));

        pass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Ventana v = new Ventana();
        dispose();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }//GEN-LAST:event_volverActionPerformed
    byte trys;
    private void cappass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappass1ActionPerformed
        Admin ad = new Admin();
        Transfer tr = new Transfer();
        trys++;
            if(VenPass.password.getText().equals("admin")){
                dispose();
                ad.setVisible(true);
                ad.setLocationRelativeTo(null);
            }
            if(VenPass.password.getText().equals("")){
                JOptionPane.showMessageDialog(null,"No ha ingresado una contrasena", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
            if(!VenPass.password.getText().equals("admin")&&!VenPass.password.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                VenPass.password.setText("");
                JOptionPane.showMessageDialog(null, trys);
            }
        if(trys==3&&!VenPass.password.getText().equals("admin")){
            Ventana v = new Ventana();
            JOptionPane.showMessageDialog(null,"Muchos intentos, usted no es admin, no se haga"
                    + "", "ERROR", JOptionPane.ERROR_MESSAGE);
                    tr.setBlock("bloqueado");
                    dispose();
            v.setVisible(true);
        }
        
    }//GEN-LAST:event_cappass1ActionPerformed

    

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
            java.util.logging.Logger.getLogger(VenPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cappass1;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel passb;
    public static javax.swing.JPasswordField password;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
