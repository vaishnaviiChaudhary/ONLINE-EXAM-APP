package miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class python10 extends JFrame implements ActionListener {

    JLabel l1,l2;

    JRadioButton a,b,c,d;

    JButton submit,prev;
    int rdX=75,rdW=320,rdH=50;

    ButtonGroup opt;

    python10() {
        setSize(1000, 700);

        l1 = new JLabel("PYTHON  BASICS");
        l1.setBounds(400, 20, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(l1);

        l2 = new JLabel("10. Which of the following is not a core data type in Python programming?");
        l2.setBounds(30, 130, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) Tuples");
        a.setBounds(rdX, 270, rdW, rdH);
        opt.add(a);
        add(a);

        b = new JRadioButton("b) Lists");
        b.setBounds(rdX, 340, rdW, rdH);
        opt.add(b);
        add(b);

        c = new JRadioButton("c) Class");
        c.setBounds(rdX, 410, rdW, rdH);
        opt.add(c);
        add(c);

        d = new JRadioButton("d) Dictionary");
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
            new python9();
            this.setVisible(false);
        }
        String option = null;
        if(a.isSelected())
        {
            option = "a) Tuples";
        }
        else if(b.isSelected())
        {
            option = "b) Lists";
        }
        else if (c.isSelected())
        {
            option = "c) Class";
        }
        else if(d.isSelected())
        {
            option = "d) Dictionary";
        }

    }

    public static void main(String[] args)
    {
        new python10();
    }


}
