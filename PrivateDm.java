//In data members priority always goes to child
//data members can't override
class Base
{
  static private int x=90;
  static int y=12;
  int z=10;
  void show()
  {
    System.out.println(x);
  }
}
class PrivateDm extends Base
{
 private int x=80;
 int y=15;
 int z=34;
 void show()
 {
   System.out.println(x);
 }
public static void main(String... gh)
 {
  PrivateDm b=new PrivateDm();
  b.show();
  System.out.println(b.y);     
  System.out.println(Base.y); // it will print successfully bcz y is static in Base
  System.out.println(b.z);
  //System.out.println(Base.x); //error we can't call private data members directly
 }
} 