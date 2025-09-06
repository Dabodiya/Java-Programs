class AtulComPat
{
   public static void main(String... dsaf)
   {
	   int arr[]={2,9,5,4,13,10,6,11};
	   int max=arr[0];
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]>max)
		   {
			   max=arr[i];
		   }
	   }
	   int temp=max;
	   System.out.println(max);
	   for(int i=0;i<max;i++)
	   {
		   for(int j=0;j<arr.length;j++)
		   {
			   if(arr[j]>=temp-i)
			   {
				   System.out.print("* ");
			   }
 		   }   
		   System.out.println();
	   }
   }
}