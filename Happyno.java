class Happyno
{
  static void checking(int n)
  {
	int r=0,sq=0;
	while(n!=0)
	{
	 r=n%10;
	 sq=sq+r*r;
	 n=n/10;
	}	
    //int nd=sq;
	if(sq>=10)
	{
	 checking(sq);
	}
	else
    {
	 if(sq==1)
	 {
	  System.out.println("Happy");
	 }
     else
	 {
	  System.out.println("Not Happy");
	 }
    }	 
  }
  public static void main(String[] p)
  {
	int a;
	System.out.println("Enter a number - ");
	a=new java.util.Scanner(System.in).nextInt();
	checking(a);
  }
}