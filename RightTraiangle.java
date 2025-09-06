class Patter1
{
  Patter1()
  {
   int n ;
   System.out.print("Enter a number - ");
   n=new java.util.Scanner(System.in).nextInt();
   for(int i=1;i<=n;i++)
   {
	   for(int j=1;j<=i;j++)
	   {
		   System.out.print("*");
	   }
	   System.out.println();
   }
  }
  public static void main(String... fg)
  {
	new Patter1();
  }
}