class MyString
{
  public static void main(String... k)
  {
    String obj=new String();
	String str=" Hello";
	//str="Welcome";
	String str1="Bye";
	System.out.println("String first with charat-"+str.charAt(0));
	System.out.println("String 2nd with charat-"+str1.charAt(0));
    System.out.println("comareto method -"+str.compareTo(str1));
	System.out.println("concat method -"+str.concat(str1));
	System.out.println("equals method -"+str.equals(str1));
	System.out.println("indexOf method - "+str.indexOf('H',0));
	System.out.println("lastindexOf method - "+str.lastIndexOf("e"));
	System.out.println("length method - "+str.length());
	System.out.println("replace mthod - "+str.replace('l','R'));
	System.out.println("substring method - "+str.substring(1,4));
	System.out.println("trim method - "+str.trim());
	String s=str1.toUpperCase();
    System.out.println("toUPPER method - "+s);
  }
}