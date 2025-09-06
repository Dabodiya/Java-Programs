class SecondLar
{
	public static void main(String... v)
	{
		System.out.println("Enter how many number u want to input - ");
		int n=new java.util.Scanner(System.in).nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new java.util.Scanner(System.in).nextInt();
		}
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
			  max=a[i];
			}
		}
		int smax=a[0];
		for(int i=0;i<n;i++)
		{
			if(smax<a[i] && a[i]<max)
			{
			  smax=a[i];
			}
		}
		System.out.println("Second Largest Value is - "+smax);
	}
}