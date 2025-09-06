class Divisbleby3
{
  public static void main(String[] o)
  {
   int n,c=0,r=0;
   System.out.println("Enter a number");
   n=new java.util.Scanner(System.in).nextInt();
   for(int i=3;i<=n;i++)
   {
     r=r+3;
	 c++;
	 if(r==n)
	 {
	   System.out.println("Divisble by 3 Successfully");
	   System.out.println("Quatiant is - "+c);
	   break; 
	 }
   }
  }
}
	 