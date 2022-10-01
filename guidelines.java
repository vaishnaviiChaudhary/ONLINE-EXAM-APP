package HACK;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guidelines extends JFrame implements  ActionListener
{
    JButton  btn1;
    guidelines()
    {
        JFrame j=new JFrame();
        JLabel lable=new JLabel();
        JButton button=new JButton();

        lable.setText("GUIDELINES");//Text
        //lable.setForeground(new Color(123,150,250));//font colour change
        lable.setFont(new Font("Tahoma", Font.BOLD, 30));
        //lable.setBackground(Color.BLACK);
        lable.setOpaque(true);

        btn1= new JButton("Back");
        btn1.setBounds(700, 700, 150, 30);
        btn1.addActionListener(this);
        j.add(btn1);

        Border bdr= BorderFactory.createLineBorder(Color.black,3);  //Border to window
        lable.setBorder(bdr);
        j.setSize(1550,800);//Window size
        j.setTitle("Hack O'Holic");//Name


        lable.setVerticalAlignment(JLabel.TOP);
        lable.setHorizontalAlignment(JLabel.CENTER);

        //button
        button.setBounds(200,150,100,50);
        button.setVisible(true);
        add(button);
        // lable.setBounds(0,0,250,250);
        // j.setLayout(null);
        j.add(lable);
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit code on closing window
        j.setVisible(true);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource()==btn1)
        {

         this.setVisible(false);
            new homepage();
         }
    }

    public static void main(String [] args)
    {
        new guidelines();
    }
}
