class StringArr
{
   public static void main(String... fds)
   {
     String arr[]={"My"," Name"," is", " Himanshu"," Dabodiya"};
	 int max=arr[0].length();
	 for(int i=0;i<arr.length;i++)
	 {
		if(arr[i].length()>max)
		{
			max=arr[i].length();
		}
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i].length()==max)
		 {
			 System.out.println(arr[i]);
		 }
	 }
   }
}