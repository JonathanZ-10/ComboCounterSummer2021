package Multiplayer;

import Main.Main;
import Modes.ForceModePanelOLD;
import javax.swing.JFrame;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RezTheCoward
 */
public class ForceModeMultiplayer extends javax.swing.JPanel {

    /**
     * Creates new form ForceModeMultiplayer
     */
    private int page;

    public ForceModeMultiplayer(int numPlayers) {
        initComponents();
        jTextField3.setText(Main.name1);
        jTextField4.setText(Main.name2);
        jTextField5.setText(Main.name3);
        jTextField6.setText(Main.name4);
        jTextField7.setText(Main.name5);
        jTextField8.setText(Main.name6);
        jLabel10.setText(Main.score1);
        jLabel8.setText(Main.score2);
        jLabel12.setText(Main.score3);
        jLabel11.setText(Main.score4);
        jLabel16.setText(Main.score5);
        jLabel15.setText(Main.score6);
        Main.playerNum = numPlayers ;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton5.setOpaque(false);
        jButton5.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 55));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-50.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-punching-bag-50.png"))); // NOI18N
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 320, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-gear-50.png"))); // NOI18N
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 320, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-graph-50.png"))); // NOI18N
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 320, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-male-user-50.png"))); // NOI18N
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 320, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-open-door-50.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 0, 320, -1));

        jTextField4.setBackground(new java.awt.Color(0, 0, 55));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(240, 240, 240));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Player 2");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 500, 60));

        jTextField5.setBackground(new java.awt.Color(0, 0, 55));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(240, 240, 240));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Player 3");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 500, 60));

        jTextField6.setBackground(new java.awt.Color(0, 0, 55));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(240, 240, 240));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Player 4");
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 500, 60));

        jTextField7.setBackground(new java.awt.Color(0, 0, 55));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(240, 240, 240));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Player 5");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, 500, 60));

        jTextField8.setBackground(new java.awt.Color(0, 0, 55));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(240, 240, 240));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Player 6");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 770, 500, 60));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setText("Done");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 900, 200, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 500, 60));

        jTextField3.setBackground(new java.awt.Color(0, 0, 55));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(240, 240, 240));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Player 1");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 500, 60));
        jTextField3.getAccessibleContext().setAccessibleName("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Score");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 500, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 500, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 500, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 500, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 500, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 500, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 770, 500, 60));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 500, 60));

        jTextField9.setBackground(new java.awt.Color(0, 0, 55));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(240, 240, 240));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("100");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 290, 500, 60));

        jTextField10.setBackground(new java.awt.Color(0, 0, 55));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(240, 240, 240));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("100");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 410, 500, 60));

        jTextField11.setBackground(new java.awt.Color(0, 0, 55));
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(240, 240, 240));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("100");
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 530, 500, 60));

        jTextField12.setBackground(new java.awt.Color(0, 0, 55));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(240, 240, 240));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("100");
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 650, 500, 60));

        jTextField13.setBackground(new java.awt.Color(0, 0, 55));
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(240, 240, 240));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("100");
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 770, 500, 60));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Handicap");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 90, 500, -1));

        jTextField14.setBackground(new java.awt.Color(0, 0, 55));
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(240, 240, 240));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("100");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 170, 500, 60));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Players");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 320, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if (Main.doneFlag == true)
        {
            Main.done() ;
            return ;
        }
        Main.currentPlayer = 1;
        /*Main.Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Main.Frame.setContentPane(new ForceModePanelOLD());
        Main.Frame.repaint();
        Main.Frame.revalidate();*/
        // Use setup() or transitionToPage() instead
        
        // Save Variable Names
        Main.name1 = jTextField3.getText() ;
        Main.name2 = jTextField4.getText() ;
        Main.name3 = jTextField5.getText() ;
        Main.name4 = jTextField6.getText() ;
        Main.name5 = jTextField7.getText() ;
        Main.name6 = jTextField8.getText() ;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Main.transitionToPage(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Main.transitionToPage(6);
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}