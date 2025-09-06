class Examly
{
  public static void main(String[] ar)
  {
    int n;
	int[] a=new int[4];
	System.out.println("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	for(int i=0;i<n;i++)
	{
	  a[i]=new java.util.Scanner(System.in).nextInt();
	}
	int max=a[0];
	int min=a[0]; 
	for(int i=0;i<n;i++)
	{
	  if(a[i]>max)
	  {
	    max=a[i];
	  }
	}
	System.out.print(max);
	for(int i=0;i<n-1;i++)
	{
	  if(	
   }
}