class StringEx
{
   public static void main(String... jhdsfj)
   {
      String str;
	  str=new java.util.Scanner(System.in).next();
	  char ch[];
	  int k=0;
	  ch=new char[15];
	  if(str.length()<=15)
	  {
	     for(int i=0;i<str.length();i++)
		 {
		    if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
			   ch[k]=str.charAt(i);
			   k++;
			}
		 }
		 for(int i=0;i<k;i++)
		 {
			 System.out.println(ch[i]);
		 }
	  }
	  else
	  {
		  System.out.println("Please enter a 15 character string");
	  }
	  
   }
}