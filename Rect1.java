class Rect1
{
  public static void main(String... j)
  { 
    int x,y;
	System.out.println("Enter the height - ");
	x=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter the widhth of rectangle - ");
	y=new java.util.Scanner(System.in).nextInt();
	Rectangle r=new Rectangle();
	r.getvalue(x,y);
	System.out.println("The area of rectangle is - "+r.area());
  }
}