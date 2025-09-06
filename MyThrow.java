/*class InvalidAge extends Exception
{
	InvalidAge(String str)
	{
		super(str);
	}
}*/
class MyThrow 
{
	
  public static void main(String... dsf)
  {
    int age;
	System.out.print("Enter your age - ");
	age=new java.util.Scanner(System.in).nextInt();
	try{
	if(age<18)
	{
		throw new Exception("You can't vote");
	}
	else
	{
		System.out.print("Your vote is too important");
	}
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
  }
}