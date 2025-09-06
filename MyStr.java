class MyStr
{
   public static void main(String args[])
   {
	   String str="Hello World";
	   for(char i=0;i<str.length();i++)
	   {
		   if(str.charAt(i)==' ')
		   {
			   c++;
		   }
		   else
			   System.out.println(str.charAt(i));
	   }
   }
}
class CheckStr
{
	public static void main(String... g)
	{
		String str="Hello 45World12312fgsd3q4";
		int c=0,d=0;
	   for(int i=0;i<str.length();i++)
	   {
		   if(str.charAt(i)==' ')
		   {
			   c++;
		   }
		   else if(str.charAt(i)isDigit())
			   d++;
	   }
	   System.out.println(c+" and "+d);
	}
}
