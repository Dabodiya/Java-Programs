class Base 
{
  void show()
  {
    System.out.println("Base"); 
  }
}
  class Beta extends Base
  {
   void show()
   {
     System.out.println("Child");
	 super.show();
   }
   public static void main(String... k)
   {
     Beta c1=new Beta();
	 c1.show();
   }
}
   