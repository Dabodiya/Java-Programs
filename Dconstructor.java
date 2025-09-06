class Dconstructor
{
  int x;
  int y;
  Dconstructor()
  {
    x=10;
	y=223;
  }
  void show()
  {
    System.out.println(x);
	System.out.println(y);
  }
  public static void main(String... j)
  {
    Dconstructor d=new Dconstructor();
	d.show();
	Dconstructor d1=new Dconstructor();
	d1.show();
  }
}