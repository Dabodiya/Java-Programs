import java.sql.*;
class Db_conn
{
   public static void main(String arg[])
   {
      try
	  {
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoeshopdb","root","");
		 System.out.println("Connected");
		 
	  }
	  catch(Exception e)
	  {
	     System.out.println("NO");
	  }
   }
}