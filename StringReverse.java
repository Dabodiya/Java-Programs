class StringReverse
{
   public static void main(String... hsfdg)
   {
     StringBuilder string=new StringBuilder(new java.util.Scanner(System.in).nextLine());
	 char cpch;
	 for(int i=0;i<string.length()/2;i++)
	 {
	     cpch=string.charAt(i);
		 string.setCharAt(i,string.charAt(string.length()-i-1));
		 string.setCharAt(string.length()-i-1,cpch);
	 }
	 System.out.println(string);
   }
}