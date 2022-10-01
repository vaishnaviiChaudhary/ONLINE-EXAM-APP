package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class c7 extends JFrame implements ActionListener {

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton next,prev;
    int rdX=75,rdW=320,rdH=50;

    ButtonGroup opt;

    c7() {
        setSize(1000, 700);

        l1 = new JLabel("C++  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("7. What is meant by a polymorphism in C++?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) class having only single form");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) class having four forms");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) class having many forms");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) class having two forms");
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
            option = "a) class having only single form";
        }
        else if(b.isSelected())
        {
            option = "b) class having four forms";
        }
        else if (c.isSelected())
        {
            option = "c) class having many forms";
        }
        else if(d.isSelected())
        {
            option = "d) class having two forms";
        }

        if(ae.getSource()==next)
        {
            new c8();
            this.setVisible(false);
        }
        if(ae.getSource()==prev)
        {
            new c6();
            this.setVisible(false);
        }

    }

    public static void main(String[] args)
    {
        new c7();
    }


}
