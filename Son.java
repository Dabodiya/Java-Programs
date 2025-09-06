class Dadaji
{ 
  int x=10;
}
  class Papa extends Dadaji
  {
   int x=20;
  }
  class Son extends Papa
  {
    int x=4;
	void show()
	{
	   System.out.println(x);
	   System.out.println(((Dadaji)this).x);
	   System.out.println(((Papa)this).x);
	}
	public static void main(String... p)
	{
	  Son s=new Son();
	  s.show();
	}
}