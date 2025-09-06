class ViaMethod
{
  int x=this.getx();
  int getx()
  {
    System.out.println(x);
	return 20;
  }
  ViaMethod()
  {
    //x=0;
	//x=getx();
	System.out.println(x);
  }
  public static void main(String... v)
  {
   new ViaMethod();
  }
}