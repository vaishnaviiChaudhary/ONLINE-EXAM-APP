package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class c3 extends JFrame implements ActionListener{

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton next,prev;
    int rdX=75,rdW=140,rdH=50;

    ButtonGroup opt;

    c3() {
        setSize(1000, 700);

        l1 = new JLabel("C++  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("3. Which of the following is not a type of Constructor in C++?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) Default constructor");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) Parameterized constructor");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) Copy constructor");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) Friend constructor");
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
            option = "a) Default constructor";
        }
        else if(b.isSelected())
        {
            option = "b) Parameterized constructor";
        }
        else if (c.isSelected())
        {
            option = "c) Copy constructor";
        }
        else if(d.isSelected())
        {
            option = "d) Friend constructor";
        }

        if(ae.getSource()==next)
        {
            new c4();
            this.setVisible(false);
        }
        if(ae.getSource()==prev)
        {
            new c2();
            this.setVisible(false);
        }

    }

    public static void main(String[] args)
    {
        new c3();
    }


}
