package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class python5 extends JFrame implements ActionListener {

    JLabel l1,l2,l3;

    JRadioButton a,b,c,d;

    JButton next,prev;
    int rdX=75,rdW=200,rdH=50;

    ButtonGroup opt;

    python5() {
        setSize(1000, 700);

        l1 = new JLabel("PYTHON  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("5. Which of the following blocks will always be executed whether an exception is encountered");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        l3 = new JLabel("or not in a program?");
        l3.setBounds(50, 170, 1000, 100);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l3);

        opt = new ButtonGroup();

        a = new JRadioButton("a) try");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) except");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) finally");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) None of the above");
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
            option = "a) try";
        }
        else if(b.isSelected())
        {
            option = "b) except";
        }
        else if (c.isSelected())
        {
            option = "c) finally";
        }
        else if(d.isSelected())
        {
            option = "d) None of the above";
        }

        if(ae.getSource()==next)
        {
            new python6();
            this.setVisible(false);
        }
        if(ae.getSource()==prev)
        {
            new python4();
            this.setVisible(false);
        }

    }

    public static void main(String[] args)
    {
        new python5();
    }


}
