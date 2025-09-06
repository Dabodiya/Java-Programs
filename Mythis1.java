class Mythis1
{
  int x=100;
  void get(Mythis1 this,int x)
  {
    System.out.println(this+"getjajaja");
	System.out.println(this.x);
	System.out.println(x);
  }
  public static void main(String... k)
  {
    Mythis1 mt1=new Mythis1();
    System.out.println(mt1+"main");
	mt1.get(25);
  }
}