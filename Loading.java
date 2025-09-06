import javax.swing.*;
import java.awt.*;
class Loading extends Thread
{
	 Loading()
	 {
		 JFrame f=new JFrame();
		 //JPanel p=new JPanel();
		 //p.setSize(700,700);
		 JLabel l=new JLabel("LOADING PAGE");
		 l.setBounds(230,25,280,30);
		 l.setFont(new Font("Serif",Font.BOLD,30));
		 l.setForeground(Color.blue);
		 JLabel l1=new JLabel("Loading...");
		 l1.setBounds(5,440,90,30);
		 l1.setFont(new Font("Serif",Font.BOLD,20));
		 JLabel l2=new JLabel();
		 l2.setBounds(95,440,90,30);
		 l2.setFont(new Font("Serif",Font.BOLD,20));
		 l1.setForeground(Color.blue);
		 l2.setForeground(Color.blue);
		 JLabel l3=new JLabel("! Please Wait...");
		 l3.setFont(new Font("Serif",Font.BOLD,30));
		 l3.setForeground(Color.white);
		 l3.setBounds(260,600,280,30);
		 JPanel jp1=new JPanel();
	     jp1.setBounds(5,5,676,80);
		 jp1.setBackground(Color.yellow);
		 JPanel jp2=new JPanel();
	     jp2.setBounds(5,580,676,80);
		 jp2.setBackground(Color.green);
		 JPanel jp=new JPanel();
		 jp.setSize(700,700);
		 JProgressBar pb=new JProgressBar();
		 pb.setBounds(0,480,700,20);
		 f.add(pb);
		 f.add(l);
		 f.add(jp1);
		 f.add(l1);
		 f.add(l2);
		 f.add(l3);
		 f.add(jp2);
		 f.add(jp);
		 pb.setForeground(Color.blue);
		 f.setSize(700,700);
		 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		 f.setVisible(true);
		 f.setLayout(null);
		 for (int i=0;i<=100;i++) 
		 {
         final int percent = i;
         try 
         {
			 
			pb.setValue(percent);
			l2.setText(String.valueOf(percent+"%"));
		 sleep(80);
         } 
	    catch (InterruptedException e) 
		{
        }
     }
	 new Login();
	 f.dispose();
	 }
	public static void main(String... sdahg)
	{
		new Loading();
	}
}
	 