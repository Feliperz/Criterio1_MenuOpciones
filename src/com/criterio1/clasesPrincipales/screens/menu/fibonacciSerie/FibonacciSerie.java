/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criterio1.clasesPrincipales.screens.menu.fibonacciSerie;

import com.criterio1.clasesPrincipales.SerieFibonacci;
import com.criterio1.clasesPrincipales.screens.sistemaEcuaciones.SistemaEcuaciones;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author FelipeRC
 */
public class FibonacciSerie extends javax.swing.JPanel {

    /**
     * Creates new form FibonacciSerie
     */
    public FibonacciSerie() {
        initComponents();
    }

    public void Clean(){
        numFi.setText("");
        mostrarSerie.setText("");
        numFi.setBackground(new Color(255,255,255));
    }

     SerieFibonacci calc = new SerieFibonacci();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kk = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarSerie = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        numFi = new javax.swing.JTextField();
        calcF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cleanFibonacci = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        kk.setForeground(new java.awt.Color(255, 0, 0));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(165, 0, 86)));
        jScrollPane1.setRowHeaderView(null);

        mostrarSerie.setEditable(false);
        mostrarSerie.setColumns(20);
        mostrarSerie.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        mostrarSerie.setLineWrap(true);
        mostrarSerie.setRows(3);
        mostrarSerie.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(245, 0, 86)));
        mostrarSerie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(mostrarSerie);

        kk.add(jScrollPane1);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresa el termino hasta el cual quiere calcular la serie");

        numFi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numFi.setForeground(new java.awt.Color(0, 0, 0));
        numFi.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        numFi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickedOnField(evt);
            }
        });
        numFi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numFiKeyTyped(evt);
            }
        });

        calcF.setBackground(new java.awt.Color(255, 255, 255));
        calcF.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        calcF.setForeground(new java.awt.Color(0, 0, 0));
        calcF.setText("Calcular");
        calcF.setBorderPainted(false);
        calcF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcF.setFocusable(false);
        calcF.setOpaque(true);
        calcF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarColorBFibonacci1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBfibonacci1(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                calcFMouseReleased(evt);
            }
        });
        calcF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SERIE DE FIBONACCI");

        cleanFibonacci.setBackground(new java.awt.Color(255, 255, 255));
        cleanFibonacci.setForeground(new java.awt.Color(0, 0, 0));
        cleanFibonacci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/clasesPrincipales/screens/menu/fibonacciSerie/escobita.png"))); // NOI18N
        cleanFibonacci.setBorderPainted(false);
        cleanFibonacci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanFibonacci.setFocusable(false);
        cleanFibonacci.setOpaque(true);
        cleanFibonacci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarColorBfibo2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBf2(evt);
            }
        });
        cleanFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanFibonacciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(kk, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calcF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cleanFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numFi, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calcF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanFibonacci)
                    .addComponent(numFi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kk, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calcFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcFActionPerformed

    private void calcFMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcFMouseReleased
        dataIsCorrect = true;
        mostrarSerie.setText("");
        int i=0, enviarNum;
        float enviarfloat = isCorrectData(numFi);
        if(dataIsCorrect && enviarfloat !=0 && enviarfloat >= 0){
        enviarNum = Math.round(enviarfloat);
        calc.setLimite(enviarNum);
        calc.SerieFibonacci(i);
        mostrarSerie.setText(calc.general);
        }        
        if(enviarfloat<0)numFi.setBackground(Color.red);
        
        
        
    }//GEN-LAST:event_calcFMouseReleased

    private void clickedOnField(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickedOnField
       ((JTextField) evt.getSource()).setBackground(Color.white);
    }//GEN-LAST:event_clickedOnField

    private void cleanFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanFibonacciActionPerformed
        Clean();
        
    }//GEN-LAST:event_cleanFibonacciActionPerformed

    private void numFiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numFiKeyTyped
       char c = evt.getKeyChar();
       if(c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numFiKeyTyped

    private void cambiarColorBFibonacci1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColorBFibonacci1
        calcF.setBackground(new Color(210,211,224));
    }//GEN-LAST:event_cambiarColorBFibonacci1

    private void volverColorBfibonacci1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBfibonacci1
       calcF.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_volverColorBfibonacci1

    private void cambiarColorBfibo2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColorBfibo2
        cleanFibonacci.setBackground(new Color(210,211,224));
    }//GEN-LAST:event_cambiarColorBfibo2

    private void volverColorBf2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBf2
       cleanFibonacci.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_volverColorBf2


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcF;
    private javax.swing.JButton cleanFibonacci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.ScrollPane kk;
    private javax.swing.JTextArea mostrarSerie;
    private javax.swing.JTextField numFi;
    // End of variables declaration//GEN-END:variables
    
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
}
