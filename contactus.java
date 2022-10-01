package HACK;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class contactus extends JFrame implements ActionListener
{
    JButton back;
    Font fLabel = new Font("Times New Roman", 0, 19);
    contactus()
    {
        JFrame j=new JFrame();
        JLabel lable=new JLabel();
        JButton button=new JButton();
        JPanel panel = new JPanel();


        Border bdr= BorderFactory.createLineBorder(Color.black,3);  //Border to window
        lable.setBorder(bdr);
        j.setSize(1550,800);//Window size
        j.setTitle("Hack O'Holic");//Name

        ImageIcon img=new ImageIcon("logo.png");//logo change
        j.setIconImage(img.getImage());
        //j.getContentPane().setBackground(new Color(123,50,250));//change BG

        lable.setText("CONTACT US");//Text
        //lable.setForeground(new Color());//font colour change
        lable.setFont(new Font("Tahoma", Font.BOLD, 30));
        //lable.setBackground(Color.BLACK);
        lable.setOpaque(true);

        //aligliment
        lable.setVerticalAlignment(JLabel.TOP);
        lable.setHorizontalAlignment(JLabel.CENTER);

        JLabel wel = new JLabel("E-MAIL: ");
        wel.setBounds(320, 240, 100, 40);
        wel.setFont(this.fLabel);
        j.add(wel);


        JLabel mail = new JLabel("appname@gmail.com");
        mail.setBounds(400, 240, 200, 40);
        mail.setFont(fLabel);
        j.add(mail);

        JLabel con = new JLabel("CONTACT NUMBER: ");
        con.setBounds(980, 240, 250, 40);
        con.setFont(this.fLabel);
        j.add(con);

        JLabel num = new JLabel("1234567890 ");
        num.setBounds(1170, 240, 200, 40);
        num.setFont(this.fLabel);
        j.add(num);

        this.back =new JButton("BACK");
        this.back.setBounds(710,500,100,40);
        this.back.addActionListener(this);
        j.add(back);


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
        if (ae.getSource()==back)
        {
            this.setVisible(false);
            new homepage();
        }

    }
    public static void main (String args[])
    {
        new contactus();
    }



}
