class ArrEleEndtoStart
{
   public static void main(String... hjds)
   {
     int[] arr=new int[7];
	 System.out.print("Enter the array - ");
	 for(int i=0;i<7;i++)
	 {
		 arr[i]=new java.util.Scanner(System.in).nextInt();
	 }
	 System.out.print("Enter a number less than 7 - ");
	 int rn=new java.util.Scanner(System.in).nextInt();
	 int[] narr=new int[rn];
	 for(int i=0;i<rn;i++)
	 {
		 narr[i]=arr[arr.length-rn+i];
	 }
	 int c=1;
	 for(int i=arr.length-rn-1;i>=0;i--)
	 {
		arr[arr.length-c]=arr[i];
        c++;		
	 }
	 for(int i=0;i<rn;i++)
	 {
		 arr[i]=narr[i];
	 }
	 for(int i=0;i<7;i++)
	 {
		 System.out.println(arr[i]);
	 }
   }
}