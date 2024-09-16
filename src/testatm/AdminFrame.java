package testatm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AdminFrame extends JFrame{
    public AdminFrame()
    {
        this.setLayout(null);
        Color backgroundcolor = new Color(235,255,255);
        Color FontColor = new Color(237,145,33);
        getContentPane().setBackground(backgroundcolor);
        this.setSize(1000,800);
        this.setVisible(true);
        this.setBackground(backgroundcolor);
        
        JLabel atmpin = new JLabel("Enter Username");
        atmpin.setFont(new Font("Lucida Sans",Font.ITALIC,25));
        atmpin.setForeground(FontColor);
        atmpin.setBounds(300, 100, 250, 30);
        this.add(atmpin);
        
        JTextField atmpinfield = new JTextField();
        atmpinfield.setFont(new Font("Lucida Sans",Font.PLAIN,20));
        atmpinfield.setBounds(300,145,200,30);
        this.add(atmpinfield);
        
        JLabel password = new JLabel("Enter Password");
        password.setFont(new Font("Lucida Sans",Font.ITALIC,25));
        password.setForeground(FontColor);
        password.setBounds(300, 180, 250, 30);
        this.add(password);
        
        JPasswordField passwordfield = new JPasswordField();
        passwordfield.setFont(new Font("Lucida Sans",Font.PLAIN,20));
        passwordfield.setBounds(300,225,200,30);
        this.add(passwordfield);
        
        JLabel error = new JLabel();
        error.setForeground(FontColor);
        error.setFont(new Font("Lucida Sans",Font.BOLD,25));
        error.setBounds(300,340,250,30);
        this.add(error);
        
        JButton submit = new JButton("Submit");
        submit.setBackground(FontColor);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Lucida Sans",Font.PLAIN,25));
        submit.setBounds(300,260,200,30);
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                char[] p = passwordfield.getPassword();
                String p1 = new String(p);
                Admin a = Admin.findadmininfo(atmpinfield.getText());
                if(Admin.findadmininfo(atmpinfield.getText())==null)
                {
                    error.setText("Wrong Username");
                }
                else if(a.getPin().equals(p1))
                {
                    new adminframeoptions();
                }
                else
                    error.setText("Wrong Pin");
            }
        }
        
        );
        this.add(submit);
        
        JButton close = new JButton("Close");
        close.setBackground(FontColor);
        close.setForeground(Color.WHITE);
        close.setBounds(300, 300, 200, 30);
        close.setFont(new Font("Lucida Sans",Font.PLAIN,25));
        close.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(close);
               thisFrame.dispose();
            }
        } );
        this.add(close);
    }
    public class adminframeoptions extends JFrame
    {
        public adminframeoptions()
        {
           this.setSize(1000,800);
           this.setVisible(true);
           this.setLayout(null);
           Color backgroundcolor = new Color(235,255,255);
           Color FontColor = new Color(237,145,33);
           getContentPane().setBackground(backgroundcolor);
           
           JLabel error = new JLabel();
           error.setFont(new Font("Lucida Sans",Font.PLAIN,30));
           error.setForeground(FontColor);
           error.setBounds(157, 450, 300, 35);
           this.add(error);
           
           
           JLabel Addacc = new JLabel("Accounts Manager");
           Addacc.setFont(new Font("Lucida Sans",Font.BOLD,30));
           Addacc.setForeground(FontColor);
           Addacc.setBounds(200,50,300,40);
           this.add(Addacc);
           
           JLabel BankTitle = new JLabel("Bank Title");
           BankTitle.setFont(new Font("Lucida Sans",Font.ITALIC,20));
           BankTitle.setForeground(FontColor);
           BankTitle.setBounds(200,100,200,25);
           this.add(BankTitle);
           JTextField bankt = new JTextField();
           bankt.setBounds(380, 102, 200, 25);
           bankt.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           this.add(bankt);
           
           JLabel Accnum = new JLabel("Account Number");
           Accnum.setFont(new Font("Lucida Sans",Font.ITALIC,20));
           Accnum.setForeground(FontColor);
           Accnum.setBounds(200,140,200,25);
           this.add(Accnum);
           JTextField accnumt = new JTextField();
           accnumt.setBounds(380, 142, 200, 25);
           accnumt.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           this.add(accnumt);
           
           JLabel Accbal = new JLabel("Account Balance");
           Accbal.setFont(new Font("Lucida Sans",Font.ITALIC,20));
           Accbal.setForeground(FontColor);
           Accbal.setBounds(200,180,200,25);
           this.add(Accbal);
           JTextField accbalt = new JTextField();
           accbalt.setBounds(380, 182, 200, 25);
           accbalt.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           this.add(accbalt);
           
           JLabel fname = new JLabel("Full Name");
           fname.setFont(new Font("Lucida Sans",Font.ITALIC,20));
           fname.setForeground(FontColor);
           fname.setBounds(200,220,200,25);
           this.add(fname);
           JTextField fnamet = new JTextField();
           fnamet.setBounds(380, 222, 200, 25);
           fnamet.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           this.add(fnamet);
           
           JLabel connum = new JLabel("Contact Number");
           connum.setFont(new Font("Lucida Sans",Font.ITALIC,20));
           connum.setForeground(FontColor);
           connum.setBounds(200,260,200,25);
           this.add(connum);
           JTextField connumt = new JTextField();
           connumt.setBounds(380, 262, 200, 25);
           connumt.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           this.add(connumt);
           
           JLabel cityname = new JLabel("City Name");
           cityname.setFont(new Font("Lucida Sans",Font.ITALIC,20));
           cityname.setForeground(FontColor);
           cityname.setBounds(200,300,200,25);
           this.add(cityname);
           JTextField citynamet = new JTextField();
           citynamet.setBounds(380, 302, 200, 25);
           citynamet.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           this.add(citynamet);
           
           JLabel ir = new JLabel("Interest Rate");
           ir.setFont(new Font("Lucida Sans",Font.ITALIC,20));
           ir.setForeground(FontColor);
           ir.setBounds(200,340,200,25);
           this.add(ir);
           JTextField irt = new JTextField();
           irt.setBounds(380, 342, 200, 25);
           irt.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           this.add(irt);
           
           JRadioButton j = new JRadioButton("CurrentAccount");
           j.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           j.setForeground(FontColor);
           j.setBounds(180,380,200,25);
           this.add(j);
           
           JRadioButton j1 = new JRadioButton("SavingAccount");
           j1.setFont(new Font("Lucida Sans",Font.PLAIN,20));
           j1.setForeground(FontColor);
           j1.setBounds(400,380,200,25);
           j1.addItemListener(new ItemListener() {
               @Override
               public void itemStateChanged(ItemEvent e) {
                   irt.setEnabled(j1.isSelected());
               }
           });
           this.add(j1);
           
           ButtonGroup g = new ButtonGroup();
           g.add(j);
           g.add(j1);
           
           JButton Add = new JButton("Add");
           Add.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           Add.setForeground(Color.WHITE);
           Add.setBackground(FontColor);
           Add.setBounds(157,410,100,30);
           Add.addActionListener(new ActionListener()
           {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                   double  i = Double.parseDouble(accbalt.getText());
                   if(j.isSelected())
                   {
                      CurrentAccount c = new CurrentAccount(bankt.getText(),accnumt.getText(),i,fnamet.getText(),connumt.getText(),citynamet.getText(),0);
                      c.StoreCurrentAccount(c);
                      error.setText("Account Added");
                   }
                   else if(j1.isSelected())
                   {
                      double k = Double.parseDouble(irt.getText());
                      SavingAccount s = new SavingAccount(bankt.getText(),accnumt.getText(),i,fnamet.getText(),connumt.getText(),citynamet.getText(),k,0);
                      s.StoreSavingAccount(s);
                      error.setText("Account Added");
                   }
               }
           });
           this.add(Add);
           
           JButton del = new JButton("Delete");
           del.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           del.setForeground(Color.WHITE);
           del.setBackground(FontColor);
           del.setBounds(259,410,120,30);
           del.addActionListener(new ActionListener()
           {
               @Override
               public void actionPerformed(ActionEvent e) {
                  if(j.isSelected())
                  {
                      CurrentAccount.DeleteCurrentAccount(accnumt.getText());
                      error.setText("Account Deleted");
                  }
                  else if(j1.isSelected())
                  {
                      SavingAccount.DeleteSavingAccount(accnumt.getText());
                      error.setText("Account Deleted");
                  }
               }
           });
           this.add(del);
           
           JButton upd = new JButton("Update");
           upd.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           upd.setForeground(Color.WHITE);
           upd.setBackground(FontColor);
           upd.setBounds(380,410,130,30);
           upd.addActionListener(new ActionListener()
           {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                   if(j.isSelected())
                   {
                       double  i = Double.parseDouble(accbalt.getText());
                       CurrentAccount.DeleteCurrentAccount(accnumt.getText());
                       CurrentAccount c = new CurrentAccount(bankt.getText(),accnumt.getText(),i,fnamet.getText(),connumt.getText(),citynamet.getText(),0);
                       c.StoreCurrentAccount(c);
                       error.setText("Account Updated");
                   }
                   else if(j1.isSelected())
                   {
                       double  i = Double.parseDouble(accbalt.getText());
                       double k = Double.parseDouble(irt.getText());
                       SavingAccount.DeleteSavingAccount(accnumt.getText());
                       SavingAccount s = new SavingAccount(bankt.getText(),accnumt.getText(),i,fnamet.getText(),connumt.getText(),citynamet.getText(),k,0);
                       s.StoreSavingAccount(s);
                       error.setText("Account Updated");
                   }
               }
           });
           this.add(upd);
           
           JButton find = new JButton("Find");
           find.setFont(new Font("Lucida Sans",Font.PLAIN,25));
           find.setForeground(Color.WHITE);
           find.setBackground(FontColor);
           find.setBounds(512,410,130,30);
           find.addActionListener(new ActionListener()
           {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                   if(j.isSelected())
                   {
                       CurrentAccount c = CurrentAccount.findCurrentAccount(accnumt.getText());
                       bankt.setText(c.getBanktitle());
                       accnumt.setText(c.getAccountNumber());
                       String a = String.valueOf(c.getAccountBalance());
                       accbalt.setText(a);
                       fnamet.setText(c.getfullname());
                       connumt.setText(c.getcontactnumber());
                       citynamet.setText(c.getcityname());
                   }
                   else if(j1.isSelected())
                   {
                       SavingAccount c = SavingAccount.findSavingAccount(accnumt.getText());
                       bankt.setText(c.getBanktitle());
                       accnumt.setText(c.getAccountNumber());
                       String a = String.valueOf(c.getAccountBalance());
                       accbalt.setText(a);
                       fnamet.setText(c.getfullname());
                       connumt.setText(c.getcontactnumber());
                       citynamet.setText(c.getcityname());
                       String b = String.valueOf(c.getir());
                       irt.setText(b);
                   }
               }
           });
           this.add(find);
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

