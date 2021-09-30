/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criterio1.ejemplomenu.screens.menu;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Axel
 */
public class menuPresentacion extends javax.swing.JFrame {

    int xMouse, yMouse;

    public menuPresentacion() {
        initComponents();
        //Establecer el tamano de la interfaz
        setSize(746, 485);
        //Dejar Estatico el tamano de la interfaz
        //setResizable(false);
        //Darle un titulo a la interfaz
        setTitle("Menu de Opciones");
        //Centrar la ventana interfaz
        setLocationRelativeTo(null);

        Texto_txt2.setText("<html>3. Impresión de la serie de Fibonacci hasta un número determinado.</html>");
        Texto_txt1.setText("<html>2. Descripción de tipo de raíces a partir del análisis del Discriminante.</html>");
        Texto_txt.setText("<html>1. Sistema de ecuaciones de 1er grado de 3 variables por método de determinantes.</html>");

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
    //codigo para cambiar el logo a la interfaz
    @Override
    public Image getIconImage(){
        Image retValue =Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo_Tec_Tepic.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backgraound = new javax.swing.JPanel();
        JLabel_Logo = new javax.swing.JLabel();
        Background_Blanco = new javax.swing.JPanel();
        Label_txt = new javax.swing.JLabel();
        Entrar_Boton = new javax.swing.JPanel();
        Entrar_txt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logo_tec_tepic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Background_Rojo = new javax.swing.JPanel();
        Panel_Exit = new javax.swing.JPanel();
        Boton_Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Texto_txt = new javax.swing.JLabel();
        Texto_txt1 = new javax.swing.JLabel();
        Texto_txt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        Backgraound.setBackground(new java.awt.Color(64, 64, 64));
        Backgraound.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Backgraound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Backgraound.add(JLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 160, 60));

        Background_Blanco.setBackground(new java.awt.Color(255, 255, 255));

        Label_txt.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        Label_txt.setForeground(new java.awt.Color(0, 0, 0));
        Label_txt.setText("CRITERIO I");

        Entrar_Boton.setBackground(new java.awt.Color(64, 64, 64));

        Entrar_txt.setBackground(new java.awt.Color(64, 64, 64));
        Entrar_txt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Entrar_txt.setForeground(new java.awt.Color(255, 255, 255));
        Entrar_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entrar_txt.setText("ENTRAR");
        Entrar_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar_txt.setFocusable(false);
        Entrar_txt.setOpaque(true);
        Entrar_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Entrar_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Entrar_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Entrar_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Entrar_BotonLayout = new javax.swing.GroupLayout(Entrar_Boton);
        Entrar_Boton.setLayout(Entrar_BotonLayout);
        Entrar_BotonLayout.setHorizontalGroup(
            Entrar_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entrar_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );
        Entrar_BotonLayout.setVerticalGroup(
            Entrar_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entrar_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Equipo J");

        Logo_tec_tepic.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Numero de Control");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("19401123");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("19401091");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("18400276");

        javax.swing.GroupLayout Background_BlancoLayout = new javax.swing.GroupLayout(Background_Blanco);
        Background_Blanco.setLayout(Background_BlancoLayout);
        Background_BlancoLayout.setHorizontalGroup(
            Background_BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_BlancoLayout.createSequentialGroup()
                .addGroup(Background_BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background_BlancoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(Background_BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(Entrar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Background_BlancoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(Background_BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))))
                    .addGroup(Background_BlancoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Label_txt))
                    .addGroup(Background_BlancoLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(Logo_tec_tepic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        Background_BlancoLayout.setVerticalGroup(
            Background_BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_BlancoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Label_txt)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Entrar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(Logo_tec_tepic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        Backgraound.add(Background_Blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 300, 370));

        Background_Rojo.setBackground(new java.awt.Color(204, 0, 102));

        javax.swing.GroupLayout Background_RojoLayout = new javax.swing.GroupLayout(Background_Rojo);
        Background_Rojo.setLayout(Background_RojoLayout);
        Background_RojoLayout.setHorizontalGroup(
            Background_RojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        Background_RojoLayout.setVerticalGroup(
            Background_RojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        Backgraound.add(Background_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 300, 490));

        Panel_Exit.setBackground(new java.awt.Color(64, 64, 64));
        Panel_Exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_ExitMouseDragged(evt);
            }
        });
        Panel_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_ExitMousePressed(evt);
            }
        });

        Boton_Exit.setBackground(new java.awt.Color(64, 64, 64));
        Boton_Exit.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Boton_Exit.setForeground(new java.awt.Color(204, 0, 102));
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

        javax.swing.GroupLayout Panel_ExitLayout = new javax.swing.GroupLayout(Panel_Exit);
        Panel_Exit.setLayout(Panel_ExitLayout);
        Panel_ExitLayout.setHorizontalGroup(
            Panel_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ExitLayout.createSequentialGroup()
                .addComponent(Boton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 690, Short.MAX_VALUE))
        );
        Panel_ExitLayout.setVerticalGroup(
            Panel_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Backgraound.add(Panel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Thin", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAMACION AVANZADA");
        Backgraound.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        Texto_txt.setBackground(new java.awt.Color(64, 64, 64));
        Texto_txt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Texto_txt.setForeground(new java.awt.Color(255, 255, 255));
        Texto_txt.setText("Texto1");
        Backgraound.add(Texto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 260, 40));

        Texto_txt1.setBackground(new java.awt.Color(64, 64, 64));
        Texto_txt1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Texto_txt1.setForeground(new java.awt.Color(255, 255, 255));
        Texto_txt1.setText("Texto2");
        Backgraound.add(Texto_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 260, 40));

        Texto_txt2.setBackground(new java.awt.Color(64, 64, 64));
        Texto_txt2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Texto_txt2.setForeground(new java.awt.Color(255, 255, 255));
        Texto_txt2.setText("Texto3");
        Backgraound.add(Texto_txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 260, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backgraound, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backgraound, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExitMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Panel_ExitMousePressed

    private void Panel_ExitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExitMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Panel_ExitMouseDragged

    private void Boton_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Boton_ExitMouseClicked

    private void Boton_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ExitMouseEntered
        Boton_Exit.setBackground(Color.red);
    }//GEN-LAST:event_Boton_ExitMouseEntered

    private void Boton_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ExitMouseExited
        Boton_Exit.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_Boton_ExitMouseExited

    private void Entrar_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Entrar_txtMouseEntered
        Entrar_txt.setBackground(Color.lightGray);
    }//GEN-LAST:event_Entrar_txtMouseEntered

    private void Entrar_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Entrar_txtMouseExited
        Entrar_txt.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_Entrar_txtMouseExited
    menu m1 = new menu();
    private void Entrar_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Entrar_txtMouseClicked
        this.dispose();
        m1.show();
    }//GEN-LAST:event_Entrar_txtMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgraound;
    private javax.swing.JPanel Background_Blanco;
    private javax.swing.JPanel Background_Rojo;
    private javax.swing.JLabel Boton_Exit;
    private javax.swing.JPanel Entrar_Boton;
    private javax.swing.JLabel Entrar_txt;
    private javax.swing.JLabel JLabel_Logo;
    private javax.swing.JLabel Label_txt;
    private javax.swing.JLabel Logo_tec_tepic;
    private javax.swing.JPanel Panel_Exit;
    private javax.swing.JLabel Texto_txt;
    private javax.swing.JLabel Texto_txt1;
    private javax.swing.JLabel Texto_txt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
