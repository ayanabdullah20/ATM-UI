package testatm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class Option extends JFrame{
       Color FontColor = new Color(237,145,33);
    public Option(CurrentAccount a)
    {
        LineBorder b1=new LineBorder(Color.BLACK,2);
        Color c3=new Color(237,145,33);
        Color c=new Color(235,255,255);
            
        LineBorder b=new LineBorder(c3,2);
        Font f=new Font("Time new Roman",Font.BOLD,20);
        
        setSize(1000,800);
        getContentPane().setLayout(null);
        getContentPane().setBackground(c);
        setVisible(true);
        
        JLabel welcome = new JLabel(a.getBanktitle()+ " Welcome to AUBL");
        welcome.setBounds(275, 50, 600, 50);
        welcome.setFont(new Font("Lucida Sans",Font.ITALIC+Font.BOLD, 40));
        welcome.setForeground(c3);
        getContentPane().add(welcome);
        
        JButton Withdraw = new JButton();
        Withdraw.setText("Withdraw");
        Withdraw.setFont(f);
        Withdraw.setBorder(b1);
        Withdraw.setForeground(Color.WHITE);
        Withdraw.setBackground(c3);
        Withdraw.setBounds(350, 150, 180, 40);
        Withdraw.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new withdraw(a);
            }
        });
        getContentPane().add(Withdraw);
        
        JButton Transfer = new JButton();
        Transfer.setText("Transfer");
        Transfer.setFont(new Font("Lucida Sans",Font.PLAIN,30));
        Transfer.setBounds(350, 230, 180, 40);
        Transfer.setFont(f);
        Transfer.setBorder(b1);
        Transfer.setBackground(c3);
        Transfer.setForeground(Color.WHITE);
        Transfer.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new transferfund(a);
            }
        });
        getContentPane().add(Transfer);        
        
        JButton changepin = new JButton();
        changepin.setText("Change Pin");
        changepin.setBounds(350,310,180,40);
        changepin.setBackground(c3);
        changepin.setBorder(b1);
        changepin.setForeground(Color.WHITE);
        changepin.setFont(f);
        changepin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                chanpin c = new chanpin(a);
            }
        });
        getContentPane().add(changepin);
        
        JButton Checkbal = new JButton();
        Checkbal.setText("Check Balance");
        Checkbal.setBackground(c3);
        Checkbal.setBorder(b1);
        Checkbal.setForeground(Color.WHITE);
         Checkbal.setFont(f);
        Checkbal.setBounds(350,390,180,40);
        Checkbal.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                checkb c = new checkb(a);
            }
        });
        getContentPane().add(Checkbal);
           JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
    }
    public Option(SavingAccount a)
    {
         Color c3=new Color(237,145,33);
         Color c=new Color(235,255,255);
        setSize(1000,800);
        getContentPane().setBackground(c);
        getContentPane().setLayout(null);
       // getContentPane().setBackground(new Color(0,0,120));
        setVisible(true);
        
        JLabel welcome = new JLabel(a.getBanktitle()+ " Welcome to AUBL");
        welcome.setBounds(225, 50, 600, 50);
        welcome.setFont(new Font("Lucida Sans",Font.ITALIC+Font.BOLD, 40));
        welcome.setForeground(c3);
        getContentPane().add(welcome);
        
        JButton Withdraw = new JButton();
        Withdraw.setText("Withdraw");
        Withdraw.setFont(new Font("Lucida Sans",Font.PLAIN,30));
        Withdraw.setForeground(Color.WHITE);
        Withdraw.setBackground(c3);
        Withdraw.setBounds(250, 150, 250, 30);
        Withdraw.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new withdraw(a);
            }
        });
        getContentPane().add(Withdraw);
        
        JButton Transfer = new JButton();
        Transfer.setText("Transfer");
       // Transfer.setBorder(b);
        Transfer.setBackground(c3);
        Transfer.setForeground(Color.WHITE);
        Transfer.setFont(new Font("Lucida Sans",Font.PLAIN,30));
        Transfer.setBounds(250, 230, 250, 30);
        Transfer.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new transferfund(a);
            }
        });
        getContentPane().add(Transfer);        
        
        JButton changepin = new JButton();
        changepin.setText("Change Pin");
        changepin.setBackground(c3);
        changepin.setForeground(Color.WHITE);
        changepin.setBounds(250,310,250,30);
        changepin.setFont(new Font("Lucida Sans",Font.PLAIN,30));
        changepin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                chanpin c = new chanpin(a);
            }
        });
        getContentPane().add(changepin);
        
        JButton Checkbal = new JButton();
        Checkbal.setText("Check Balance");
        Checkbal.setBackground(c3);
        Checkbal.setForeground(Color.WHITE);
        Checkbal.setFont(new Font("Lucida Sans",Font.PLAIN,30));
        Checkbal.setBounds(250,390,250,30);
        Checkbal.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                checkb c = new checkb(a);
            }
        });
        getContentPane().add(Checkbal);
                   JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
    }
    public class chanpin extends JFrame
     {
        public chanpin(CurrentAccount a)
        {
            Color c3=new Color(237,145,33);
            LineBorder  b2=new LineBorder(c3,3);
            LineBorder b3=new LineBorder(Color.BLACK,2);
            
         Color c=new Color(235,255,255);
         JLabel l=new JLabel();
         l.setBackground(c);
         l.setForeground(Color.BLACK);
         l.setBounds(200,300,200,50);
            setVisible(true);
            getContentPane().setBackground(c);
            getContentPane().setLayout(null);
            setSize(1000, 800);
            JLabel j = new JLabel("Enter New 4 Digit Pin");
            j.setFont(new Font("Lucida Sans",Font.ITALIC+Font.BOLD,30));
            j.setForeground(c3);
            
            j.setBounds(190,100,400,35);
            JTextField t = new JTextField();
             
            t.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            t.setBorder(b2);
            t.setBounds(200, 150, 200, 35);
            JButton b = new JButton("Change");
            b.setBorder(b3);
            b.setBackground(c3);
            b.setForeground(Color.WHITE);
            b.setFont(new Font("Lucida Sans",Font.BOLD,20));
            b.setBounds(200, 210, 100, 35);
            b.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            int pin = Integer.parseInt(t.getText());
                            CurrentAccount.UpdateAtmPin(a.getAccountNumber(), pin);
                            l.setText("Pin Changed");
                        }
                    }
                    );
            JButton b1 = new JButton("Cancel");
            b1.setFont(new Font("Lucida Sans",Font.BOLD,20));
            b1.setBounds(320,210,100,35);
            b1.setBorder(b3);
            b1.setBackground(c3);
            b1.setForeground(Color.WHITE);
            getContentPane().add(l);
            getContentPane().add(j);
            getContentPane().add(t);
            getContentPane().add(b);
            getContentPane().add(b1);
            
                       JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
        }
          public chanpin(SavingAccount a)
        {
            
            
             Color c3=new Color(237,145,33);
            LineBorder  b2=new LineBorder(c3,3);
            LineBorder b3=new LineBorder(Color.BLACK,2);
            
         Color c=new Color(235,255,255);
         JLabel l=new JLabel();
         l.setBackground(c);
         l.setForeground(Color.BLACK);
         l.setBounds(200,300,200,50);
            setVisible(true);
            getContentPane().setLayout(null);
            setSize(1000, 800);
            getContentPane().setBackground(c);
            JLabel j = new JLabel("Enter New 4 Digit Pin");
            j.setFont(new Font("Lucida Sans",Font.ITALIC+Font.BOLD,30));
            j.setBounds(190,100,400,35);
            j.setForeground(c3);
            
            JTextField t = new JTextField();
            t.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            t.setBounds(200, 150, 200, 35);
            t.setBorder(b2);
            JButton b = new JButton("Change");
            b.setBorder(b3);
            b.setBackground(c3);
            b.setForeground(Color.WHITE);
            b.setFont(new Font("Lucida Sans",Font.BOLD,20));
            b.setBounds(200, 210, 100, 35);
            
            
            b.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            int pin = Integer.parseInt(t.getText());
                            SavingAccount.UpdateAtmPin(a.getAccountNumber(), pin);
                            l.setText("Pin Changed");
                        }
                    }
                    );
            JButton b1 = new JButton("Cancel");
            b1.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            b1.setBounds(320,210,100,35);
            b1.setBorder(b3);
            b1.setBackground(c3);
            b1.setForeground(Color.WHITE);
            getContentPane().add(l);
            getContentPane().add(j);
            getContentPane().add(t);
            getContentPane().add(b);
            getContentPane().add(b1);
            
                       JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
        }
     }
    public class transferfund extends JFrame
    {
        public transferfund(CurrentAccount a)
        {
            Color c3=new Color(237,145,33);
            Color c=new Color(235,255,255);
            LineBorder b1=new LineBorder(Color.BLACK,2);
            LineBorder b=new LineBorder(c3,2);
            getContentPane().setLayout(null);
            getContentPane().setBackground(c);
            setVisible(true);
            setSize(1000, 800);
            JLabel j = new JLabel("Enter the Account Number");
            j.setBounds(200, 100, 450, 35);
            j.setForeground(c3);
            j.setFont(new Font("Lucida Sans",Font.BOLD+Font.ITALIC,30));
            JTextField t = new JTextField();
            t.setBorder(b);
            t.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            t.setBounds(200,145,200,35);
            JLabel j1 = new JLabel("Enter the Amount");
            j1.setForeground(c3);
            j1.setFont(new Font("Lucida Sans",Font.BOLD+Font.ITALIC,30));
            j1.setBounds(200,195,400,35);
            JTextField t1 = new JTextField();
            t1.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            t1.setBorder(b);
            t1.setBounds(200,240,200,35);
            JButton s = new JButton("Submit");
            s.setBackground(c3);
            s.setBorder(b1);
            
            s.setForeground(Color.WHITE);
            s.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            s.setBounds(220,295,100,35);
            s.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    double amount=Integer.parseInt(t1.getText());
                    String RecievingNumber = t.getText();
                    String SendingNumber = a.getAccountNumber();
                    double rupbal = CurrentAccount.findCurrentAccount(RecievingNumber).getAccountBalance()+amount;
                    double supbal = CurrentAccount.findCurrentAccount(SendingNumber).getAccountBalance()-amount;
                    if(amount>0)
                    {
                        if(amount<a.getAccountBalance())
                        {
                            CurrentAccount.Updatebalance(RecievingNumber,rupbal);
                            CurrentAccount.Updatebalance(SendingNumber, supbal);
                        }
                    }
                }
            }
            );
            getContentPane().add(j);
            getContentPane().add(j1);
            getContentPane().add(t);
            getContentPane().add(t1);
            getContentPane().add(s);
            
                       JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
        }
        public transferfund(SavingAccount a)
        {
            Color c3=new Color(237,145,33);
            LineBorder  b2=new LineBorder(c3,3);
            LineBorder b3=new LineBorder(Color.BLACK,2);
            Color c=new Color(235,255,255);
            getContentPane().setLayout(null);
            setVisible(true);
            setSize(1000, 800);
            JLabel j = new JLabel("Enter the Account Number");
            j.setBounds(200, 100, 450, 35);
            j.setFont(new Font("Lucida Sans",Font.BOLD+Font.ITALIC,30));
            j.setForeground(c3);
            JTextField t = new JTextField();
            t.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            t.setBounds(200,145,200,35);
            t.setBorder(b2);
            JLabel j1 = new JLabel("Enter the Amount");
            j1.setFont(new Font("Lucida Sans",Font.BOLD+Font.ITALIC,30));
            j1.setBounds(200,195,400,35);
            j1.setForeground(c3);
            JTextField t1 = new JTextField();
            t1.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            t1.setBounds(200,240,200,35);
            t1.setBorder(b2);
            JButton s = new JButton("Submit");
            s.setFont(new Font("Lucida Sans",Font.BOLD,20));
            s.setBounds(200,295,100,35);
            s.setBackground(c3);
            s.setForeground(Color.WHITE);
            s.setBorder(b3);
            s.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    double amount=Integer.parseInt(t1.getText());
                    String RecievingNumber = t.getText();
                    String SendingNumber = a.getAccountNumber();
                    double rupbal = SavingAccount.findSavingAccount(RecievingNumber).getAccountBalance()+amount;
                    double supbal = SavingAccount.findSavingAccount(SendingNumber).getAccountBalance()-amount;
                    if(amount>0)
                    {
                        if(amount<a.getAccountBalance())
                        {
                            SavingAccount.Updatebalance(RecievingNumber,rupbal);
                            SavingAccount.Updatebalance(SendingNumber, supbal);
                        }
                    }
                }
            }
            );
            getContentPane().add(j);
            getContentPane().add(j1);
            getContentPane().add(t);
            getContentPane().add(t1);
            getContentPane().add(s);
            
                       JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
        }
    }
    public class withdraw extends JFrame
    {
        public withdraw(CurrentAccount a)
        {
              Color c3=new Color(237,145,33);
            LineBorder  b2=new LineBorder(c3,3);
            LineBorder b3=new LineBorder(Color.BLACK,2);
         Color c=new Color(235,255,255);
            JLabel lb=new JLabel();
            lb.setBackground(c);
            lb.setBounds(150,320,300,40);
            lb.setForeground(Color.BLACK);
            
            
            Font f2=new Font("Lucida Sans",Font.ITALIC+Font.BOLD,20);        
            Font f1= new Font("Lucida Sans",Font.ITALIC+Font.BOLD,40);
            getContentPane().setBackground(c);
            getContentPane().setLayout(null);
            setSize(1000,800);
            setVisible(true);
            JLabel j = new JLabel("Enter Amount");
            j.setFont(f2);
            j.setBounds(200,150,250,50);
            j.setForeground(c3);
            JLabel j1 = new JLabel("ACCOUNT WITHDRAW");
            j1.setBounds(270,0,500,150);
            j1.setFont(f1);
            j1.setForeground(c3);
            JTextField t = new JTextField();
            t.setBounds(200,210,250,30);
            t.setBorder(b2);
            JButton b = new JButton("Withdraw");
            b.setBackground(c3);
            b.setBorder(b3);
            
            b.setForeground(Color.WHITE);
            b.setBounds(240, 260, 140, 30);
         
            
           // b.setBackground(Color.);
            
            b.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            b.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int i = Integer.parseInt(t.getText());
                    if(i<=a.getAccountBalance())
                    {
                        CurrentAccount.Updatebalance(a.getAccountNumber(), CurrentAccount.findCurrentAccount(a.getAccountNumber()).getAccountBalance()-i);
                        lb.setText("Amount Withdrawn Successfully");
                    }
                    else
                        lb.setText("Insufficient Funds");
                }
            }
            );
            getContentPane().add(lb);
            getContentPane().add(j);
            getContentPane().add(j1);
            getContentPane().add(t);
            getContentPane().add(b);
            
                       JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
        }
        public withdraw(SavingAccount a)
        {
             Color c3=new Color(237,145,33);
            LineBorder  b2=new LineBorder(c3,3);
            LineBorder b3=new LineBorder(Color.BLACK,2);
            Color c=new Color(235,255,255);
            getContentPane().setLayout(null);
            getContentPane().setBackground(c);
            setSize(1000,800);
            setVisible(true);
            JLabel lb1=new JLabel();
            lb1.setBackground(c);
            lb1.setForeground(Color.BLACK);
            lb1.setBounds(250,320,300,40);
            JLabel j = new JLabel("Enter Amount");
            j.setFont(new Font("Lucida Sans",Font.ITALIC+Font.BOLD,30));
            j.setBounds(200,150,250,50);
            j.setForeground(c3);
            JLabel j1 = new JLabel("Account Withdraw");
            j1.setBounds(270,0,500,150);
            j1.setForeground(c3);
            j1.setFont(new Font("Lucida Sans",Font.ITALIC+Font.BOLD,30));
            JTextField t = new JTextField();
            t.setFont(new Font("Lucida Sans",Font.PLAIN,20));
            t.setBounds(200,210,250,30);
            t.setBorder(b2);
            JButton b = new JButton("Withdraw");
            b.setBounds(240, 260, 140, 30);
            b.setBorder(b3);
            b.setBackground(c3);
            b.setForeground(Color.WHITE);
            b.setFont(new Font("Lucida Sans",Font.BOLD,20));
            b.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int i = Integer.parseInt(t.getText());
                    if(i<=a.getAccountBalance())
                    {
                        SavingAccount.Updatebalance(a.getAccountNumber(), SavingAccount.findSavingAccount(a.getAccountNumber()).getAccountBalance()-i);
                        lb1.setText("Amount Withdrawn Successfully");
                    }
                    else
                        lb1.setText("Insufficient Funds");
                }
            }
            );
            getContentPane().add(lb1);
            getContentPane().add(j);
            getContentPane().add(j1);
            getContentPane().add(t);
            getContentPane().add(b);
            
                       JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
        }
    }
        public class checkb extends JFrame
        {
            public checkb(CurrentAccount a)
            {
                
                Color c3=new Color(237,145,33);
                LineBorder  b2=new LineBorder(c3,3);
                LineBorder b3=new LineBorder(Color.BLACK,2);
                Color c=new Color(235,255,255);
                setSize(1000,800);
                setVisible(true);
                getContentPane().setLayout(null);
                getContentPane().setBackground(c);
                JLabel j = new JLabel("Your Account Number");
                j.setForeground(c3);
                j.setFont(new Font("Lucida Sans",Font.BOLD+Font.ITALIC,30));
                j.setBounds(200,200,350,30);
                JLabel j1 = new JLabel(a.getAccountNumber());
                j1.setFont(new Font("Lucida Sans",Font.PLAIN,20));
                j1.setBorder(b3);
                j1.setBounds(200, 260, 200, 30);
                JLabel j3 = new JLabel("Your Account Balance");
                j3.setForeground(c3);
                j3.setFont(new Font("Lucida Sans",Font.BOLD+Font.ITALIC,30));
                j3.setBounds(200, 320, 350, 30);
                JLabel j4 = new JLabel(String.valueOf(CurrentAccount.findCurrentAccount(a.getAccountNumber()).getAccountBalance()));
                j4.setFont(new Font("Lucida Sans",Font.PLAIN,20));
                j4.setBorder(b3);
                j4.setBounds(200, 370, 200, 30);
                getContentPane().add(j);
                getContentPane().add(j1);
                getContentPane().add(j3);
                getContentPane().add(j4);
                
                           JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
                
            }
            public checkb(SavingAccount a)
            {
                Color c3=new Color(237,145,33);
                LineBorder  b2=new LineBorder(c3,3);
                LineBorder b3=new LineBorder(Color.BLACK,2);
                Color c=new Color(235,255,255);
                setSize(1000,800);
                setVisible(true);
                getContentPane().setBackground(c);
                getContentPane().setLayout(null);
                JLabel j = new JLabel("Your Account Number");
                j.setFont(new Font("Lucida Sans",Font.BOLD+Font.ITALIC,30));
                j.setForeground(c3);
                j.setBounds(200,200,350,30);
                JLabel j1 = new JLabel(a.getAccountNumber());
                j1.setFont(new Font("Lucida Sans",Font.PLAIN,20));
                j1.setBorder(b3);
                j1.setBounds(200, 260, 200, 30);
                JLabel j3 = new JLabel("Your Account Balance");
                j3.setFont(new Font("Lucida Sans",Font.BOLD+Font.ITALIC,30));
                j3.setForeground(c3);
                j3.setBounds(200, 320, 350, 30);
                JLabel j4 = new JLabel(String.valueOf(SavingAccount.findSavingAccount(a.getAccountNumber()).getAccountBalance()));
                j4.setFont(new Font("Lucida Sans",Font.PLAIN,20));
                j4.setBorder(b3);
                j4.setBounds(200, 370, 200, 30);
                getContentPane().add(j);
                getContentPane().add(j1);
                getContentPane().add(j3);
                getContentPane().add(j4);
                
                           JButton Back = new JButton("Back");
           Back.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Back.setForeground(Color.WHITE);
           Back.setBackground(FontColor);
           Back.setBounds(10,720,100,30);
           Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(Back);
               thisFrame.dispose();
            }
        } );
           this.add(Back);
            }
        }
}


