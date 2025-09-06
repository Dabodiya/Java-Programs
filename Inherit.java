class Test
{
	protected int a=9,b=8;
	private int k=3,l=9;
	private void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(k);
		System.out.println(l);
	}
	protected int add()
	{
		return a+b;
	}
}
class Inherit extends Test
{
	int x=1,y=2;
	private void show()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		//display();
	}
   public static void main(String... jkf)
   {
     Inherit i=new Inherit();	   
	 //i.display();
	 i.show();
	 System.out.println(i.add());
   }
}