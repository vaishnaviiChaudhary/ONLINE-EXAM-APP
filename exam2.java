package HACK;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exam2  extends JFrame implements ActionListener{

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton next;
    int rdX=75,rdW=140,rdH=50;

    ButtonGroup opt;

    exam2() {
        setSize(1000, 700);

        JLabel lable=new JLabel();

        l1 = new JLabel("JAVA  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        Border bdr= BorderFactory.createLineBorder(Color.black,3);  //Border to window
        lable.setBorder(bdr);
        lable.setOpaque(true);

        l2 = new JLabel("1. Which of the following is used to find and fix bugs in Java programs?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) JVM");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) JRE");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) JDK");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) JDB");
        d.setBounds(rdX, 490, rdW, rdH);
        opt.add(d);
        add(d);

        next = new JButton("Next");
        next.setBounds(770,500,100,40);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        new exam1();
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==next) {
            new login();
            this.setVisible(false);
        }
        String option = null;
        if(a.isSelected())
        {
            option = "a) JVM";
        }
        else if(b.isSelected())
        {
            option = "b) JRE";
        }
        else if (c.isSelected())
        {
            option = "c)JDK";
        }
        else if(d.isSelected())
        {
            option = "d)JDB";
        }

    }
}

