class MyArrEleNum
{
	public static void main(String... fdg)
	{
		int arr[];
		arr=new int[]{2,3,4,5,8};
		int []arrc=new int[arr[0]];
		int k=0,l=0;
		for(int i=0;i<arrc.length;i++)
		{
              arrc[i]=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i>arr.length-arrc.length)
			{
                  arr[i]=arrc[k];
				  k++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
		  System.out.println(arr[i]);
		}
	}
}
