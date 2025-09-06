
class StringCount
{
  public static void main(String... djbuy) 
  {
    String s="jhh87132y487h";
    int i,j,c=0;  
		for(j=0;j<=9;j++)
		{
			for(i=0;i<s.length();i++)
	        {
			 if(j==s.charAt(i))
			 {
				c++;
			 }
		    }
		 System.out.println(c);
		 c=0;
	    }
}
}
