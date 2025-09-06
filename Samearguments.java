class Samearguments
{
  static void show(int x,long f)
  {
    System.out.println("int Long");
  }
  static void show(long x,int z)
  {
    System.out.println("Long Int arguments");
  }
  public static void main(String[] l)
  {
   //show(10,100L); //int Long
   //show(20L,20); //Long int
   show(10,10);  //error
  }
}
