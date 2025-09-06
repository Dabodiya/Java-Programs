class Pattern20
{
  static void pattern(int a)
  {
    char ch;
	for(int i=1;i<=a;i++)
	{
	  ch='A';
	  for(int j=1;j<=a;j++)
	  {
	    if(i%2==0)
		{
		 System.out.print(ch);
		 ch++;
		}
	    else
		{
		 System.out.print("*");
        }
      }
     System.out.println();
    }
  }	
  public static void main(String... mh)
  {
    int n;
	System.out.print("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	pattern(n);
  }
}
    