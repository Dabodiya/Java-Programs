import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
class RegStudent
{
	RegStudent()
	{
	JFrame f=new JFrame();
	JLabel l1=new JLabel("Student Id  :");
	l1.setBounds(15,50,120,30);
	l1.setFont(new Font("Serif",Font.BOLD,22));
	l1.setForeground(Color.black);
	f.add(l1);
	JTextField t1=new JTextField();
	t1.setBounds(170,50,120,30);
	t1.setForeground(Color.black);
	t1.setFont(new Font("Serif",Font.BOLD,22));
	f.add(t1);
	 String country[]={"India","Aus","U.S.A","England","Newzealand"};        
    JComboBox cb=new JComboBox(country);    
    cb.setBounds(170,120,120,30);    
    f.add(cb);        
	JLabel l2=new JLabel("Course Id   :");
	l2.setBounds(15,120,120,30);
	l2.setFont(new Font("Serif",Font.BOLD,22));
	l2.setForeground(Color.black);
	f.add(l2);
	JLabel l3=new JLabel("Score  :");
	l3.setBounds(15,190,120,30);
	l3.setFont(new Font("Serif",Font.BOLD,22));
	l3.setForeground(Color.black);
	f.add(l3);
	JTextField t2=new JTextField();
	t2.setBounds(170,190,120,30);
	t2.setForeground(Color.black);
	t2.setFont(new Font("Serif",Font.BOLD,22));
	f.add(t2);
	JLabel l4=new JLabel("Description :");
	l4.setBounds(15,260,130,30);
	l4.setFont(new Font("Serif",Font.BOLD,22));
	l4.setForeground(Color.black);
	f.add(l4);
	JTextField t3=new JTextField();
	t3.setBounds(170,260,120,30);
	t3.setForeground(Color.black);
	t3.setFont(new Font("Serif",Font.BOLD,22));
	f.add(t3);
	JTable table=new JTable();
	table.setBounds(400,50,300,300);
	f.add(table);
	JButton b1=new JButton("Register");
	b1.setBounds(60,350,120,30);
	f.add(b1);
	JPanel p=new JPanel();
	p.setBackground(Color.yellow);
	f.add(p);
	f.setSize(800,500);
	f.setVisible(true);
	f.setLayout(null);
	}
	public static void main(String... hiurew)
	{
		new RegStudent();
	}
}
 