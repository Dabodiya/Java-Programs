class InitializationasFunctioncalling
{
  int x=getx();
  int getx()
  {
   System.out.println(x);
   return 2;
  }
  InitializationasFunctioncalling()
  {
   //x=getx(); //implicit this is happening
   System.out.println(x);
  }
  public static void main(String... b)
  {
    new InitializationasFunctioncalling();
  }
}
   