class CheckStr
{
	public static void main(String... g)
	{
		String str="Hello 45World12312fgsd3q4";
		int c=0,d=0,p=0;
		char ar[];
		int arr[];
		ar=new char[str.length()];
		arr=new int[str.length()];
	   for(int i=0;i<str.length();i++)
	   {
		   if(str.charAt(i)==' ')
		   {
			   c++;
		   }
		   else if(Character.isDigit(str.charAt(i)))
		   {
			   ar[d]=str.charAt(i);
			   d++;
		   }
		   else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
		   {
			   p++;
		   }
	   }
	   System.out.println("No of spaces "+c+" and Capital Letters"+p);
	   for(int i=0;i<d;i++)
	   {
		   System.out.print(ar[i]);
		   arr[i]=ar[i];
	   }
	}
}
