package br.com.view;
import br.com.controle.Calculadora;

public class Tela01 extends javax.swing.JFrame {
    private Object jTvalorw;
    private Object c;

    /**
     * Creates new form Tela01
     */
    public Tela01() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTvalor1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTvalor2 = new javax.swing.JTextField();
        jBsomar = new javax.swing.JButton();
        jBsubtrair = new javax.swing.JButton();
        jBmultiplicar = new javax.swing.JButton();
        jBdividir = new javax.swing.JButton();
        jBresto = new javax.swing.JButton();
        jLresultados = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite o Valor 1: ");

        jTvalor1.setColumns(6);

        jLabel2.setText("Digite o Valor 2:");

        jTvalor2.setColumns(6);

        jBsomar.setText("+");
        jBsomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsomarActionPerformed(evt);
            }
        });

        jBsubtrair.setText("-");
        jBsubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubtrairActionPerformed(evt);
            }
        });

        jBmultiplicar.setText("*");
        jBmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmultiplicarActionPerformed(evt);
            }
        });

        jBdividir.setText("/");
        jBdividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdividirActionPerformed(evt);
            }
        });

        jBresto.setText("%");
        jBresto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrestoActionPerformed(evt);
            }
        });

        jLresultados.setText("0.00");

        jLabel4.setText("CALCULADORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLresultados)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBsomar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBsubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBdividir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBresto)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsomar)
                    .addComponent(jBsubtrair)
                    .addComponent(jBmultiplicar)
                    .addComponent(jBdividir)
                    .addComponent(jBresto))
                .addGap(45, 45, 45)
                .addComponent(jLresultados)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsomarActionPerformed
        Calculadora cal = new Calculadora ();
        cal.setValor1(Double.valueOf(jTvalor1.getText()));
        cal.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultados.setText(String.valueOf(cal.Somar()));
        jTvalor1.setText(null);
        jTvalor2.setText(null);
        jTvalor1.requestFocus();           
    }//GEN-LAST:event_jBsomarActionPerformed

    private void jBrestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrestoActionPerformed
        Calculadora cal = new Calculadora ();
        cal.setValor1(Double.valueOf(jTvalor1.getText()));
        cal.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultados.setText(String.valueOf(cal.Resto()));
    }//GEN-LAST:event_jBrestoActionPerformed

    private void jBsubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubtrairActionPerformed
        Calculadora cal = new Calculadora ();
        cal.setValor1(Double.valueOf(jTvalor1.getText()));
        cal.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultados.setText(String.valueOf(cal.Subtrair()));     
    }//GEN-LAST:event_jBsubtrairActionPerformed

    private void jBmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmultiplicarActionPerformed
        Calculadora cal = new Calculadora ();
        cal.setValor1(Double.valueOf(jTvalor1.getText()));
        cal.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultados.setText(String.valueOf(cal.Multiplicar()));
    }//GEN-LAST:event_jBmultiplicarActionPerformed

    private void jBdividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdividirActionPerformed
        Calculadora cal = new Calculadora ();
        cal.setValor1(Double.valueOf(jTvalor1.getText()));
        cal.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultados.setText(String.valueOf(cal.Dividir()));
    }//GEN-LAST:event_jBdividirActionPerformed

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
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdividir;
    private javax.swing.JButton jBmultiplicar;
    private javax.swing.JButton jBresto;
    private javax.swing.JButton jBsomar;
    private javax.swing.JButton jBsubtrair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLresultados;
    private javax.swing.JTextField jTvalor1;
    private javax.swing.JTextField jTvalor2;
    // End of variables declaration//GEN-END:variables
}
