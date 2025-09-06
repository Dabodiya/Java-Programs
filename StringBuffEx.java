class StringBuffEx
{
  public static void main(String... args)
  {
    StringBuffer str=new StringBuffer("Himanshu");
	System.out.println(str.append(" Dabodiya"));
	System.out.println(str.length());
	System.out.println(str.capacity());
	System.out.println(str.charAt(9));
	System.out.println(str.delete(10,14));
	System.out.println(str.deleteCharAt(9));
	System.out.println(str.insert(9,"Ji"));
	System.out.println(str.replace(9,11,"Kumar"));
	System.out.println(str.reverse());
  }
}