class Funover
{
  static void show()
  {
    System.out.println("Zero argument");
  }
   static void show(int x)
   {
     System.out.println("One aruguments");
   }
   static void show(int x,int y)
   {
     System.out.println("Two arguments");
    }
	static void show(long x,int y,int z)
	{
	  System.out.println("Three arguments");
	}
	public static void main(String[] o)
	{
	  show();
	  show(45,67,89);
	  show(34,23);
	  show(1);
	}
}
