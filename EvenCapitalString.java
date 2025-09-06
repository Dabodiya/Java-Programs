class EvenCapitalString
{
  public static void main(String... atr)
  {
    String s="lovely professional university";
	//char[] ch=new char[];
	//ch=s;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(i%2==0)
		{
		 System.out.print(Character.toUpperCase(ch));
		}
		else
		{
			System.out.print(Character.toLowerCase(ch));
		}
	}
  }
}
