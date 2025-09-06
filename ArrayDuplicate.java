class ArrayDuplicate
{
  public static void main(String kl[])
  {
    int arr[];
	arr=new int[8];
	System.out.println("Enter the elements");
	for(int i : arr)
	{
	   arr[i]=new java.util.Scanner(System.in).nextInt();
	}
	int freq[],visited=-1;
	freq=new int[arr.length];
	System.out.println("Now checking the frequency of each element in array - ");
	for(int i=0; i<arr.length; i++)
	{
		 int count=1;
		for(int j=i+1; j<arr.length; j++)
		{
		  if(arr[i]==arr[j])
		  {
 			count++;
		  }
		  freq[j]=visited;
		}
		if(freq[i]!=visited)
		{
			freq[i]=count;
		}
	}
	for(int i=0; i<arr.length; i++)
	{
		if(freq[i]!=visited)
		System.out.println(arr[i]+" is "+freq[i]+"times.");
	}
  }
}