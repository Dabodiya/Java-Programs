import javax.swing.*;
import java.awt.event.*;
class SubAdd
{
  public static void main(String... kjgu)
  {
    JFrame jf=new JFrame();
	JTextField tf1=new JTextField();
	JTextField tf2=new JTextField();
	JTextField tf3=new JTextField();
	JButton jb1=new JButton("+");
	JButton jb2=new JButton("-");
	JButton jb3=new JButton("clear");
	jf.setSize(500,500);
	tf1.setBounds(10,20,90,30);
	tf2.setBounds(10,60,90,30);
	tf3.setBounds(10,180,90,30);
		jb1.setBounds(50,220,90,30);
         jb2.setBounds(120,220,90,30);
		 jb3.setBounds(180,220,90,30);
	jf.add(tf1);
	jf.add(tf2);
	jf.add(tf3);
	jf.add(jb1);
	jf.add(jb2);
	jf.add(jb3);
	jf.setLayout(null);
	jf.setVisible(true);
	jb1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a+b;
			tf3.setText(String.valueOf(c));
		}
	});
	jb2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a-b;
			tf3.setText(String.valueOf(c));
		}
	});
	jb3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	});
	jf.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
         System.exit(0);
        }
        });		 
  }
}
	