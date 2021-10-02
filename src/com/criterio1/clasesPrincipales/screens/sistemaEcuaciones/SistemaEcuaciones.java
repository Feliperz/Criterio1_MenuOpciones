/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criterio1.clasesPrincipales.screens.sistemaEcuaciones;

import com.criterio1.clasesPrincipales.Determinantes;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author FelipeRC
 */
public class SistemaEcuaciones extends javax.swing.JPanel {

   public float tempMatriz[][] = new float[4][4];
    public SistemaEcuaciones() {
        initComponents();

    }
    public void cleanComponents(){
        x1.setText("");
        x2.setText("");
        x3.setText("");
        y1.setText("");
        y2.setText("");
        y3.setText("");
        z1.setText("");
        z2.setText("");
        z3.setText("");
        constant1.setText("");
        constant2.setText("");
        constant3.setText("");
        x1.setBackground(Color.white);
        x2.setBackground(Color.white);
        x3.setBackground(Color.white);
        y1.setBackground(Color.white);
        y2.setBackground(Color.white);
        y3.setBackground(Color.white);
        z1.setBackground(Color.white);
        z2.setBackground(Color.white);
        z3.setBackground(Color.white);
        constant1.setBackground(Color.white);
        constant2.setBackground(Color.white);
        constant3.setBackground(Color.white);
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        x3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        z3 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        constant3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        z1 = new javax.swing.JTextField();
        constant1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        z2 = new javax.swing.JTextField();
        constant2 = new javax.swing.JTextField();
        bVolverME2 = new javax.swing.JButton();
        calcularButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText(" y  + ");

        x3.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        x3.setForeground(new java.awt.Color(0, 0, 0));
        x3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        x3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("x   +   ");

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("z   = ");

        z3.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        z3.setForeground(new java.awt.Color(0, 0, 0));
        z3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        z3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        z3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        y3.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        y3.setForeground(new java.awt.Color(0, 0, 0));
        y3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        y3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        y3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("x   +   ");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(" y + ");

        constant3.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        constant3.setForeground(new java.awt.Color(0, 0, 0));
        constant3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        constant3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        constant3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("z   = ");

        x1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        x1.setForeground(new java.awt.Color(0, 0, 0));
        x1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        y1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        y1.setForeground(new java.awt.Color(0, 0, 0));
        y1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        y1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        y1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        z1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        z1.setForeground(new java.awt.Color(0, 0, 0));
        z1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        z1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        z1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        constant1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        constant1.setForeground(new java.awt.Color(0, 0, 0));
        constant1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        constant1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        constant1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("x   +   ");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText(" y  +");

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("z   = ");

        x2.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        x2.setForeground(new java.awt.Color(0, 0, 0));
        x2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        x2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        y2.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        y2.setForeground(new java.awt.Color(0, 0, 0));
        y2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        y2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        y2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        z2.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        z2.setForeground(new java.awt.Color(0, 0, 0));
        z2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        z2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        z2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        constant2.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        constant2.setForeground(new java.awt.Color(0, 0, 0));
        constant2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        constant2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        constant2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyValidate(evt);
            }
        });

        bVolverME2.setBackground(new java.awt.Color(255, 255, 255));
        bVolverME2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bVolverME2.setForeground(new java.awt.Color(0, 0, 0));
        bVolverME2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/clasesPrincipales/screens/sistemaEcuaciones/escobita.png"))); // NOI18N
        bVolverME2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        bVolverME2.setBorderPainted(false);
        bVolverME2.setContentAreaFilled(false);
        bVolverME2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolverME2.setFocusable(false);
        bVolverME2.setOpaque(true);
        bVolverME2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVolverME2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarColorBoton2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBoton2(evt);
            }
        });

        calcularButton.setBackground(new java.awt.Color(255, 255, 255));
        calcularButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        calcularButton.setForeground(new java.awt.Color(0, 0, 0));
        calcularButton.setText("Calcular");
        calcularButton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        calcularButton.setBorderPainted(false);
        calcularButton.setContentAreaFilled(false);
        calcularButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcularButton.setFocusable(false);
        calcularButton.setOpaque(true);
        calcularButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarColorBoton1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBoton1(evt);
            }
        });
        calcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(calcularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(constant1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(constant2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bVolverME2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(constant3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(constant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(constant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(constant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bVolverME2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(calcularButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 64, 64));
        jLabel1.setText("3x4");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Resolver Sistema De Ecuaciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bVolverME2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVolverME2MouseClicked
       
        cleanComponents();
        
       
        
    }//GEN-LAST:event_bVolverME2MouseClicked
    
    
    private void clickedOnField(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickedOnField
        ((JTextField) evt.getSource()).setBackground(Color.white);
    }//GEN-LAST:event_clickedOnField

    private void keyValidate(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyValidate
        char c = evt.getKeyChar();
        if(c<'-' || c>'9' || c=='/' || c=='.') evt.consume();
    }//GEN-LAST:event_keyValidate

    private void calcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularButtonActionPerformed
        dataIsCorrect = true;
        getDataFromPanel();
        if(dataIsCorrect){

            ResultadoEcuaciones res = new ResultadoEcuaciones();
            Determinantes m1 = new Determinantes();
            m1.setIntanceSistemaEcuaciones(res);
            res.setMatriz(tempMatriz);
            res.mostrarValores();
            m1.ingresar(tempMatriz);

            res.show();
        }

    }//GEN-LAST:event_calcularButtonActionPerformed

    private void cambiarColorBoton1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColorBoton1
        calcularButton.setBackground(new Color(210,211,224));
    }//GEN-LAST:event_cambiarColorBoton1

    private void volverColorBoton1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBoton1
        calcularButton.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_volverColorBoton1

    private void cambiarColorBoton2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColorBoton2
        bVolverME2.setBackground(new Color(210,211,224));
    }//GEN-LAST:event_cambiarColorBoton2

    private void volverColorBoton2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBoton2
       bVolverME2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_volverColorBoton2
 
    public void getDataFromPanel(){
        // INGRESANDO VALORES DE x
       
         tempMatriz[0][0] = isCorrectData(x1); 
         tempMatriz[1][0] = isCorrectData(x2);   
         tempMatriz[2][0] = isCorrectData(x3);
         //INGRESANDO VALORES DE y
         
         tempMatriz[0][1] = isCorrectData(y1);
         tempMatriz[1][1] = isCorrectData(y2);
         tempMatriz[2][1] = isCorrectData(y3);
         //INGRESANDO VALORES DE Z
          
         tempMatriz[0][2] = isCorrectData(z1);
         tempMatriz[1][2] =  isCorrectData(z2);
         tempMatriz[2][2] = isCorrectData(z3);
         //INGRESANDO VALORES CONSTANTES
          
         tempMatriz[0][3] = isCorrectData(constant1);
         tempMatriz[1][3] = isCorrectData(constant2);
         tempMatriz[2][3] = isCorrectData(constant3);
         
    }
    boolean dataIsCorrect = true;
    public float isCorrectData(JTextField field){
        String data = field.getText();
        if(data.equals("")){
           dataIsCorrect = false;
           field.setBackground(new Color(170,0,85));
           return 0;
        }
      
        float dataReturn = Float.parseFloat(data);
        return dataReturn;
            
        
       
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVolverME2;
    private javax.swing.JButton calcularButton;
    private javax.swing.JTextField constant1;
    private javax.swing.JTextField constant2;
    private javax.swing.JTextField constant3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField z1;
    private javax.swing.JTextField z2;
    private javax.swing.JTextField z3;
    // End of variables declaration//GEN-END:variables
}
