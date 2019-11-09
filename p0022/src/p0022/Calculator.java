/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0022;

import javax.swing.JButton;


/**
 *
 * @author Pham Anh Dung
 */
public class Calculator extends javax.swing.JFrame {
    final  double ct=0;
    String S = "0123456789.";
    double number = 0, anwser = 0, tram, tru = 0,tong=0,sobitru;
    int calcul;
    boolean bangtip = false;
    boolean changed = true;
    boolean emty = true;
    boolean congtru = true;
    boolean truso=false;
   

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        display.setEditable(false);
        display.requestFocus();
    }

    public void Operating(JButton a) {
        try {
            emty = false;
            if (S.contains(a.getText())) {
                if (emty == false && changed == false) {
                    display.setText("");
                    changed=true;
                }
                display.setText(display.getText() + a.getText());
                bangtip = false;
            } else {
                changed = false;
                if (a.getText().equals("+")) {
                    jLabel1.setText("+");
                    number = Double.parseDouble(display.getText());
                    display.setText("");
                    calcul = 1;
                } else if (a.getText().equals("-")) {
                    jLabel1.setText("-");
                    number = Double.parseDouble(display.getText());
                    display.setText("");
                    calcul = 2;

                } else if (a.getText().equals("X")) {
                    jLabel1.setText("X");
                    number = Double.parseDouble(display.getText());
                    display.setText("");
                    calcul = 3;
                } else if (a.getText().equals(":")) {
                    jLabel1.setText(":");
                    number = Double.parseDouble(display.getText());
                    display.setText("");
                    calcul = 4;
                } else if (a.getText().equals("%")) {
                    jLabel1.setText("%");
                    number = Double.parseDouble(display.getText());
                    anwser = number / 100;
                    display.setText(Double.toString(anwser));

                } else if (a.getText().equals("1/X")) {
                    jLabel1.setText("1/X");
                    number = Double.parseDouble(display.getText());
                    anwser = 1 / number;
                    display.setText(Double.toString(anwser));

                } else if (a.getText().equals("+/-")) {
                    jLabel1.setText("+/-");
                    number = Double.parseDouble(display.getText());

                    if (number > 0) {
                        display.setText("-" + Double.toString(number).replace(".0", ""));
                    } else if (number < 0) {

                        display.setText(Double.toString(number).replace("-", "").replace(".0", ""));

                    }

                } else if (a.getText().equals("√")) {
                    jLabel1.setText("√");
                    number = Double.parseDouble(display.getText());
                    anwser = Math.sqrt(number);
                    display.setText(Double.toString(anwser));

                } else if (a.getText().equals("M+") || a.getText().equals("M-")) {
                   
                    switch (calcul) {
                        case 1:
                            anwser = number + Double.parseDouble(display.getText());
                         

                            break;
                        case 2:

                            anwser = number - Double.parseDouble(display.getText());
                           

                            break;
                        case 3:

                            anwser = number * Double.parseDouble(display.getText());
                         
                            break;
                        case 4:

                            anwser = number / Double.parseDouble(display.getText());
                            

                            break;
                    }
                } else if (a.getText().equals("=")) {
                    changed = false;
                    if (bangtip == false) {
                        bangtip = true;
                        switch (calcul) {
                            case 1:
                                tram = Double.parseDouble(display.getText());
                                anwser = number + Double.parseDouble(display.getText());

                                display.setText(Double.toString(anwser).replace(".0", ""));

                                break;
                            case 2:
                                tram = Double.parseDouble(display.getText());
                                anwser = number - Double.parseDouble(display.getText());

                                display.setText(Double.toString(anwser).replace(".0", ""));

                                break;
                            case 3:
                                tram = Double.parseDouble(display.getText());
                                anwser = number * Double.parseDouble(display.getText());

                                display.setText(Double.toString(anwser).replace(".0", ""));

                                break;
                            case 4:
                                tram = Double.parseDouble(display.getText());
                                anwser = number / Double.parseDouble(display.getText());

                                display.setText(Double.toString(anwser).replace(".0", ""));

                                break;
                        }
                    } else {
                        switch (calcul) {

                            case 1:

                                anwser = Double.parseDouble(display.getText()) + tram;

                                display.setText(Double.toString(anwser).replace(".0", ""));

                                break;
                            case 2:

                                anwser = Double.parseDouble(display.getText()) - tram;

                                display.setText(Double.toString(anwser).replace(".0", ""));

                                break;
                            case 3:
                                anwser = tram * Double.parseDouble(display.getText());
                                display.setText(Double.toString(anwser).replace(".0", ""));

                                break;
                            case 4:
                                anwser = Double.parseDouble(display.getText()) / tram;
                                display.setText(Double.toString(anwser).replace(".0", ""));

                                break;
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bMR = new javax.swing.JButton();
        bMC = new javax.swing.JButton();
        bcan = new javax.swing.JButton();
        bMcong = new javax.swing.JButton();
        bMtru = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bpt = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bchia = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        bchia10 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bX = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        btru = new javax.swing.JButton();
        bCham = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bAmDuong = new javax.swing.JButton();
        bCong = new javax.swing.JButton();
        bbang = new javax.swing.JButton();
        bAC = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bMR.setBackground(new java.awt.Color(204, 204, 0));
        bMR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bMR.setText("MR");
        bMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMRActionPerformed(evt);
            }
        });

        bMC.setBackground(new java.awt.Color(204, 204, 0));
        bMC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bMC.setText("MC");
        bMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMCActionPerformed(evt);
            }
        });

        bcan.setBackground(new java.awt.Color(153, 255, 51));
        bcan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bcan.setText("√");
        bcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcanActionPerformed(evt);
            }
        });

        bMcong.setBackground(new java.awt.Color(204, 204, 0));
        bMcong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bMcong.setText("M+");
        bMcong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMcongActionPerformed(evt);
            }
        });

        bMtru.setBackground(new java.awt.Color(204, 204, 0));
        bMtru.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bMtru.setText("M-");
        bMtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMtruActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(153, 153, 255));
        b2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(153, 153, 255));
        b1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bpt.setBackground(new java.awt.Color(153, 255, 51));
        bpt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bpt.setText("%");
        bpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bptActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(153, 153, 255));
        b3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bchia.setBackground(new java.awt.Color(153, 255, 51));
        bchia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bchia.setText(":");
        bchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bchiaActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(153, 153, 255));
        b5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(153, 153, 255));
        b4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        bchia10.setBackground(new java.awt.Color(153, 255, 51));
        bchia10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bchia10.setText("1/X");
        bchia10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bchia10ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(153, 153, 255));
        b6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bX.setBackground(new java.awt.Color(153, 255, 51));
        bX.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bX.setText("X");
        bX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(153, 153, 255));
        b8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(153, 153, 255));
        b7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(153, 153, 255));
        b9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        btru.setBackground(new java.awt.Color(153, 255, 51));
        btru.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btru.setText("-");
        btru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btruActionPerformed(evt);
            }
        });

        bCham.setBackground(new java.awt.Color(153, 153, 255));
        bCham.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bCham.setText(".");
        bCham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChamActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(153, 153, 255));
        b0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bAmDuong.setBackground(new java.awt.Color(153, 255, 51));
        bAmDuong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bAmDuong.setText("+/-");
        bAmDuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAmDuongActionPerformed(evt);
            }
        });

        bCong.setBackground(new java.awt.Color(153, 255, 51));
        bCong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bCong.setText("+");
        bCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCongActionPerformed(evt);
            }
        });

        bbang.setBackground(new java.awt.Color(153, 255, 51));
        bbang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bbang.setText("=");
        bbang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbangActionPerformed(evt);
            }
        });

        bAC.setBackground(new java.awt.Color(255, 0, 51));
        bAC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bAC.setText("AC");
        bAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bACActionPerformed(evt);
            }
        });

        display.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bMC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bMR)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bchia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bX, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bMcong, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bMtru, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b8)
                                    .addComponent(bCham))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bAmDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bCong, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btru, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bchia10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bcan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAmDuong, bCham, bCong, bMC, bMR, bMcong, bMtru, bX, bchia, btru});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAC, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMR)
                    .addComponent(bMcong)
                    .addComponent(bMtru)
                    .addComponent(bcan)
                    .addComponent(bMC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(bchia)
                    .addComponent(b1)
                    .addComponent(bpt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5)
                    .addComponent(b6)
                    .addComponent(bX)
                    .addComponent(b4)
                    .addComponent(bchia10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b8)
                            .addComponent(b9)
                            .addComponent(btru)
                            .addComponent(b7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCham)
                            .addComponent(bAmDuong)
                            .addComponent(bCong)
                            .addComponent(b0)))
                    .addComponent(bbang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAmDuong, bCham, bCong, bMC, bMR, bMcong, bMtru, bX, bcan, bchia, bchia10, bpt, btru});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        Operating(b1);

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        Operating(b2);
    }//GEN-LAST:event_b2ActionPerformed

    private void bCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCongActionPerformed
        // TODO add your handling code here:
        Operating(bCong);
    }//GEN-LAST:event_bCongActionPerformed

    private void bbangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbangActionPerformed
        // TODO add your handling code here:
        Operating(bbang);

    }//GEN-LAST:event_bbangActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        Operating(b3);
    }//GEN-LAST:event_b3ActionPerformed

    private void bACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bACActionPerformed
        // TODO add your handling code here:
        display.setText("");
        jLabel1.setText("");
        bangtip = false;
        changed = false;
        tong=0;
       sobitru=0;
    }//GEN-LAST:event_bACActionPerformed

    private void bptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bptActionPerformed
        // TODO add your handling code here:
        Operating(bpt);
    }//GEN-LAST:event_bptActionPerformed

    private void bcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcanActionPerformed
        // TODO add your handling code here:
        Operating(bcan);
    }//GEN-LAST:event_bcanActionPerformed

    private void bchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bchiaActionPerformed
        // TODO add your handling code here:
        Operating(bchia);
    }//GEN-LAST:event_bchiaActionPerformed

    private void bXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXActionPerformed
        // TODO add your handling code here:
        Operating(bX);
    }//GEN-LAST:event_bXActionPerformed

    private void btruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btruActionPerformed
        // TODO add your handling code here:
        Operating(btru);
    }//GEN-LAST:event_btruActionPerformed

    private void bchia10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bchia10ActionPerformed
        // TODO add your handling code here:
        Operating(bchia10);
    }//GEN-LAST:event_bchia10ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        Operating(b4);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        Operating(b5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        Operating(b6);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        Operating(b7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        Operating(b8);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        Operating(b9);
    }//GEN-LAST:event_b9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
        Operating(b0);
    }//GEN-LAST:event_b0ActionPerformed

    private void bChamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChamActionPerformed
        // TODO add your handling code here:
        Operating(bCham);
    }//GEN-LAST:event_bChamActionPerformed

    private void bAmDuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAmDuongActionPerformed
        // TODO add your handling code here:
        Operating(bAmDuong);
    }//GEN-LAST:event_bAmDuongActionPerformed

    private void bMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMRActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("MR");

        if (congtru == false) {
           display.setText(Double.toString(tong));
        } else {
            display.setText(Double.toString(sobitru));
        }
    }//GEN-LAST:event_bMRActionPerformed

    private void bMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMCActionPerformed
        // TODO add your handling code here:
       tong=0;
       sobitru=0;
        jLabel1.setText("MC");
    }//GEN-LAST:event_bMCActionPerformed

    private void bMcongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMcongActionPerformed
        // TODO add your handling code here:
          congtru = false;
        Operating(bMcong);
       if(changed==false && congtru==false){
       anwser = Double.parseDouble(display.getText());
       tong+=anwser;}
        jLabel1.setText(Double.toString(tong));
    }//GEN-LAST:event_bMcongActionPerformed

    private void bMtruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMtruActionPerformed
        // TODO add your handling code here:
        
        congtru=true;
        Operating(bMtru);
        if(changed==false && congtru==true &&truso==false){
       anwser = Double.parseDouble(display.getText());
       sobitru=anwser;
       jLabel1.setText(Double.toString(sobitru));
       truso=true;
 }
        else if(changed==false && congtru==true &&truso==true){
              anwser = Double.parseDouble(display.getText());
            sobitru-=anwser;
             jLabel1.setText(Double.toString(sobitru));
        }
      
        
    }//GEN-LAST:event_bMtruActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAC;
    private javax.swing.JButton bAmDuong;
    private javax.swing.JButton bCham;
    private javax.swing.JButton bCong;
    private javax.swing.JButton bMC;
    private javax.swing.JButton bMR;
    private javax.swing.JButton bMcong;
    private javax.swing.JButton bMtru;
    private javax.swing.JButton bX;
    private javax.swing.JButton bbang;
    private javax.swing.JButton bcan;
    private javax.swing.JButton bchia;
    private javax.swing.JButton bchia10;
    private javax.swing.JButton bpt;
    private javax.swing.JButton btru;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
