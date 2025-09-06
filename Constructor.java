 class Constructor
{
  int x;
  int y;
  Constructor()
  {
   x=29;
   y=89;
  }
  void show()
  {
    System.out.println(x);
	System.out.println(y);
  }
  public static void main(String... v)
  {
    Constructor c=new Constructor();
	c.show();
	Constructor c1=new Constructor();
	c1.show();
  }
}