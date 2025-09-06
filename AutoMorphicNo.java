class AutoMorphicNo
{
 static boolean automorphic(int a)
 {
   int sq,count=0;
   sq=a*a;
   while(a!=0)
   {
	if(a%10!=sq%10)
	{
		return false;
	}
	 a=a/10;
	 sq=sq/10;
   }
   return true;
 }
  public static void main(String... ar)
  {
    int n;
	System.out.print("Enter a number - ");
	n=new java.util.Scanner(System.in).nextInt();
	System.out.println(automorphic(n)?"Automorphic":"Not Automorphic");
  }
}