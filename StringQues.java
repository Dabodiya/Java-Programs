class StringQues
{
  public static void main(String... djhcxb)
  {
    String str;
	int c=0;
	char ar[];
	System.out.println("Enter a line - ");
	str=new java.util.Scanner(System.in).nextLine();
    /*for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)>=48 && str.charAt(i)<=57)
			c++;
	}
	System.out.println(c);*/
	ar=new char[str.length()];
	for(int i=0;i<str.length();i++)
	{
		ar[i]=str.charAt(i);
		if(ar[i]!=' ')
		{
			System.out.print(ar[i]);
		}
		else
			break;
		
	}
  }
}  
  