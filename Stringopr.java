class Stringopr
{
 public static void main(String... bfd)
 {
   char[] str={'H','i','m','a','n','s','h','u'};
   //new char[8];
   System.out.println("Enter a number less then "+str.length+" - ");
   int num=new java.util.Scanner(System.in).nextInt();
   char[] copy=new char[num];
   int c=0;
   for(int i=str.length-num;i<str.length;i++)
   {
	    copy[c]=str[i];
		c++;
   }
   for(int i=0;i<copy.length;i++)
	   System.out.print(copy[i]);
   c=0;
   for(int i=str.length-1;i>=num-1;i--)
   {
	   str[str.length-1-c]=str[i];
   }
 }
}