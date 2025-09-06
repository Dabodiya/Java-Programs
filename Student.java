interface Person
{
   String str="Hello";
  public void getName();
  public void setName();
}
class Student implements Person
{
	//String str;
	public void getName()
	{
		System.out.println(Person.str);
	}
	public void setName()
	{
		//Person.str="Himanshu";
		System.out.println("Welcome to Java's world");
		//str="k";
		System.out.println(str);
    }
   public static void main(String... k)
   {
      Person p=new Student();
      p.getName();
      p.setName();
	  
   }
}   