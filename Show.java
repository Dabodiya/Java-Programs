class Show
{
  void show(byte b)
  {
    System.out.println("Show from Byte");
  }
  void show(long l)
  {
    System.out.println("Show from Long");
  }
  
  public static void main(String... s)
  {
	Show sn=new Show();
    sn.show(10);
  }
}
