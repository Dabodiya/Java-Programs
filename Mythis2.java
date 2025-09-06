class Mythis2
{
  int x=10;
  void get(int x, Mythis2 m)
  {
    System.out.println(x);
	System.out.println(m.x);
  }
  public static void main(String... n)
  {
   Mythis2 mt2=new Mythis2();
   System.out.println(mt2.x);
   mt2.get(20,mt2);
  }
}