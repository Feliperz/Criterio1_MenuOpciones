/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criterio1.ejemplomenu.screens.sistemaEcuaciones;

import java.awt.Color;


public class ResultadoEcuaciones extends javax.swing.JFrame {

SistemaEcuaciones ecuaciones = new SistemaEcuaciones();
private String matriz[][] = new String[4][4];
private int xMouse, yMouse;
    public ResultadoEcuaciones() {
        initComponents();
        
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PanelDeterminantePrincipal = new javax.swing.JPanel();
        dPrincipalx1 = new javax.swing.JLabel();
        dPrincipaly3 = new javax.swing.JLabel();
        dPrincipalz1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dPrincipalz2 = new javax.swing.JLabel();
        dPrincipalz3 = new javax.swing.JLabel();
        dPrincipalx2 = new javax.swing.JLabel();
        dPrincipalx3 = new javax.swing.JLabel();
        dPrincipaly1 = new javax.swing.JLabel();
        dPrincipaly2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        suma1Principal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        suma2Principal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        resultadoDetPrincipal = new javax.swing.JLabel();
        PanelDeterminanteDeX = new javax.swing.JPanel();
        matrizDeX_x1 = new javax.swing.JLabel();
        matrizDeX_y3 = new javax.swing.JLabel();
        matrizDeX_z1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        matrizDeX_z2 = new javax.swing.JLabel();
        matrizDeX_z3 = new javax.swing.JLabel();
        matrizDeX_x2 = new javax.swing.JLabel();
        matrizDeX_x3 = new javax.swing.JLabel();
        matrizDeX_y1 = new javax.swing.JLabel();
        matrizDeX_y2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        suma1X = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        suma2X = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resultadoDetX = new javax.swing.JLabel();
        PanelDeterminanteDeY = new javax.swing.JPanel();
        matrizDeY_x1 = new javax.swing.JLabel();
        matrizDeY_y3 = new javax.swing.JLabel();
        matrizDeY_z1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        matrizDeY_z2 = new javax.swing.JLabel();
        matrizDeY_z3 = new javax.swing.JLabel();
        matrizDeY_x2 = new javax.swing.JLabel();
        matrizDeY_x3 = new javax.swing.JLabel();
        matrizDeY_y1 = new javax.swing.JLabel();
        matrizDeY_y2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        suma1Y = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        suma2Y = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        resultadoDetY = new javax.swing.JLabel();
        PanelDeterminanteDeZ = new javax.swing.JPanel();
        matrizDeZ_x1 = new javax.swing.JLabel();
        matrizDeZ_y3 = new javax.swing.JLabel();
        matrizDeZ_z1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        matrizDeZ_z2 = new javax.swing.JLabel();
        matrizDeZ_z3 = new javax.swing.JLabel();
        matrizDeZ_x2 = new javax.swing.JLabel();
        matrizDeZ_x3 = new javax.swing.JLabel();
        matrizDeZ_y1 = new javax.swing.JLabel();
        matrizDeZ_y2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        suma1Z = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        suma2Z = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ResultadoDetZ = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        resultadoDetXMuestra = new javax.swing.JLabel();
        resultadoDetPrincipal2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        valDeX = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        resultadoDetYMuestra = new javax.swing.JLabel();
        resultadoDetPrincipal3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        valDeY = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        resultadoDetZMuestra = new javax.swing.JLabel();
        resultadoDetPrincipal4 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        valDeZ = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        PanelDeterminantePrincipal.setBackground(new java.awt.Color(255, 255, 255));

        dPrincipalx1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipalx1.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipalx1.setText("2");
        dPrincipalx1.setName(""); // NOI18N

        dPrincipaly3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipaly3.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipaly3.setText("3");

        dPrincipalz1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipalz1.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipalz1.setText("5");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("|A| = ");

        dPrincipalz2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipalz2.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipalz2.setText("6");

        dPrincipalz3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipalz3.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipalz3.setText("6");

        dPrincipalx2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipalx2.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipalx2.setText("4");

        dPrincipalx3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipalx3.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipalx3.setText("4");

        dPrincipaly1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipaly1.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipaly1.setText("4");

        dPrincipaly2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dPrincipaly2.setForeground(new java.awt.Color(0, 0, 0));
        dPrincipaly2.setText("3");

        jLabel41.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("=");

        suma1Principal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        suma1Principal.setForeground(new java.awt.Color(0, 0, 0));
        suma1Principal.setText("1");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("-");

        suma2Principal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        suma2Principal.setForeground(new java.awt.Color(0, 0, 0));
        suma2Principal.setText("2");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("=");

        resultadoDetPrincipal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        resultadoDetPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        resultadoDetPrincipal.setText("1");

        javax.swing.GroupLayout PanelDeterminantePrincipalLayout = new javax.swing.GroupLayout(PanelDeterminantePrincipal);
        PanelDeterminantePrincipal.setLayout(PanelDeterminantePrincipalLayout);
        PanelDeterminantePrincipalLayout.setHorizontalGroup(
            PanelDeterminantePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeterminantePrincipalLayout.createSequentialGroup()
                .addGroup(PanelDeterminantePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(PanelDeterminantePrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanelDeterminantePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDeterminantePrincipalLayout.createSequentialGroup()
                                .addComponent(dPrincipalx3)
                                .addGap(18, 18, 18)
                                .addComponent(dPrincipaly3)
                                .addGap(18, 18, 18)
                                .addComponent(dPrincipalz3))
                            .addGroup(PanelDeterminantePrincipalLayout.createSequentialGroup()
                                .addComponent(dPrincipalx2)
                                .addGap(18, 18, 18)
                                .addComponent(dPrincipaly2)
                                .addGap(18, 18, 18)
                                .addComponent(dPrincipalz2))
                            .addGroup(PanelDeterminantePrincipalLayout.createSequentialGroup()
                                .addComponent(dPrincipalx1)
                                .addGap(18, 18, 18)
                                .addComponent(dPrincipaly1)
                                .addGap(18, 18, 18)
                                .addComponent(dPrincipalz1)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suma1Principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suma2Principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadoDetPrincipal)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PanelDeterminantePrincipalLayout.setVerticalGroup(
            PanelDeterminantePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeterminantePrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelDeterminantePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dPrincipalx1)
                    .addComponent(dPrincipaly1)
                    .addComponent(dPrincipalz1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminantePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dPrincipalx2)
                    .addComponent(dPrincipaly2)
                    .addComponent(jLabel1)
                    .addComponent(dPrincipalz2)
                    .addComponent(jLabel41)
                    .addComponent(suma1Principal)
                    .addComponent(jLabel5)
                    .addComponent(suma2Principal)
                    .addComponent(jLabel6)
                    .addComponent(resultadoDetPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminantePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dPrincipalz3)
                    .addComponent(dPrincipaly3)
                    .addComponent(dPrincipalx3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelDeterminanteDeX.setBackground(new java.awt.Color(255, 255, 255));

        matrizDeX_x1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_x1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_x1.setText("2");

        matrizDeX_y3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_y3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_y3.setText("3");

        matrizDeX_z1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_z1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_z1.setText("5");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("|Ax| = ");

        matrizDeX_z2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_z2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_z2.setText("6");

        matrizDeX_z3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_z3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_z3.setText("6");

        matrizDeX_x2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_x2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_x2.setText("4");

        matrizDeX_x3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_x3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_x3.setText("4");

        matrizDeX_y1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_y1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_y1.setText("4");

        matrizDeX_y2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeX_y2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeX_y2.setText("3");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("=");

        suma1X.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        suma1X.setForeground(new java.awt.Color(0, 0, 0));
        suma1X.setText("1");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("-");

        suma2X.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        suma2X.setForeground(new java.awt.Color(0, 0, 0));
        suma2X.setText("2");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("=");

        resultadoDetX.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        resultadoDetX.setForeground(new java.awt.Color(0, 0, 0));
        resultadoDetX.setText("1");

        javax.swing.GroupLayout PanelDeterminanteDeXLayout = new javax.swing.GroupLayout(PanelDeterminanteDeX);
        PanelDeterminanteDeX.setLayout(PanelDeterminanteDeXLayout);
        PanelDeterminanteDeXLayout.setHorizontalGroup(
            PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeterminanteDeXLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeterminanteDeXLayout.createSequentialGroup()
                        .addGroup(PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matrizDeX_x2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matrizDeX_x3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDeterminanteDeXLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(matrizDeX_y3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeterminanteDeXLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matrizDeX_y2)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDeterminanteDeXLayout.createSequentialGroup()
                                .addComponent(matrizDeX_z2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suma1X)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suma2X)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultadoDetX))
                            .addComponent(matrizDeX_z3)))
                    .addGroup(PanelDeterminanteDeXLayout.createSequentialGroup()
                        .addComponent(matrizDeX_x1)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeX_y1)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeX_z1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelDeterminanteDeXLayout.setVerticalGroup(
            PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeterminanteDeXLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeX_x1)
                    .addComponent(matrizDeX_y1)
                    .addComponent(matrizDeX_z1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeX_x2)
                    .addComponent(matrizDeX_y2)
                    .addComponent(jLabel14)
                    .addComponent(matrizDeX_z2)
                    .addComponent(jLabel2)
                    .addComponent(suma1X)
                    .addComponent(jLabel7)
                    .addComponent(suma2X)
                    .addComponent(jLabel8)
                    .addComponent(resultadoDetX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminanteDeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeX_z3)
                    .addComponent(matrizDeX_y3)
                    .addComponent(matrizDeX_x3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelDeterminanteDeY.setBackground(new java.awt.Color(255, 255, 255));

        matrizDeY_x1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_x1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_x1.setText("2");

        matrizDeY_y3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_y3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_y3.setText("3");

        matrizDeY_z1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_z1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_z1.setText("5");

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("|Ay| = ");

        matrizDeY_z2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_z2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_z2.setText("6");

        matrizDeY_z3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_z3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_z3.setText("6");

        matrizDeY_x2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_x2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_x2.setText("4");

        matrizDeY_x3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_x3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_x3.setText("4");

        matrizDeY_y1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_y1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_y1.setText("4");

        matrizDeY_y2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeY_y2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeY_y2.setText("3");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("=");

        suma1Y.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        suma1Y.setForeground(new java.awt.Color(0, 0, 0));
        suma1Y.setText("1");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("-");

        suma2Y.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        suma2Y.setForeground(new java.awt.Color(0, 0, 0));
        suma2Y.setText("2");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("=");

        resultadoDetY.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        resultadoDetY.setForeground(new java.awt.Color(0, 0, 0));
        resultadoDetY.setText("1");

        javax.swing.GroupLayout PanelDeterminanteDeYLayout = new javax.swing.GroupLayout(PanelDeterminanteDeY);
        PanelDeterminanteDeY.setLayout(PanelDeterminanteDeYLayout);
        PanelDeterminanteDeYLayout.setHorizontalGroup(
            PanelDeterminanteDeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeterminanteDeYLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminanteDeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDeterminanteDeYLayout.createSequentialGroup()
                        .addComponent(matrizDeY_x2)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeY_y2)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeY_z2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDeterminanteDeYLayout.createSequentialGroup()
                        .addComponent(matrizDeY_x1)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeY_y1)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeY_z1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDeterminanteDeYLayout.createSequentialGroup()
                        .addComponent(matrizDeY_x3)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeY_y3)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeY_z3)))
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suma1Y)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suma2Y)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadoDetY)
                .addGap(4, 4, 4))
        );
        PanelDeterminanteDeYLayout.setVerticalGroup(
            PanelDeterminanteDeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeterminanteDeYLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelDeterminanteDeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeY_x1)
                    .addComponent(matrizDeY_y1)
                    .addComponent(matrizDeY_z1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminanteDeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeY_x2)
                    .addComponent(matrizDeY_y2)
                    .addComponent(jLabel24)
                    .addComponent(matrizDeY_z2)
                    .addComponent(jLabel3)
                    .addComponent(suma1Y)
                    .addComponent(jLabel10)
                    .addComponent(suma2Y)
                    .addComponent(jLabel9)
                    .addComponent(resultadoDetY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminanteDeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeY_z3)
                    .addComponent(matrizDeY_y3)
                    .addComponent(matrizDeY_x3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelDeterminanteDeZ.setBackground(new java.awt.Color(255, 255, 255));

        matrizDeZ_x1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_x1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_x1.setText("2");

        matrizDeZ_y3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_y3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_y3.setText("3");

        matrizDeZ_z1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_z1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_z1.setText("5");

        jLabel34.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("|Az| = ");

        matrizDeZ_z2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_z2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_z2.setText("6");

        matrizDeZ_z3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_z3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_z3.setText("6");

        matrizDeZ_x2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_x2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_x2.setText("4");

        matrizDeZ_x3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_x3.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_x3.setText("4");

        matrizDeZ_y1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_y1.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_y1.setText("4");

        matrizDeZ_y2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        matrizDeZ_y2.setForeground(new java.awt.Color(0, 0, 0));
        matrizDeZ_y2.setText("3");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("=");

        suma1Z.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        suma1Z.setForeground(new java.awt.Color(0, 0, 0));
        suma1Z.setText("1");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("-");

        suma2Z.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        suma2Z.setForeground(new java.awt.Color(0, 0, 0));
        suma2Z.setText("2");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("=");

        ResultadoDetZ.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ResultadoDetZ.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoDetZ.setText("1");

        javax.swing.GroupLayout PanelDeterminanteDeZLayout = new javax.swing.GroupLayout(PanelDeterminanteDeZ);
        PanelDeterminanteDeZ.setLayout(PanelDeterminanteDeZLayout);
        PanelDeterminanteDeZLayout.setHorizontalGroup(
            PanelDeterminanteDeZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeterminanteDeZLayout.createSequentialGroup()
                .addGroup(PanelDeterminanteDeZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeterminanteDeZLayout.createSequentialGroup()
                        .addGroup(PanelDeterminanteDeZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeterminanteDeZLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matrizDeZ_x2)
                                .addGap(18, 18, 18)
                                .addComponent(matrizDeZ_y2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeterminanteDeZLayout.createSequentialGroup()
                                .addComponent(matrizDeZ_x3)
                                .addGap(18, 18, 18)
                                .addComponent(matrizDeZ_y3)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDeterminanteDeZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDeterminanteDeZLayout.createSequentialGroup()
                                .addComponent(matrizDeZ_z3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelDeterminanteDeZLayout.createSequentialGroup()
                                .addComponent(matrizDeZ_z2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(suma1Z)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suma2Z)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ResultadoDetZ))))
                    .addGroup(PanelDeterminanteDeZLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(matrizDeZ_x1)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeZ_y1)
                        .addGap(18, 18, 18)
                        .addComponent(matrizDeZ_z1)))
                .addContainerGap())
        );
        PanelDeterminanteDeZLayout.setVerticalGroup(
            PanelDeterminanteDeZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeterminanteDeZLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelDeterminanteDeZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeZ_x1)
                    .addComponent(matrizDeZ_y1)
                    .addComponent(matrizDeZ_z1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminanteDeZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeZ_x2)
                    .addComponent(matrizDeZ_y2)
                    .addComponent(jLabel34)
                    .addComponent(matrizDeZ_z2)
                    .addComponent(jLabel4)
                    .addComponent(suma1Z)
                    .addComponent(jLabel13)
                    .addComponent(suma2Z)
                    .addComponent(jLabel11)
                    .addComponent(ResultadoDetZ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeterminanteDeZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizDeZ_z3)
                    .addComponent(matrizDeZ_y3)
                    .addComponent(matrizDeZ_x3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDeterminantePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDeterminanteDeX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelDeterminanteDeY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelDeterminanteDeZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDeterminantePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDeterminanteDeX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDeterminanteDeY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDeterminanteDeZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("x = ");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("|Ax|/(|A|)");

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("=");

        resultadoDetXMuestra.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        resultadoDetXMuestra.setForeground(new java.awt.Color(0, 0, 0));
        resultadoDetXMuestra.setText("1");

        resultadoDetPrincipal2.setText("1");

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("=");

        valDeX.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        valDeX.setForeground(new java.awt.Color(0, 0, 0));
        valDeX.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoDetXMuestra)
                    .addComponent(resultadoDetPrincipal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valDeX)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(resultadoDetXMuestra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoDetPrincipal2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(valDeX))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("y = ");

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("|Ay|/(|A|)");

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("=");

        resultadoDetYMuestra.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        resultadoDetYMuestra.setForeground(new java.awt.Color(0, 0, 0));
        resultadoDetYMuestra.setText("1");

        resultadoDetPrincipal3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        resultadoDetPrincipal3.setForeground(new java.awt.Color(0, 0, 0));
        resultadoDetPrincipal3.setText("1");

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("=");

        valDeY.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        valDeY.setForeground(new java.awt.Color(0, 0, 0));
        valDeY.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoDetYMuestra)
                    .addComponent(resultadoDetPrincipal3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valDeY)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(resultadoDetYMuestra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoDetPrincipal3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(valDeY))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("z = ");

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("|Ay|/(|A|)");

        jLabel31.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("=");

        resultadoDetZMuestra.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        resultadoDetZMuestra.setForeground(new java.awt.Color(0, 0, 0));
        resultadoDetZMuestra.setText("1");

        resultadoDetPrincipal4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        resultadoDetPrincipal4.setForeground(new java.awt.Color(0, 0, 0));
        resultadoDetPrincipal4.setText("1");

        jLabel35.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("=");

        valDeZ.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        valDeZ.setForeground(new java.awt.Color(0, 0, 0));
        valDeZ.setText("1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoDetZMuestra)
                    .addComponent(resultadoDetPrincipal4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valDeZ)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(resultadoDetZMuestra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoDetPrincipal4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(valDeZ))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        jPanel7.setBackground(new java.awt.Color(66, 66, 66));

        botonVolver.setBackground(new java.awt.Color(66, 66, 66));
        botonVolver.setFont(new java.awt.Font("Lucida Sans", 1, 28)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(204, 0, 0));
        botonVolver.setText("X");
        botonVolver.setBorderPainted(false);
        botonVolver.setContentAreaFilled(false);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.setFocusable(false);
        botonVolver.setOpaque(true);
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVolverMouseExited(evt);
            }
        });
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/ejemplomenu/screens/sistemaEcuaciones/Logo_Tec_Tepic.png"))); // NOI18N
        jLabel17.setText("jLabel17");

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 29)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("RESULTADOS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(botonVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 890, 70));

        jPanel8.setBackground(new java.awt.Color(170, 0, 85));

        jPanel9.setBackground(new java.awt.Color(66, 66, 66));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 890, 70));
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
       ecuaciones.cleanComponents();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
         xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void botonVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseEntered
         botonVolver.setBackground(new Color(50,50,50));
    }//GEN-LAST:event_botonVolverMouseEntered

    private void botonVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseExited
         botonVolver.setBackground(new Color(66,66,66));
    }//GEN-LAST:event_botonVolverMouseExited

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
            java.util.logging.Logger.getLogger(ResultadoEcuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadoEcuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadoEcuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadoEcuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadoEcuaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDeterminanteDeX;
    private javax.swing.JPanel PanelDeterminanteDeY;
    private javax.swing.JPanel PanelDeterminanteDeZ;
    private javax.swing.JPanel PanelDeterminantePrincipal;
    private javax.swing.JLabel ResultadoDetZ;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel dPrincipalx1;
    private javax.swing.JLabel dPrincipalx2;
    private javax.swing.JLabel dPrincipalx3;
    private javax.swing.JLabel dPrincipaly1;
    private javax.swing.JLabel dPrincipaly2;
    private javax.swing.JLabel dPrincipaly3;
    private javax.swing.JLabel dPrincipalz1;
    private javax.swing.JLabel dPrincipalz2;
    private javax.swing.JLabel dPrincipalz3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel matrizDeX_x1;
    private javax.swing.JLabel matrizDeX_x2;
    private javax.swing.JLabel matrizDeX_x3;
    private javax.swing.JLabel matrizDeX_y1;
    private javax.swing.JLabel matrizDeX_y2;
    private javax.swing.JLabel matrizDeX_y3;
    private javax.swing.JLabel matrizDeX_z1;
    private javax.swing.JLabel matrizDeX_z2;
    private javax.swing.JLabel matrizDeX_z3;
    private javax.swing.JLabel matrizDeY_x1;
    private javax.swing.JLabel matrizDeY_x2;
    private javax.swing.JLabel matrizDeY_x3;
    private javax.swing.JLabel matrizDeY_y1;
    private javax.swing.JLabel matrizDeY_y2;
    private javax.swing.JLabel matrizDeY_y3;
    private javax.swing.JLabel matrizDeY_z1;
    private javax.swing.JLabel matrizDeY_z2;
    private javax.swing.JLabel matrizDeY_z3;
    private javax.swing.JLabel matrizDeZ_x1;
    private javax.swing.JLabel matrizDeZ_x2;
    private javax.swing.JLabel matrizDeZ_x3;
    private javax.swing.JLabel matrizDeZ_y1;
    private javax.swing.JLabel matrizDeZ_y2;
    private javax.swing.JLabel matrizDeZ_y3;
    private javax.swing.JLabel matrizDeZ_z1;
    private javax.swing.JLabel matrizDeZ_z2;
    private javax.swing.JLabel matrizDeZ_z3;
    private javax.swing.JLabel resultadoDetPrincipal;
    private javax.swing.JLabel resultadoDetPrincipal2;
    private javax.swing.JLabel resultadoDetPrincipal3;
    private javax.swing.JLabel resultadoDetPrincipal4;
    private javax.swing.JLabel resultadoDetX;
    private javax.swing.JLabel resultadoDetXMuestra;
    private javax.swing.JLabel resultadoDetY;
    private javax.swing.JLabel resultadoDetYMuestra;
    private javax.swing.JLabel resultadoDetZMuestra;
    private javax.swing.JLabel suma1Principal;
    private javax.swing.JLabel suma1X;
    private javax.swing.JLabel suma1Y;
    private javax.swing.JLabel suma1Z;
    private javax.swing.JLabel suma2Principal;
    private javax.swing.JLabel suma2X;
    private javax.swing.JLabel suma2Y;
    private javax.swing.JLabel suma2Z;
    private javax.swing.JLabel valDeX;
    private javax.swing.JLabel valDeY;
    private javax.swing.JLabel valDeZ;
    // End of variables declaration//GEN-END:variables

     public void setMatriz(float matrize[][]) {
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               matriz[i][j] = Float.toString(matrize[i][j]);
            }
        }
      
    }
     public void mostrarValores(){
         mostrarDetPrincipal();
         mostrarDetX();
         mostrarDetY();
         mostrarDetZ();
     }
    private void mostrarDetPrincipal() {
        //fila x
        dPrincipalx1.setText(matriz[0][0]);
        dPrincipalx2.setText(matriz[1][0]);
        dPrincipalx3.setText(matriz[2][0]);
        //fila y
        dPrincipaly1.setText(matriz[0][1]);
        dPrincipaly2.setText(matriz[1][1]);
        dPrincipaly3.setText(matriz[2][1]);
        //fila z
        dPrincipalz1.setText(matriz[0][2]);
        dPrincipalz2.setText(matriz[1][2]);
        dPrincipalz3.setText(matriz[2][2]);
    }

    private void mostrarDetX() {
        //fila x
        matrizDeX_x1.setText(matriz[0][3]);
        matrizDeX_x2.setText(matriz[1][3]);
        matrizDeX_x3.setText(matriz[2][3]);
        //fila y
        matrizDeX_y1.setText(matriz[0][1]);
        matrizDeX_y2.setText(matriz[1][1]);
        matrizDeX_y3.setText(matriz[2][1]);
        //fila z
        matrizDeX_z1.setText(matriz[0][2]);
        matrizDeX_z2.setText(matriz[1][2]);
        matrizDeX_z3.setText(matriz[2][2]);
    }

    private void mostrarDetY() {
       //fila x
        matrizDeY_x1.setText(matriz[0][0]);
        matrizDeY_x2.setText(matriz[1][0]);
        matrizDeY_x3.setText(matriz[2][0]);
        //fila y
        matrizDeY_y1.setText(matriz[0][3]);
        matrizDeY_y2.setText(matriz[1][3]);
        matrizDeY_y3.setText(matriz[2][3]);
        //fila z
        matrizDeY_z1.setText(matriz[0][2]);
        matrizDeY_z2.setText(matriz[1][2]);
        matrizDeY_z3.setText(matriz[2][2]);
    }
     private void mostrarDetZ() {
        //fila x
        matrizDeZ_x1.setText(matriz[0][0]);
        matrizDeZ_x2.setText(matriz[1][0]);
        matrizDeZ_x3.setText(matriz[2][0]);
        //fila y
        matrizDeZ_y1.setText(matriz[0][1]);
        matrizDeZ_y2.setText(matriz[1][1]);
        matrizDeZ_y3.setText(matriz[2][1]);
        //fila z
        matrizDeZ_z1.setText(matriz[0][3]);
        matrizDeZ_z2.setText(matriz[1][3]);
        matrizDeZ_z3.setText(matriz[2][3]);
    }
     int conteo = 0;
     public void mostrarSumaPrincipal(String suma1, String suma2){
         if(conteo ==0){
             suma1Principal.setText(suma1);
             suma2Principal.setText(suma2);
         }
         if(conteo ==1){
             suma1X.setText(suma1);
             suma2X.setText(suma2);
         }
         if(conteo ==2){
             suma1Y.setText(suma1);
             suma2Y.setText(suma2);
         }
         if(conteo ==3){
             suma1Z.setText(suma1);
             suma2Z.setText(suma2);
             conteo=-1;
         }         
         conteo++;
         
     }
     
     public void mostraValoresFinales(float detPrincipal,float detX, float detY,float detZ){
         //agregando Valores a parte de las matrices
         resultadoDetPrincipal.setText(Float.toString(detPrincipal));
         resultadoDetX.setText(Float.toString(detX));
         resultadoDetY.setText(Float.toString(detY));
         ResultadoDetZ.setText(Float.toString(detZ));
         //agregando valor a solucion para las variables
         resultadoDetPrincipal2.setText(Float.toString(detPrincipal));
         resultadoDetPrincipal3.setText(Float.toString(detPrincipal));
         resultadoDetPrincipal4.setText(Float.toString(detPrincipal));
         resultadoDetXMuestra.setText(Float.toString(detX));
         resultadoDetYMuestra.setText(Float.toString(detY));
         resultadoDetZMuestra.setText(Float.toString(detZ));
         //MOSTRANDO VALORES FINALES DE LAS VARIABLES
         valDeX.setText(Float.toString(detX/detPrincipal));
         valDeY.setText(Float.toString(detY/detPrincipal));
         valDeZ.setText(Float.toString(detZ/detPrincipal));
    }
   
}
