class Himanshu
{
  public static void main(String... af)
  {
    int n,r,org,arm=0;
	System.out.print("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	org=n;
	while(n!=0)
	{
	  r=n%10;
	  arm=r*r*r+arm;
	  n=n/10;
	}
	if(arm==org)
	{
	  System.out.print("Number is Armstrong");
	}
	 else
	 {
	  System.out.println("Number is not armstong");
	 }
   }
}