import java.awt.Color;
import javax.swing.JFrame;

/*
 * Controls the creation of most pages as well as the declaration of vars
 */

/**
 *
 * @author James
 * @editor Jonathan Zamora
 */
public class Main {
    public static int FormulaPageValue = 50;
    static JFrame Frame = new JFrame();
    public static void main(String [] args){
        
        Frame.getContentPane().setBackground(Color.BLUE);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(600,600);
        //homePage hp = new homePage(Frame);
        //PunchCount pc = new PunchCount(Frame);
        Frame.setContentPane(new LoginPanel());
        Frame.repaint();
        Frame.revalidate();
        Frame.setVisible(true);
    }
    
    /**
     * Transitions program to new page/creates new page
     * @param i 0= LoginPanel 1=homePage 2=ComboScore 3=TotalForce 4=TotalTime
     * 5= PunchCount 6=FormulaPage 7=TF Multiplayer
     */
    
    public static void transitionToPage(int i)
    {
        switch (i) {
            case 0:
                Frame.setContentPane(new LoginPanel());
                Frame.repaint();
                Frame.revalidate();
                break;
            case 1:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Frame.setContentPane(new homePagePanel());
                Frame.repaint();
                Frame.revalidate();
                break;
            case 2:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Frame.setContentPane(new ComboModePanel());
                Frame.repaint();
                Frame.revalidate();
                break;
            case 3:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Frame.setContentPane(new ForceModePanel());
                Frame.repaint();
                Frame.revalidate();
                break;
            case 4:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Frame.setContentPane(new TimedModePanel());
                Frame.repaint();
                Frame.revalidate();
                break;
            case 5:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);         
                Frame.setContentPane(new StrengthModePanel());
                Frame.repaint();
                Frame.revalidate();
                break;
            case 6:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Frame.setContentPane(new FormulaPage());
                Frame.repaint();
                Frame.revalidate();
                break;
            case 7:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Frame.setContentPane(new PunchChallengePanel());
                Frame.repaint();
                Frame.revalidate();
                break;
            default:
                break;
        }
    }
    
    /**
     * Transition to a multiplayer page
     * @param i Game mode
     * @param x If used on case 0 = game mode / otherwise = numPlayers
     */
    public static void transitionToMulti(int i, int x)
    {
        multiplayer = true ;
        switch (i) {
            case -1:
                // Error sends to main page
                transitionToPage(1) ;
                break ;
            case 0:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Frame.setContentPane(new MultiplayerCount(x));
                Frame.repaint();
                Frame.revalidate();
                break;
            case 1:
                Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);         
                Frame.setContentPane(new ForceModeMultiplayer(x));
                Frame.repaint();
                Frame.revalidate();
                break;
            
        }
    }
    
    public static void closeFrame(){
        Frame.dispose();
        System.exit(0);
    }
    
    public static void done(){
        // Reseting all variables
        name1 = "Player 1"; name2 = "Player 2"; name3 = "Player 3"; 
        name4 = "Player 4"; name5 = "Player 5"; name6 = "Player 6";
        
        score1= ""; score2= ""; score3= ""; score4= ""; score5= ""; score6= "";
        
        playerNum = 0; currentPlayer = -1 ;
        doneFlag = false ; multiplayer = false ;
        
        Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Frame.setContentPane(new homePagePanel());
        Frame.repaint();
        Frame.revalidate();
    }
    
    // Var Declarations
    public static String name1 = "Player 1", name2 = "Player 2", 
            name3 = "Player 3", name4 = "Player 4", name5 = "Player 5",
                                                            name6 = "Player 6";
    
    public static String score1, score2, score3, score4, score5, score6;
    
    public static String handi1, handi2, handi3, handi4, handi5, handi6;
    
    public static int gameMode ;
    public static int playerNum = 0;
    public static int currentPlayer = -1;
    public static boolean doneFlag = false;
    public static boolean multiplayer = false;
    
    public static java.awt.Color baseColor = new java.awt.Color(0,0,55);
    public static java.awt.Color titleColor = new java.awt.Color(240,240,240);
}
