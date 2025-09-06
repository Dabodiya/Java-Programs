//Write a function to check if a given number is a prime number

class MyTest1
{
     
public static void primeCheck()
{
   int num, flag=0;
   System.out.print("Enter a number to check prime - ");
   num=new java.util.Scanner(System.in).nextInt();
   int countVowels=0, countConsonants=0, countDigits=0;
   if(num!=0 && num>1)
   {
      for(int i=2;i<=num/2;i++)
	  {
	    if(num%i==0)
		{
		   flag=1;
		}
	  }
	  if(flag==0)
	  {
	    System.out.println("The number "+ num + " is Prime");
	  }
	  else{
	     System.out.println("The number "+ num + " is Not Prime");
	  }
   }
   else if(num==1)
   {
	   System.out.println("The number "+ num + " is 1");
   }
}
  public static void main(String... feuhg)
{
    primeCheck();
}  

}

