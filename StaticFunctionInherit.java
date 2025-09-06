class Base
{
  static void show()
  {
    System.out.println("Hello");
  }
}
class StaticFunctionInherit extends Base
{
  static void show()
  {
    System.out.println("Hyyyyyy");
  }
  public static void main(String[] h)
  {
    Base b=new StaticFunctionInherit();
	b.show();
	StaticFunctionInherit sfi=(StaticFunctionInherit)b;
	sfi.show();
	Base.show();
  }
}