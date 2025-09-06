class CompositeNo
{
  public static void main(String... mn)
  {
    int n,count=0;
	System.out.print("ENter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	for(int i=1;i<=n;i++)
	{
	  if(n%i==0)
	  {
	    count++;
	  }
	}
	if(count>2)
	{
	 System.out.println("Number is Composite");
	}
	else
	{
	 System.out.println("Not Composite");
	}
  }
}