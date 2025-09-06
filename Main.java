class ParentPractice extends Thread
{
  //static int n=9;
  public void run()
  {
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println(i);
		  try
		  {
		    Thread.sleep(500);
			System.out.println(Thread.currentThread());
		  }
		  catch(Exception e)
		  {
			System.out.println(e);
		  }
	  }
  }
  public static void main(String... jkl)
  {
	//System.out.println(n);
	ParentPractice t1=new ParentPractice();
	ParentPractice t2=new ParentPractice();
	t1.start();
	t2.start();
  }
}

 class Main implements Runnable
 {
	 public void run()
	 {
		 System.out.println("Hello ");
		 System.out.println(Thread.currentThread());
	 }
	 public static void display()
	 {
		 
		 Main m=new Main();
		 Thread th=new Thread(m,"Himanshu");
		 th.start();
	 }
	 public static void main(String... ags)
	 {
		 display();
	 }
 } 