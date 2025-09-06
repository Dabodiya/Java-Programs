class MinArr
{
  public static void main(String... p)
  {
     int n[][]={{5,6,7},
	              {-9,2,6},
				  {5,3,8}};
	int min=n[0][0];
	 for(int i=0;i<3;i++)
	 {
		for(int j=0;j<n[i].length;j++)
		{
			if(min>n[i][j])
			{
				
				min=n[i][j];
			}
		}
	 }
		System.out.println("Smallest Element in matrix is - "+min);
  }
}
		