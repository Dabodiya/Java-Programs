class Returntype
{
  static void show(char c)
  {
    System.out.println("no return type");
  }
  static int show(int z)
  {
    System.out.println("With returntype");
	return z;
  }
  public static void main(String[] j)
  {
    show('o');
	//show(200);
	int a=show(10);
	System.out.println(a);
   }
}