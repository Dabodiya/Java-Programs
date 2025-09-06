class IntroStatic
{
  static int x;
  static 
  {
    x=new java.util.Scanner(System.in).nextInt();
    System.out.println(x);
  }
  public static void main(String... s)
  {
    System.out.println("main");
  }
}

class IntroStatic1
{
	 public static void main(String... s)
	 {
		  System.out.println(IntroStatic.x);
		  IntroStatic.x=40;
		  System.out.println(IntroStatic.x);
     }
}