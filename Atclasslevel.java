class Atclasslevel
{
  int x=2;
  int y=5;
  void show()
  {
   System.out.println(x);
   System.out.println(y);
  }
  public static void main(String... f)
  {
    Atclasslevel acl=new Atclasslevel();
	acl.show();
	Atclasslevel acl2=new Atclasslevel();
	acl.show();
  }
}
  