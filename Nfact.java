class Nfact
{
   public static void main(String... args)
   {
     int n;
	 System.out.println("Enter the size of Array - ");
	 n=new java.util.Scanner(System.in).nextInt();
	 int[] a=new int[n];
	 System.out.println(" - Enter the elements - ");
	 for(int i=0;i<n;i++)
	 {
		 a[i]=new java.util.Scanner(System.in).nextInt();
	 }
	 int fact=1,k=1;
	 for(int i=0;i<n;i++)
	 { 
		while(k<=a[i])
		{
          fact=fact*k;
          k++;
        }
		System.out.println(fact);
		k=1;
		fact=1;
     }	
   }
}   