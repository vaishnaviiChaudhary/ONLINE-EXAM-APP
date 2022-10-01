package HACK;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java extends JFrame implements ActionListener
{
    JButton bt1;
    Font fLabel = new Font("Times New Roman", 0, 19);
    Java()
    {
        JFrame j=new JFrame();
        JLabel lable=new JLabel();
        JButton button=new JButton();
        JPanel panel = new JPanel();


        Border bdr= BorderFactory.createLineBorder(Color.black,3);  //Border to window
        lable.setBorder(bdr);
        j.setSize(1850,900);//Window size
        j.setTitle("Hack O'Holic");//Name

        ImageIcon img=new ImageIcon("logo.png");//logo change
        j.setIconImage(img.getImage());
        //j.getContentPane().setBackground(new Color(123,50,250));//change BG

        lable.setText("JAVA");//Text
        //lable.setForeground(new Color());//font colour change
        lable.setFont(new Font("Tahoma", Font.BOLD, 30));
        //lable.setBackground(Color.BLACK);
        lable.setOpaque(true);

        //aligliment
        lable.setVerticalAlignment(JLabel.TOP);
        lable.setHorizontalAlignment(JLabel.CENTER);



        JLabel wel = new JLabel("Reference ");
        wel.setBounds(320, 240, 100, 40);
        wel.setFont(this.fLabel);
        j.add(wel);


        JLabel mail = new JLabel("YT Link");
        mail.setBounds(400, 240, 200, 40);
        mail.setFont(fLabel);
        j.add(mail);


        this.bt1 = new JButton("Start Test");
        this.bt1.setBounds(1200, 40, 150, 20);
        bt1.addActionListener(this);
        j.add(this.bt1);


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
    if (ae.getSource() == bt1) {
        this.setVisible(false);
        new exam1();
    }
}
public static void main(String [] args)
   {
       new Java();
   }


}
