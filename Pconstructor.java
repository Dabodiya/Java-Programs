class Pconstructor
{
  int x;
  int y;
  Pconstructor(int x,int y)
  {
    this.x=x;
	this.y=y;
  }
  void show()
  {
    System.out.println(x);
	System.out.println(y);
  }
   public static void main(String... u)
   {
     Pconstructor pc=new Pconstructor(10,20);
	 pc.show();
	 Pconstructor pc1=new Pconstructor(101,201);
	 pc1.show();
   }
}