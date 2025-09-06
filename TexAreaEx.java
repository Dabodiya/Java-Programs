import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TexAreaEx
{
  public static void main(String... jhgj)
{
  TextArea ta=new TextArea();
  JFrame jf=new JFrame();
  jf.add(ta);
  ta.setSize(10,90);
  ta.getPreferredSize();
  jf.setSize(500,500);
  jf.setVisible(true);
  jf.setLayout(null);
  jf.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
         System.exit(0);
        }
        });		 
}
}  



