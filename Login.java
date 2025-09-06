import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane.*;
class Login
{
  Login()
  {
    JFrame jf=new JFrame();
	 JLabel l3=new JLabel("LOGIN PAGE");
	 l3.setBounds(330,30,180,20);
	 JLabel l4=new JLabel("CopyRight 2022 LPU All Rights Are Reserved");
	 l4.setBounds(200,705,400,20);
	 JLabel l1=new JLabel("UserName : ");
	 l1.setBounds(200,180,120,20);
	jf.add(l1);
    JLabel l2=new JLabel("Password : ");
	l2.setBounds(200,295,120,20);
	jf.add(l2);
	final JTextField t1=new JTextField();
	t1.setBounds(310,175,200,40);
	jf.add(t1);
	t1.setForeground(Color.blue);
	t1.setFont(new Font("Serif",Font.BOLD,20));
	final JPasswordField pt=new JPasswordField();
	pt.setBounds(310,290,200,40);
	pt.setFont(new Font("Serif",Font.BOLD,20));
	jf.add(pt);
	pt.setForeground(Color.blue);
	JButton b1=new JButton("Login");
	b1.setBounds(400,380,90,40);
	b1.setForeground(Color.red);
	b1.setFont(new Font("Serif",Font.BOLD,20));
	jf.add(b1);
	JButton b2=new JButton("Reset");
	b2.setBounds(270,380,90,40);
	b2.setForeground(Color.red);
	b2.setFont(new Font("Serif",Font.BOLD,20));
	jf.add(b2);
	JPanel jp1=new JPanel();
	jp1.setBounds(5,5,777,80);
	JPanel jp2=new JPanel();
	jp2.setBounds(5,680,777,80);
	JPanel jp=new JPanel();
	jp1.setBackground(Color.yellow);
	jp2.setBackground(Color.green);
	jf.add(l3);
	jf.add(l4);
	jf.add(jp1);
	jf.add(jp2);
	jf.add(jp);
	jf.setSize(800,800);
	l3.setForeground(Color.blue);
	l4.setForeground(Color.white);
	l1.setForeground(Color.blue);
	l2.setForeground(Color.blue);
	l1.setFont(new Font("Serif", Font.BOLD, 20));
	l2.setFont(new Font("Serif", Font.BOLD, 20));
	l3.setFont(new Font("Serif",Font.BOLD,25));
	l4.setFont(new Font("Serif",Font.BOLD,20));
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			String s=new String(pt.getPassword());
			if(t1.getText().equals("root") && s.equals("Himanshu@java")) 
			{
			    JOptionPane.showMessageDialog(jf,"Successfully Logged in");
				
				try
	            {
      	           Connection c;
		           c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mypro","root","");
                   if(c!=null)
				   {
				     JOptionPane.showMessageDialog(jf,"Successfully Logged in Database");
                      new Register();
                      jf.dispose();					  
				   }
				   c.close();
	            }
	            catch(Exception e)
	            {
		            JOptionPane.showMessageDialog(jf,"Not Connected Database");
	            }
				t1.setText("");
			    pt.setText("");
			}
			else if(s.equals("")||t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(jf,"Please enter id and password","Alert",JOptionPane.WARNING_MESSAGE);
			}
			else if(s.equals("")&&t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(jf,"Enter username and password","Alert",JOptionPane.WARNING_MESSAGE);
			}
            else
			{
                JOptionPane.showMessageDialog(jf,"Wrong Id or Password","Alert",JOptionPane.WARNING_MESSAGE);
				t1.setText("");
			    pt.setText("");
            }				
		}
	});
	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			t1.setText("");
			pt.setText("");
		}
	});
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	jf.setVisible(true);
	jf.setLayout(null);
  }
  public static void main(String... dsjvf)
  {
    Login l=new Login();
  }
}