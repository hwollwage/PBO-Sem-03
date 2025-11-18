
package assignment;

public class assignment extends javax.swing.JFrame { 
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(assignment.class.getName());
    private double num1, num2, result;
    private boolean isOperatorClicked = false;
    String operator;
    
    public assignment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btndivide = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnmultiply = new javax.swing.JButton();
        btnminus = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btnpoint = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDisplay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn8.setText("8");
        btn8.addActionListener(this::btn8ActionPerformed);

        btn7.setText("7");
        btn7.addActionListener(this::btn7ActionPerformed);

        btn0.setText("0");
        btn0.addActionListener(this::btn0ActionPerformed);

        btn4.setText("4");
        btn4.addActionListener(this::btn4ActionPerformed);

        btn1.setText("1");
        btn1.addActionListener(this::btn1ActionPerformed);

        btn2.setText("2");
        btn2.addActionListener(this::btn2ActionPerformed);

        btn9.setText("9");
        btn9.addActionListener(this::btn9ActionPerformed);

        btndivide.setText("/");
        btndivide.addActionListener(this::btndivideActionPerformed);

        btn5.setText("5");
        btn5.addActionListener(this::btn5ActionPerformed);

        btn3.setText("3");
        btn3.addActionListener(this::btn3ActionPerformed);

        btn6.setText("6");
        btn6.addActionListener(this::btn6ActionPerformed);

        btnmultiply.setText("*");
        btnmultiply.addActionListener(this::btnmultiplyActionPerformed);

        btnminus.setText("-");
        btnminus.addActionListener(this::btnminusActionPerformed);

        btnplus.setText("+");
        btnplus.addActionListener(this::btnplusActionPerformed);

        btnpoint.setText(".");

        btnequal.setText("=");
        btnequal.addActionListener(this::btnequalActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                    .addComponent(btndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnmultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnequal, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("8");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "8");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("9");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "9");
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("1");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "1");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("2");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "2");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("3");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "3");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("4");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "4");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("5");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "5");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("6");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "6");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (isOperatorClicked) {
            txtDisplay.setText("7");
            isOperatorClicked = false;
        } else {
            txtDisplay.setText(txtDisplay.getText() + "7");
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivideActionPerformed
        num1 = Double.parseDouble(txtDisplay.getText());
        operator = "/";
        isOperatorClicked = true;
        
    }//GEN-LAST:event_btndivideActionPerformed

    private void btnmultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplyActionPerformed
        num1 = Double.parseDouble(txtDisplay.getText());
        operator = "*";
        isOperatorClicked = true;
        
    }//GEN-LAST:event_btnmultiplyActionPerformed

    private void btnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminusActionPerformed
        num1 = Double.parseDouble(txtDisplay.getText());
        operator = "-";
        isOperatorClicked = true;
        
    }//GEN-LAST:event_btnminusActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        num1 = Double.parseDouble(txtDisplay.getText());
        operator = "+";
        isOperatorClicked = true;
        
    }//GEN-LAST:event_btnplusActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
        // TODO add your handling code here:
        num2 = Double.parseDouble(txtDisplay.getText());
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        txtDisplay.setText(String.valueOf(result));
    }//GEN-LAST:event_btnequalActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new assignment().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btndivide;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnminus;
    private javax.swing.JButton btnmultiply;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnpoint;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
