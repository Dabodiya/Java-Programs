class Defaultval
{
  int a;
  String s;
  char c;
  float f;
  short sh;
  double d;
  long l;
  boolean b;
  byte by;
  public static void main(String[] p)
  {
    Defaultval dv=new Defaultval();
	System.out.println("Default value for integer -- "+dv.a);
	System.out.println("Default value for String -- "+dv.s);
    System.out.println("Default value for char -- "+dv.c);
	System.out.println("Default value for float -- "+dv.f);
	System.out.println("Default value for short -- "+dv.sh);
	System.out.println("Default value for double -- "+dv.d);
	System.out.println("Default value for long -- "+dv.l);
	System.out.println("Default value for boolean -- "+dv.b);
	System.out.println("Default value for byte -- "+dv.by);
  }
}