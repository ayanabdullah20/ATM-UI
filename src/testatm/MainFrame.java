package testatm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class MainFrame extends JFrame{
        CurrentAccount c;
        SavingAccount s;
               

    public MainFrame()
    {
        
        Color c3=new Color(235,255,255);
        LineBorder  b2=new LineBorder(c3,3);
        LineBorder b3=new LineBorder(Color.BLACK,2);
        JTextField Accountnumber;
        JLabel welcome;
        JLabel addaccnum;
        JRadioButton CA,SA;
        setSize(1000,800);
        ButtonGroup grp=new ButtonGroup();
        
        ImageIcon img = new ImageIcon("584031.png");
        this.setIconImage(img.getImage());

        getContentPane().setLayout(null);
        Color backgroundcolor = new Color(235,255,255);
        getContentPane().setBackground(backgroundcolor);
        
        Color FontColor = new Color(237,145,33);
        welcome = new JLabel("Welcome to AUBL");
        welcome.setFont(new Font("Lucida Sans",Font.BOLD, 40));
        welcome.setForeground(FontColor);
        welcome.setBounds(325, 100, 450, 40);
        getContentPane().add(welcome);
      
        CA = new JRadioButton();
        CA.setText("Current Account");
        CA.setFont(new Font("Lucida Sans",Font.BOLD,20));
        CA.setBounds(280, 225, 200, 30);
        getContentPane().add(CA);
        
        
        SA = new JRadioButton();
        SA.setText("Saving Account");
        SA.setFont(new Font("Lucida Sans",Font.BOLD,20));
        SA.setBounds(530, 225, 200, 30);
        getContentPane().add(SA);
        grp.add(CA);
        grp.add(SA);
        JLabel result = new JLabel();
        result.setBounds(280, 415, 450, 50);
        result.setFont(new Font("Lucida Sans",Font.BOLD, 40));
        result.setText("Welcome...");
        result.setForeground(FontColor);
        getContentPane().add(result);
        
        addaccnum = new JLabel("Enter Acc Num");
        addaccnum.setFont(new Font("Lucida Sans",Font.PLAIN,25));
        addaccnum.setBounds(280,320, 200, 30);
        addaccnum.setForeground(FontColor);
        getContentPane().add(addaccnum);
        
        Accountnumber=new JTextField();
        Accountnumber.setBounds(280, 350, 450, 30);
        Accountnumber.setFont(new Font("Lucida Sans",Font.ROMAN_BASELINE,25));
        Accountnumber.setText(null);
        getContentPane().add(Accountnumber);
        
        JButton Submit = new JButton("Submit");
        Submit.setBounds(280,390,100,25);
        Submit.setFont(new Font("Lucida Sans",Font.PLAIN,20));
        Submit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String an = Accountnumber.getText();
                if(SA.isSelected())
                {
                    s = SavingAccount.findSavingAccount(an);
                    if(s !=null)
                    result.setText("Welcome " + s.getBanktitle());
                    else
                    result.setText("Enter Correct Info");
                }
                else if(CA.isSelected())
                {
                    c = CurrentAccount.findCurrentAccount(an);
                    if(c !=null){
                        System.out.println(c);
                    result.setText("Welcome " + c.getBanktitle());}
                    else
                    result.setText("Enter Correct Info");
                }
            }
        });
        Submit.setBackground(FontColor);
        Submit.setBorder(b3);
        Submit.setForeground(Color.WHITE);
        getContentPane().add(Submit);
        
        JLabel p = new JLabel("Enter Acc Pin");
        p.setBounds(280,460, 200, 30);
        p.setFont(new Font("Lucida Sans",Font.PLAIN,25));
        p.setForeground(FontColor);
        getContentPane().add(p);
        
        JPasswordField pin=new JPasswordField();
        pin.setBounds(280, 490, 450, 30);
        pin.setFont(new Font("Lucida Sans",Font.ROMAN_BASELINE,20));
        pin.setText(null);
        getContentPane().add(pin);
        
        JButton summit2 = new JButton();
        summit2.setText("Submit");
        summit2.setFont(new Font("Lucida Sans",Font.PLAIN,20));
        summit2.setBounds(280,530,100,25);
        summit2.setForeground(Color.WHITE);
        summit2.setBackground(FontColor);
        summit2.setBorder(b3);
        summit2.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            char[] a = pin.getPassword();
            String s = new String(a);
            if(CA.isSelected())
            {
                CurrentAccount c = CurrentAccount.findCurrentAccount(Accountnumber.getText());
                String p = String.valueOf(c.getAtmPin());
                if(p.equals(s))
                {
                    Option o = new Option(CurrentAccount.findCurrentAccount(Accountnumber.getText()));
                }
                else
                    result.setText("Incorrect Pin");
            }
            if(SA.isSelected())
            {
                SavingAccount c = SavingAccount.findSavingAccount(Accountnumber.getText());
                String p = String.valueOf(c.getAtmPin());
                if(p.equals(s))
                {
                    Option o = new Option(SavingAccount.findSavingAccount(Accountnumber.getText()));
                }
                else
                  result.setText("Incorrect Pin");
            }
            
        }
        
                });
        getContentPane().add(summit2);
        
        JButton Admin = new JButton("Admin Login");
        Admin.setFont(new Font("Lucida Sans",Font.PLAIN,30));
        Admin.setBackground(FontColor);
        Admin.setForeground(c3);
        Admin.setBounds(750,720,230,35);
        Admin.setBorder(b3);
        Admin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new AdminFrame();
            }
        }
        
        );  
        getContentPane().add(Admin);
    }
        
}
