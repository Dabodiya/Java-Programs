class Base
{
  static int x;
  static 
  {
   x=90;
  }
  static void show()
  {
    System.out.println(x);
    System.out.println("Show from Base");
  }
}
class StaticInherit extends Base
{
  static int x;
  
  static void show()
  {
    System.out.println(x);
    System.out.println("From Child");
  }
  static 
  {
    x=20;
  }
  public static void main(String... ffg)
  {
	show();
	System.out.println(x);
  }
}
    
  
   