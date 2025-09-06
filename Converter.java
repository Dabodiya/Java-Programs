class Converter
{
    public static void convert(int n)
	{
		int r,i=0,ar[],c=0;
		int n1=n;
		while(n!=0)
		{
			r=n%2;
			n=n/2;
			c++;
		}
		ar=new int[c];
		while(n1!=0)
		{
			r=n1%2;
			n1=n1/2;
			ar[i]=r;
			i++;
		}
		for(int j=c-1;j>=0;j--)
		{
			System.out.print(ar[j]);
		}
	}
	public static void main(String... jeduae)
	{
	  int n;
      n=new java.util.Scanner(System.in).nextInt();
      convert(n);	  
	}
}