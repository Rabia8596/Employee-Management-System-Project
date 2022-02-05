
package employeeproject;
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;


class Front_page implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton b;

    Front_page(){
 
        f=new JFrame("Employee Management System");
        f.setBackground(Color.DARK_GRAY);
        f.setLayout(null);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employeeproject/Icons/front_page.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l = new JLabel(i3);
        
        l.setBounds(0,150,1360,530);
        f.add(l);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.white);
         b.setFont(new Font("serif",Font.BOLD,15));
        

        b.setBounds(500,600,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.DARK_GRAY);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);

    
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            login t = new login();    
        }
    }

    public static void main(String[] arg){
        Front_page f = new Front_page();
    }

  
   
}

