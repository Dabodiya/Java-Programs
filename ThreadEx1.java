class ThreadEx1 extends Thread
{
   public void run()
   {
     System.out.println("let's learn counting 10");
	 for(int i=1;i<=10;i++)
	 {
	   System.out.println(i);
	  }
	}
	public static void main(String... hjhjh)
	{
	   ThreadEx1 the=new ThreadEx1();
	   the.start();
	}
}