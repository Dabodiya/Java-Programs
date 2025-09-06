interface Inter
{
	
}	
class Parent implements Inter 
{
   public void greet()
   {
      System.out.println("Hello Guys");
   }
}
class Child implements Inter
{
   public void call()
   { 
      System.out.println("Accuse me Please!");
   }
}
class Downcasting
{
   public static void main(String... uhfd)
   {
      Inter in=new Child();
	  if(in instanceof Parent)
	  {
		  Parent p=(Parent)in;
		  p.greet();
	  }
	  if(in instanceof Child)
	  {
		  Child ch=(Child)in;
		  ch.call();
	  }
   }
}