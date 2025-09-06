class MagicNo
{
  public static void main(String... ad)
  {
    int n,r,rev=0,sum=0,org;
	System.out.print("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	org=n;
	while(n!=0)
	{
	 r=n%10;
	 sum=sum+r;
	 n=n/10;
	}
	n=sum;
	while(sum!=0)
	{
	 r=sum%10;
	 rev=rev*10+r;
	 sum=sum/10;
	}
	r=n*rev;
	if(r==org)
	{
	  System.out.println("Number is Magic");
	}
	else
	{
	  System.out.println("Not Magic");
	}
  }
}
	 