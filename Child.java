class Base
{
  private int x=10;
  void show()
  {
   System.out.println("value of x is - "+x);
  }
}
class PrivateChild extends Base
{
  
  public static void main(String... l)
  {
    PrivateChild pc=new PrivateChild();
	pc.show();
	//System.out.println(pc.x); //error because we cannot call private things directly via child object
  }
}
  
