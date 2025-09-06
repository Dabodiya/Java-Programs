//import java.util.Scanner;
class Prime
{
  void checking(int m)
  {
   int count=0;
   for(int d=1;d<m;d++)
   {
	   int r=m%d;
	   if(r==0)
		   count++;
   }
   if(count==1)
    System.out.println("Prime Number");
    else
	System.out.println("Not Prime Number");
  }
  public static void main(String[] n)
  {
    int x;
	Prime p=new Prime();
	System.out.println("Enter a Number - ");
	x=new java.util.Scanner(System.in).nextInt();
	p.checking(x);
  }
}