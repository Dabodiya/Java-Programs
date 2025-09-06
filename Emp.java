class Emp
{
  static String cname="TCS";
  String name;
  int salary;
  void get(String s1,int s2)
  {
    name=s1;
	salary=s2;
  }
  void show()
  {
   System.out.println("Employee name is - "+name);
   System.out.println("Employee salary is - "+salary);
   System.out.println("Company name is - "+cname); 
  }
  static int add(int a,int b)
  {
   return a+b;
  }
  public static void main(String[] j)
  {
    Emp e1=new Emp();
	System.out.println(e1);
	e1.name="Lalu";
	e1.salary=1001;
	System.out.println(e1.name);
	System.out.println(e1.salary);
	Emp e2=e1;
	int i=add(200,9);
	System.out.println("Addition is - "+i);
	System.out.println(e2);
	e2.name="Rabri";
	System.out.println(e1.name);
	System.out.println(e2.salary);
	System.out.println(cname);
	i=add(8,9);
	System.out.println("Second Addition is - "+i);
	System.out.println(Emp.cname);
  }
}

 class Demo
 {
	 public static void main(String[] k)
	 {
		 int z=Emp.add(10,20);
		 System.out.println(z);
		 System.out.println(Emp.cname);
     }
 }