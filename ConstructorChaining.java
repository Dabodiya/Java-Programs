class ConstructorChaining
{
  ConstructorChaining()
  {
    this(10);
	System.out.println("Default");
  }
  ConstructorChaining(int x)
  {
    this(67,41);
	System.out.println("One Parameter");
  }
  ConstructorChaining(int a,int b)
  {
    System.out.println("Two parameters");
	System.out.println(a);
	System.out.println(b);
  }
  public static void main(String... s)
  {
    new ConstructorChaining();
	new ConstructorChaining(20);
	new ConstructorChaining(78,32);
  }
}