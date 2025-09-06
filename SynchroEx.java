class MyThread1 extends Thread
{
	Table t;
   MyThread1(Table obj)
   {
     t=obj;
   }
   public void run()
   {
      t.printTable(50);
	}
}
class MyThread2 extends Thread
{
	Table t1;
  MyThread2(Table obj)
   {
     t1=obj;
   }
   public void run()
   {
      t1.printTable(5);
	}
}
class Table
{
   public synchronized void printTable(int n)
   {
    for(int i=1;i<=5;i++)
    {
	   System.out.println(n*i);
	   try
	   {
	     Thread.sleep(2000);
	   }
	   catch(Exception e)
	   {
	     System.out.println(e);
	   }
	 }
	}
}
class SynchroEx extends Thread
{
   public static void main(String... dhhfj)
   {
	   Table t=new Table();
     MyThread1 mt1=new MyThread1(t);
     MyThread2 mt2=new MyThread2(t);
	 mt1.start();
	 mt2.start();
   }
}