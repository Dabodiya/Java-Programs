class Rectangle
{
	int height,width;
	public void getvalue(int a,int b)
	{
		height=a;
		width=b;
	}
	public int area()
	{
		return height*width;
    }
}
class Rect1
{
  public static void main(String... j)
  { 
    int x,y,area;
	System.out.println("Enter the height - ");
	x=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter the widhth of rectangle - ");
	y=new java.util.Scanner(System.in).nextInt();
	Rectangle r=new Rectangle();
	r.getvalue(x,y);
	area=r.area();
	System.out.println("The area of rectangle is - "+area);
  }
}