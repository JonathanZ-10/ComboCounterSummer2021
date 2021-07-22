package Modes.Setup;

import Main.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Jonathan Attias Khoudari
 * Cell #: 305-343-5864
 */
public class PunchChallengeSetup extends javax.swing.JPanel {
    
    // TODO figure out what to do with these
        int roundsNum = 1;
        int roundTimeMin = 1;
        int roundTimeSec = 0;
        int restTimeMin = 0;
        int restTimeSec = 30;
        int forceGoal = 500;
        boolean countDown = true;
        boolean multiplayer = false;
        Timer timer;
    // TODO
        
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 30;
    private int thresholdForce = 200;
    
    // TODO    
    public PunchChallengeSetup() {
        initComponents();       
        Main.playerNum = 2;
        // Setting Plus and Minus state
        SideBar.setVisible(false);
        TrainingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        TopBar = new javax.swing.JPanel();
        ComboCounterTitle = new javax.swing.JLabel();
        SidebarButton = new javax.swing.JLabel();
        SideBar = new javax.swing.JPanel();
        jPanel1.setVisible(false);
        SettingsButton = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        ProfileButton = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        ActivityButton = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        FeedbackButton = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        AboutButton = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        PunchChallengeTitle = new javax.swing.JLabel();
        ComboModeButton = new javax.swing.JLabel();
        ForceModeButton = new javax.swing.JLabel();
        TimedModeButton = new javax.swing.JLabel();
        StrengthModeButton = new javax.swing.JLabel();
        PunchChallengeButton = new javax.swing.JLabel();
        ThresholdForceTitle = new javax.swing.JLabel();
        ThresholdForceLabel = new javax.swing.JLabel();
        ThresholdForcePlus = new javax.swing.JLabel();
        ThresholdForceMinus = new javax.swing.JLabel();
        HoursTitle = new javax.swing.JLabel();
        HoursMinus = new javax.swing.JLabel();
        HoursLabel = new javax.swing.JLabel();
        HoursPlus = new javax.swing.JLabel();
        MinutesTitle = new javax.swing.JLabel();
        MinutesMinus = new javax.swing.JLabel();
        MinutesLabel = new javax.swing.JLabel();
        MinutesPlus = new javax.swing.JLabel();
        SecondsTitle = new javax.swing.JLabel();
        SecondsMinus = new javax.swing.JLabel();
        SecondsLabel = new javax.swing.JLabel();
        SecondsPlus = new javax.swing.JLabel();
        PlayerSettingTitle = new javax.swing.JLabel();
        TrainingButton = new javax.swing.JLabel();
        CompetitionButton = new javax.swing.JLabel();
        NumOfPlayersTitle = new javax.swing.JLabel();
        NumOfPlayers = new javax.swing.JLabel();
        NumOfPlayersPlus = new javax.swing.JLabel();
        NumOfPlayersMinus = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(About_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 60));

