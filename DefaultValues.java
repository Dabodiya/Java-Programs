class DefaultValues
{
	int x;
	float y;
	char ch;
	byte b;
	long l;
	double d;
	boolean bl;
	short s;
	DefaultValues ref=new DefaultValues();
  public static void main(String... fsdajk)
  {
    DefaultValues o=new DefaultValues();
	System.out.println(o.x);
	System.out.println(o.y);
	System.out.println(o.ch);
	System.out.println(o.b);
	System.out.println(o.l);
	System.out.println(o.d);
	System.out.println(o.bl);
	System.out.println(o.s);
	System.out.println(o.ref);
  }
}