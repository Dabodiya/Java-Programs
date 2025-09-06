class SleepInMain extends Thread
{
  public void run()
  {
	   System.out.println("Hii");
	 
   }
   public static void main(String...  dsjkguy)
   {
	   new SleepInMain().start();
	   try
	   {
     Thread.sleep(5000);
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
     new SleepInMain().start();
   }
}   