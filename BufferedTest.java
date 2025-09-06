import java.util.Scanner;
import java.io.*;
class BufferedTest
{
   public static void main(String... dsf)
   {
	   String input = "NULL";
	   try
	   {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         input = reader.readLine();
       }
	   catch(Exception exp)
	   {
	   }
        // Parsing the string input to an integer
        int x = Integer.parseInt(input);
		System.out.println(x);
   }
}