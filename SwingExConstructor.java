import java.awt.event.*;
import javax.swing.*;
class SwingExConstructor
{
   SwingExConstructor()
   {
         JFrame jf=new JFrame();
		 JButton jb=new JButton(new ImageIcon());
		 final JTextField jtf=new JTextField();
		 jtf.setBounds(60,50,200,40);
		 jb.setBounds(130,100,200,80);
		 jb.setText("Submit");
		 jf.add(jb);
		 jf.add(jtf);
		 jf.setSize(400,500);
		 jb.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
				 jtf.setText(" HELLO EVERYONE WELCOME ");
			 }
		 });
		 jf.setLayout(null);
		 jf.setVisible(true);
	}
	public static void main(String... kygeyrf)
	{
	   new SwingExConstructor();
	}
}