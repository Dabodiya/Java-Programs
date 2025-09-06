class Copyconstructor
{
  int x;
  int y;
  Copyconstructor(int x,int y)
  {
    this.x=x;
	this.y=y;
  }
  void show()
  {
    System.out.println(x);
	System.out.println(y);
  }
  Copyconstructor(Copyconstructor c)
  {
    this.x=c.x;
	this.y=c.y;
  }
  public static void main(String... k)
  {
    Copyconstructor cc=new Copyconstructor(23,67);
    cc.show();
    Copyconstructor cc1=new Copyconstructor(cc);
	cc1.show();
  }
}