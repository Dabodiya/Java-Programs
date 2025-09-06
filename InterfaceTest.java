interface InterFace
{
   int  n=10,m=5;
   public static void hello()
   {
      System.out.println("Hello From Interface");
   }
}
class InterfaceTest implements InterFace
{
   public static void main(String... hjkgfd)
   {
    InterFace face=new InterfaceTest();
	System.out.println(face.n);
	InterFace.hello();
   }
}