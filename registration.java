package HACK;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class registration extends JFrame implements ActionListener {
JButton lb;
JButton back;
    registration() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(1600, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        JLabel l1 = new JLabel("Enter Details");
        l1.setBounds(800, 50, 100, 50);
        panel.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setBounds(500, 150, 50, 25);
        panel.add(l2);
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(700, 150, 250, 25);
        panel.add(nameTxt);


        JLabel l4 = new JLabel("E-mail");
        l4.setBounds(500, 200, 50, 25);
        panel.add(l4);
        JTextField emailTxt=new JTextField();
        emailTxt.setBounds(700,200,250,25);
        panel.add(emailTxt);

        JLabel l5 = new JLabel("Date of Birth");
        l5.setBounds(500, 250, 100, 25);
        panel.add(l5);
        JTextField dobTxt=new JTextField();
        dobTxt.setBounds(700,250,250,25);
        panel.add(dobTxt);

        JLabel l6 = new JLabel("College");
        l6.setBounds(500, 300, 50, 25);
        panel.add(l6);
        JTextField clgTxt=new JTextField();
        clgTxt.setBounds(700,300,250,25);
        panel.add(clgTxt);

        JLabel l7 = new JLabel("Gender");
        l7.setBounds(500, 350, 50, 25);
        panel.add(l7);
        JTextField genderTxt=new JTextField();
        genderTxt.setBounds(700,350,250,25);
        panel.add(genderTxt);

        JLabel l8 = new JLabel("Aadhar No.");
        l8.setBounds(500, 400, 100, 25);
        panel.add(l8);
        JTextField adnoTxt=new JTextField();
        adnoTxt.setBounds(700,400,250,25);
        panel.add(adnoTxt);

        JLabel l3 = new JLabel("Contact");
        l3.setBounds(500, 450, 50, 25);
        panel.add(l3);
        JTextField contTxt=new JTextField();
        contTxt.setBounds(700,450,250,25);
        panel.add(contTxt);

        JLabel lable2 = new JLabel("Set Password");
        lable2.setBounds(500, 500, 80, 25);
        panel.add(lable2);

        JPasswordField txtpass = new JPasswordField();
        txtpass.setBounds(700, 500, 250, 25);
        panel.add(txtpass);

        setLocationRelativeTo(null);
        frame.setVisible(true);
        this.lb=new JButton("SUBMIT");
        this.lb.setBounds(700,600,100,20);
       this.lb.addActionListener(this);
        panel.add(lb);

        this.back =new JButton("BACK");
        this.back.setBounds(850,600,100,20);
        this.back.addActionListener(this);
        panel.add(back);

        frame.setVisible(true);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource()== lb)
        {
            this.setVisible(false);
            new login();
        }
        if (ae.getSource()==back)
        {
            this.setVisible(false);
            new homepage();
        }
    }


    public static void main(String[] args) {
        new registration();


    }



}
