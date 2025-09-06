class Unique
{
  public static void main(String[] s)
  {
    int a,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
	int m=0,r,org,count=0,l=0,n=0,o=0,p=0,q=0,v=0,t=0,u=0,x=0,w=0;
	System.out.println("Enter a number -");
	a=new java.util.Scanner(System.in).nextInt();
	 org=a;
	 while(a!=0)
	  {
	   r=a%10;
	   count++;
	   a=a/10;
	  }
	  for(int k=1;k<=count;k++)
	  {
	   r=org%10;
	    if(r==1)
	   {
		m++;
	    b=r;
	   }
	   if(r==2)
	   {
	    n++;
	    c=r;
	   }
	   
	   if(r==3)
	   {
		o++;   
	    d=r;
	   }
	   
	   if(r==4)
	   {
		p++;   
	    e=r;
	   }
	  
	   if(r==5)
	   {
		q++;   
	    f=r;
	   }
	  
	   if(r==6)
	   {
		t++;   
	    g=r;
	   }
	   
	   if(r==7)
	   {
		u++;   
	    h=r;
	   }
	   
	   if(r==8)
	   {
		v++;   
	    i=r;
	   }
	   
	   if(r==9)
	   {
		w++;    
	    j=r;
	   }
	   
	   if(r==0)
	   {
		x++;
	    l=r;
	   }
	   
	   org=org/10;
	  }
	  if(m>1||n>1||o>1||p>1||q>1||t>1||u>1||v>1||w>1||x>1)
	  {
	   System.out.println("Not Unique");
	  }
	  else
	  {
	  System.out.println("Number is Unique");
	  }
	}
}
	  
	
	  
	   
	   