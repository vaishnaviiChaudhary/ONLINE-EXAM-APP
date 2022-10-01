package HACK;

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class homepage extends JFrame implements ActionListener {
    JButton bt1;
    JButton bt2;
    JButton bt3;
    JButton bt4;
    JButton bt5;
    JButton bt6;
    Font fLabel = new Font("Times New Roman", 0, 19);

    homepage() {
        JFrame frame = new JFrame();
        frame.setSize(1600, 900);
        this.setDefaultCloseOperation(3);
        this.setLayout((LayoutManager)null);

        this.bt1 = new JButton("Login");
        this.bt1.setBounds(1200, 40, 150, 20);
        bt1.addActionListener(this);
        frame.add(this.bt1);


        this.bt6 = new JButton("Registration");
        this.bt6.setBounds(1200, 100, 150, 20);
        bt6.addActionListener(this);
        frame.add(this.bt6);

        this.bt2 = new JButton("Result");
        this.bt2.setBounds(100, 180, 100, 20);
        this.bt2.addActionListener(this);
        frame.add(this.bt2);

        this.bt3 = new JButton("Rules");
        this.bt3.setBounds(100, 240, 100, 20);
        this.bt3.addActionListener(this);
        frame.add(this.bt3);

        this.bt4 = new JButton("Grivence");
        this.bt4.setBounds(100, 300, 100, 20);
        this.bt4.addActionListener(this);
        frame.add(this.bt4);

        this.bt5 = new JButton("Feedback");
        this.bt5.setBounds(100, 360, 100, 20);
        this.bt5.addActionListener(this);
        frame.add(this.bt5);

        JLabel wel = new JLabel("WELCOME");
        wel.setBounds(720, 440, 800, 40);
        wel.setFont(this.fLabel);
        frame.add(wel);

        JLabel name = new JLabel("App name");
        name.setBounds(720, 40, 800, 40);
        name.setFont(this.fLabel);
        frame.add(name);

        JLabel logo = new JLabel("LOGO");
        logo.setBounds(100, 40, 40, 40);
        frame.add(logo);
        JLabel details = new JLabel("");
        details.setBounds(720, 560, 800, 100);
        frame.add(details);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() ==bt1)
        {
            this.setVisible(false);
            new login();
        }
        else if (ae.getSource() == bt6)
         {
            this.setVisible(false);
            new registration();
        }
        else if (ae.getSource()== bt2 )
        {
            this.setVisible(false);
            new result();
        }
        else if (ae.getSource()== bt3 )
        {
            this.setVisible(false);
            new guidelines();
        }
        else if (ae.getSource()== bt4 )
        {
            this.setVisible(false);
            new contactus();
        }
        else if (ae.getSource()== bt5 )
        {
            this.setVisible(false);
            new contactus();
        }

    }

    public static void main(String[] args)
    {
        new homepage();
    }
}
