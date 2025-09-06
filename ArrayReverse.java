class ArrayReverse
{
  public static void main(String... fs)
  {
    int arr[],temp,n;
	System.out.println("Enter the length of the array - ");
	n=new java.util.Scanner(System.in).nextInt();
	arr=new int[n];
	System.out.println("Enter the array - ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=new java.util.Scanner(System.in).nextInt();
	}
	System.out.println("Now array Reversed - ");
	for(int j=0;j<arr.length/2;j++)
	{
	    temp=arr[arr.length-1-j];
		arr[arr.length-1-j]=arr[j];
		arr[j]=temp;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
  }   
}