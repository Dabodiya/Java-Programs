class BasicThis
{
  int x=10;
  void show(int x)
  {
   System.out.println(x);
   System.out.println(x);
  }
   public static void main(String[] o)
   {
     BasicThis bt=new BasicThis();
	 bt.show(27);
	 System.out.println(bt.x);
   }
}