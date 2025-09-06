/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int res,my=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
             {
                 
                 for(int k=0;k<=j;k++)
                 {
                     res=(int)Math.pow(2,k);
                     if(k==0)
                     my=a+res*b;
                     else
                     my=my+res*b;
                 }
                 System.out.println(my);
                 
             }
        }
        
             
        in.close();
    }
}*/
import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        //String datatypes[];
        //datatypes=new String[4]{"byte","short","int","long"};
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
				if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



