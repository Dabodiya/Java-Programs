interface Interface1
{
  int a=9;
  void display();
  public static void hello()
  {
    System.out.println("Hey Ji");
  }
}
  class LPU implements Interface1
  {
	  public void printing()
	  {
		    System.out.println("Bye");
	  }
	  public void display()
	  {
		   System.out.println("Bye");
      }
    public static void main(String... g)
	{
	  Interface1 l=new LPU();
	  l.display();
	    System.out.println(l.a);
		Interface1.hello();
	}
  }
	  