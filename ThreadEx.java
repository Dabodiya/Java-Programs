class ThreadEx extends Thread
{
  public static void main(String... hklkj)
  {
    Thread te=new ThreadEx();
	//String str="Kon Hai";
	//Thread t=new Thread(te);
	//System.out.println(str);
	System.out.println(Thread.currentThread());
	System.out.println(te.getName());
	te.start();
	System.out.println(te.getPriority());
  }
   public void run()
   {
     System.out.println("Himanshu");
	}
}
  