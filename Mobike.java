class Mobike
{
 String bno;
 String name;
 int days;
 int charge;
 void input(String s1,String s2,int d1)
 {
   bno=s1;
   name=s2;
   days=d1;
 }
 void compute()
 {
  int sfd=0,ffd=0,rd=0,c=0,c1=0;
  for(int i=1;i<=days;i++)
  {
   if(i<=5)
   {
     ffd=i*500; 
   }
   if(i>5&&i<=10)
   { 
    c++;  
    sfd=c*400;
   }
   if(i>10)
   {
	c1++;
	rd=c1*200;
   }
  }
  charge=ffd+sfd+rd;
 }
 void display()
 {
  System.out.println("Bike No. - "+bno);
  System.out.println("Customer name - "+name);
  System.out.println("Charged - "+charge);
 }
 public static void main(String[] l)
 { 
   String bn;
   String cust;
   int day;
   Mobike mb=new Mobike();
   System.out.println("Enter The Bike No - ");
   bn=new java.util.Scanner(System.in).nextLine();
   System.out.println("Enter the Name of Customer - ");
   cust=new java.util.Scanner(System.in).nextLine();
   System.out.println("Enter The Days - ");
   day=new java.util.Scanner(System.in).nextInt();
   mb.input(bn,cust,day);
   mb.compute();
   mb.display();
 }
}
   