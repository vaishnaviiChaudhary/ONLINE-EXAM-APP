package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class c6 extends JFrame implements ActionListener {

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton next,prev;
    int rdX=75,rdW=320,rdH=50;

    ButtonGroup opt;

    c6() {
        setSize(1000, 700);

        l1 = new JLabel("C++  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("6. What is Inheritance in C++?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) Deriving new classes from existing classes");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) Overloading of classes");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) Classes with same names");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) Wrapping of data into a single class");
        d.setBounds(rdX, 490, rdW, rdH);
        opt.add(d);
        add(d);

        next = new JButton("Next");
        next.setBounds(770,550,100,40);
        next.addActionListener(this);
        add(next);

        prev = new JButton("Previous");
        prev.setBounds(650,550,100,40);
        prev.addActionListener(this);
        add(prev);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String option = null;
        if(a.isSelected())
        {
            option = "a) Deriving new classes from existing classes";
        }
        else if(b.isSelected())
        {
            option = "b) Overloading of classes";
        }
        else if (c.isSelected())
        {
            option = "c) Classes with same names";
        }
        else if(d.isSelected())
        {
            option = "d) Wrapping of data into a single class";
        }

        if(ae.getSource()==next)
        {
            new c7();
            this.setVisible(false);
        }
        if(ae.getSource()==prev)
        {
            new c5();
            this.setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        new c6();
    }


}
