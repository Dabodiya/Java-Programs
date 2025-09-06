class Initialization
{
  int x=40;
  int y=59;
  Initialization()
  {
    System.out.println("Default");
  }
  Initialization(int a)
  {
    System.out.println(a);
  }
  void show()
  {
   System.out.println(x);
   System.out.println(y);
  }
    public static void main(String... g)
	{
	  Initialization i=new Initialization();
	  i.show();
	  Initialization i1=new Initialization(23);
	  i1.show();
	}
}