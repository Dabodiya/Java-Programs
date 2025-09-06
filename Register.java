import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class Register 
{

  Register()
  {
    JFrame f=new JFrame();
	JLabel l1=new JLabel("Id           :");
	l1.setBounds(90,100,150,20);
	l1.setFont(new Font("Serif",Font.BOLD,24));
	l1.setForeground(Color.blue);
	f.add(l1);
	JTextField f1=new JTextField();
	f1.setBounds(240,95,120,40);
	f1.setForeground(Color.blue);
	f1.setFont(new Font("Serif",Font.BOLD,22));
	f.add(f1);
	JTextField f2=new JTextField();
	f2.setBounds(240,200,120,40);
	f2.setForeground(Color.blue);
	f2.setFont(new Font("Serif",Font.BOLD,22));
	f.add(f2);
	JTextField f3=new JTextField();
	f3.setBounds(240,305,120,40);
	f3.setForeground(Color.blue);
	f3.setFont(new Font("Serif",Font.BOLD,22));
	f.add(f3);
	JTextField f4=new JTextField();
	f4.setBounds(240,395,120,40);
	f4.setForeground(Color.blue);
	f4.setFont(new Font("Serif",Font.BOLD,22));
	f.add(f4);
	JTextField f5=new JTextField();
	f5.setBounds(600,95,120,40);
	f5.setForeground(Color.blue);
	f5.setFont(new Font("Serif",Font.BOLD,22));
	f.add(f5);
	JTextField f6=new JTextField();
	f6.setBounds(600,200,120,40);
	f6.setForeground(Color.blue);
	f6.setFont(new Font("Serif",Font.BOLD,22));
	f.add(f6);
	JLabel l2=new JLabel("First Name   :");
	l2.setBounds(50,210,150,20);
	l2.setFont(new Font("Serif",Font.BOLD,24));
	l2.setForeground(Color.blue);
	f.add(l2);
	JLabel l3=new JLabel("Last Name    :");
	l3.setBounds(50,310,150,20);
	l3.setFont(new Font("Serif",Font.BOLD,24));
	l3.setForeground(Color.blue);
	f.add(l3);
	JLabel l4=new JLabel("Phone no.    :");
	l4.setBounds(50,400,150,20);
	l4.setFont(new Font("Serif",Font.BOLD,24));
	l4.setForeground(Color.blue);
	f.add(l4);
	JLabel l5=new JLabel("Address   :");
	l5.setBounds(450,100,150,20);
	l5.setFont(new Font("Serif",Font.BOLD,24));
	l5.setForeground(Color.blue);
	f.add(l5);
	JLabel l6=new JLabel("Course    :");
	l6.setBounds(450,210,150,20);
	l6.setFont(new Font("Serif",Font.BOLD,24));
	l6.setForeground(Color.blue);
	f.add(l6);
	JLabel l8=new JLabel("Username  :");
	l8.setBounds(450,310,150,20);
	l8.setForeground(Color.blue);
	l8.setFont(new Font("Serif",Font.BOLD,24));
	f.add(l8);
	JTextField f7=new JTextField();
	f7.setBounds(600,310,120,40);
	f7.setForeground(Color.blue);
	f7.setFont(new Font("Serif",Font.BOLD,22));
	f.add(f7);
	JLabel l9=new JLabel("Password  :");
	l9.setBounds(450,400,150,20);
	l9.setForeground(Color.blue);
	l9.setFont(new Font("Serif",Font.BOLD,24));
	f.add(l9);
	JPasswordField f8=new JPasswordField();
	f8.setBounds(600,400,120,40);
	f8.setForeground(Color.blue);
	f8.setFont(new Font("Serif",Font.BOLD,22));
	f.add(f8);
	JPanel p3=new JPanel();
	p3.setBounds(5,700,875,60);
	f.add(p3);
	p3.setBackground(Color.green);
	JButton b1=new JButton("Register");
	b1.setBounds(450,500,120,40);
	f.add(b1);
	b1.setFont(new Font("Serif",Font.BOLD,24));
	b1.setForeground(Color.blue);
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			try
			{
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mypro","root","");
			long id=Long.parseLong(f1.getText());
				String fn=f2.getText();
				String ln=f3.getText();
				long phone=Long.parseLong(f4.getText());
				String address=f5.getText();
				String course=f6.getText();
				String un=f7.getText();
				String pass=new String(f8.getPassword());
			    String query="INSERT INTO registration VALUES('"+id+"','"+fn+"','"+ln+"','"+phone+"','"+address+"','"+course+"','"+un+"','"+pass+"')";
				PreparedStatement pst=c.prepareStatement(query);
				pst.executeUpdate();
			    JOptionPane.showMessageDialog(f,"Student Registered Successfully!");
				f1.setText(null);
			    f2.setText(null);
			    f3.setText(null);
			    f4.setText(null);
			    f5.setText(null);
			    f6.setText(null);
			    f7.setText(null);
			    f8.setText(null);
				c.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
    });		
	JButton b2=new JButton("Reset");
	b2.setBounds(300,500,90,40);
	f.add(b2);
	b2.setFont(new Font("Serif",Font.BOLD,24));
	b2.setForeground(Color.blue);
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			f1.setText(null);
			f2.setText(null);
			f3.setText(null);
			f4.setText(null);
			f5.setText(null);
			f6.setText(null);
			f7.setText(null);
			f8.setText(null);
		}
	});
    JPanel p1=new JPanel();
	p1.setBounds(5,5,875,60);
	f.add(p1);
	p1.setBackground(Color.yellow);
	JLabel l7=new JLabel("New Register Page");
	l7.setBounds(5,500,190,40);
	l7.setFont(new Font("Serif",Font.BOLD,30));
	l7.setForeground(Color.blue);
	p1.add(l7);
	JPanel p=new JPanel();
	f.add(p);
	f.setSize(900,800);
	f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
         System.exit(0);
        }
    });
	f.setVisible(true);
	f.setLayout(null);
  }
  public static void main(String... bbuds)
  {
	  new Register();
  }
}