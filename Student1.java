interface Person
{
   public void setAge();
   public void getAge();
}
class Student2 extends Student1
{
	public void setNam()
	{
		System.out.println("Bye Class over");
	}
}
class Student1 implements Person
{
   public void setAge()
   {
     System.out.println("HELLO THIS IS SET_AGE METHOD");
   }
   public void getAge()
   {
     System.out.println(" - - - Hii GET_AGE METHOD - - - ");
   }
   public static void main(String... jkjl)
   {
     Person p=new Student1();
	 p.setAge();
	 p.getAge();
	 Student1 p1=new Student1();
	 p1.setAge();
	 p1.getAge(); 
	 Person p2=new Student2();
     p2.setAge();
     p2.getAge();
     p2.setNam();	 
	}
}
