class HCF
{
  public static void main(String[] i)
  {
    int n1,n2,h=0;
	System.out.println("Enter first number -");
	n1=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter second number -");
	n2=new java.util.Scanner(System.in).nextInt();
	for(int j=2;j<n1&&j<n2;j++)
	{
	  if(n1%j==0&&n2%j==0&&j>h)
	  {
	   h=j;
	  }
    }    
	if(n1%n2!=0&&n2%n1!=0)
	{
	 System.out.println("Hcf of "+n1+" & "+n2+" is -" +h);
	}
	else if(n1%n2==0)
	{
     System.out.println("Hcf of "+n1+" & "+n2+" is -" +n2);
	}
	else if(n2%n1==0)
	{
	 System.out.println("Hcf of "+n1+" & "+n2+" is -" +n1);
	}
	if(h==0)
	 System.out.println("No Hcf Found");
  }
}