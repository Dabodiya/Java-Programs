import javax.swing.*;
class LableEx
{
  public static void main(String...  hguyg)
  {
     JFrame jf=new JFrame("My frame");
	 JLabel jl1=new JLabel("First label");
	 JLabel jl2=new JLabel("Second label");
	 jf.setSize(400,400);
	 jf.add(jl1);
	 jf.add(jl2);
	 jl1.setBounds(10,20,90,120);
	 jl2.setBounds(50,70,90,120);
	 jf.setLayout(null);
	 jf.setVisible(true);
  }
}