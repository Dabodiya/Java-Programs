class ThreadSleep extends Thread
{
  public void run()
  {
    for(int i=0;i<=5;i++)
	{
	  System.out.println(i);
	  try{
	  Thread.sleep(60);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	}
  }
  public static void main(String... gghv)
  {
    ThreadSleep ts1=new ThreadSleep();
    ThreadSleep ts2=new ThreadSleep();
	ts1.start();
	ts2.start();
  }
}