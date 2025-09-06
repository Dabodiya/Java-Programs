class BasicThis1
{
  int x=90;
  void show(int x,BasicThis1 z)
  {
   System.out.println(x);
   System.out.println(z.x);
  }
  public static void main(String[] l)
  {
    BasicThis1 bt1=new BasicThis1();
	bt1.show(21,bt1);
	bt1.show(1,bt1);
  }
}