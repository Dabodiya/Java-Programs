//import java.lang.Math;
class BinToDec
{
    public static void convert(int n)
	{
		int n1=n;
		int c=0;
		while(n1!=0)
		{
			n1=n1/10;
			c++;
		}
		int ar[];
		ar=new int[c];
		int r,i=0,flag=0;
		while(n!=0)
		{
			r=n%10;
			if(r==0 || r==1)
		    {
			n=n/10;
			ar[i]=r;
			i++;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
		int num=0;
		for(int j=c-1;j>=0;j--)
		{
			num=num+ar[j]*(int)Math.pow(2,j);
		}
		System.out.println(num);
		}
		else
		{
			System.out.println("Wrong input");
		}
	}
	public static void main(String... jeduae)
	{
	  int n;
      n=new java.util.Scanner(System.in).nextInt();
      convert(n);	  
	}
}