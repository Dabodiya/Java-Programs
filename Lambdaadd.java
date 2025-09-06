interface addable
{
	public int add(int a,int b,int c);
}
class Lambdaadd
{
	public static void main(String... hjhjg)
	{
		addable a=(x,y,z)->(x*y*z);
		System.out.println(a.add(10,60,2));
		addable a1=(x,y,z)->(x*y*z);
		System.out.println(a1.add(50,600,3));
	}
}
