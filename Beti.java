//error
class Base
{
  void show()
  {
    System.out.println("Base");
  }
}
class Beti extends Base
{
  int show()
  {
    System.out.println("Child");
	return 10;
  }
  public static void main(String... g)
  {
   Beti b=new Beti();
   b.show();
  }
}