
package com.company.iceshield.paneles;

import java.awt.BorderLayout;
import java.awt.Color;


public class jMain extends javax.swing.JFrame {


    int Xmouse,Ymouse;
    JPrincipal jp = new JPrincipal();
    public jMain() {
        initComponents();
        setSize(1310, 682);
        fondo_mv.removeAll();
        fondo_mv.add(jp,BorderLayout.CENTER);
        fondo_mv.revalidate();
        fondo_mv.repaint();
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
        Menu = new javax.swing.JPanel();
        btn_mini = new javax.swing.JPanel();
        txt_mini = new javax.swing.JLabel();
        btn_exit = new javax.swing.JPanel();
        txt_exit = new javax.swing.JLabel();
        menu_logo = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JPanel();
        txt_inicio = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JPanel();
        txt_cerrar = new javax.swing.JLabel();
        fondo_mv = new javax.swing.JPanel();
        moviment = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(254, 171, 33));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(249, 238, 96));
        Menu.setPreferredSize(new java.awt.Dimension(1310, 86));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mini.setBackground(new java.awt.Color(249, 238, 96));

        txt_mini.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_mini.setText("-");
        txt_mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_miniMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_miniLayout = new javax.swing.GroupLayout(btn_mini);
        btn_mini.setLayout(btn_miniLayout);
        btn_miniLayout.setHorizontalGroup(
            btn_miniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_mini, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        btn_miniLayout.setVerticalGroup(
            btn_miniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_mini, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Menu.add(btn_mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        btn_exit.setBackground(new java.awt.Color(249, 238, 96));

        txt_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exit.setText("X");
        txt_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_exitLayout = new javax.swing.GroupLayout(btn_exit);
        btn_exit.setLayout(btn_exitLayout);
        btn_exitLayout.setHorizontalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        btn_exitLayout.setVerticalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Menu.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, -1, -1));

        menu_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_menu.png"))); // NOI18N
        Menu.add(menu_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 50));

        btn_inicio.setBackground(new java.awt.Color(249, 238, 96));

        txt_inicio.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_home.png"))); // NOI18N
        txt_inicio.setText("Inicio");
        txt_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_inicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_inicioLayout = new javax.swing.GroupLayout(btn_inicio);
        btn_inicio.setLayout(btn_inicioLayout);
        btn_inicioLayout.setHorizontalGroup(
            btn_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_inicioLayout.setVerticalGroup(
            btn_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Menu.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 90, 40));

        btn_cerrar.setBackground(new java.awt.Color(249, 238, 96));

        txt_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salir.png"))); // NOI18N
        txt_cerrar.setText("Cerrar Sesión");
        txt_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_cerrarLayout = new javax.swing.GroupLayout(btn_cerrar);
        btn_cerrar.setLayout(btn_cerrarLayout);
        btn_cerrarLayout.setHorizontalGroup(
            btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_cerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_cerrarLayout.setVerticalGroup(
            btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_cerrarLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(txt_cerrar)
                .addContainerGap())
        );

        Menu.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 30, -1, -1));

        bg.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 86));

        fondo_mv.setBackground(new java.awt.Color(254, 171, 33));
        fondo_mv.setPreferredSize(new java.awt.Dimension(1310, 596));

        javax.swing.GroupLayout fondo_mvLayout = new javax.swing.GroupLayout(fondo_mv);
        fondo_mv.setLayout(fondo_mvLayout);
        fondo_mvLayout.setHorizontalGroup(
            fondo_mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        fondo_mvLayout.setVerticalGroup(
            fondo_mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        bg.add(fondo_mv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 682));

        moviment.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movimentMouseDragged(evt);
            }
        });
        moviment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movimentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movimentMousePressed(evt);
            }
        });

        javax.swing.GroupLayout movimentLayout = new javax.swing.GroupLayout(moviment);
        moviment.setLayout(movimentLayout);
        movimentLayout.setHorizontalGroup(
            movimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        movimentLayout.setVerticalGroup(
            movimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(moviment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movimentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimentMouseClicked

    }//GEN-LAST:event_movimentMouseClicked

    private void movimentMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimentMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-Xmouse, y-Ymouse);
    }//GEN-LAST:event_movimentMouseDragged

    private void movimentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimentMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_movimentMousePressed

    private void txt_miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_miniMouseEntered
        btn_mini.setBackground(new Color(227,217,84));
    }//GEN-LAST:event_txt_miniMouseEntered

    private void txt_miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_miniMouseExited
        btn_mini.setBackground(new Color(249,238,96));
    }//GEN-LAST:event_txt_miniMouseExited

    private void txt_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseEntered
        btn_exit.setBackground(Color.red);
    }//GEN-LAST:event_txt_exitMouseEntered

    private void txt_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseExited
        btn_exit.setBackground(new Color(249,238,96));
    }//GEN-LAST:event_txt_exitMouseExited

    private void txt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txt_exitMouseClicked

    private void txt_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_miniMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_txt_miniMouseClicked

    private void txt_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_inicioMouseEntered
        btn_inicio.setBackground(new Color(235,221,40));
    }//GEN-LAST:event_txt_inicioMouseEntered

    private void txt_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_inicioMouseExited
        btn_inicio.setBackground(new Color(249,238,96));
    }//GEN-LAST:event_txt_inicioMouseExited

    private void txt_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cerrarMouseExited
        btn_cerrar.setBackground(new Color(249,238,96));
    }//GEN-LAST:event_txt_cerrarMouseExited

    private void txt_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cerrarMouseEntered
        btn_cerrar.setBackground(new Color(235,221,40));
    }//GEN-LAST:event_txt_cerrarMouseEntered

    private void txt_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_inicioMouseClicked
        fondo_mv.removeAll();
        fondo_mv.add(jp,BorderLayout.CENTER);
        fondo_mv.revalidate();
        fondo_mv.repaint();
    }//GEN-LAST:event_txt_inicioMouseClicked

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
            java.util.logging.Logger.getLogger(jMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_cerrar;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_inicio;
    private javax.swing.JPanel btn_mini;
    public static javax.swing.JPanel fondo_mv;
    private javax.swing.JLabel menu_logo;
    private javax.swing.JPanel moviment;
    private javax.swing.JLabel txt_cerrar;
    private javax.swing.JLabel txt_exit;
    private javax.swing.JLabel txt_inicio;
    private javax.swing.JLabel txt_mini;
    // End of variables declaration//GEN-END:variables
}
