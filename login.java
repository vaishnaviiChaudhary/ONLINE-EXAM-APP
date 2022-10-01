package HACK;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JButton lb;
    JButton bk;

    login() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        JLabel lable=new JLabel();
        // ImageIcon title=new ImageIcon(ClassLoader.getSystemResource("title.png"));
        // Image i3  = title.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
        // ImageIcon i4 = new ImageIcon(i3);
        // JLabel i2 = new JLabel(i4);
        // i2.setBounds(0,0,800,500);
        // panel.add(i2);

        frame.setSize(1500, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lable.setText("LOGIN");//Text
        //lable.setForeground(new Color(123,150,250));//font colour change
        lable.setFont(new Font("Tahoma", Font.BOLD, 30));
        //lable.setBackground(Color.BLACK);
        lable.setOpaque(true);
        lable.setVerticalAlignment(JLabel.TOP);
        lable.setHorizontalAlignment(JLabel.CENTER);

         panel.add(lable);

        panel.setLayout(null);
        JLabel lable1 = new JLabel("USERNAME");
        lable1.setBounds(300, 250, 80, 25);
        panel.add(lable1);

        JTextField txtUser = new JTextField(20);
        txtUser.setBounds(400, 250, 170, 20);
        panel.add(txtUser);


        JLabel lable2 = new JLabel("PASSWORD");
        lable2.setBounds(300, 300, 80, 25);
        panel.add(lable2);

        JPasswordField txtpass = new JPasswordField();
        txtpass.setBounds(400, 300, 170, 20);
        panel.add(txtpass);

        this.lb = new JButton("LOGIN");
        this.lb.setBounds(350, 350, 100, 20);
        this.lb.addActionListener(this);
        panel.add(lb);

        this.bk= new JButton("BACK");
        this.bk.setBounds(500, 350, 100, 20);
        this.bk.addActionListener(this);
        panel.add(bk);
        panel.add(lable);
        frame.setVisible(true);
        lable.setVisible(true);
    }

    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource() == lb) {

            this.setVisible(false);
            new subject();
        }
       else if (ae.getSource() == bk) {

            this.setVisible(false);
            new homepage();
        }
    }

    public static void main(String[] args)
    {
        new login();
    }
}

