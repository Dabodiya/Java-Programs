class LargestDigit
{
  public static void main(String... cjvzz)
  {
	System.out.print("Enter a number - ");
	int n=new java.util.Scanner(System.in).nextInt();
	int org=n,c=0;
	while(n!=0)
	{
		n=n/10;
		c++;
	}
    int[] arr=new int[c];
	int r,j=arr.length-1;
	while(org!=0)
	{
		arr[j]=org%10;
		org=org/10;
		j--;
	}
	int lar=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(lar<arr[i])
		{
			lar=arr[i];
		}
	}
	int min=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
	System.out.println("The largest digit is - "+lar);
	System.out.println("The smallest digit is - "+min);
  }
}