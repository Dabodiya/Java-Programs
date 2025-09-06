class StringRev
{
   public static void main(String... hjg)
   {
	   System.out.println("Reverse a String");
      String str;
	  str=new java.util.Scanner(System.in).nextLine();
	  int len=str.length();
	  char[] ch=new char[len];
	  len-=1;
	  System.out.println(ch.length);
	  for(int i=0;i<str.length();i++)
	  {
		  ch[len]=str.charAt(i);
		  len--;
	  }
	  System.out.println("\n");
	  for(int i=0;i<ch.length;i++)
	  {
		  System.out.print(ch[i]);
	  }
	  System.out.println("\n");
	  char arr1[]=new char[str.length()];
	  for(int i=0;i<str.length();i++)
	  {
		  if(Character.isDigit(str.charAt(i)))
		  {
			  arr1[i]=str.charAt(i);
			  System.out.println(arr1[i]);
		  }
	  }
	  System.out.println("StringBuilder Reverse");
	  StringBuilder str1=new StringBuilder(new java.util.Scanner(System.in).nextLine());
	  System.out.println(str1.reverse());
	  System.out.println("Now array reverse");
	  int arr[];
	  arr=new int[5];
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=new java.util.Scanner(System.in).nextInt();
	  }		
     for(int i=arr.length-1;i>=0;i--)
	 {
		System.out.print(arr[i]); 
	 }		 
	}
}