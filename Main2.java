import java.util.*; 
import java.io.*;

class Main2 {

  public static String SearchingChallenge(String str) {
    // code goes here 
     char[] arch=str.toCharArray();
     double charcount=0,sum=0;
     double total=0;
     for(char c: arch)
     {
       if(Character.isDigit(c))
       {
            sum=sum+c;
       }
       else if(Character.isLetter(c))
       {
             charcount++;
       }
     }
     total=sum/charcount;
    return String.valueOf(total);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SearchingChallenge(s.nextLine())); 
  }

}