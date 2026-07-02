import java.util.Scanner;
class DigitTraingle
{
	public static void main(String... gar)
	{
	int n;
	n= new Scanner(System.in).nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n-1; j++)
			{
				System.out.print(" ");
			}
		for(int k=i; k<=(i*2)-1; k++)
		{
			System.out.print(k);
		}
		for(int l=(i*2)-2; l>=i; l--)
		{
			System.out.print(l);
		}
		System.out.println();
		}
	}
}