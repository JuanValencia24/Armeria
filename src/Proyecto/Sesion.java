
package Proyecto;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Sesion extends javax.swing.JFrame {
    ArrayList<Usuario> user = DataHolder.user;
    VenReg_Usuario vr = new VenReg_Usuario();
    Compra cp = new Compra();
     public static int doc;
    
    
    public Sesion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(526,341);
        ImageIcon img = new ImageIcon("src/Imagenes/volv.png");
        ImageIcon imgf = new ImageIcon("src/Imagenes/sesion.jpg");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(volver.getWidth(), volver.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo1 = new ImageIcon(imgf.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        volver.setIcon(icono);
        fondo.setIcon(fondo1);
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reg = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        userdoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Documento");

        reg.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        reg.setText("Registrarse");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        Inicio.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        Inicio.setText("Iniciar Sesión");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        jLabel4.setText("¿No tiene cuenta para comprar armas?");

        volver.setBackground(new java.awt.Color(204, 204, 255));
        volver.setForeground(new java.awt.Color(153, 153, 153));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(Inicio))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(userdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(reg))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(Inicio))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(userdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(reg))
            .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        vr.setVisible(true);
        dispose();
    }//GEN-LAST:event_regActionPerformed
    byte trys=3;
    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        String name = "";
        doc = 0;
        if(userdoc.getText().equals("")){
            userdoc.setText("-Vacio-");
        }else{
            doc=Integer.parseInt(userdoc.getText());
        }
        if(username.getText().equals("")){
            username.setText("-Vacio-");
        }
        else{
            name=username.getText();
        }
        if(!user.isEmpty()){
            for(int i=0; i<user.size();i++){
                if(user.get(i).cc==doc&&user.get(i).nombre.equals(name)){
                    dispose();
                    cp.setVisible(true);
                }
                if(i==user.size()-1&&!user.get(i).nombre.equals(name)||
                   i==user.size()-1&&user.get(i).cc!=doc){
                    trys--;
                    if(trys!=0){
                        JOptionPane.showMessageDialog(null, "Usuario o documento incorrecto o puede que este usuario no este registrado","ERROR",JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Posibles causas:\n-Mal escritura de los datos\n-Aun no esta registrado"
                            ,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Recuerde que solo tiene "+trys+" apartir de ahora"
                         ,"EXTRA",JOptionPane.INFORMATION_MESSAGE);
                        username.setText("");
                        userdoc.setText("");
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se han registrado usuarios aun o no aparecen, porfavor hable con el admin"
            ,"ERROR",JOptionPane.ERROR_MESSAGE);
            username.setText("");
            userdoc.setText("");
        }
        if(trys==0){
            JOptionPane.showMessageDialog(null, "Se acabaron los intentos, el usuario no esta, asi que registrate ctm");
            dispose();
            vr.setVisible(true);
        }
    }//GEN-LAST:event_InicioActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Ventana v = new Ventana();
        dispose();
        v.setVisible(true);  
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
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicio;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton reg;
    private javax.swing.JTextField userdoc;
    private javax.swing.JTextField username;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
