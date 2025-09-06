class StaticBlock extends Exception
{
  static int i=12116055;
   static 
   {
	 String s=new java.util.Scanner(System.in).nextLine();
     System.out.println(i);
	 System.out.println(s);
   }
   StaticBlock(String str)
   {
	   super(str);
   }
   public static void main(String... hguywgyu)
   {
	   try
	   {
	     throw new StaticBlock("There is a Problem");
	   }
	   catch(StaticBlock sb)
	   {
		   System.out.println("Message");
		   System.out.println(sb.getMessage());
	   }
    }
}	
	