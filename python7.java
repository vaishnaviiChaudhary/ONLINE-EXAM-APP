package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class python7 extends JFrame implements ActionListener {

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton next,prev;
    int rdX=75,rdW=320,rdH=50;

    ButtonGroup opt;

    python7() {
        setSize(1000, 700);

        l1 = new JLabel("PYTHON  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("7. How can assertions be disabled in Python?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) Passing -O when running Python");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) Assertions are disabled by default");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) Both a and b are wrong");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) Assertions cannot be disabled in Python");
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
            option = "a) Passing -O when running Python";
        }
        else if(b.isSelected())
        {
            option = "b) Assertions are disabled by default";
        }
        else if (c.isSelected())
        {
            option = "c) Both a and b are wrong";
        }
        else if(d.isSelected())
        {
            option = "d) Assertions cannot be disabled in Python";
        }

        if(ae.getSource()==next)
        {
            new python8();
            this.setVisible(false);
        }
        if(ae.getSource()==prev)
        {
            new python6();
            this.setVisible(false);
        }

    }

    public static void main(String[] args)
    {
        new python7();
    }


}
