
package Proyecto;


import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AggArms extends javax.swing.JFrame {

    Admin ad = new Admin();
    short cantarms;
    String lista;



    public AggArms() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("src/Imagenes/AggArmas.jpeg");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        ImageIcon labels = new ImageIcon("src/Imagenes/botones.png");
        Icon iconlabels = new ImageIcon(labels.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(iconlabels);
        jLabel3.setIcon(iconlabels);
        jLabel2.setIcon(iconlabels);
        jLabel5.setIcon(iconlabels);
        this.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cant = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GunList = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Arma = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        reg = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setText("Arma");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 115, 120, 35));

        cant.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        getContentPane().add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 214, 41, 35));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel3.setText("Cantidad");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 214, 120, 35));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel5.setText("Precio");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 168, 120, 35));

        GunList.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        GunList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Rifles de asalto", "Rifles de francotirador", "Escopetas", "Pistolas", "Especiales" }));
        GunList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GunListActionPerformed(evt);
            }
        });
        getContentPane().add(GunList, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 62, -1, 35));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel4.setText("Tipo de arma");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 62, 120, 35));

        Arma.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        getContentPane().add(Arma, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 115, 132, 35));

        Precio.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 168, 132, 35));

        reg.setBackground(new java.awt.Color(0, 0, 0));
        reg.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        reg.setForeground(new java.awt.Color(204, 204, 204));
        reg.setText("Registrar");
        reg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        getContentPane().add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 110, 31));

        volver.setBackground(new java.awt.Color(0, 0, 0));
        volver.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        volver.setForeground(new java.awt.Color(204, 204, 204));
        volver.setText("Volver atras");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 31));

        Fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GunListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GunListActionPerformed


    }//GEN-LAST:event_GunListActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        lista = GunList.getSelectedItem().toString();
        cantarms = Short.parseShort(cant.getValue().toString());
        byte est = 1;
        if (!lista.equals("Seleccione...") && cantarms != 0 && !this.Precio.getText().equals("") && !this.Arma.getText().equals("")) {
            int price = Integer.parseInt(this.Precio.getText());
            DataHolder.guns.add(new Armas(lista, Arma.getText(), cantarms, price));
            ////////////////////////////////////////////////////////////////////////////////////////////

            //////////////////////////////////////////////////////////////////////////////////////////////////////////// 

            GunList.setSelectedItem("Seleccione...");
           
            cant.setValue(0);
            Precio.setText("");
            est = 0;
            Arma.setText("");
        } else {
            String errores = "";
            if (lista.equals("Seleccione...")) {
                errores += "- El tipo de arma\n";
            }
            if (Precio.getText().equals("")) {
                errores += "- Precio para esta arma, la va a regalar o que?\n";
            }
            if (Arma.getText().equals("")) {
                errores += "- Nombre del arma\n";
            }
            if (cantarms == 0) {
                errores += "- Cantidad de armas con estas caracteristicas que desea registrar\n";
            }
            JOptionPane.showMessageDialog(null, "Falta por ingresar:\n" + errores, "AVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_regActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        setVisible(false);
        ad.setVisible(true);
        
        
        
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(AggArms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AggArms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AggArms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AggArms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AggArms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arma;
    private javax.swing.JLabel Fondo;
    private javax.swing.JComboBox<String> GunList;
    private javax.swing.JTextField Precio;
    private javax.swing.JSpinner cant;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton reg;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
