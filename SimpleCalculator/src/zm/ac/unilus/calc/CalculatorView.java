/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.calc;

/**
 *
 * @author MARCUS
 */
public class CalculatorView extends javax.swing.JFrame {

    private final CalculatorController controller;

    /**
     * Creates new form Calculator
     */
    public CalculatorView() {

        initComponents();
        this.controller = new CalculatorController(this);
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subtractBtn = new javax.swing.JButton();
        digit2Btn = new javax.swing.JButton();
        digit1Btn = new javax.swing.JButton();
        digit3Btn = new javax.swing.JButton();
        digit4Btn = new javax.swing.JButton();
        digit5Btn = new javax.swing.JButton();
        digit6Btn = new javax.swing.JButton();
        digit7Btn = new javax.swing.JButton();
        digit8Btn = new javax.swing.JButton();
        digit9Btn = new javax.swing.JButton();
        digit0Btn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        multiplyBtn = new javax.swing.JButton();
        divideBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        expressionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unilus Simple Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(204, 204, 255));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        subtractBtn.setText("-");
        subtractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractBtnActionPerformed(evt);
            }
        });

        digit2Btn.setText("2");
        digit2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit2BtnActionPerformed(evt);
            }
        });

        digit1Btn.setText("1");
        digit1Btn.setName("digit1"); // NOI18N
        digit1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit1BtnActionPerformed(evt);
            }
        });

        digit3Btn.setText("3");
        digit3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit3BtnActionPerformed(evt);
            }
        });

        digit4Btn.setText("4");
        digit4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit4BtnActionPerformed(evt);
            }
        });

        digit5Btn.setText("5");
        digit5Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit5BtnActionPerformed(evt);
            }
        });

        digit6Btn.setText("6");
        digit6Btn.setToolTipText("");
        digit6Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit6BtnActionPerformed(evt);
            }
        });

        digit7Btn.setText("7");
        digit7Btn.setToolTipText("");
        digit7Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit7BtnActionPerformed(evt);
            }
        });

        digit8Btn.setText("8");
        digit8Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit8BtnActionPerformed(evt);
            }
        });

        digit9Btn.setText("9");
        digit9Btn.setToolTipText("");
        digit9Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit9BtnActionPerformed(evt);
            }
        });

        digit0Btn.setText("0");
        digit0Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit0BtnActionPerformed(evt);
            }
        });

        addBtn.setText("+");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        multiplyBtn.setText("X");
        multiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyBtnActionPerformed(evt);
            }
        });

        divideBtn.setText("/");
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });

        equalBtn.setText("=");
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("C");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        expressionLabel.setBackground(new java.awt.Color(0, 51, 51));
        expressionLabel.setFont(new java.awt.Font("Digital-7", 3, 24)); // NOI18N
        expressionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        expressionLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        expressionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(expressionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addGap(2, 2, 2)
                                    .addComponent(subtractBtn)
                                    .addGap(22, 22, 22)
                                    .addComponent(multiplyBtn)
                                    .addGap(28, 28, 28)
                                    .addComponent(divideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(addBtn, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(digit1Btn)
                                    .addComponent(digit5Btn)
                                    .addComponent(digit0Btn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(digit6Btn)
                                        .addGap(18, 18, 18)
                                        .addComponent(digit7Btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(digit8Btn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(digit2Btn)
                                        .addGap(18, 18, 18)
                                        .addComponent(digit3Btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(digit4Btn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(digit9Btn)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(equalBtn)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(expressionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(multiplyBtn)
                    .addComponent(subtractBtn)
                    .addComponent(divideBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digit1Btn)
                    .addComponent(digit2Btn)
                    .addComponent(digit3Btn)
                    .addComponent(digit4Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digit5Btn)
                    .addComponent(digit6Btn)
                    .addComponent(digit7Btn)
                    .addComponent(digit8Btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(digit0Btn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(digit9Btn)
                        .addComponent(clearBtn)
                        .addComponent(equalBtn)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        controller.resetModel();

    }//GEN-LAST:event_clearBtnActionPerformed

    private void digit9BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit9BtnActionPerformed

        controller.updateOperandViewModel(9);
    }//GEN-LAST:event_digit9BtnActionPerformed


    private void digit1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit1BtnActionPerformed

        controller.updateOperandViewModel(1);

    }//GEN-LAST:event_digit1BtnActionPerformed


    private void digit2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit2BtnActionPerformed

        controller.updateOperandViewModel(2);
    }//GEN-LAST:event_digit2BtnActionPerformed

    private void digit0BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit0BtnActionPerformed

        controller.updateOperandViewModel(0);
    }//GEN-LAST:event_digit0BtnActionPerformed

    private void digit4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit4BtnActionPerformed

        controller.updateOperandViewModel(4);
    }//GEN-LAST:event_digit4BtnActionPerformed

    private void digit8BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit8BtnActionPerformed

        controller.updateOperandViewModel(8);
    }//GEN-LAST:event_digit8BtnActionPerformed

    private void digit6BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit6BtnActionPerformed

        controller.updateOperandViewModel(6);
    }//GEN-LAST:event_digit6BtnActionPerformed

    private void digit7BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit7BtnActionPerformed
        controller.updateOperandViewModel(7);
    }//GEN-LAST:event_digit7BtnActionPerformed

    private void digit3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit3BtnActionPerformed
        controller.updateOperandViewModel(3);
    }//GEN-LAST:event_digit3BtnActionPerformed

    private void digit5BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit5BtnActionPerformed
        controller.updateOperandViewModel(5);
    }//GEN-LAST:event_digit5BtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        controller.updateOperatorViewModel("+");
    }//GEN-LAST:event_addBtnActionPerformed

    private void multiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyBtnActionPerformed
        controller.updateOperatorViewModel("*");
    }//GEN-LAST:event_multiplyBtnActionPerformed

    private void subtractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractBtnActionPerformed
        controller.updateOperatorViewModel("-");
    }//GEN-LAST:event_subtractBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed

        controller.updateAnswerViewModel();
    }//GEN-LAST:event_equalBtnActionPerformed

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
        controller.updateOperatorViewModel("/");
    }//GEN-LAST:event_divideBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton digit0Btn;
    private javax.swing.JButton digit1Btn;
    private javax.swing.JButton digit2Btn;
    private javax.swing.JButton digit3Btn;
    private javax.swing.JButton digit4Btn;
    private javax.swing.JButton digit5Btn;
    private javax.swing.JButton digit6Btn;
    private javax.swing.JButton digit7Btn;
    private javax.swing.JButton digit8Btn;
    private javax.swing.JButton digit9Btn;
    private javax.swing.JButton divideBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JLabel expressionLabel;
    private javax.swing.JButton multiplyBtn;
    private javax.swing.JButton subtractBtn;
    // End of variables declaration//GEN-END:variables
}