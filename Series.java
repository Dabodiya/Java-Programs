class Series
{
  public static void main(String... b)
  {
   int n=15;
   System.out.println("Even Series is - ");
   for(int i=1;i<=n;i++)
   {
     if(i%2==0)
	 {
	  System.out.println(i);
	 }
   }
   System.out.println("Odd Series is - ");
   while(n>=1)
   {
    if(n%2==1)
	 {
	  System.out.println(n);
	 }
	 n=n-1;
   }
  }
}