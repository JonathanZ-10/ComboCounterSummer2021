package Modes;


import Main.Main;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RezTheCoward
 */
public class StrengthModePanel extends javax.swing.JPanel {

    int timerSec = 0 ;
    int timerMin = 0 ;
    int forceGoal ;
    int playerNum = 2;
    boolean countDown = true;
    boolean paused = true;
    int index = 0;
    int totalForce = 0;
    boolean start;
    /**
     * Creates new form PunchCountPanel
     */
    public StrengthModePanel() {
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

        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton8.setOpaque(false);
        jButton8.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        jButton7 = new javax.swing.JButton();
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        jButton9 = new javax.swing.JButton();
        jButton9.setOpaque(false);
        jButton9.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 55));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-punching-bag-50.png"))); // NOI18N
        jLabel16.setOpaque(true);
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 320, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-gear-50.png"))); // NOI18N
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 320, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-50.png"))); // NOI18N
        jLabel11.setOpaque(true);
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-graph-50.png"))); // NOI18N
        jLabel18.setOpaque(true);
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 320, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-male-user-50.png"))); // NOI18N
        jLabel19.setOpaque(true);
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 320, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-open-door-50.png"))); // NOI18N
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 0, 320, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("00:30");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 500, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Strength Mode");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 560, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Time Setting");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 500, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Invalid Punches");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 500, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 500, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(21, 140, 75));
        jButton8.setText("Start");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 160, 50));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(242, 0, 0));
        jButton7.setText("Stop");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 160, 50));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(246, 225, 17));
        jButton9.setText("Reset");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 780, 160, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Threshold Force");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, 500, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("200");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 780, 500, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Valid Punches");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 290, 500, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("0");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 360, 500, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Current Time");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 500, 500, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("00:00.00");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 570, 500, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Last Hit");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 710, 500, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("N/A");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 780, 500, -1));
    }// </editor-fold>//GEN-END:initComponents

    private int minute;
    private int second;
    private int ms;
    private int invalid = 0;
    private int valid = 0;
    private int num = 0;
    // boolean start;
    
    public static int[] generateRandNums(int max, int[] randNums){
        Random r = new Random();
        for(int i = 0; i < randNums.length; i++){
            randNums[i] = r.nextInt(max) + 1000;
        }
        Arrays.sort(randNums);
        return randNums;
    }
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        minute = 0;
        second = 30;
        ms = 0;
        int[] randNumbs = new int [30];
        generateRandNums(6000, randNumbs);
        start = true;
        Thread t = new Thread(){
            public void run(){
                while(start == true){
                    try{
                        sleep(10);
                        ms--;
                        if(ms == -1){
                            if(second % 2 == 0){
                                jLabel21.setText(String.valueOf(randNumbs[num]));
                                num++;
                                valid++;
                                jLabel12.setText(String.valueOf(valid));
                            }
                            if(second % 3 == 0){
                                invalid++;
                                jLabel7.setText(String.valueOf(invalid));
                            }
                            second--;
                            ms = 99;
                        }
                        if(second == -1){
                            minute--;
                            second = 59;
                        }
                        if(ms == 0 && second == 0 && minute == 0){
                            break;
                        }
                        String minute_str = String.format("%02d", minute);
                        String second_str = String.format("%02d", second);
                        String ms_str = String.format("%02d", ms);
                        jLabel14.setText(minute_str + ":" + second_str + "." + ms_str);
                    }catch(Exception e){
                        System.out.println("Error");
                    }
                }
            }
        };
        t.start();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        start = false;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Main.transitionToPage(5) ;
        /*start = false;
        ms = 0;
        second = 0;
        minute = 0;
        invalid = 0;
        valid = 0;
        String minute_str = String.format("%02d", minute);
        String second_str = String.format("%02d", second);
        String ms_str = String.format("%02d", ms);
        jLabel14.setText(minute_str + ":" + second_str + "." + ms_str);
        jLabel7.setText(String.valueOf(invalid));
        jLabel12.setText(String.valueOf(valid));
        jLabel21.setText("0");*/
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Main.transitionToPage(1);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Main.transitionToPage(6);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        
    }//GEN-LAST:event_jLabel20MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
