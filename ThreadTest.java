class ThreadTest implements Runnable
{
  public void run()
  {
	  System.out.println("run method is running...");
  }
  public static void main(String... khjbfd)
  {
	   ThreadTest obj=new ThreadTest();
	   Thread th=new Thread(obj);
	   th.start();
  }
}