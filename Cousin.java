class Base 
{
  int x=50;
  void show()
  {
    System.out.println("Show");
  }
}
  class Cousin extends Base
  {
    int x=20;
	void show()
	{
	 System.out.println("Cousin");
	 super.show();
	}
	void display()
	{
	  System.out.println("Display");
	}
	public static void main(String... l)
	{
	  Base b=new Cousin(); //Upcasting
      b.show();
      Cousin c=(Cousin)b; //downcasting
	  c.display();
	  System.out.println(b.x);
	  System.out.println(c.x); 
	}
}