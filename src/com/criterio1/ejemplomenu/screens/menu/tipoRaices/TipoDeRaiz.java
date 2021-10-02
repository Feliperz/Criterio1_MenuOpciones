/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criterio1.ejemplomenu.screens.menu.tipoRaices;

import com.criterio1.ejemplomenu.TipoDeRaices;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author FelipeRC
 */
public class TipoDeRaiz extends javax.swing.JPanel {

  private double ArregloCocientes[] = new double[3];
    public TipoDeRaiz() {
        initComponents();
    }

   boolean dataIsCorrect = true;
    public double isCorrectData(JTextField field){
        String data = field.getText();
        if(data.equals("")){
           dataIsCorrect = false;
           field.setBackground(new Color(170,0,85));
           return 0;
        }
      
        double dataReturn = Double.valueOf(data);
        return dataReturn;
            
    }
    public void cleanValues(){
        cocienteA.setText("");
        cocienteB.setText("");
        cocienteC.setText("");
        cocienteA.setBackground(Color.white);
        cocienteB.setBackground(Color.white);
        cocienteC.setBackground(Color.white);
        casoRaiz.setText("");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cocienteA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cocienteB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cocienteC = new javax.swing.JTextField();
        calButtonRaiz = new javax.swing.JButton();
        botonClean = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        casoRaiz = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TIPO DE RAICES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("\"Metodo De Discriminante\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese Los Coeficientes");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Txt_IV50", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("a=");

        cocienteA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        cocienteA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validateCharacter(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Txt_IV50", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("b=");

        cocienteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        cocienteB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validateCharacter(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Txt_IV50", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("c=");

        cocienteC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        cocienteC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validateCharacter(evt);
            }
        });

        calButtonRaiz.setBackground(new java.awt.Color(255, 255, 255));
        calButtonRaiz.setForeground(new java.awt.Color(0, 0, 0));
        calButtonRaiz.setText("Calcular");
        calButtonRaiz.setBorderPainted(false);
        calButtonRaiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calButtonRaiz.setFocusable(false);
        calButtonRaiz.setOpaque(true);
        calButtonRaiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarColorBcR(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBcR(evt);
            }
        });
        calButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calButtonRaizActionPerformed(evt);
            }
        });

        botonClean.setBackground(new java.awt.Color(255, 255, 255));
        botonClean.setForeground(new java.awt.Color(0, 0, 0));
        botonClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/ejemplomenu/screens/menu/tipoRaices/escobita.png"))); // NOI18N
        botonClean.setBorderPainted(false);
        botonClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonClean.setFocusable(false);
        botonClean.setOpaque(true);
        botonClean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarColorBborrarR(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBborrarR(evt);
            }
        });
        botonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cocienteA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cocienteB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cocienteC, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(calButtonRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cocienteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cocienteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cocienteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonClean)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(calButtonRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        casoRaiz.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(casoRaiz)
                .addGap(0, 81, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(casoRaiz)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calButtonRaizActionPerformed
        dataIsCorrect = true;
        agregar();
        if(dataIsCorrect){
            TipoDeRaices raiz = new TipoDeRaices();
            raiz.calcularRaices(ArregloCocientes);
            casoRaiz.setText(raiz.clase);
            
        }
    }//GEN-LAST:event_calButtonRaizActionPerformed

    private void clickedOnField(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickedOnField
        ((JTextField) evt.getSource()).setBackground(Color.white);
    }//GEN-LAST:event_clickedOnField

    private void botonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCleanActionPerformed
        cleanValues();

        
    }//GEN-LAST:event_botonCleanActionPerformed

    private void validateCharacter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validateCharacter
       char c = evt.getKeyChar();
       if(c<'-' || c>'9' || c=='.'||c=='/') evt.consume();
    }//GEN-LAST:event_validateCharacter

    private void cambiarColorBcR(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColorBcR
         calButtonRaiz.setBackground(new Color(210,211,224));
    }//GEN-LAST:event_cambiarColorBcR

    private void volverColorBcR(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBcR
       calButtonRaiz.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_volverColorBcR

    private void volverColorBborrarR(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBborrarR
        botonClean.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_volverColorBborrarR

    private void cambiarColorBborrarR(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColorBborrarR
         botonClean.setBackground(new Color(210,211,224));
    }//GEN-LAST:event_cambiarColorBborrarR
    private void agregar(){
        ArregloCocientes[0] = isCorrectData(cocienteA);
        ArregloCocientes[1] = isCorrectData(cocienteB);
        ArregloCocientes[2] = isCorrectData(cocienteC);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonClean;
    private javax.swing.JButton calButtonRaiz;
    private javax.swing.JLabel casoRaiz;
    private javax.swing.JTextField cocienteA;
    private javax.swing.JTextField cocienteB;
    private javax.swing.JTextField cocienteC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
