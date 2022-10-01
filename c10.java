package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class c10 extends JFrame implements ActionListener {

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton submit,prev;
    int rdX=75,rdW=320,rdH=50;

    ButtonGroup opt;

    c10() {
        setSize(1000, 700);

        l1 = new JLabel("C++  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("10. Which function do we use for checking if a character is a space or a tab?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a)  isdigit()");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) isblank()");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) isalnum()");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) isalpha()");
        d.setBounds(rdX, 490, rdW, rdH);
        opt.add(d);
        add(d);

        prev = new JButton("Previous");
        prev.setBounds(650,550,100,40);
        prev.addActionListener(this);
        add(prev);

        submit = new JButton("Submit");
        submit.setBounds(770,550,100,40);
//        submit.addActionListener(this);
        add(submit);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==prev)
        {
            new c9();
            this.setVisible(false);
        }
        String option = null;
        if(a.isSelected())
        {
            option = "a)  isdigit()";
        }
        else if(b.isSelected())
        {
            option = "b) isblank()";
        }
        else if (c.isSelected())
        {
            option = "c) isalnum()";
        }
        else if(d.isSelected())
        {
            option = "d) isalpha()";
        }

    }

    public static void main(String[] args)
    {
        new c10();
    }


}
