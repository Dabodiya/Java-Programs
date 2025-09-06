class PerfectNo
{
  public static void main(String... gh)
  {
    int n,sum=0;
	System.out.print("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	int org=n;
	for(int i=1;i<=n/2;i++)
	{
	  if(n%i==0)
	  {
	    sum=sum+i;
	  }
	}
	if(sum==org)
	{
	  System.out.println("Perfect");
	 }
	 else
	 {
	   System.out.println("Not perfect");
	 }
  }
}