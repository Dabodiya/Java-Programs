class ArrayEx
{
  public static void main(String... ihiu)
  {
    //int size;
	//System.out.println("Enter the size of the array");
    //size=new java.util.Scanner(System.in).nextInt();
	//int[] a=new int[size];
      int a[][]={{2,3,4},
	         {4,7,8},
			 {9,0,1}};
	/*System.out.println("Enter the elements of the arrays - ");
	for(int i=0;i<size;i++)
	{
	  a[i]=new java.util.Scanner(System.in).nextInt();
	}*/
    System.out.println("Now array is - ");
    for(int i=0;i<a.length;i++)
    {
		for(int j=0;j<a.length;j++)
		{
	     System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
  }
}
	