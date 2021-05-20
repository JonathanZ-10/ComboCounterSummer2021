import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author James
 * @editor Jonathan Zamora
 */
public class homePage extends javax.swing.JPanel{
    private JPanel mainPanel = new JPanel();
    public homePage(JFrame Frame){
        // Initializing components
        GridBagConstraints gc = new GridBagConstraints();
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        
        JPanel timePanel = new JPanel(); //going to hold local time and Date
        timePanel.setLayout(new GridBagLayout());
        JPanel ComboCounter = new JPanel();
        ComboCounter.setLayout(new GridBagLayout());
        JPanel TotalForce = new JPanel();
        TotalForce.setLayout(new GridBagLayout());
        JPanel TotalTime = new JPanel();
        TotalTime.setLayout(new GridBagLayout());
        JPanel Competition = new JPanel();
        Competition.setLayout(new GridBagLayout());
        JPanel PunchCount = new JPanel();
        PunchCount.setLayout(new GridBagLayout());
        JPanel PunchChallenge = new JPanel();
        PunchChallenge.setLayout(new GridBagLayout());
        
        JLabel CC = new JLabel("Combo Counter");
        JLabel TF = new JLabel("Total Force");
        JLabel TT = new JLabel("Total Time");
        JLabel Comp = new JLabel("Competition");
        JLabel PC = new JLabel("Punch Count");
        JLabel PunC = new JLabel("Punch Challenge");
        
        JButton solo1 = new JButton();
        solo1.setText("Solo");
        JButton solo2 = new JButton();
        solo2.setText("Solo");
        JButton solo3 = new JButton();
        solo3.setText("Solo");
        JButton solo4 = new JButton();
        solo4.setText("Pound-For-Pound");
        JButton solo5 = new JButton();
        solo5.setText("Solo");
        JButton solo6 = new JButton();
        solo6.setText("Solo");
        
        JButton multi1 = new JButton();
        multi1.setText("Multiplayer");
        JButton multi2 = new JButton();
        multi2.setText("Multiplayer");
        JButton multi3 = new JButton();
        multi3.setText("Multiplayer");
        JButton multi4 = new JButton();
        multi4.setText("Sensor Adjustment");
        JButton multi5 = new JButton();
        multi5.setText("Multiplayer");
        JButton multi6 = new JButton();
        multi6.setText("Multiplayer");
        
        // Adding Components to subPanels
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.PAGE_START;
        ComboCounter.add(CC,gc);
        gc.gridy = 1;
        ComboCounter.add(solo1,gc);
        gc.gridy = 2;
        ComboCounter.add(multi1,gc);
        
        gc.gridy = 0;
        TotalForce.add(TF,gc);
        gc.gridy = 1;
        TotalForce.add(solo2,gc);
        gc.gridy = 2;
        TotalForce.add(multi2,gc);
        
        gc.gridy = 0;
        TotalTime.add(TT,gc);
        gc.gridy = 1;
        TotalTime.add(solo3,gc);
        gc.gridy = 2;
        TotalTime.add(multi3,gc);
        
        gc.gridy =0;
        Competition.add(Comp,gc);
        gc.gridy = 1;
        Competition.add(solo4 ,gc);
        gc.gridy = 2;
        Competition.add(multi4,gc);
        
        gc.gridy = 0;
        PunchCount.add(PC,gc);
        gc.gridy = 1;
        PunchCount.add(solo5,gc);
        gc.gridy = 2;
        PunchCount.add(multi5,gc);
        
        gc.gridy =0;
        PunchChallenge.add(PunC,gc);
        gc.gridy =1;
        PunchChallenge.add(solo6,gc);
        gc.gridy =2;
        PunchChallenge.add(multi6,gc);
        
        // Placing subPanels onto main Panel
        gc.gridy = 0;
        gc.weighty = 0.5;
        mainPanel.add(timePanel,gc);
        
        gc.gridy =1;
        gc.weighty = 3;
        mainPanel.add(ComboCounter,gc);
        gc.gridx = 1;
        mainPanel.add(TotalForce,gc);
        gc.gridx = 2;
        mainPanel.add(TotalTime,gc);
        
        gc.gridx = 0;
        gc.gridy = 2;
        mainPanel.add(Competition,gc);
        gc.gridx = 1;
        mainPanel.add(PunchCount,gc);
        gc.gridx = 2;
        mainPanel.add(PunchChallenge,gc);
        
        mainPanel.setVisible(true);
        Frame.getContentPane().add(mainPanel);
    }    
}
