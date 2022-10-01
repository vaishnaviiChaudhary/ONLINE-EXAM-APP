package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class python1 extends JFrame implements ActionListener{

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton next;
    int rdX=75,rdW=200,rdH=50;

    ButtonGroup opt;

    python1() {
        setSize(1000, 700);

        l1 = new JLabel("PYTHON  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("1. What is the maximum length of a Python identifier?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) 32");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) 16");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) 128");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) No fixed length is specified");
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
        new python1();
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==next) {
            new python2();
            this.setVisible(false);
        }
        String option = null;
        if(a.isSelected())
        {
            option = "a) 32";
        }
        else if(b.isSelected())
        {
            option = "b) 16";
        }
        else if (c.isSelected())
        {
            option = "c) 128";
        }
        else if(d.isSelected())
        {
            option = "d) No fixed length is specified";
        }

    }
}
