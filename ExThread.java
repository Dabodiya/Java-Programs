class ExThread extends Thread
{
  public void run()
  {
     System.out.println(getName());
  }
  public static void main(String... hg)
  {
     ExThread eh1=new ExThread();
	 ExThread eh2=new ExThread();
	 ExThread eh3=new ExThread();
	 eh1.setName("One");
	 eh2.setName("Two");
	 eh3.setName("Three");
	 eh1.setPriority(1);
	 eh2.setPriority(2);
	 eh2.setPriority(3);
	 eh1.start();
	 eh2.start();
	 eh3.start();
  }
}