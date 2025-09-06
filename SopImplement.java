class System1
{
	static Sop out1;
   static
   {
     out1=new Sop();
   }
}
class Sop
{
  public void printlv()
  {
     int a=9,b=1;
	 System.out.println(a+b);
  }
}
class SopImplement extends System1
{
   public static void main(String... vfdsd)
   {
      System1.out1.printlv();
   }
}
     