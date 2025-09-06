class KrishnaMurthyNo
{
  public static void main(String... jk)
  {
    int n,fact,r,sum=0,org;
	System.out.println("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	org=n;
	while(n!=0)
	{
	  fact=1;
	  r=n%10;
	  for(int i=1;i<=r;i++)
	  {
	    fact=fact*i;
	  }
	  sum=sum+fact;
      n=n/10;	  
	}
	if(sum==org)
	{
	  System.out.println("Wow KrishnaMurthy ");
	 }
	 else
	 {
	  System.out.println("NoNo KrishnaMuthy");
	 }
  }
}