
package employeeproject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class view_employee implements ActionListener{

    JFrame f;
    JTextField t;
    JLabel l1,l2;
    JButton b,b2;

    view_employee(){
        f=new JFrame("View");
        f.setBackground(Color.green);
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employeeproject/icons/viewww.jpg"));
        
         Image i2 = i1.getImage().getScaledInstance(500,270,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
      l3.setBounds(0,0,500,270);
        f.add(l3);
        
        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.white);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l3.add(l2);
        f.add(l3);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        l3.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
           
        b.addActionListener(this);
        l3.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l3.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b2){
            f.setVisible(false);
            mainpage a=new mainpage();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            Print_Data p = new Print_Data(t.getText());
        }

    }

    public static void main(String[]ar){
        view_employee v=new view_employee();
    }
}
