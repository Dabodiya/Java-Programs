class ComArrMulti
{
   public static void multiofarr(int arr[], int n)
   {
	   int mult;
	   int arr2[]=new int[n];
	   System.out.println(" -- Now resultant arrar calculation -- ");
      for(int i=0;i<n;i++)
	  {
		  mult=1;
		  for(int j=0;j<n;j++)
		  {
			  
			  if(i!=j)
			  {
				  mult=mult*arr[j];
			  }
		  }
		  arr2[i]=mult;
	  }
	  for(int i=0;i<n;i++)
	  {
		  System.out.println(arr2[i]);
	  }
   }
   public static void main(String... fhd)
   {
	 int arrr[]=new int[5];
	 System.out.println("Enter the array's elements - ");
	 for(int i=0;i<5;i++)
	 {
		 arrr[i]=new java.util.Scanner(System.in).nextInt();
	 }
	 multiofarr(arrr,5); 
   }
}