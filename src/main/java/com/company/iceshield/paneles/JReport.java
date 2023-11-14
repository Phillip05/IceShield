package com.company.iceshield.paneles;

import com.company.iceshield.database.MysqlConnector;
import com.company.iceshield.jLogin;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class JReport extends javax.swing.JPanel {

    /**
     * Creates new form JReport
     */
    MysqlConnector myconnector = new MysqlConnector();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_input_report = new javax.swing.JList<>();
        txt_input_codigo = new com.company.iceshield.others.MyTextField();

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
        txt_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_buscarMouseClicked(evt);
            }
        });

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
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

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

        txt_input_report.setToolTipText("");
        txt_input_report.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txt_input_report);

        javax.swing.GroupLayout jPanelRound2Layout = new javax.swing.GroupLayout(jPanelRound2);
        jPanelRound2.setLayout(jPanelRound2Layout);
        jPanelRound2Layout.setHorizontalGroup(
            jPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRound2Layout.setVerticalGroup(
            jPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(jPanelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 870, 540));
        add(txt_input_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 25, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarMouseClicked
// Obtener el ID desde el campo de texto
        int id = Integer.parseInt(txt_input_codigo.getText());

// Consulta SQL parametrizada para buscar en la tabla 'ventas' por ID
        String query = "SELECT * FROM ventas WHERE id = ?";

        try (Connection connection = myconnector.getConexionDB(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Establecer el parámetro en la consulta
            preparedStatement.setInt(1, id);

            // Ejecutar la consulta y procesar los resultados
            try (ResultSet rs = preparedStatement.executeQuery()) {
                // Verificar si hay resultados
                if (rs.next()) {
                    // Obtener la cadena de productos desde la columna 'productos_venta'
                    String txreport = rs.getString("productos_venta");

                    // Dividir la cadena en elementos individuales
                    String[] productosArray = txreport.split(" ");

                    // Limpiar el modelo antes de agregar nuevos elementos
                    DefaultListModel<String> listModel = new DefaultListModel<>();

                    // Agregar cada producto al modelo de lista
                    for (String producto : productosArray) {
                        listModel.addElement(producto);
                    }

                    // Asignar el modelo al JList
                    txt_input_report.setModel(listModel);

                    // Otros pasos necesarios según tu lógica
                    // ...
                    System.out.println("Resultados encontrados para el ID: " + id);
                } else {
                    // Manejar el caso en que no se encontraron resultados para el ID dado
                    System.out.println("No se encontraron resultados para el ID: " + id);
                }
            }

        } catch (NumberFormatException ex) {
            // Manejar la excepción si el valor ingresado no es un número válido
            System.err.println("Error: El valor ingresado no es un número válido.");
        } catch (SQLException ex) {
            Logger.getLogger(JReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            // Manejar otras excepciones generales
            ex.printStackTrace();
        }

    }//GEN-LAST:event_txt_buscarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            // Obtener el ID desde el campo de texto
            int id = Integer.parseInt(txt_input_codigo.getText());

            // Consulta SQL parametrizada para buscar en la tabla 'ventas' por ID
            String query = "SELECT * FROM ventas WHERE id = ?";

            // Intentar establecer la conexión y ejecutar la consulta
            try (Connection connection = myconnector.getConexionDB(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                // Establecer el parámetro en la consulta
                preparedStatement.setInt(1, id);

                // Ejecutar la consulta y procesar los resultados
                try (ResultSet rs = preparedStatement.executeQuery()) {
                    // Verificar si hay resultados
                    if (rs.next()) {
                        // Obtener la cadena de productos desde la columna 'productos_venta'
                        String txreport = rs.getString("productos_venta");
                        int valortotal = rs.getInt("valortotal");

      
                        // Generar el contenido para el PDF
                        String contenidoPDF = "Producto comprado: Producto1\nValor Total: $"+valortotal+"\n"+txreport;

                        // Generar el nombre del archivo PDF
                        String nombreArchivoPDF = "Reporte_ID_" + id + ".pdf";

                        // Generar el PDF con iText
                        generarPDF_iText(nombreArchivoPDF, contenidoPDF);

                        System.out.println("Resultados encontrados para el ID: " + id);
                    } else {
                        // Manejar el caso en que no se encontraron resultados para el ID dado
                        System.out.println("No se encontraron resultados para el ID: " + id);
                    }
                }
            }

        } catch (NumberFormatException ex) {
            // Manejar la excepción si el valor ingresado no es un número válido
            System.err.println("Error: El valor ingresado no es un número válido.");
        } catch (SQLException ex) {
            Logger.getLogger(JReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            // Manejar otras excepciones generales
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void generarPDF_iText(String nombreArchivo, String contenido) throws IOException {
        Document document = new Document(PageSize.A4);

        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
            document.open();

            // Agregar el contenido al PDF
            document.add(new Paragraph(contenido));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.company.iceshield.others.JPanelRound btn_buscar;
    private javax.swing.JLabel jLabel1;
    private com.company.iceshield.others.JPanelRound jPanelRound1;
    private com.company.iceshield.others.JPanelRound jPanelRound2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_buscar;
    private javax.swing.JLabel txt_codigo;
    private com.company.iceshield.others.MyTextField txt_input_codigo;
    private javax.swing.JList<String> txt_input_report;
    // End of variables declaration//GEN-END:variables
}
