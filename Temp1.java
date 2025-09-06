class Temp1
{
  void show(byte b)
  {
   System.out.println("Hello from Byte");
  }
  void show(int i)
  {
    System.out.println("Welcome to Int");
  }
  void show(long l)
  {
    System.out.println("Tank you Long");
  }
  public static void main(String... s)
  {
   int i1=80;
   byte b1=90;
   long l1=70;
   Temp1 t1=new Temp1();
   t1.show(b1);
   t1.show(l1);
   t1.show(i1);
  }
}