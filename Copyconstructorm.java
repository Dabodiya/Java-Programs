class Copyconstructorm
{
  int x;
  int y;
  Copyconstructorm(int x,int y)
  {
    this.x=x;
	this.y=y;
  }
  Copyconstructorm(Copyconstructorm cc)
  {
    x=cc.x;
	y=cc.y;
  }
  void show()
  {
   System.out.println(x);
   System.out.println(y);
  }
   public static void main(String... m)
   {
     Copyconstructorm cc1=new Copyconstructorm(10,20);
	 cc1.show();
	 Copyconstructorm cc2=new Copyconstructorm(cc1);
	 cc2.show();
   }
}