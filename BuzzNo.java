class BuzzNo
{
  static void buzz(int a)
  {
   int r; 
	  r=a%10;
	  if(r==7 || a%7==0)
	  {
	    System.out.println("Number is Buzz");
	  }
	  else
	  {
		System.out.println("Number is not Buzz");
	  }
  }
   public static void main(String... xh)
   {
    int n;
	System.out.print("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	buzz(n);
   }
}