import java.util.*;
import java.io.*;
class Properti
{
   public static void main(String... mmnbbnv) throws Exception
   {
      FileReader fr=new FileReader("hh.Properties");
	  Properties p=new Properties();
	  p.load(fr);
	  System.out.println(p.getProperty("name"));
	  System.out.println(p.getProperty("course"));
	  p.setProperty("Location","Jalandhar");
	  p.store(new FileWriter("hh.Properties"),"Java Lab");
	  System.out.println(p.getProperty("Location"));
	}
}