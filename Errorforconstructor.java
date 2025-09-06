 // error for constructor	
class Errorforconstructor
{
  void show()
  {
    System.out.println("show");
  }
  Errorforconstructor(int x)
  {
    System.out.println(x);
  }
  public static void main(String... h)
  {
    Errorforconstructor e=new Errorforconstructor();
	e.show();
  }
}
  