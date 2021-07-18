package Modes;

import Main.Main;
import static java.lang.Thread.sleep;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author Jonathan Zamora
 */
public class ForceModePanel extends javax.swing.JPanel {
    
    // Declaring vars
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
     * Initiates TimedModePanel components
     * @param timerMin
     * @param timerSec
     */
    public ForceModePanel(int forceGoal) 
    {
        initComponents();
        
        this.forceGoal = forceGoal ;
        update();
        
        // Setting states
        SideBar.setVisible(false);
        NextPlayer.setVisible(false);
        PreviousPlayer.setVisible(false);
    }
    
    /**
     * Updates the timer text
     */
    public void update()
    {
        String frcGoal = String.format("%02d", forceGoal);
        ForceGoal.setText(frcGoal);
    }
    
    public static int[] generateRandNums(int max, int[] randNums){
        Random r = new Random();
        for(int i = 0; i < randNums.length; i++){
            randNums[i] = r.nextInt(max) + 1000;
        }
        Arrays.sort(randNums);
        return randNums;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideBar = new javax.swing.JPanel();
        jPanel1.setVisible(false);
        About_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Settings_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Profile_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Activity_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Feedback_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        jPanel2 = new javax.swing.JPanel();
        ComboCounterTitle = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        SidebarButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PlayPauseButton = new javax.swing.JLabel();
        PreviousPlayer = new javax.swing.JLabel();
        ResetButton = new javax.swing.JLabel();
        SaveButton = new javax.swing.JLabel();
        NextPlayer = new javax.swing.JLabel();
        ForceGoal = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();
        ForceGoalLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SideBar1 = new javax.swing.JPanel();
        jPanel1.setVisible(false);
        About_Button1 = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Settings_Button1 = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Profile_Button1 = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Activity_Button1 = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Feedback_Button1 = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        jPanel4 = new javax.swing.JPanel();
        ComboCounterTitle1 = new javax.swing.JLabel();
        BackButton1 = new javax.swing.JLabel();
        SidebarButton1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        PlayPauseButton1 = new javax.swing.JLabel();
        PreviousPlayer1 = new javax.swing.JLabel();
        ResetButton1 = new javax.swing.JLabel();
        SaveButton1 = new javax.swing.JLabel();
        NextPlayer1 = new javax.swing.JLabel();
        ForceGoal1 = new javax.swing.JLabel();
        timer1 = new javax.swing.JLabel();
        ForceGoalLabel1 = new javax.swing.JLabel();
        ForceGoalLabel2 = new javax.swing.JLabel();
        ForceGoal2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 55));
        setMaximumSize(new java.awt.Dimension(768, 1024));
        setMinimumSize(new java.awt.Dimension(768, 1024));
        setPreferredSize(new java.awt.Dimension(768, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideBar.setBackground(new java.awt.Color(51, 51, 56));
        SideBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        About_Button.setBackground(new java.awt.Color(51, 51, 56));
        About_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        About_Button.setForeground(new java.awt.Color(240, 240, 240));
        About_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aboutIcon.png"))); // NOI18N
        About_Button.setText(" About");
        About_Button.setBorder(null);
        About_Button.setContentAreaFilled(false);
        About_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                About_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(About_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 60));

        Settings_Button.setBackground(new java.awt.Color(51, 51, 56));
        Settings_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Settings_Button.setForeground(new java.awt.Color(240, 240, 240));
        Settings_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settingsIcon.png"))); // NOI18N
        Settings_Button.setText(" Settings");
        Settings_Button.setBorder(null);
        Settings_Button.setContentAreaFilled(false);
        Settings_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Settings_Button.setFocusPainted(false);
        Settings_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Settings_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(Settings_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

        Profile_Button.setBackground(new java.awt.Color(51, 51, 56));
        Profile_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Profile_Button.setForeground(new java.awt.Color(240, 240, 240));
        Profile_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileIcon.png"))); // NOI18N
        Profile_Button.setText(" Profile");
        Profile_Button.setBorder(null);
        Profile_Button.setContentAreaFilled(false);
        Profile_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profile_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(Profile_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 60));

        Activity_Button.setBackground(new java.awt.Color(51, 51, 56));
        Activity_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Activity_Button.setForeground(new java.awt.Color(240, 240, 240));
        Activity_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/activityIcon.png"))); // NOI18N
        Activity_Button.setText(" Activity");
        Activity_Button.setBorder(null);
        Activity_Button.setContentAreaFilled(false);
        Activity_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Activity_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(Activity_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 60));

        Feedback_Button.setBackground(new java.awt.Color(51, 51, 56));
        Feedback_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Feedback_Button.setForeground(new java.awt.Color(240, 240, 240));
        Feedback_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/feedbackIcon.png"))); // NOI18N
        Feedback_Button.setText(" Feedback");
        Feedback_Button.setBorder(null);
        Feedback_Button.setContentAreaFilled(false);
        Feedback_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Feedback_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(Feedback_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 60));

        add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 80, 250, 530));

        jPanel2.setBackground(new java.awt.Color(51, 51, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCounterTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle.setText("ComboCounter");
        jPanel2.add(ComboCounterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backIcon.png"))); // NOI18N
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        jPanel2.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SidebarButton.setBackground(new java.awt.Color(51, 51, 56));
        SidebarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        SidebarButton.setOpaque(true);
        SidebarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarButtonMouseClicked(evt);
            }
        });
        jPanel2.add(SidebarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 55));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 80));

        jPanel3.setBackground(new java.awt.Color(51, 51, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png"))); // NOI18N
        PlayPauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayPauseButtonMouseClicked(evt);
            }
        });
        jPanel3.add(PlayPauseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 300, 290));

        PreviousPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backPlayerIcon.png"))); // NOI18N
        jPanel3.add(PreviousPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 80, 80));

        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/retryIcon.png"))); // NOI18N
        ResetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetButtonMouseClicked(evt);
            }
        });
        jPanel3.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 80, 80));

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saveIcon2.png"))); // NOI18N
        jPanel3.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 80, 80));

        NextPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextPlayerIcon.png"))); // NOI18N
        jPanel3.add(NextPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 80, 80));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 635, 755, 350));

        ForceGoal.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        ForceGoal.setForeground(new java.awt.Color(240, 240, 240));
        ForceGoal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ForceGoal.setText("0");
        add(ForceGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 210, 60));

        timer.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        timer.setForeground(new java.awt.Color(240, 240, 240));
        timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timer.setText("0:00");
        add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 500, -1));

        ForceGoalLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ForceGoalLabel.setForeground(new java.awt.Color(240, 240, 240));
        ForceGoalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ForceGoalLabel.setText("Force Goal:");
        add(ForceGoalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 280, 80));

        jPanel1.setBackground(new java.awt.Color(0, 0, 55));
        jPanel1.setMaximumSize(new java.awt.Dimension(768, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(768, 1024));
        jPanel1.setPreferredSize(new java.awt.Dimension(768, 1024));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideBar1.setBackground(new java.awt.Color(51, 51, 56));
        SideBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)));
        SideBar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        About_Button1.setBackground(new java.awt.Color(51, 51, 56));
        About_Button1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        About_Button1.setForeground(new java.awt.Color(240, 240, 240));
        About_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aboutIcon.png"))); // NOI18N
        About_Button1.setText(" About");
        About_Button1.setBorder(null);
        About_Button1.setContentAreaFilled(false);
        About_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                About_Button1MouseClicked(evt);
            }
        });
        SideBar1.add(About_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 60));

        Settings_Button1.setBackground(new java.awt.Color(51, 51, 56));
        Settings_Button1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Settings_Button1.setForeground(new java.awt.Color(240, 240, 240));
        Settings_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settingsIcon.png"))); // NOI18N
        Settings_Button1.setText(" Settings");
        Settings_Button1.setBorder(null);
        Settings_Button1.setContentAreaFilled(false);
        Settings_Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Settings_Button1.setFocusPainted(false);
        Settings_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Settings_Button1MouseClicked(evt);
            }
        });
        SideBar1.add(Settings_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

        Profile_Button1.setBackground(new java.awt.Color(51, 51, 56));
        Profile_Button1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Profile_Button1.setForeground(new java.awt.Color(240, 240, 240));
        Profile_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileIcon.png"))); // NOI18N
        Profile_Button1.setText(" Profile");
        Profile_Button1.setBorder(null);
        Profile_Button1.setContentAreaFilled(false);
        Profile_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profile_Button1MouseClicked(evt);
            }
        });
        SideBar1.add(Profile_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 60));

        Activity_Button1.setBackground(new java.awt.Color(51, 51, 56));
        Activity_Button1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Activity_Button1.setForeground(new java.awt.Color(240, 240, 240));
        Activity_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/activityIcon.png"))); // NOI18N
        Activity_Button1.setText(" Activity");
        Activity_Button1.setBorder(null);
        Activity_Button1.setContentAreaFilled(false);
        Activity_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Activity_Button1MouseClicked(evt);
            }
        });
        SideBar1.add(Activity_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 60));

        Feedback_Button1.setBackground(new java.awt.Color(51, 51, 56));
        Feedback_Button1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Feedback_Button1.setForeground(new java.awt.Color(240, 240, 240));
        Feedback_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/feedbackIcon.png"))); // NOI18N
        Feedback_Button1.setText(" Feedback");
        Feedback_Button1.setBorder(null);
        Feedback_Button1.setContentAreaFilled(false);
        Feedback_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Feedback_Button1MouseClicked(evt);
            }
        });
        SideBar1.add(Feedback_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 60));

        jPanel1.add(SideBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 80, 250, 530));

        jPanel4.setBackground(new java.awt.Color(51, 51, 56));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCounterTitle1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle1.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle1.setText("ComboCounter");
        jPanel4.add(ComboCounterTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        BackButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backIcon.png"))); // NOI18N
        BackButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton1MouseClicked(evt);
            }
        });
        jPanel4.add(BackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SidebarButton1.setBackground(new java.awt.Color(51, 51, 56));
        SidebarButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        SidebarButton1.setOpaque(true);
        SidebarButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarButton1MouseClicked(evt);
            }
        });
        jPanel4.add(SidebarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 55));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 80));

        jPanel5.setBackground(new java.awt.Color(51, 51, 56));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayPauseButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png"))); // NOI18N
        PlayPauseButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayPauseButton1MouseClicked(evt);
            }
        });
        jPanel5.add(PlayPauseButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 300, 290));

        PreviousPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backPlayerIcon.png"))); // NOI18N
        jPanel5.add(PreviousPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 80, 80));

        ResetButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/retryIcon.png"))); // NOI18N
        ResetButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetButton1MouseClicked(evt);
            }
        });
        jPanel5.add(ResetButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 80, 80));

        SaveButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saveIcon2.png"))); // NOI18N
        jPanel5.add(SaveButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 80, 80));

        NextPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextPlayerIcon.png"))); // NOI18N
        jPanel5.add(NextPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 80, 80));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 635, 755, 350));

        ForceGoal1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        ForceGoal1.setForeground(new java.awt.Color(240, 240, 240));
        ForceGoal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ForceGoal1.setText("0");
        jPanel1.add(ForceGoal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 210, 60));

        timer1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        timer1.setForeground(new java.awt.Color(240, 240, 240));
        timer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timer1.setText("0:00");
        jPanel1.add(timer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 500, -1));

        ForceGoalLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ForceGoalLabel1.setForeground(new java.awt.Color(240, 240, 240));
        ForceGoalLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ForceGoalLabel1.setText("Force Goal:");
        jPanel1.add(ForceGoalLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 280, 80));

        ForceGoalLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ForceGoalLabel2.setForeground(new java.awt.Color(240, 240, 240));
        ForceGoalLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ForceGoalLabel2.setText("Current Force:");
        jPanel1.add(ForceGoalLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 320, 80));

        ForceGoal2.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        ForceGoal2.setForeground(new java.awt.Color(240, 240, 240));
        ForceGoal2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ForceGoal2.setText("0");
        jPanel1.add(ForceGoal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 210, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void PlayPauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayPauseButtonMouseClicked
        if (paused == true)
        {
            int[] randNumbs = new int [40];
            generateRandNums(8000, randNumbs);
            paused = false;
            PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pauseIcon.png")));
            start = true;
            Thread th;

            th = new Thread(){
                @Override
                public void run(){
                    while(start == true){
                        try{
                            sleep(1000);
                            timerSec-= 1;
                            
                            // Increases Total Force randomly
                            if (timerSec % 2 == 0)
                            {
                                totalForce += randNumbs[index];
                                String tf = String.valueOf(totalForce);
                                ForceGoal.setText(tf);
                                index++;
                            }
                            
                            if(timerSec == -1){
                                timerMin--;
                                timerSec = 59;
                            }
                            
                            if(timerSec == 0 && timerMin == 0){
                                update();
                                return;
                            }
                            update();
                        }catch(InterruptedException e){
                            System.out.println("Error");
                        }
                    }
                }
            };
            th.start();
        }
        else if (paused == false)
        {
            start = false;
            paused = true;
            PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png")));
        }
    }//GEN-LAST:event_PlayPauseButtonMouseClicked

    private void ResetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        Main.setup(3);
    }//GEN-LAST:event_BackButtonMouseClicked

    private void SidebarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarButtonMouseClicked
        if (Main.sidebarOpen == false)
        {
            SideBar.setVisible(true) ;
            Main.sidebarOpen = true ;
        }
        else if (Main.sidebarOpen == true)
        {
            SideBar.setVisible(false);
            Main.sidebarOpen = false ;
        }
    }//GEN-LAST:event_SidebarButtonMouseClicked

    private void BackButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButton1MouseClicked

    private void SidebarButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SidebarButton1MouseClicked

    private void PlayPauseButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayPauseButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayPauseButton1MouseClicked

    private void ResetButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetButton1MouseClicked

    private void Feedback_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_Button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Feedback_Button1MouseClicked

    private void Activity_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activity_Button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Activity_Button1MouseClicked

    private void Profile_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile_Button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Profile_Button1MouseClicked

    private void Settings_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_Button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Settings_Button1MouseClicked

    private void About_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_Button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_About_Button1MouseClicked

    private void Feedback_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_ButtonMouseClicked
        /*start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        // Page to transition to*/
    }//GEN-LAST:event_Feedback_ButtonMouseClicked

    private void Activity_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activity_ButtonMouseClicked
        /*start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        // Page to transition to*/
    }//GEN-LAST:event_Activity_ButtonMouseClicked

    private void Profile_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile_ButtonMouseClicked
        /*start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        // Page to transition to*/
    }//GEN-LAST:event_Profile_ButtonMouseClicked

    private void Settings_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_ButtonMouseClicked
        start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        Main.transitionToPage(3);
    }//GEN-LAST:event_Settings_ButtonMouseClicked

    private void About_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_ButtonMouseClicked
        /*start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        // Page to transition to*/
    }//GEN-LAST:event_About_ButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_Button;
    private javax.swing.JButton About_Button1;
    private javax.swing.JButton Activity_Button;
    private javax.swing.JButton Activity_Button1;
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel BackButton1;
    private javax.swing.JLabel ComboCounterTitle;
    private javax.swing.JLabel ComboCounterTitle1;
    private javax.swing.JButton Feedback_Button;
    private javax.swing.JButton Feedback_Button1;
    private javax.swing.JLabel ForceGoal;
    private javax.swing.JLabel ForceGoal1;
    private javax.swing.JLabel ForceGoal2;
    private javax.swing.JLabel ForceGoalLabel;
    private javax.swing.JLabel ForceGoalLabel1;
    private javax.swing.JLabel ForceGoalLabel2;
    private javax.swing.JLabel NextPlayer;
    private javax.swing.JLabel NextPlayer1;
    private javax.swing.JLabel PlayPauseButton;
    private javax.swing.JLabel PlayPauseButton1;
    private javax.swing.JLabel PreviousPlayer;
    private javax.swing.JLabel PreviousPlayer1;
    private javax.swing.JButton Profile_Button;
    private javax.swing.JButton Profile_Button1;
    private javax.swing.JLabel ResetButton;
    private javax.swing.JLabel ResetButton1;
    private javax.swing.JLabel SaveButton;
    private javax.swing.JLabel SaveButton1;
    private javax.swing.JButton Settings_Button;
    private javax.swing.JButton Settings_Button1;
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel SideBar1;
    private javax.swing.JLabel SidebarButton;
    private javax.swing.JLabel SidebarButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel timer;
    private javax.swing.JLabel timer1;
    // End of variables declaration//GEN-END:variables
}
