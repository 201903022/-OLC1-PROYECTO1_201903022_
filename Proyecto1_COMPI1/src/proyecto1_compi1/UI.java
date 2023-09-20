/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_compi1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Analizadores.Parser; 
import Analizadores.Lexico; 
import java.io.StringReader;
import java.util.LinkedList;
import AnalizadoresJson.ParserJson;

/**
 *
 * @author PC
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
     File file_current = null;
     Parser AnalizadorS = null; 
     String fileName ;
    
    public UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AbrirButtom = new javax.swing.JButton();
        SaveButtom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_editor = new javax.swing.JTextArea();
        SaveAsButtom = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        consola = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AbrirButtom.setText("Abrir");
        AbrirButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirButtomActionPerformed(evt);
            }
        });

        SaveButtom.setText("Guardar");
        SaveButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtomActionPerformed(evt);
            }
        });

        txta_editor.setColumns(20);
        txta_editor.setRows(5);
        txta_editor.setName(""); // NOI18N
        jScrollPane1.setViewportView(txta_editor);

        SaveAsButtom.setText("Guardar Como");
        SaveAsButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsButtomActionPerformed(evt);
            }
        });

        jButton4.setText("ANALIZAR JSON");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ANALIZAR STATPY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        consola.setColumns(20);
        consola.setRows(5);
        consola.setFocusable(false);
        jScrollPane2.setViewportView(consola);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consola");

        jButton6.setText("Graficar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(AbrirButtom)
                        .addGap(28, 28, 28)
                        .addComponent(SaveAsButtom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SaveButtom))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(28, 28, 28)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbrirButtom)
                    .addComponent(SaveAsButtom)
                    .addComponent(SaveButtom)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirButtomActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(txta_editor);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String content = "";
             file_current = fileChooser.getSelectedFile();
             fileName = String.valueOf(file_current.getName().toLowerCase()) ;
             fileName = "\"" +fileName+ "\"";
             System.out.println("File Name: "+fileName);
             data.dataJson.current_FileName = fileName;
            
             
            try {
                Scanner input = new Scanner(file_current);
                while (input.hasNextLine()) {
                    content += input.nextLine() + "\n";
                }
                input.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            txta_editor.setText(content);
        }
    }//GEN-LAST:event_AbrirButtomActionPerformed

    private void SaveButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtomActionPerformed
        // TODO add your handling code here:
        File file = file_current;
        String text = txta_editor.getText();
        try (PrintWriter out = new PrintWriter(file, StandardCharsets.UTF_8)) {
            out.print(text);
            System.out.println("Guardado exitosamente");

        }     catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SaveButtomActionPerformed

    private void SaveAsButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsButtomActionPerformed
        // TODO add your handling code here:
        String nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo:");
        if (nombreArchivo != null) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
                bw.write(txta_editor.getText());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SaveAsButtomActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String codigo = txta_editor.getText();
            try{ 
                AnalizadoresJson.Lexico scanner = new AnalizadoresJson.Lexico(new StringReader(codigo));
                 AnalizadoresJson.ParserJson AnalizadorJ = new AnalizadoresJson.ParserJson(scanner);  
                 
                AnalizadorJ.parse();
                
                data.dataJson.agregar();
                data.dataJson.Sho();
                
            }catch (Exception e) {
              }
           //Codigo omitido 
           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                   String codigo = txta_editor.getText();
        try {
            Lexico scanner = new Lexico (new StringReader(codigo));
            AnalizadorS = new Parser(scanner);    
            AnalizadorS.parse(); 
            if(!AnalizadorS.errores_s.equals("")|| !scanner.errores.equals("")){
                System.out.println("Errroreees");
                String reporte_errores = "<!doctype html>\n"
                + "<html lang=\"en\">\n"
                + "  <head>\n"
                + "    <!-- Required meta tags -->\n"
                + "    <meta charset=\"utf-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
                + "\n"
                + "    <!-- Bootstrap CSS -->\n"
                + "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n"
                + "\n"
                + "    <title>Hello, world!</title>\n"
                + "  </head>\n"
                + "  <body>\n"
                + "<table class=\"table table-hover table-dark\">\n"
                + "  <thead>\n"
                + "    <tr>\n"
                + "      <th scope=\"col\">Tipo de Error</th>\n"
                + "      <th scope=\"col\">DescripciÃ³n</th>\n"
                + "      <th scope=\"col\">LÃ­nea</th>\n"
                + "      <th scope=\"col\">Columna</th>\n"
                + "    </tr>\n"
                + "  </thead>\n"
                + "  <tbody>\n" + AnalizadorS.errores_s + scanner.errores
                + "</tbody>\n"
                + "</table>\n"
                + "    <!-- Optional JavaScript -->\n"
                + "    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n"
                + "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n"
                + "    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n"
                + "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n"
                + "  </body>\n"
                + "</html>";
                crearArchivo("src/REPORTE_ERRORES/", "Reporte de errores.html ", reporte_errores);
                consola.setText("Se detectaron errores en la entrada, escritos a la carpeta de errores");
                String codigo1 = Tabla_Simbolos.DataSimbolos.table();
                crearArchivo("src/REPORT_SIMBOLOS/", "Reporte de simbolos.html ", codigo1);
               consola.setText(Traductor.Traduc.mostrar());
                return;
            }else { 
                System.out.println("No errrores");
                String codigo1 = Tabla_Simbolos.DataSimbolos.table();
                crearArchivo("src/REPORT_SIMBOLOS/", "Reporte de simbolos.html ", codigo1);
                 consola.setText(Traductor.Traduc.mostrar());
            }
        } catch (Exception e) {
       
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        Graficas.Graficar.barras(data.Valorees.TituloBarras, data.Valorees.TituloX, data.Valorees.TituloY, data.Valorees.valores, data.Valorees.ejex);

        Graficas.Graficar.Pie(data.Valorees.TituloPie, data.Valorees.TituloX, data.Valorees.TituloY, data.Valorees.valoresP, data.Valorees.ejexP);
         data.Valorees.TituloBarras = "";
        data.Valorees.TituloX = "";  
        data.Valorees.TituloY = "";
        data.Valorees.valores.clear();
        data.Valorees.ejex.clear();
        data.Valorees.TituloPie = "";
       data.Valorees.valoresP.clear();
        data.Valorees.ejexP.clear();
        
    }//GEN-LAST:event_jButton6ActionPerformed
public void crearArchivo(String dir, String nombre, String texto) {
    File file = new File(dir, nombre);

    try {
        if (!file.exists()) {
            file.createNewFile();
        }

        try (PrintWriter pw = new PrintWriter(file)) {
            pw.write(texto);
        }
    } catch (IOException ex) {
        // Manejo de excepciones aquí (puedes imprimir mensajes de error o lanzar excepciones según sea necesario)
        ex.printStackTrace();
    }
}
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirButtom;
    private javax.swing.JButton SaveAsButtom;
    private javax.swing.JButton SaveButtom;
    private javax.swing.JTextArea consola;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txta_editor;
    // End of variables declaration//GEN-END:variables
}
