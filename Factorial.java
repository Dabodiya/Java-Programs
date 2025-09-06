class Factorial
{
  public static void main(String[] p)
  {
    int n,fact=1;
	System.out.println("Enter a number -");
	n=new java.util.Scanner(System.in).nextInt();
	for(int i=1;i<=n;i++)
	{
	 fact=fact*i;
	}
	System.out.println("Factorial is - "+fact);
  }
}