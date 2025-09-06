import java.sql.*;

class MydatabaseEx
{

public static void main(String []args)
{
try{
   Connection con=null;
    String url="jdbc:mysql://127.0.0.1/doc08";
    String username="root";
    //String password="root123";
    con=DriverManager.getConnection(url,username,"");
    if(con!=null)
    {
     System.out.println("Database connected");
     con.close();
    }
   }

   catch(Exception e){
	   e.printStackTrace();
   }
}
}