import java.util.*;
class Max
{
  static int max(int x[])
  {
    int m;
	m=x[0];
	for(int i=0;i<x.length;i++)
	{
	 if(m<x[i])
	 {
	   m=x[i];
	 }
	}
	return m;
  }
  public static void main(String... g)
  {
    int ar[];
	System.out.println("Enter the Size");
	int size=new Scanner(System.in).nextInt();
	ar=new int[size];
    System.out.println("Enter the array");
	for(int i=0;i<ar.length;i++)
	{
	  ar[i]=new Scanner(System.in).nextInt();
	}
    int maxv=max(ar);
	System.out.println("Maximum value in the array is - "+maxv);
  }
}