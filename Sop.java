class My
{
  static Demo d;
  static
  {
    d=new Demo();
  }
}
class Demo
{
  void show()
  {
    System.out.println("Hello");
	System.out.println("Show from Demo");
  }
}
class Sop
{
  public static void main(String... c)
  {
    My.d.show();
  }
}
    