import java.util.*;
class UserInput
{
   public static void main(String... dfs)
   {
	   int num1;
	   String str;
	   char ch;
	   float flt;
	   System.out.println("Enter the Integer - ");
	   num1 =new Scanner(System.in).nextInt();
	   System.out.println("Enter the string - ");
	   str = new Scanner(System.in).nextLine();
	   System.out.println("Enter a Character - ");
	   ch = new Scanner(System.in).nextLine().charAt(0);
	   System.out.println("Enter the floating value - ");
	   flt = new Scanner(System.in).nextFloat();
	   System.out.println("All the enetered numbers and texts are - \n Integer is - "+num1+ "\nString is - "+str+"\nCharacter is - "+ch+"\nFloating value is - "+flt);
   }
}