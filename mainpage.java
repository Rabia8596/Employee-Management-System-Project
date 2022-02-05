
package employeeproject;
import java.awt.*;
import static java.awt.Color.gray;
import javax.swing.*;
import java.awt.event.*;
public class mainpage implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;

    mainpage(){
        f=new JFrame("Employee Detail");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
      l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employeeproject/Icons/mainpage.jpg"));

        
         Image i2 = i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
      l3.setBounds(0,0,700,500);
        f.add(l3);
        
        l2 = new JLabel("Employee Details");
       l2.setBounds(350,20,210,45);
        
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l3.add(l2);

        b1=new JButton("Add");
          b1.setBounds(330,80,120,40);
        b1.setFont(new Font("serif",Font.BOLD,16));
        b1.addActionListener(this);
        l3.add(b1);


        b2=new JButton("View");
      b2.setBounds(460,80,120,40);
        b2.setFont(new Font("serif",Font.BOLD,16));
        b2.addActionListener(this);
        l3.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(330,140,120,40);
        
        b3.setFont(new Font("serif",Font.BOLD,16));
        b3.addActionListener(this);
        l3.add(b3);

        b4=new JButton("Update");
      b4.setBounds(460,140,120,40);
        b4.setFont(new Font("serif",Font.BOLD,16));
        b4.addActionListener(this);
        l3.add(b4);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new add_employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new view_employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new remove_employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new search_employee();
        }
    }

    public static void main(String[ ] arg){
        mainpage a  = new mainpage();
    }
}