class Twod
{
  public static void main(String... g)
  {
    int a[][]={{9,7,5},
		      {3,3,2},
	{2,4,5}};
	int b[][]={{2,3,8},
		{5,8,1},
	{8,1,3}};
	int[][] sum=new int[5][5];
	System.out.println("Your 2d array is - ");
	for(int i=0;i<a.length;i++)
	{
	  for(int j=0;j<a[i].length;j++)
	  {
	   sum[i][j]=a[i][j]+b[i][j];
	  }
	}
	for(int i=0;i<a.length;i++)
	{
	  for(int j=0;j<a[i].length;j++)
	  {
	   System.out.print(" "+sum[i][j]);
	  }
	   System.out.println();
	}
   }
}