class Base
{
  void show()
  {
    System.out.println("Show from Base");
  }
  static void display()
  {
    System.out.println("Display from base");
  }
  private void set()
  {
    System.out.println("Set From Base");
  }
}
class MethodInherit extends Base
{
  void show()
  {
    System.out.println("SHow from child");
  }
  static void display()
  {
    System.out.println("Display from Child");
  }
  private void set() 
  {
    System.out.println("Set from Child");
  }
  public static void main(String... kl)
  {
    MethodInherit b=new MethodInherit();
	Base b1=new MethodInherit();
	b1.show();
	b1.display();
	//b1.set(); //error both are private functions we can't inherit or access anyone in case of upcasting if upcasting is not done then execute child's set
	b.show();
	b.display(); // if both functions are static then priority goes to parent in case of upcasting other wise to child
	b.set(); 
  }
}