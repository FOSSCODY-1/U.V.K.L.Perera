/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

/**
 *
 * @author kasuni
 */
public class interface_cal extends javax.swing.JFrame {

    double n1;
    double n2;
    double result; 
    String opr;
    private Object math;
    
    
    public interface_cal() {
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

        tfDisplay = new javax.swing.JTextField();
        jbDEL = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jbMUL = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jbADD = new javax.swing.JButton();
        jbpoint = new javax.swing.JButton();
        jbPLUSMINUS = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbANS = new javax.swing.JButton();
        jbDIV = new javax.swing.JButton();
        jbEQL = new javax.swing.JButton();
        jbSUB = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jbBACKS = new javax.swing.JButton();
        jbTAN = new javax.swing.JButton();
        jbCOS = new javax.swing.JButton();
        jbSIN = new javax.swing.JButton();
        jbLOG = new javax.swing.JButton();
        jbSQR = new javax.swing.JButton();
        jbCOSEC = new javax.swing.JButton();
        jbCLEAR = new javax.swing.JButton();
        jbCOT = new javax.swing.JButton();
        jbSEC = new javax.swing.JButton();
        jbPI = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        tfDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDisplayActionPerformed(evt);
            }
        });

        jbDEL.setText("DEL");

        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jbMUL.setText("*");
        jbMUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMULActionPerformed(evt);
            }
        });

        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jbADD.setText("+");
        jbADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbADDActionPerformed(evt);
            }
        });

        jbpoint.setText(".");
        jbpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpointActionPerformed(evt);
            }
        });

        jbPLUSMINUS.setText("+/-");
        jbPLUSMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPLUSMINUSActionPerformed(evt);
            }
        });

        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jbANS.setText("ANS");
        jbANS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbANSActionPerformed(evt);
            }
        });

        jbDIV.setText("/");
        jbDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDIVActionPerformed(evt);
            }
        });

        jbEQL.setText("=");
        jbEQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEQLActionPerformed(evt);
            }
        });

        jbSUB.setText("-");
        jbSUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSUBActionPerformed(evt);
            }
        });

        jButton20.setText("AC");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("x^y");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jbBACKS.setText("←");
        jbBACKS.setToolTipText("");
        jbBACKS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBACKSActionPerformed(evt);
            }
        });

        jbTAN.setText("tan");
        jbTAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTANActionPerformed(evt);
            }
        });

        jbCOS.setText("cos");
        jbCOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCOSActionPerformed(evt);
            }
        });

        jbSIN.setText("sin");
        jbSIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSINActionPerformed(evt);
            }
        });

        jbLOG.setText("log");
        jbLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLOGActionPerformed(evt);
            }
        });

        jbSQR.setText("√");
        jbSQR.setToolTipText("");
        jbSQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSQRActionPerformed(evt);
            }
        });

        jbCOSEC.setText("cosec");
        jbCOSEC.setToolTipText("");
        jbCOSEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCOSECActionPerformed(evt);
            }
        });

        jbCLEAR.setText("C");
        jbCLEAR.setToolTipText("");
        jbCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCLEARActionPerformed(evt);
            }
        });

        jbCOT.setText("cot");
        jbCOT.setToolTipText("");
        jbCOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCOTActionPerformed(evt);
            }
        });

        jbSEC.setText("sec");
        jbSEC.setToolTipText("");
        jbSEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSECActionPerformed(evt);
            }
        });

        jbPI.setText("pi");
        jbPI.setToolTipText("");
        jbPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPIActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfDisplay, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbMUL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbLOG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBACKS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbPLUSMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbANS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbADD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbEQL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSUB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbPI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCOSEC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCLEAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSQR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbCOS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbTAN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbSEC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBACKS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSQR, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMUL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLOG, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSIN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCOS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbTAN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbADD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSUB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCOSEC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSEC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbPI, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbANS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEQL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPLUSMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        String n=tfDisplay.getText() + jb7.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
         String n=tfDisplay.getText() + jb8.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb8ActionPerformed

    private void jbDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDIVActionPerformed
        
    }//GEN-LAST:event_jbDIVActionPerformed

    private void jbEQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEQLActionPerformed

        num2 = Double.parseDouble(tfDisplay.getText());
                tfDisplay.setText(String.valueOf(num1+num2));

        
    }//GEN-LAST:event_jbEQLActionPerformed

    private void jbSUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSUBActionPerformed
        
    }//GEN-LAST:event_jbSUBActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jbBACKSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBACKSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBACKSActionPerformed

    private void jbTANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTANActionPerformed
        double num = Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num=Math.toRadians(num);
        num = Math.tan(num);
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbTANActionPerformed

    private void jbCOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCOSActionPerformed
        double num = Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num=Math.toRadians(num);
        num = Math.cos(num);
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbCOSActionPerformed

    private void jbSINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSINActionPerformed
        double num = Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num=Math.toRadians(num);
        num = Math.sin(num);
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbSINActionPerformed

    private void jbLOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLOGActionPerformed
        double num = Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num = Math.log(num);
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbLOGActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
         String n=tfDisplay.getText() + jb5.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb5ActionPerformed

    private void tfDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDisplayActionPerformed

    private void jbANSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbANSActionPerformed
        
    }//GEN-LAST:event_jbANSActionPerformed

    
   double num1;
   double num2;
    
    private void jbADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbADDActionPerformed
        num1 = Double.parseDouble(tfDisplay.getText());
        tfDisplay.setText("");
        
    }//GEN-LAST:event_jbADDActionPerformed

    private void jbSQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSQRActionPerformed
        double num = Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num = Math.sqrt(num);
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbSQRActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
         String n=tfDisplay.getText() + jb9.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
         String n=tfDisplay.getText() + jb4.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
         String n=tfDisplay.getText() + jb6.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
         String n=tfDisplay.getText() + jb1.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
         String n=tfDisplay.getText() + jb2.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
         String n=tfDisplay.getText() + jb3.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb3ActionPerformed

    private void jbCOSECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCOSECActionPerformed
        double num = Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num = Math.toRadians(num);
        num = Math.sin(num);
        num=1/num;
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbCOSECActionPerformed

    private void jbCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCLEARActionPerformed
      tfDisplay.setText("");
    }//GEN-LAST:event_jbCLEARActionPerformed

    private void jbCOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCOTActionPerformed
        double num = Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num = Math.toRadians(num);
        num = Math.tan(num);
        num=1/num;
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbCOTActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        String n = tfDisplay.getText() + jb0.getText();
        tfDisplay.setText(n);
    }//GEN-LAST:event_jb0ActionPerformed

    private void jbpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpointActionPerformed
       if(!tfDisplay.getText().contains(".")){
           tfDisplay.setText(tfDisplay.getText()+jbpoint.getText());
       }
    }//GEN-LAST:event_jbpointActionPerformed

    private void jbPLUSMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPLUSMINUSActionPerformed
        double num=Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num=(-1)*num;
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbPLUSMINUSActionPerformed

    private void jbMULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMULActionPerformed
        
    }//GEN-LAST:event_jbMULActionPerformed

    private void jbSECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSECActionPerformed
         double num = Double.parseDouble(String.valueOf(tfDisplay.getText()));
        num=Math.toRadians(num);
        num = Math.cos(num);
        num=1/num;
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbSECActionPerformed

    private void jbPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPIActionPerformed
        double num= 3.1415926535897932384626433832795;
        tfDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_jbPIActionPerformed

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
            java.util.logging.Logger.getLogger(interface_cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbADD;
    private javax.swing.JButton jbANS;
    private javax.swing.JButton jbBACKS;
    private javax.swing.JButton jbCLEAR;
    private javax.swing.JButton jbCOS;
    private javax.swing.JButton jbCOSEC;
    private javax.swing.JButton jbCOT;
    private javax.swing.JButton jbDEL;
    private javax.swing.JButton jbDIV;
    private javax.swing.JButton jbEQL;
    private javax.swing.JButton jbLOG;
    private javax.swing.JButton jbMUL;
    private javax.swing.JButton jbPI;
    private javax.swing.JButton jbPLUSMINUS;
    private javax.swing.JButton jbSEC;
    private javax.swing.JButton jbSIN;
    private javax.swing.JButton jbSQR;
    private javax.swing.JButton jbSUB;
    private javax.swing.JButton jbTAN;
    private javax.swing.JButton jbpoint;
    private javax.swing.JTextField tfDisplay;
    // End of variables declaration//GEN-END:variables
}
