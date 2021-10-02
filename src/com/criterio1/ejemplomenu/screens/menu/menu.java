/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criterio1.ejemplomenu.screens.menu;

import com.criterio1.ejemplomenu.screens.menu.fibonacciSerie.FibonacciSerie;
import com.criterio1.ejemplomenu.screens.menu.tipoRaices.TipoDeRaiz;

import com.criterio1.ejemplomenu.screens.sistemaEcuaciones.SistemaEcuaciones;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class menu extends javax.swing.JFrame implements ActionListener {

    
   int xMouse, yMouse;
    public menu() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu de Operaciones");
        
        chooseDeterminante1.addActionListener(this);
        chooseRaices1.addActionListener(this);
        chooseFibonachi1.addActionListener(this);
        
         ImageIcon wallpaper_logo = new ImageIcon("src/Imagenes/LOGO_TECNM_BLANCO.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(JLabel_Logo.getWidth(), JLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        JLabel_Logo.setIcon(icono_logo);
        this.repaint();
        
        //codigo para logo Tec tepic
        ImageIcon wallpaper_logo2 = new ImageIcon("src/Imagenes/Logo_Tec_Tepic.png");
        Icon icono_logo2 = new ImageIcon(wallpaper_logo2.getImage().getScaledInstance(Logo_tec_tepic.getWidth(), Logo_tec_tepic.getHeight(), Image.SCALE_DEFAULT));
        Logo_tec_tepic.setIcon(icono_logo2);
        this.repaint();
        
            
    }
        public Image getIconImage(){
        Image retValue =Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo_Tec_Tepic.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panel_Exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        volverPresentacion = new javax.swing.JButton();
        chooseDeterminante1 = new javax.swing.JButton();
        chooseFibonachi1 = new javax.swing.JButton();
        chooseRaices1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLabel_Logo = new javax.swing.JLabel();
        sEc = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Logo_tec_tepic = new javax.swing.JLabel();
        Boton_Exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(170, 0, 85));

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));

        volverPresentacion.setBackground(new java.awt.Color(204, 0, 102));
        volverPresentacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        volverPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        volverPresentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/ejemplomenu/screens/menu/Menu.png"))); // NOI18N
        volverPresentacion.setText("Volver Menu     ");
        volverPresentacion.setBorder(null);
        volverPresentacion.setBorderPainted(false);
        volverPresentacion.setContentAreaFilled(false);
        volverPresentacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverPresentacion.setFocusable(false);
        volverPresentacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        volverPresentacion.setOpaque(true);
        volverPresentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarFondoBotonVolver(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBotonVolver(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                volverPresentacionMouseReleased(evt);
            }
        });

        chooseDeterminante1.setBackground(new java.awt.Color(204, 0, 102));
        chooseDeterminante1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        chooseDeterminante1.setForeground(new java.awt.Color(255, 255, 255));
        chooseDeterminante1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/ejemplomenu/screens/menu/Determinante.png"))); // NOI18N
        chooseDeterminante1.setText("Determinante   ");
        chooseDeterminante1.setBorder(null);
        chooseDeterminante1.setBorderPainted(false);
        chooseDeterminante1.setContentAreaFilled(false);
        chooseDeterminante1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseDeterminante1.setFocusable(false);
        chooseDeterminante1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chooseDeterminante1.setOpaque(true);
        chooseDeterminante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarFondoBoton(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBoton(evt);
            }
        });
        chooseDeterminante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDeterminante1ActionPerformed(evt);
            }
        });

        chooseFibonachi1.setBackground(new java.awt.Color(204, 0, 102));
        chooseFibonachi1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        chooseFibonachi1.setForeground(new java.awt.Color(255, 255, 255));
        chooseFibonachi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/ejemplomenu/screens/menu/Fibonacci.png"))); // NOI18N
        chooseFibonachi1.setText("Fibonacci Serie");
        chooseFibonachi1.setBorder(null);
        chooseFibonachi1.setBorderPainted(false);
        chooseFibonachi1.setContentAreaFilled(false);
        chooseFibonachi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseFibonachi1.setFocusable(false);
        chooseFibonachi1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chooseFibonachi1.setOpaque(true);
        chooseFibonachi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarFondoBotonFibonacci(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBotonFibonacci(evt);
            }
        });
        chooseFibonachi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFibonachi1ActionPerformed(evt);
            }
        });

        chooseRaices1.setBackground(new java.awt.Color(204, 0, 102));
        chooseRaices1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        chooseRaices1.setForeground(new java.awt.Color(255, 255, 255));
        chooseRaices1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/ejemplomenu/screens/menu/Raices.png"))); // NOI18N
        chooseRaices1.setText("Discriminante   ");
        chooseRaices1.setBorder(null);
        chooseRaices1.setBorderPainted(false);
        chooseRaices1.setContentAreaFilled(false);
        chooseRaices1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseRaices1.setFocusable(false);
        chooseRaices1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chooseRaices1.setOpaque(true);
        chooseRaices1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarFondoBotonRaices(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverColorBotonRaices(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chooseRaices1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
            .addComponent(chooseDeterminante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chooseFibonachi1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(chooseDeterminante1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(chooseRaices1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(chooseFibonachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(volverPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRITERIO 1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(panel_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 480));

        sEc.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sEcLayout = new javax.swing.GroupLayout(sEc);
        sEc.setLayout(sEcLayout);
        sEcLayout.setHorizontalGroup(
            sEcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sEcLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sEcLayout.setVerticalGroup(
            sEcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sEcLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel4.add(sEc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 600, 330));

        jPanel5.setBackground(new java.awt.Color(64, 64, 64));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PROGRAMACIÓN AVANZADA");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Interfaz Usuario");

        Logo_tec_tepic.setForeground(new java.awt.Color(0, 0, 0));
        Logo_tec_tepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/criterio1/ejemplomenu/screens/menu/Logo_Tec_Tepic.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(Logo_tec_tepic)
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo_tec_tepic, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 640, 90));

        Boton_Exit.setBackground(new java.awt.Color(255, 255, 255));
        Boton_Exit.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Boton_Exit.setForeground(new java.awt.Color(153, 153, 153));
        Boton_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_Exit.setText("X");
        Boton_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Exit.setOpaque(true);
        Boton_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton_ExitMouseExited(evt);
            }
        });
        jPanel4.add(Boton_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 30, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Equipo J");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 201, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverPresentacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverPresentacionMouseReleased
        menuPresentacion volver = new menuPresentacion();
        volver.show();
        this.dispose();
    }//GEN-LAST:event_volverPresentacionMouseReleased

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void Boton_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Boton_ExitMouseClicked

    private void Boton_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ExitMouseEntered
        Boton_Exit.setBackground(Color.red);
    }//GEN-LAST:event_Boton_ExitMouseEntered

    private void Boton_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ExitMouseExited
        Boton_Exit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_Boton_ExitMouseExited

    private void cambiarFondoBoton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarFondoBoton
        chooseDeterminante1.setBackground(new Color(224,0,102));
    }//GEN-LAST:event_cambiarFondoBoton

    private void volverColorBoton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBoton
        chooseDeterminante1.setBackground(new Color(204,0,102));
    }//GEN-LAST:event_volverColorBoton

    private void cambiarFondoBotonFibonacci(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarFondoBotonFibonacci
       chooseFibonachi1.setBackground(new Color(224,0,102));
    }//GEN-LAST:event_cambiarFondoBotonFibonacci

    private void volverColorBotonFibonacci(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBotonFibonacci
       chooseFibonachi1.setBackground(new Color(204,0,102));
    }//GEN-LAST:event_volverColorBotonFibonacci

    private void cambiarFondoBotonRaices(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarFondoBotonRaices
        chooseRaices1.setBackground(new Color(224,0,102));
    }//GEN-LAST:event_cambiarFondoBotonRaices

    private void volverColorBotonRaices(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBotonRaices
        chooseRaices1.setBackground(new Color(204,0,102));
    }//GEN-LAST:event_volverColorBotonRaices

    private void cambiarFondoBotonVolver(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarFondoBotonVolver
        volverPresentacion.setBackground(new Color(224,0,102));
    }//GEN-LAST:event_cambiarFondoBotonVolver

    private void volverColorBotonVolver(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverColorBotonVolver
        volverPresentacion.setBackground(new Color(204,0,102));
    }//GEN-LAST:event_volverColorBotonVolver

    private void chooseFibonachi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFibonachi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseFibonachi1ActionPerformed

    private void chooseDeterminante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseDeterminante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseDeterminante1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton_Exit;
    private javax.swing.JLabel JLabel_Logo;
    private javax.swing.JLabel Logo_tec_tepic;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton chooseDeterminante1;
    private javax.swing.JButton chooseFibonachi1;
    private javax.swing.JButton chooseRaices1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel panel_Exit;
    private javax.swing.JPanel sEc;
    private javax.swing.JButton volverPresentacion;
    // End of variables declaration//GEN-END:variables
   
    SistemaEcuaciones sis = new SistemaEcuaciones();
    FibonacciSerie fibonacci = new FibonacciSerie();
    TipoDeRaiz raiz = new TipoDeRaiz();
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseDeterminante1) {
               
               sis.cleanComponents();
               sis.setBounds(0,0,699,699);
               sEc.add(sis);
               validate();
               repaint();
               sis.setVisible(true);
              fibonacci.setVisible(false);
              raiz.setVisible(false);
                       
               
             
        } else if (e.getSource() == chooseRaices1) {
            raiz.cleanValues();
            this.sEc.setBackground(Color.blue);
            raiz.setBounds(0,0,699,699);
               sEc.add(raiz);
               validate();
               repaint();
               raiz.setVisible(true);
             sis.setVisible(false);
             fibonacci.setVisible(false);
             
        } else if (e.getSource() == chooseFibonachi1) {
               fibonacci.Clean();
               fibonacci.setBounds(0,0,699,699);
               sEc.add(fibonacci);
               validate();
               repaint();
               fibonacci.setVisible(true);
               sis.setVisible(false);
               raiz.setVisible(false);
        }
    }
}
