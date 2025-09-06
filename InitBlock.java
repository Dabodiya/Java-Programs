class InitBlock
{
  int x;
  {
   System.out.println("init block");
   this.x=10;
  }
  InitBlock()
  {
    System.out.println("Default");
	System.out.println(x);
  }
  {
    System.out.println("Second");
  }
  InitBlock(int x)
  {
    System.out.println(x);
  }
  public static void main(String... v)
  {
    new InitBlock();
	new InitBlock(34);
	new InitBlock();
  }
}