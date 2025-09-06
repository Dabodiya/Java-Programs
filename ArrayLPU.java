class ArrayLPU
{
  public static void main(String... k)
  {
	int a[]={10,45,78,23,56};
	int sum=0;
	int[] b=a;
	b[4]--;
	System.out.println("Our array is - ");
	for(int i:b)
	{
		System.out.println(i);
	}
	System.out.println("The sum of elements is - "+sum);
  }
}