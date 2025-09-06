class StrFreq
{
   public static void main(String... fdg)
   {
      StringBuilder str=new StringBuilder("Himanshu Dabodiya");
	  int []freq=new int[str.length()];
	  for(int i=0;i<str.length();i++)
	  {
		  freq[i]=1;
		 for(int j=i+1;j<str.length();j++)
		 {
			 if(str.charAt(i)==str.charAt(j))
			 {
				 freq[i]++;
				 str.setCharAt(j,'0');
			 }
			 
		 }
	  }
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)!=' ' && str.charAt(i)!='0')
		  {
			  System.out.println(str.charAt(i)+"-"+freq[i]);
		  }
	  }
   }
}