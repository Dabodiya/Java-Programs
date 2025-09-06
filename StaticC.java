class StaticC
{
  static int a;
  static 
  {
    System.out.println("Static Block");
	a=new java.util.Scanner(System.in).nextInt();
  }
}
  class StaticTest1
  {
    public static void main(String... d)
	{
	  System.out.println("main from statictest1");
	  System.out.println(StaticC.a);
	  System.out.println("After static block from statictest1");
	}
  }
  class StaticTest2
  {
    public static void main(String... b)
	{
	  System.out.println("Main from statictest2");
	  System.out.println(StaticC.a);
	  System.out.println("After static block from Statictest2");
	}
  }