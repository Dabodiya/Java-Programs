abstract class Base
{
  int x=10;
  int y=90;
  void show() 
  {
   System.out.println("show from abstract");
  }
  abstract void display();
}
class AbstractTrail extends Base
{
  void show()
  {
    System.out.println("Show from child"); // if show() is overriden in child then always execute child's otherwise parent
  }
  public static void main(String... fg)
  {
    AbstractTrail at=new AbstractTrail();
	Base b=new AbstractTrail();
	at.show();
	b.show();
	b.display();
	at.display();
  }
  void display()
  {
    System.out.println("Display ");
  }
}
  