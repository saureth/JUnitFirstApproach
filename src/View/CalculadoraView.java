package View;

import Ctrl.CalcularIF;
import Model.Calcular;
import javax.swing.JOptionPane;

public class CalculadoraView extends javax.swing.JFrame {
    public float first, second, result;
    private CalcularIF control;

    public CalculadoraView() {
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

        FirstValue = new javax.swing.JTextField();
        SecondValue = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        substractButton = new javax.swing.JButton();
        multplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        ResultLabel = new javax.swing.JLabel();
        AnswerToFirstValue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FirstValue.setToolTipText("First Number");

        SecondValue.setToolTipText("Second Number\n");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        substractButton.setText("Substract");
        substractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractButtonActionPerformed(evt);
            }
        });

        multplyButton.setText("Multiply");
        multplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multplyButtonActionPerformed(evt);
            }
        });

        divideButton.setText("Divide");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        ResultLabel.setText("Result: ");

        AnswerToFirstValue.setText("Answer");
        AnswerToFirstValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerToFirstValueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(FirstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(SecondValue, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(substractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ResultLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnswerToFirstValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(divideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecondValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(substractButton)
                    .addComponent(multplyButton)
                    .addComponent(divideButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResultLabel)
                    .addComponent(AnswerToFirstValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            first = Float.parseFloat(FirstValue.getText());
            second = Float.parseFloat(SecondValue.getText());
            control= new Calcular(first, second);
            result = control.Add(first, second);
            ResultLabel.setText("Result: " + control.toString());
            FirstValue.setText("");
            SecondValue.setText("");
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Lo que escribió no son números", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay errores, revise sus números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void substractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractButtonActionPerformed
        try {
            first = Float.parseFloat(FirstValue.getText());
            second = Float.parseFloat(SecondValue.getText());
            control= new Calcular(first, second);
            result = control.Substract(first, second);
            ResultLabel.setText("Result: " + control.toString());
            FirstValue.setText("");
            SecondValue.setText("");
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Lo que escribió no son números", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay errores, revise sus números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_substractButtonActionPerformed

    private void multplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multplyButtonActionPerformed
        try {
            first = Float.parseFloat(FirstValue.getText());
            second = Float.parseFloat(SecondValue.getText());
            control= new Calcular(first, second);
            result = control.Multiply(first, second);
            ResultLabel.setText("Result: " + control.toString());
            FirstValue.setText("");
            SecondValue.setText("");
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Lo que escribió no son números", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay errores, revise sus números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_multplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        try {
            first = Float.parseFloat(FirstValue.getText());
            second = Float.parseFloat(SecondValue.getText());
            control= new Calcular(first, second);
            System.out.println(second+"  " + SecondValue.getText());
            if (SecondValue.getText().equalsIgnoreCase("0") || second == 0) {
                JOptionPane.showMessageDialog(null, "No divida por cero", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                result = control.Divide(first, second);
                ResultLabel.setText(""+result);
            }
            FirstValue.setText("");
            SecondValue.setText("");
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Lo que escribió no son números", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " " + e.getMessage(), "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_divideButtonActionPerformed

    //the idea is to put the answer as the first value of the calculator
    private void AnswerToFirstValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerToFirstValueActionPerformed
        if (ResultLabel.getText().equals("Result: ")) {
            FirstValue.setText("" + 0.0f);
            SecondValue.setText("" + 0.0f);
        } else {
            FirstValue.setText("" + result);
        }
    }//GEN-LAST:event_AnswerToFirstValueActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerToFirstValue;
    private javax.swing.JTextField FirstValue;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JTextField SecondValue;
    private javax.swing.JButton addButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton multplyButton;
    private javax.swing.JButton substractButton;
    // End of variables declaration//GEN-END:variables
}
