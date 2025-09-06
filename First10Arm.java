class First10Arm
{
  public static void main(String... lko)
  {
    int n=10,copy=152,r,sum,x;
    System.out.println("10 Armstrong numbers are - ");
    while(n!=0)
    {
        copy++;
        x=copy;
        sum=0;            
        while(copy!=0)
        {
            r=copy%10;
            sum=sum+(r*r*r);
            copy=copy/10;
        }
        if(sum==x)
        {
            System.out.println(x);
            n--;
        }
        copy=x;
    }
  }
}