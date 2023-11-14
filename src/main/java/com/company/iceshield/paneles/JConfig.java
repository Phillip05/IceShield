
package com.company.iceshield.paneles;

import java.awt.BorderLayout;
import java.awt.Color;


public class JConfig extends javax.swing.JPanel {


    JUser ju = new JUser();
    JconfigBD jcbd = new JconfigBD();
    public JConfig() {
        initComponents();
        setSize(1310, 596);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_1 = new com.company.iceshield.others.JPanelRound();
        clic_btn1 = new javax.swing.JLabel();
        btn1_img = new javax.swing.JLabel();
        btn1_txt = new javax.swing.JLabel();
        btn_2 = new com.company.iceshield.others.JPanelRound();
        clic_btn3 = new javax.swing.JLabel();
        btn1_img2 = new javax.swing.JLabel();
        btn1_txt2 = new javax.swing.JLabel();
        fondo_config = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 171, 33));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(249, 238, 96));
        btn_1.setRoundBottomLeft(14);
        btn_1.setRoundBottomRight(14);
        btn_1.setRoundTopLeft(14);
        btn_1.setRoundTopRight(14);
        btn_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clic_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clic_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clic_btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clic_btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clic_btn1MouseExited(evt);
            }
        });
        btn_1.add(clic_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 190));

        btn1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/db.png"))); // NOI18N
        btn_1.add(btn1_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 32, -1, -1));

        btn1_txt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn1_txt.setText("Configuración BD");
        btn_1.add(btn1_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 99, 252, -1));

        add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 264, 189));

        btn_2.setBackground(new java.awt.Color(249, 238, 96));
        btn_2.setPreferredSize(new java.awt.Dimension(270, 190));
        btn_2.setRoundBottomLeft(14);
        btn_2.setRoundBottomRight(14);
        btn_2.setRoundTopLeft(14);
        btn_2.setRoundTopRight(14);
        btn_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clic_btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clic_btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clic_btn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clic_btn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clic_btn3MouseExited(evt);
            }
        });
        btn_2.add(clic_btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 190));

        btn1_img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        btn_2.add(btn1_img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 32, -1, -1));

        btn1_txt2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1_txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn1_txt2.setText("Usuarios");
        btn_2.add(btn1_txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 99, 252, -1));

        add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        fondo_config.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_config.png"))); // NOI18N
        add(fondo_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 580, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void clic_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clic_btn1MouseClicked
        jMain.fondo_mv.removeAll();
        jMain.fondo_mv.add(jcbd,BorderLayout.CENTER);
        jMain.fondo_mv.revalidate();
        jMain.fondo_mv.repaint();
    }//GEN-LAST:event_clic_btn1MouseClicked

    private void clic_btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clic_btn1MouseEntered
        btn_1.setBackground(new Color(243,232,81));
    }//GEN-LAST:event_clic_btn1MouseEntered

    private void clic_btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clic_btn1MouseExited
        btn_1.setBackground(new Color(249,238,96));
    }//GEN-LAST:event_clic_btn1MouseExited

    private void clic_btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clic_btn3MouseClicked
        jMain.fondo_mv.removeAll();
        jMain.fondo_mv.add(ju,BorderLayout.CENTER);
        jMain.fondo_mv.revalidate();
        jMain.fondo_mv.repaint();
    }//GEN-LAST:event_clic_btn3MouseClicked

    private void clic_btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clic_btn3MouseEntered
        btn_2.setBackground(new Color(243,232,81));
    }//GEN-LAST:event_clic_btn3MouseEntered

    private void clic_btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clic_btn3MouseExited
        btn_2.setBackground(new Color(249,238,96));
    }//GEN-LAST:event_clic_btn3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn1_img;
    private javax.swing.JLabel btn1_img2;
    private javax.swing.JLabel btn1_txt;
    private javax.swing.JLabel btn1_txt2;
    private com.company.iceshield.others.JPanelRound btn_1;
    private com.company.iceshield.others.JPanelRound btn_2;
    private javax.swing.JLabel clic_btn1;
    private javax.swing.JLabel clic_btn3;
    private javax.swing.JLabel fondo_config;
    // End of variables declaration//GEN-END:variables
}
