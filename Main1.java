

interface Sayable
{
	public void myName(String name);
}
class Main1
{
	public static void main(String... kpl)
	{
	Sayable s=(naam)->{ 
	          System.out.println("Hello "+naam);
	};
	System.out.println(s.myName("Anirudh"));
	Sayable s1=naam->{ 
	       System.out.println("Hey "+naam);
	};
	System.out.println(s1.myName("Deepak"));
   }
}   
	