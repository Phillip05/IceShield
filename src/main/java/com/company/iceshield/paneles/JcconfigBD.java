package com.company.iceshield.paneles;

import com.company.iceshield.files.ConfigFile;
import com.company.iceshield.jLogin;
import java.awt.Color;


public class JcconfigBD extends javax.swing.JFrame {

    /**
     * Creates new form JcconfigBD
     */
    ConfigFile cf = new ConfigFile();
    public JcconfigBD() {
        initComponents();
        setSize(1310, 596);
        txt_ip_input.setText(cf.getmsqlHost());
        port_input.setText(cf.getmsqlPort());
        namedb_input.setText(cf.getmsqlNameDB());
        user_input1.setText(cf.getmsqlUser());
        password_input.setText(cf.getmsqlPass());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txt_jconfigbd = new javax.swing.JLabel();
        txt_ip = new javax.swing.JLabel();
        txt_ip_input = new com.company.iceshield.others.MyTextField();
        password_txt = new javax.swing.JLabel();
        password_input = new com.company.iceshield.others.MyTextField();
        port_txt1 = new javax.swing.JLabel();
        port_input = new com.company.iceshield.others.MyTextField();
        user_txt1 = new javax.swing.JLabel();
        user_input1 = new com.company.iceshield.others.MyTextField();
        namedb_input = new com.company.iceshield.others.MyTextField();
        password_txt1 = new javax.swing.JLabel();
        btn_guardar = new com.company.iceshield.others.JPanelRound();
        txt_guardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 171, 33));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(254, 171, 33));
        bg.setPreferredSize(new java.awt.Dimension(1310, 596));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_jconfigbd.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_jconfigbd.setForeground(new java.awt.Color(255, 255, 255));
        txt_jconfigbd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jconfigbd.setText("Configuración BaseDatos");
        bg.add(txt_jconfigbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, -1));

        txt_ip.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_ip.setText("Host:");
        bg.add(txt_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        txt_ip_input.setText("localhost");
        txt_ip_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip_inputActionPerformed(evt);
            }
        });
        bg.add(txt_ip_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 360, 40));

        password_txt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        password_txt.setText("Password:");
        bg.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        password_input.setText("Password");
        bg.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 360, 40));

        port_txt1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        port_txt1.setText("Port:");
        bg.add(port_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        port_input.setText("3306");
        bg.add(port_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 360, 40));

        user_txt1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        user_txt1.setText("User:");
        bg.add(user_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        user_input1.setText("root");
        bg.add(user_input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 360, 40));

        namedb_input.setText("HeladeriaDB");
        bg.add(namedb_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 360, 40));

        password_txt1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        password_txt1.setText("NameBD:");
        bg.add(password_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        btn_guardar.setBackground(new java.awt.Color(237, 226, 79));
        btn_guardar.setPreferredSize(new java.awt.Dimension(240, 50));
        btn_guardar.setRoundBottomLeft(9);
        btn_guardar.setRoundBottomRight(9);
        btn_guardar.setRoundTopLeft(9);
        btn_guardar.setRoundTopRight(9);
        btn_guardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_guardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_guardar.setText("Guardar");
        txt_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_guardarMouseExited(evt);
            }
        });
        btn_guardar.add(txt_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 50));

        bg.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ip_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip_inputActionPerformed

    private void txt_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_guardarMouseEntered
        btn_guardar.setBackground(new Color(243,232,81));
    }//GEN-LAST:event_txt_guardarMouseEntered

    private void txt_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_guardarMouseExited
        btn_guardar.setBackground(new Color(249,238,96));
    }//GEN-LAST:event_txt_guardarMouseExited

    private void txt_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_guardarMouseClicked
        cf.setAppHost(txt_ip_input.getText());
        cf.setAppPort(port_input.getText());
        cf.setAppnameDB(namedb_input.getText());
        cf.setAppUser(user_input1.getText());
        cf.setAppPass(password_input.getText());
        this.setVisible(false);
    }//GEN-LAST:event_txt_guardarMouseClicked

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
            java.util.logging.Logger.getLogger(JcconfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JcconfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JcconfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JcconfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JcconfigBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.company.iceshield.others.JPanelRound btn_guardar;
    private com.company.iceshield.others.MyTextField namedb_input;
    private com.company.iceshield.others.MyTextField password_input;
    private javax.swing.JLabel password_txt;
    private javax.swing.JLabel password_txt1;
    private com.company.iceshield.others.MyTextField port_input;
    private javax.swing.JLabel port_txt1;
    private javax.swing.JLabel txt_guardar;
    private javax.swing.JLabel txt_ip;
    private com.company.iceshield.others.MyTextField txt_ip_input;
    private javax.swing.JLabel txt_jconfigbd;
    private com.company.iceshield.others.MyTextField user_input1;
    private javax.swing.JLabel user_txt1;
    // End of variables declaration//GEN-END:variables
}
