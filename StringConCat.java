class StringConCat
{
  public static void main(String... fdj)
  {
    String s="one";
	//System.out.println(new StringBuilder(s).append("two"));
    StringBuilder b1=new StringBuilder(s).append("two");
	System.out.println(b1);
  }
}