import java.awt.event.*;
import javax.swing.*;
class Calculator
{
  Calculator()
  {
	  String s;
	  final JFrame jf=new JFrame();
		 JButton jb1=new JButton();
		 JButton jb2=new JButton();
		 JButton jb3=new JButton();
		 JButton jb4=new JButton();
		 JButton jb5=new JButton();
		 JButton jb6=new JButton();
		 JButton jb7=new JButton();
		 JButton jb8=new JButton();
		 JButton jb9=new JButton();
		 JButton jb10=new JButton();
		 JButton jb11=new JButton();
		 JButton jb12=new JButton();
		 JButton jb13=new JButton();
		 JButton jb14=new JButton();
		 JButton jb15=new JButton();
		 JButton jb0=new JButton();
		 JTextField jtf=new JTextField();
		 jtf.setBounds(12,20,369,50);
		 jb0.setBounds(12,268,80,48);
		 jb1.setBounds(12,100,80,48);
		 jb2.setBounds(108,100,80,48);
		 jb3.setBounds(204,100,80,48);
		 jb4.setBounds(12,156,80,48);
		 jb5.setBounds(108,156,80,48);
		 jb6.setBounds(204,156,80,48);
		 jb7.setBounds(12,212,80,48);
		 jb8.setBounds(108,212,80,48);
		 jb9.setBounds(204,212,80,48);
		 jb10.setBounds(300,100,80,48);
		 jb11.setBounds(300,212,80,48);
		 jb12.setBounds(108,268,80,48);
		 jb13.setBounds(204,268,80,48);
		 jb14.setBounds(300,156,80,48);
		 jb15.setBounds(300,268,80,48);
		 jb1.setText("1");
		 jb2.setText("2");
		 jb3.setText("3");
		 jb4.setText("4");
		 jb5.setText("5");
		 jb6.setText("6");
		 jb7.setText("7");
		 jb8.setText("8");
		 jb9.setText("9");
		 jb10.setText("AC");
		 jb11.setText("-");
		 jb0.setText("0");
		 jb12.setText("x");
		 jb13.setText("/");
		 jb14.setText("+");
		 jb15.setText("=");
		 jf.add(jb0);
		 jf.add(jb1);
		 jf.add(jb2);
		 jf.add(jb3);
		 jf.add(jb4);
		 jf.add(jb5);
		 jf.add(jb6);
		 jf.add(jb7);
		 jf.add(jb8);
		 jf.add(jb9);
		 jf.add(jtf);
		 jf.add(jb10);
		 jf.add(jb11);
		 jf.add(jb12);
		 jf.add(jb13);
		 jf.add(jb14);
		 jf.add(jb15);
		 jf.setSize(404,400);
		 jb0.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"0");
	     }});
		 jb1.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"1");
	     }});
		 jb2.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"2");
	     }});
		 jb3.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"3");
	     }});
		 jb4.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"4");
	     }});
		 jb5.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"5");
	     }});
		 jb6.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"6");
	     }});
		 jb7.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"7");
	     }});
		 jb8.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"8");
	     }});
		 jb9.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"9");
	     }});
		 jb10.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(null);
	     }});
		 jb11.addActionListener(new ActionListener(){
			 int x,y,answer;
		 public void actionPerformed(ActionEvent ae)
		 {
			 if(jtf.getText()=="-")
			x=Integer.parseInt(jtf.getText());
			
		
			y=Integer.parseInt(jtf.getText());
			answer=x-y;
			jtf.setText(String.valueOf(answer));
	     }});
		 jb12.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"x");
	     }});
		 jb13.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText(jtf.getText()+"/");
	     }});
		 jb14.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			 int x=Integer.parseInt(jtf.getText());
			jtf.setText(jtf.getText()+"+");
	     }});
		 jb15.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			jtf.setText("res");
	     }});
		 jf.setLayout(null);
		 jf.setVisible(true);	
        jf.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
         System.exit(0);
        }
        });		 
  }
	public static void main(String... kygeyrf)
	{
	   new Calculator();
	   
	}
}