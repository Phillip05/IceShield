/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.company.iceshield.paneles;

/**
 *
 * @author Luidev02
 */
public class JReport extends javax.swing.JPanel {

    /**
     * Creates new form JReport
     */
    public JReport() {
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

        txt_codigo = new javax.swing.JLabel();
        btn_buscar = new com.company.iceshield.others.JPanelRound();
        txt_buscar = new javax.swing.JLabel();
        jPanelRound1 = new com.company.iceshield.others.JPanelRound();
        jLabel1 = new javax.swing.JLabel();
        jPanelRound2 = new com.company.iceshield.others.JPanelRound();
        myTextField1 = new com.company.iceshield.others.MyTextField();

        setBackground(new java.awt.Color(254, 171, 33));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_codigo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_codigo.setText("Codigo:");
        add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 26, -1, -1));

        btn_buscar.setBackground(new java.awt.Color(249, 238, 96));
        btn_buscar.setRoundBottomLeft(9);
        btn_buscar.setRoundBottomRight(9);
        btn_buscar.setRoundTopLeft(9);
        btn_buscar.setRoundTopRight(9);

        txt_buscar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_buscar.setText("Buscar");

        javax.swing.GroupLayout btn_buscarLayout = new javax.swing.GroupLayout(btn_buscar);
        btn_buscar.setLayout(btn_buscarLayout);
        btn_buscarLayout.setHorizontalGroup(
            btn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_buscarLayout.setVerticalGroup(
            btn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 248, -1));

        jPanelRound1.setBackground(new java.awt.Color(249, 238, 96));
        jPanelRound1.setRoundBottomLeft(9);
        jPanelRound1.setRoundBottomRight(9);
        jPanelRound1.setRoundTopLeft(9);
        jPanelRound1.setRoundTopRight(9);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Descargar Reporte");

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelRound1Layout.setVerticalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 248, -1));

        jPanelRound2.setRoundBottomLeft(12);
        jPanelRound2.setRoundBottomRight(12);
        jPanelRound2.setRoundTopLeft(12);
        jPanelRound2.setRoundTopRight(12);

        javax.swing.GroupLayout jPanelRound2Layout = new javax.swing.GroupLayout(jPanelRound2);
        jPanelRound2.setLayout(jPanelRound2Layout);
        jPanelRound2Layout.setHorizontalGroup(
            jPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanelRound2Layout.setVerticalGroup(
            jPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        add(jPanelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 870, 540));
        add(myTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 25, 180, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.company.iceshield.others.JPanelRound btn_buscar;
    private javax.swing.JLabel jLabel1;
    private com.company.iceshield.others.JPanelRound jPanelRound1;
    private com.company.iceshield.others.JPanelRound jPanelRound2;
    private com.company.iceshield.others.MyTextField myTextField1;
    private javax.swing.JLabel txt_buscar;
    private javax.swing.JLabel txt_codigo;
    // End of variables declaration//GEN-END:variables
}