        Settings_Button.setBackground(new java.awt.Color(51, 51, 56));
        Settings_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Settings_Button.setForeground(new java.awt.Color(240, 240, 240));
        Settings_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settingsIcon.png"))); // NOI18N
        Settings_Button.setText(" Settings");
        Settings_Button.setBorder(null);
        Settings_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Settings_Button.setFocusPainted(false);
        Settings_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Settings_ButtonMouseClicked(evt);
            }
        });
        jPanel1.add(Settings_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

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
        jPanel1.add(Profile_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 60));

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
        jPanel1.add(Activity_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 60));

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
        jPanel1.add(Feedback_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 60));

        setBackground(new java.awt.Color(0, 0, 55));
        setMaximumSize(new java.awt.Dimension(768, 1024));
        setMinimumSize(new java.awt.Dimension(768, 1024));
        setPreferredSize(new java.awt.Dimension(768, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopBar.setBackground(new java.awt.Color(51, 51, 56));
        TopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCounterTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle.setText("ComboCounter");
        TopBar.add(ComboCounterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        SidebarButton.setBackground(new java.awt.Color(51, 51, 56));
        SidebarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        SidebarButton.setOpaque(true);
        SidebarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarButtonMouseClicked(evt);
            }
        });
        TopBar.add(SidebarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 55));

        add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 80));

        SideBar.setBackground(new java.awt.Color(51, 51, 56));
        SideBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SettingsButton.setBackground(new java.awt.Color(51, 51, 56));
        SettingsButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        SettingsButton.setForeground(new java.awt.Color(240, 240, 240));
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settingsIcon.png"))); // NOI18N
        SettingsButton.setText(" Settings");
        SettingsButton.setBorder(null);
        SettingsButton.setContentAreaFilled(false);
        SettingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SettingsButton.setFocusPainted(false);
        SettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsButtonMouseClicked(evt);
            }
        });
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        SideBar.add(SettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

        ProfileButton.setBackground(new java.awt.Color(51, 51, 56));
        ProfileButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        ProfileButton.setForeground(new java.awt.Color(240, 240, 240));
        ProfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileIcon.png"))); // NOI18N
        ProfileButton.setText(" Profile");
        ProfileButton.setBorder(null);
        ProfileButton.setContentAreaFilled(false);
        ProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileButtonMouseClicked(evt);
            }
        });
        SideBar.add(ProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 60));

        ActivityButton.setBackground(new java.awt.Color(51, 51, 56));
        ActivityButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        ActivityButton.setForeground(new java.awt.Color(240, 240, 240));
        ActivityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/activityIcon.png"))); // NOI18N
        ActivityButton.setText(" Activity");
        ActivityButton.setBorder(null);
        ActivityButton.setContentAreaFilled(false);
        ActivityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActivityButtonMouseClicked(evt);
            }
        });
        SideBar.add(ActivityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 60));

        FeedbackButton.setBackground(new java.awt.Color(51, 51, 56));
        FeedbackButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        FeedbackButton.setForeground(new java.awt.Color(240, 240, 240));
        FeedbackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/feedbackIcon.png"))); // NOI18N
        FeedbackButton.setText(" Feedback");
        FeedbackButton.setBorder(null);
        FeedbackButton.setContentAreaFilled(false);
        FeedbackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbackButtonMouseClicked(evt);
            }
        });
        SideBar.add(FeedbackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 60));

        AboutButton.setBackground(new java.awt.Color(51, 51, 56));
        AboutButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        AboutButton.setForeground(new java.awt.Color(240, 240, 240));
        AboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aboutIcon.png"))); // NOI18N
        AboutButton.setText(" About");
        AboutButton.setBorder(null);
        AboutButton.setContentAreaFilled(false);
        AboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutButtonMouseClicked(evt);
            }
        });
        SideBar.add(AboutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 60));

        add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 80, 250, 530));

        PunchChallengeTitle.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        PunchChallengeTitle.setForeground(new java.awt.Color(240, 240, 240));
        PunchChallengeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PunchChallengeTitle.setText("Punch Challenge");
        add(PunchChallengeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 310, 50));

        ComboModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        add(ComboModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 30, 30));

        ForceModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        ForceModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForceModeButtonMouseClicked(evt);
            }
        });
        add(ForceModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 30, 30));

        TimedModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        TimedModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimedModeButtonMouseClicked(evt);
            }
        });
        add(TimedModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 30, 30));

        StrengthModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        add(StrengthModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 30, 30));

        PunchChallengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filledCircleIcon.png"))); // NOI18N
        add(PunchChallengeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 30, 30));

        ThresholdForceTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThresholdForceTitle.setForeground(new java.awt.Color(240, 240, 240));
        ThresholdForceTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ThresholdForceTitle.setText("Threshold Force");
        add(ThresholdForceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 260, 40));

        ThresholdForceLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ThresholdForceLabel.setForeground(new java.awt.Color(240, 240, 240));
        ThresholdForceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThresholdForceLabel.setText("200");
        add(ThresholdForceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 190, 40));

        ThresholdForcePlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plusIcon.png"))); // NOI18N
        ThresholdForcePlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThresholdForcePlusMouseClicked(evt);
            }
        });
        add(ThresholdForcePlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, 40));

        ThresholdForceMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minusIcon.png"))); // NOI18N
        ThresholdForceMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThresholdForceMinusMouseClicked(evt);
            }
        });
        add(ThresholdForceMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 40));

        HoursTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        HoursTitle.setForeground(new java.awt.Color(240, 240, 240));
        HoursTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HoursTitle.setText("Hours");
        add(HoursTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 100, 40));

        HoursMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minusIcon.png"))); // NOI18N
        HoursMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoursMinusMouseClicked(evt);
            }
        });
        add(HoursMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, 40));

        HoursLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        HoursLabel.setForeground(new java.awt.Color(240, 240, 240));
        HoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HoursLabel.setText("00");
        add(HoursLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 190, 40));

        HoursPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plusIcon.png"))); // NOI18N
        HoursPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoursPlusMouseClicked(evt);
            }
        });
        add(HoursPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, 40));

        MinutesTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        MinutesTitle.setForeground(new java.awt.Color(240, 240, 240));
        MinutesTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MinutesTitle.setText("Minutes");
        add(MinutesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 130, 40));

        MinutesMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minusIcon.png"))); // NOI18N
        MinutesMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinutesMinusMouseClicked(evt);
            }
        });
        add(MinutesMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, 40));

        MinutesLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        MinutesLabel.setForeground(new java.awt.Color(240, 240, 240));
        MinutesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinutesLabel.setText("00");
        add(MinutesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 190, 40));

        MinutesPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plusIcon.png"))); // NOI18N
        MinutesPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinutesPlusMouseClicked(evt);
            }
        });
        add(MinutesPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, 40));

        SecondsTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SecondsTitle.setForeground(new java.awt.Color(240, 240, 240));
        SecondsTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SecondsTitle.setText("Seconds");
        add(SecondsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 140, 40));

        SecondsMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minusIcon.png"))); // NOI18N
        SecondsMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecondsMinusMouseClicked(evt);
            }
        });
        add(SecondsMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, -1, 40));

        SecondsLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        SecondsLabel.setForeground(new java.awt.Color(240, 240, 240));
        SecondsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SecondsLabel.setText("30");
        add(SecondsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 190, 40));

        SecondsPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plusIcon.png"))); // NOI18N
        SecondsPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecondsPlusMouseClicked(evt);
            }
        });
        add(SecondsPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, -1, 40));

        PlayerSettingTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PlayerSettingTitle.setForeground(new java.awt.Color(240, 240, 240));
        PlayerSettingTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerSettingTitle.setText("Player Setting");
        add(PlayerSettingTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, 260, 50));

        TrainingButton.setBackground(new java.awt.Color(51, 51, 56));
        TrainingButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TrainingButton.setForeground(new java.awt.Color(240, 240, 240));
        TrainingButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrainingButton.setText("Training");
        TrainingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TrainingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrainingButtonMouseClicked(evt);
            }
        });
        add(TrainingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 780, 210, 60));

        CompetitionButton.setBackground(new java.awt.Color(51, 51, 56));
        CompetitionButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CompetitionButton.setForeground(new java.awt.Color(240, 240, 240));
        CompetitionButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CompetitionButton.setText("Competition");
        CompetitionButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CompetitionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompetitionButtonMouseClicked(evt);
            }
        });
        add(CompetitionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 780, 210, 60));

        NumOfPlayersTitle.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        NumOfPlayersTitle.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayersTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayersTitle.setText("# of Players:");
        add(NumOfPlayersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 870, 220, 50));

        NumOfPlayers.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        NumOfPlayers.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayers.setText("2");
        add(NumOfPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 870, 60, 50));

        NumOfPlayersPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circlePlusIcon.png"))); // NOI18N
        NumOfPlayersPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumOfPlayersPlusMouseClicked(evt);
            }
        });
        add(NumOfPlayersPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 880, -1, 40));

        NumOfPlayersMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circleMinusIcon.png"))); // NOI18N
        NumOfPlayersMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumOfPlayersMinusMouseClicked(evt);
            }
        });
        add(NumOfPlayersMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 880, -1, 40));

        StartButton.setBackground(new java.awt.Color(51, 51, 56));
        StartButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        StartButton.setForeground(new java.awt.Color(240, 240, 240));
        StartButton.setText("Start");
        StartButton.setContentAreaFilled(false);
        StartButton.setFocusPainted(false);
        StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartButtonMouseClicked(evt);
            }
        });
        add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 960, 180, 70));
    }// </editor-fold>//GEN-END:initComponents
    
    // TODO
    private void SidebarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarButtonMouseClicked
        if (Main.sidebarOpen == false) {
            SideBar.setVisible(true) ;
            Main.sidebarOpen = true ;
        } else if (Main.sidebarOpen == true) {
            SideBar.setVisible(false);
            Main.sidebarOpen = false ;
        }
    }//GEN-LAST:event_SidebarButtonMouseClicked

    private void ThresholdForcePlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThresholdForcePlusMouseClicked
        if (thresholdForce < 1000) {
            thresholdForce += 100;
        }
        String increasedThreshold = String.format("%,d", thresholdForce);
        ThresholdForceLabel.setText(increasedThreshold);
    }//GEN-LAST:event_ThresholdForcePlusMouseClicked

    private void ThresholdForceMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThresholdForceMinusMouseClicked
        if (thresholdForce > 0) {
            thresholdForce -= 100;
        }
        String decreasedThreshold = String.format("%,d", thresholdForce);
        ThresholdForceLabel.setText(decreasedThreshold);
    }//GEN-LAST:event_ThresholdForceMinusMouseClicked

    private void TimedModeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimedModeButtonMouseClicked
        Main.setup(3);
    }//GEN-LAST:event_TimedModeButtonMouseClicked

    // TODO
    private void TrainingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainingButtonMouseClicked
        if (multiplayer == true) {
            multiplayer = false ;
            TrainingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            CompetitionButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            // Removes # of Players Visibility
            NumOfPlayersTitle.setVisible(false);
            NumOfPlayers.setVisible(false);
            NumOfPlayersPlus.setVisible(false);
            NumOfPlayersMinus.setVisible(false);
        }
    }//GEN-LAST:event_TrainingButtonMouseClicked

    // TODO
    private void NumOfPlayersPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumOfPlayersPlusMouseClicked
        if (Main.playerNum < 10) {
            Main.playerNum++;
            String num = String.valueOf(Main.playerNum);
            NumOfPlayers.setText(num);
        }
    }//GEN-LAST:event_NumOfPlayersPlusMouseClicked

    // TODO
    private void NumOfPlayersMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumOfPlayersMinusMouseClicked
        if (Main.playerNum > 2) {
            Main.playerNum--;
            String num = String.valueOf(Main.playerNum);
            NumOfPlayers.setText(num);
        }
    }//GEN-LAST:event_NumOfPlayersMinusMouseClicked

    // TODO
    private void CompetitionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompetitionButtonMouseClicked
        if (multiplayer == false) {
            multiplayer = true ;
            CompetitionButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            TrainingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            // Visiblity to add players
            NumOfPlayersTitle.setVisible(true);
            NumOfPlayers.setVisible(true);
            NumOfPlayersPlus.setVisible(true);
            NumOfPlayersMinus.setVisible(true);

        }
    }//GEN-LAST:event_CompetitionButtonMouseClicked

    // TODO
    private void StartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseClicked
       /* if (multiplayer == false)
        Main.createForceMode(##Variables to create force mode##);
        else {
            // Code to create competition
        }*/

    }//GEN-LAST:event_StartButtonMouseClicked

    // TODO
    private void AboutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutButtonMouseClicked

    // TODO
    private void SettingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseClicked
        Main.transitionToPage(2);
    }//GEN-LAST:event_SettingsButtonMouseClicked

    // TODO
    private void ProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileButtonMouseClicked

    // TODO
    private void ActivityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivityButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ActivityButtonMouseClicked

    // TODO
    private void FeedbackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FeedbackButtonMouseClicked

    // TODO
    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingsButtonActionPerformed

    private void HoursMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoursMinusMouseClicked
        hoursMinus();
        renderTime();
    }//GEN-LAST:event_HoursMinusMouseClicked

    private void HoursPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoursPlusMouseClicked
        hoursPlus();
        renderTime();
    }//GEN-LAST:event_HoursPlusMouseClicked

    private void MinutesMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinutesMinusMouseClicked
        minutesMinus();
        renderTime();
    }//GEN-LAST:event_MinutesMinusMouseClicked

    private void MinutesPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinutesPlusMouseClicked
        minutesPlus();
        renderTime();
    }//GEN-LAST:event_MinutesPlusMouseClicked

    private void SecondsMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondsMinusMouseClicked
        secondsMinus();
        renderTime();
    }//GEN-LAST:event_SecondsMinusMouseClicked

    private void SecondsPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondsPlusMouseClicked
        secondsPlus();
        renderTime();
    }//GEN-LAST:event_SecondsPlusMouseClicked

    // TODO
    private void Feedback_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Feedback_ButtonMouseClicked

    // TODO
    private void Activity_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activity_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Activity_ButtonMouseClicked

    // TODO
    private void Profile_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Profile_ButtonMouseClicked

    // TODO
    private void Settings_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_ButtonMouseClicked
        Main.transitionToPage(2);
    }//GEN-LAST:event_Settings_ButtonMouseClicked

    private void About_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_ButtonMouseClicked

    }//GEN-LAST:event_About_ButtonMouseClicked

    private void ForceModeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForceModeButtonMouseClicked
        Main.setup(2);
    }//GEN-LAST:event_ForceModeButtonMouseClicked

   
    private void secondsPlus() {
        if (seconds < 59) {
            seconds++;
        }
    }
    
    private void secondsMinus() {
        if (seconds > 0) {
            seconds--;
        }
    }
    
    private void minutesPlus() {
        if (minutes < 59) {
            minutes++;
        }
    }
    
    private void minutesMinus() {
        if (minutes > 0) {
            minutes--;
        }
    }
    
    private void hoursPlus() {
        if (hours < 10) {
            hours++;
        }
    }
    
    private void hoursMinus() {
        if (hours > 0) {
            hours--;
        }
    }
    
    private void renderTime() {
        String secondsString = seconds < 10 ? String.format("0%d", seconds) : String.format("%d", seconds);
        String minutesString = minutes < 10 ? String.format("0%d", minutes) : String.format("%d", minutes);
        String hoursString = hours < 10 ? String.format("0%d", hours) : String.format("%d", hours);
            
        SecondsLabel.setText(secondsString);
        MinutesLabel.setText(minutesString);
        HoursLabel.setText(hoursString);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JButton About_Button;
    private javax.swing.JButton ActivityButton;
    private javax.swing.JButton Activity_Button;
    private javax.swing.JLabel ComboCounterTitle;
    private javax.swing.JLabel ComboModeButton;
    private javax.swing.JLabel CompetitionButton;
    private javax.swing.JButton FeedbackButton;
    private javax.swing.JButton Feedback_Button;
    private javax.swing.JLabel ForceModeButton;
    private javax.swing.JLabel HoursLabel;
    private javax.swing.JLabel HoursMinus;
    private javax.swing.JLabel HoursPlus;
    private javax.swing.JLabel HoursTitle;
    private javax.swing.JLabel MinutesLabel;
    private javax.swing.JLabel MinutesMinus;
    private javax.swing.JLabel MinutesPlus;
    private javax.swing.JLabel MinutesTitle;
    private javax.swing.JLabel NumOfPlayers;
    private javax.swing.JLabel NumOfPlayersMinus;
    private javax.swing.JLabel NumOfPlayersPlus;
    private javax.swing.JLabel NumOfPlayersTitle;
    private javax.swing.JLabel PlayerSettingTitle;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JButton Profile_Button;
    private javax.swing.JLabel PunchChallengeButton;
    private javax.swing.JLabel PunchChallengeTitle;
    private javax.swing.JLabel SecondsLabel;
    private javax.swing.JLabel SecondsMinus;
    private javax.swing.JLabel SecondsPlus;
    private javax.swing.JLabel SecondsTitle;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton Settings_Button;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel SidebarButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel StrengthModeButton;
    private javax.swing.JLabel ThresholdForceLabel;
    private javax.swing.JLabel ThresholdForceMinus;
    private javax.swing.JLabel ThresholdForcePlus;
    private javax.swing.JLabel ThresholdForceTitle;
    private javax.swing.JLabel TimedModeButton;
    private javax.swing.JPanel TopBar;
    private javax.swing.JLabel TrainingButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
