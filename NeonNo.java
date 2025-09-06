class NeonNo
{
  public static void main(String... ad)
  {
    int n,sum=0,r;
	System.out.print("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	int org=n;
	int sq=n*n;
	while(sq!=0)
	{
	 r=sq%10;
	 sum=sum+r;
	 sq=sq/10;
	}
	if(sum==org)
	{
	 System.out.println("Neoon num");
	}
	else
	{
	 System.out.println("Not neoon");
	}
  }
}