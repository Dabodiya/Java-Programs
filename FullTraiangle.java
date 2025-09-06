class Patter3
{
  Patter3()
  {
    int n;
	System.out.print("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
	   System.out.println();
	}
  }
  public static void main(String... jhfd)
  {
	  new Patter3();
  }
}
	