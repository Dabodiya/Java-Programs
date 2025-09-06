import java.awt.event.*;
import javax.swing.*;
class SwingExa
{
   public static void main(String... fdsj)
   {
      JFrame jf=new JFrame();
	  JTextField tf=new JTextField(null);
	  JButton jb=new JButton();
	  tf.setBounds(10,10,369,29);
	  jb.setBounds(90,130,50,30);
	  jf.add(tf);
	  jf.add(jb);
	  jf.setSize(400,400);
	  jf.setVisible(true);
	  jf.setLayout(null);
	  jf.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
         System.exit(0);
        }
        });	
   }
}