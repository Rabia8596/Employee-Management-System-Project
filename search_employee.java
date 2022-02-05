
package employeeproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




class search_employee implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;

    search_employee(){
        f=new JFrame("search");
        f.setBackground(Color.green);
        f.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,270);
        l5.setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employeeproject/icons/viewww.jpg"));

     Image i2 = i1.getImage().getScaledInstance(500,270,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
      l3.setBounds(0,0,500,270);
        f.add(l3);
        
        
   
   
   
   
   
   
   
   
   

        l=new JLabel("Employee Id");
        l.setVisible(true);
        l.setBounds(40,50,250,30);
        l.setForeground(Color.white);
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1); 
        l3.add(l);
        f.add(l5);

        t=new JTextField();
        t.setBounds(240,50,220,30);
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
            mainpage d=new mainpage();
        }
        if(ae.getSource()==b){
            new Update_Employee(t.getText());
            f.setVisible(false);
        }

    }
    
    public static void main(String[]ar){
        new search_employee();
    } 	
}