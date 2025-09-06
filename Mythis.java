class Mythis
{
  int x=100;
  void get(Mythis this,int x)
  {
   System.out.println(this+"getjajaja");
   System.out.println(this.x);
   System.out.println(x);
  }
  public static void main(String[] g)
  {
    Mythis mt=new Mythis();
	System.out.println(mt+"main");
	mt.get(300);
  }
}