class ThreadSleep1 extends Thread
{
  public void run()
  {
	  int i;
     for(i=1;i<=5;i++)
	 {
	   try
	   {
	   Thread.sleep(500);
	   }
	   catch(Exception e)
	   {
	     System.out.println(e);
	   }
	   System.out.println(i);
	  }
}
  public static void main(String... edfgywe)
  {
     ThreadSleep1 ts1=new ThreadSleep1();
	 ThreadSleep1 ts2=new ThreadSleep1();
	 ts1.start();
	 try{
	 ts1.join(100);
	 //ts1.sleep(4000);
	 }
	 catch(Exception e)
	 {
	 System.out.println(e);}
	 //ts12.start();
	 ts2.start();
  }
}
	  