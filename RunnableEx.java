
class RunnableEx implements Runnable
{
   public void run()
   {
      System.out.println("Hello Buddy");
   }
   public static void main(String... jhjbjh)
   {
     RunnableEx re=new RunnableEx();
	 Thread t=new Thread(re);
	 t.start();
   }
}   