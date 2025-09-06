class Fibbo
{
  public static void main(String... bhfd)
  {
    int x=0,y=1;
	int n,c=3,temp;
	n=new java.util.Scanner(System.in).nextInt();
	System.out.println(x);
	System.out.println(y);
	while(c<=n)
	{
	  temp=x+y;	
	  x=y;
	  y=temp;
	  c++;
	   System.out.println(temp);
	}
  }
}