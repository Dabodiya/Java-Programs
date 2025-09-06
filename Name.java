class Name
{
  public static void main(String... h)
  {
    String name,midname,lstname;
	System.out.println("Enter Your first name - ");
	name=new java.util.Scanner(System.in).nextLine();
	System.out.println("Enter Your mid name - ");
	midname=new java.util.Scanner(System.in).nextLine();
	System.out.println("Enter Your last name - ");
	lstname=new java.util.Scanner(System.in).nextLine();
	System.out.println("First name is - "+name);
	System.out.println("Middle name is - "+midname);
	System.out.println("Last name is - "+lstname);
	System.out.println("\tNow concatination with + operator ");
	System.out.println("your full name is with + - "+name+" "+midname+" "+lstname);
	System.out.println("Now concatination with + operator ");
	System.out.println("\tNow your full name with concat method");
	name=name.concat(" ");
	name=name.concat(midname);
	name=name.concat(" ");
	name=name.concat(lstname);
	System.out.println("Now your full name is name - "+name);
	System.out.println("Now Upper case is - ");
	System.out.println(name.toUpperCase());
	String rplacestring = name.replace(' ','-');
	System.out.println("Now replace string is - "+rplacestring);
  }
}