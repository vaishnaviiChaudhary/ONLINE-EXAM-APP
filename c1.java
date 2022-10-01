package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class c1 extends JFrame implements ActionListener{

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton next;
    int rdX=75,rdW=140,rdH=50;

    ButtonGroup opt;

    c1() {
        setSize(1000, 700);

        l1 = new JLabel("C++  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("1. Which of the following is a correct identifier in C++?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) VAR_1234");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) $var_name");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) 7VARNAME");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) 7var_name");
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
        new c1();
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==next) {
            new c2();
            this.setVisible(false);
        }
        String option = null;
        if(a.isSelected())
        {
            option = "a) VAR_1234";
        }
        else if(b.isSelected())
        {
            option = "b) $var_name";
        }
        else if (c.isSelected())
        {
            option = "c) 7VARNAME";
        }
        else if(d.isSelected())
        {
            option = "d) 7var_name";
        }

    }
}
