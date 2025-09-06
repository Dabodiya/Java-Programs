class HarshadNo
{
  public static void main(String... ar)
  {
    int n,r,org,hrsd=0;
	System.out.println("Enter a numbver");
	n=new java.util.Scanner(System.in).nextInt();
	org=n;
	while(n!=0)
	{
	 r=n%10;
	 hrsd=r+hrsd;
	 n=n/10;
	}
	if(org%hrsd==0)
	{
	  System.out.println("Number is Harshad");
	}
	else
	{
	  System.out.println("Number is not harshad");
	}
  }
}