class Checknum
{
  public static void main(String ar[])
  {
    int x;
	System.out.println("Enter a number - ");
	x=new java.util.Scanner(System.in).nextInt();
	if(x>=1)
	{
	 System.out.println("POsitive Num");
	}
	else if(x==0)
	{
	  System.out.println("Number is zero neither positive nor negative ");
	}
	else
	{
	  System.out.println("Number is negetive");
	}
  }
}