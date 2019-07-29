//importations
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class HighLow extends JFrame implements ActionListener
{
    //Buttons
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    
    //Labels
    JLabel l1,l2,l3,l4,l5,l6;
    
    //Textfields
    JTextField t1,t2,t3,t4;
    
    //Radio buttons
    JRadioButton r1,r2,r3,r4,r5,r6;
    
    //Panels
    JPanel p00,p0,p1,p2,p3,p4,p5,p6,p7,p71,p8,p9,p9_0,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25;
    
    //Logo
    ImageIcon logo;
    
    //Container to change windows
    Container C = getContentPane();
    
    //To randomize the number
    Random random = new Random();
    
    //Frame for difficulty window
    JFrame d = new JFrame();
    
    //Integers
    int i, j, G, count = 10;
    
    public HighLow(String q)
    {
        super(q);
        
        //Fonts
        Font f1 = new Font("Avenir",Font.PLAIN,40);
        Font f2 = new Font("Avenir",Font.PLAIN,15);
        setFont(f2);
        
        //Layouts
        BorderLayout br1 = new BorderLayout();
        BorderLayout br2 = new BorderLayout();
        BorderLayout br3 = new BorderLayout();
        BorderLayout br4 = new BorderLayout();
        BorderLayout br5 = new BorderLayout();
        BorderLayout br6 = new BorderLayout();
        
        FlowLayout F1 = new FlowLayout();
        
        GridLayout g1 = new GridLayout(2,0);
        GridLayout g2 = new GridLayout(2,2);
        GridLayout g3 = new GridLayout(4,0);
        GridLayout g4 = new GridLayout(5,0);
        GridLayout g5 = new GridLayout(6,0);
        
        //Adding panels
        //Main page
        p0 = new JPanel();
        p0.setLayout(br1);
        
        p1 = new JPanel();
        p0.add(p1, BorderLayout.NORTH);
        p1.setLayout(br2);
        
        p2 = new JPanel();
        p1.add(p2, BorderLayout.EAST);
        p2.setLayout(F1);
        
        p3 = new JPanel();
        p0.add(p3, BorderLayout.SOUTH);
        p3.setLayout(br3);
        
        p4 = new JPanel();
        p3.add(p4, BorderLayout.EAST);
        p4.setLayout(F1);
        
        p5 = new JPanel();
        p3.add(p5, BorderLayout.WEST);
        p5.setLayout(F1);
        
        p6 = new JPanel();
        p0.add(p6, BorderLayout.CENTER);
        p6.setLayout(g1);
        
        p7 = new JPanel();
        p6.add(p7);
        p7.setLayout(F1);
        
        //Logo
        logo = new ImageIcon("HighLow.png");
        l6 = new JLabel(logo);
        l6.setToolTipText("Logo of the game");
        p8 = new JPanel();
        p7.add(p8);
        p8.setLayout(F1);
        p8.add(l6);
        
        
        p10 = new JPanel();
        p6.add(p10);
        p10.setLayout(g1);
        
        p11 = new JPanel();
        p10.add(p11);
        p11.setLayout(F1);
        
        p12 = new JPanel();
        p10.add(p12);
        p12.setLayout(g1);
        
        p9 = new JPanel();
        p12.add(p9);
        p9.setLayout(F1);
        
        p9_0 = new JPanel();
        p12.add(p9_0);
        p9_0.setLayout(F1);
        
        //second page
        p00 = new JPanel();
        p00.setLayout(br4);
        
        p13 = new JPanel();
        p00.add(p13, BorderLayout.NORTH);
        p13.setLayout(br5);
        
        p14 = new JPanel();
        p13.add(p14, BorderLayout.WEST);
        p14.setLayout(F1);
        
        p15 = new JPanel();
        p00.add(p15, BorderLayout.SOUTH);
        p15.setLayout(br6);
        
        p16 = new JPanel();
        p15.add(p16, BorderLayout.EAST);
        p16.setLayout(F1);
        
        p17 = new JPanel();
        p15.add(p17, BorderLayout.WEST);
        p17.setLayout(F1);
        
        p18 = new JPanel();
        p00.add(p18, BorderLayout.CENTER);
        p18.setLayout(g5);
        
        /*p19 = new JPanel();
        p18.add(p19);
        
        p20 = new JPanel();
        p18.add(p20);
        p20.setLayout(g3);*/
        
        p25 = new JPanel();
        p18.add(p25);
        p25.setLayout(F1);
        
        p21 = new JPanel();
        p18.add(p21);
        p21.setLayout(F1);
        
        p22 = new JPanel();
        p18.add(p22);
        p22.setLayout(F1);
        
        p23 = new JPanel();
        p18.add(p23);
        p23.setLayout(F1);
        
        p24 = new JPanel();
        p18.add(p24);
        p24.setLayout(F1);
        
        p25 = new JPanel();
        p18.add(p25);
        p25.setLayout(F1);

        //for frame of changing difficulty
        d.setTitle("Difficulty");
        d.setFont(f2);
        d.setLayout(F1);
        d.setSize(250,100);
        d.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        d.setLocationRelativeTo(null); //to center window to screen
        
        //Radio buttons
        r1 = new JRadioButton("Easy", true);
        r1.setFont(f2);
        r1.setToolTipText("Guess from 1 - 100");
        
        r2 = new JRadioButton("Meduim");
        r2.setFont(f2);
        r2.setToolTipText("Guess from 1 - 200");
        
        r3 = new JRadioButton("Hard");
        r3.setFont(f2);
        r3.setToolTipText("Guess from 1 - 300");
        
        r4 = new JRadioButton("Easy");
        r4.setFont(f2);
        r4.setToolTipText("Guess from 1 - 100");
        
        r5 = new JRadioButton("Meduim");
        r5.setFont(f2);
        r5.setToolTipText("Guess from 1 - 200");
        
        r6 = new JRadioButton("Hard");
        r6.setFont(f2);
        r6.setToolTipText("Guess from 1 - 300");
        
        //To group radio buttons
        ButtonGroup difficulty = new ButtonGroup();
        difficulty.add(r1);
        difficulty.add(r2);
        difficulty.add(r3);
        difficulty.add(r4);
        difficulty.add(r5);
        difficulty.add(r6);
       
        //Labels
        /*l1 = new JLabel("Enter your name: ");
        l1.setFont(f2);*/
        
        l2 = new JLabel("Choose difficulty: ");
        l2.setFont(f2);
        
        l3 = new JLabel("Guess the number");
        l3.setFont(f1);
        l3.setForeground(Color.BLUE);
        
        l4 = new JLabel("<html>The purpose of this game is for you to guess a random number with<br> range based on you choice of difficulty and with only 10 attempts.<br> You exceed 10 attempts, you lose. You guess the number before<br> the attempts finish, you win. With every guess there will be results<br>helping you get closer to the goal random number.</html>");
        //l4 = new JLabel("The purpose of this game is for you to guess a random number.");
        l4.setFont(f2);
        l4.setToolTipText("Purpose and how to play the game");
        
        l5 = new JLabel("Attemps remaining: ");
        l5.setFont(f2);
        l5.setForeground(Color.BLUE);
   
        //Text fields
        /*t1 = new JTextField(10);
        t1.setFont(f2);*/
        
        //Text fields
        t2 = new JTextField(2);
        t2.setFont(f1);
        t2.setForeground(Color.BLUE);
        t2.setToolTipText("Input your guess here");
        
        t3 = new JTextField(15);
        t3.setFont(f2);
        t3.setToolTipText("Results");
        
        t4 = new JTextField(2);
        t4.setFont(f2);
        t4.setToolTipText("Number of attempts remaining");
        
        //Buttons
        b1 = new JButton("Info");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLUE);
        b1.setFont(f2);
        b1.setToolTipText("Click to show information");
        
        b2 = new JButton("Start");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.BLUE);
        b2.setFont(f2);
        b2.setToolTipText("Click to start the game");
        
        b3 = new JButton("Exit");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.BLUE);
        b3.setFont(f2);
        b3.setToolTipText("Click to exit the game");
        
        b4 = new JButton("Change difficulty");
        b4.setForeground(Color.BLUE);
        b4.setFont(f2);
        b4.setToolTipText("Click to change difficulty");
        
        b5 = new JButton("Enter");
        b5.setForeground(Color.BLUE);
        b5.setFont(f2);
        b5.setToolTipText("Click to show result");
        
        b6 = new JButton("Play again");
        b6.setForeground(Color.BLUE);
        b6.setFont(f2);
        b6.setToolTipText("Click to end current game and play again");
        
        b7 = new JButton("OK");
        b7.setForeground(Color.BLUE);
        b7.setFont(f2);
        b7.setToolTipText("Click to change difficulty");
        
        b8 = new JButton("Main page");
        b8.setForeground(Color.BLUE);
        b8.setFont(f2);
        b8.setToolTipText("Click to return to the main page");
        
        //Adding Listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
       
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        r4.addActionListener(this);
        r5.addActionListener(this);
        r6.addActionListener(this);
        
        //Adding components to panels
        C.add(p0);
        
        //Main page
        p2.add(b1);
        p5.add(b3);
        p11.add(l4);
        p9.add(l2);
        p9.add(r1);
        p9.add(r2);
        p9.add(r3);
        p9_0.add(b2);
        
        //Second page
        p14.add(b8);
        p16.add(b4);
        p17.add(b6);    
        p21.add(l3);
        p22.add(t2);
        p23.add(t3);
        p24.add(l5);
        p24.add(t4);
        p25.add(b5);
        
        //Difficulty frame
        d.add(r4);
        d.add(r5);
        d.add(r6);
        d.add(b7);
    }
    
    //method to reset the game
    public void reset(String a){
        count = 10; //to reset number of attempts
        t2.setText(""); //to clear text field 2
        t3.setText(a); //to show message in text field 3
        t4.setText(Integer.toString(count));
        //to determine difficulty and reset random number
        if (r4.isSelected()){
            G = random.nextInt(100) + 0;
        }
        else if (r5.isSelected()) {
            G = random.nextInt(200) + 0;
            
        }
        else if (r6.isSelected()){
            G = random.nextInt(300) + 0;
        }
        else if (r1.isSelected()){
        G = random.nextInt(100) + 0;
        }
        else if (r2.isSelected()) {
            G = random.nextInt(200) + 0;
        }
        else if (r3.isSelected()){
            G = random.nextInt(300) + 0;
        }
        else {
            //When no radio buttons are selected
            JOptionPane.showMessageDialog(d, "Choose a difficulty!", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    //Events
    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        
        //To exit game and go to the main page
        if (s.equals("Main page")) {
            int confirmExit = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the game?", "Exit current game?",  JOptionPane.YES_NO_OPTION);
            if (confirmExit == JOptionPane.YES_OPTION)
            {
                C.removeAll(); //To remove content from container
                this.setSize(550,550);
                C.add(p0);
            }
        }
        
        //To show info about the game
        else if (s.equals("Info")){
            JOptionPane.showMessageDialog(this, "Made by:\nNajla Albaz\nLujain AlOmari\n\nSince 2017", "Information", JOptionPane.PLAIN_MESSAGE);
        }
        
        //To exit the whole game
        else if (s.equals("Exit")){
            int confirmExit = JOptionPane.showConfirmDialog(this, "Are you sure?", "Exit?",  JOptionPane.YES_NO_OPTION);
            if (confirmExit == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
        
        //To start game and go to game page
        else if (s.equals("Start")) {
            reset("");
            try {
                if (r1.isSelected()){
            G = random.nextInt(100) + 0;
            }
            else if (r2.isSelected()) {
                G = random.nextInt(200) + 0;
            }
            else if (r3.isSelected()){
                G = random.nextInt(300) + 0;
            }
            else {
                throw new Exception();
            }
            C.removeAll(); //To remove content from container
            this.setSize(551,551);
            C.add(p00);
            C.validate();
            }
            catch(Exception e){
                 //When no radio button on main page is selected
                JOptionPane.showMessageDialog(this, "Choose a difficulty!", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        }
        
        //To enter number and show result
        else if (s.equals("Enter")){
            try {
            int n = Integer.parseInt(t2.getText());
            count -= 1;
            t4.setText(Integer.toString(count));
            int d = Math.abs(G-n); //difference between random number and guessed number
            t4.setForeground(Color.BLACK); //To set default text color of text fields
            t3.setForeground(Color.BLACK);
            
            if (n>G){ //When guess number is lower than random number
            if ((d>0)&&(d<=5)){
                t3.setText("The guess is a bit high");
            }
            else if ((d>5)&&(d<=30)){
                t3.setText("The guess is high");
            }
            else if (d>30){
                t3.setText("The guess is too high");
            }
            }
            else if (n<G){
                //when guess number is higher than random number
            if ((d>0)&&(d<=5)){
                t3.setText("The guess is a bit low");
            }
            else if ((d>5)&&(d<=30)){
                t3.setText("The guess is low");
            }
            else if (d>30){
                t3.setText("The guess is too low");
            }
            }
            else if (G==n){
                //when the guess is equal to random number
                t3.setForeground(Color.GREEN);
                reset("YOU WIN! Play again.");
            }
            
            if (count==0){
                //When number of attempt finish, program will automatically reset game
                t3.setForeground(Color.RED);
                reset("You lose. Try again.");
            }
            else if (count<=3){
                //change text to red to indicate that number of attemps is low
                t4.setForeground(Color.RED);
            }
            }
            catch(Exception e){
                //When the input is not an integer
                JOptionPane.showMessageDialog(this, "Enter a number!", "Error", JOptionPane.PLAIN_MESSAGE);
                t2.setText("");
            }
        
        }
        
        //To reset game and play agian
        else if (s.equals("Play again")){
            //To confirm reset
            int PlayAgain = JOptionPane.showConfirmDialog(this, "Are you sure you want to play again?", "Play again?",  JOptionPane.YES_NO_OPTION);
            if (PlayAgain == JOptionPane.YES_OPTION)
            {
            reset("");
            } 
        }
        
        //To show difficulty frame and change the difficulty
        else if (s.equals("Change difficulty")){
            d.setVisible(true); //To pop-up difficulty window
        }
        
        //To set difficulty
        else if (s.equals("OK")){
            reset("");
            if (r4.isSelected()){
                G = random.nextInt(100) + 0;
                d.setVisible(false);
            }
            else if (r5.isSelected()){
                G = random.nextInt(200) + 0;
                d.setVisible(false);
            }
            else if (r6.isSelected()){
                G = random.nextInt(300) + 0;                
                d.setVisible(false);
            }
            else {
                //When no radio button on frame is selected
                JOptionPane.showMessageDialog(d, "Choose a difficulty!", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    

    public static void main(String[] args)
    {
        HighLow h = new HighLow("High Low Game");
        h.setVisible(true);
        h.setSize(550,550);
        h.setLocationRelativeTo(null);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
}