class Emp1
{
 int salary;
 Emp1()
 {
  salary=50000;
  System.out.println(this.hashCode());
 }
 void show()
 {
   System.out.println(salary);
 }
 public static void main(String... l)
 {
   System.out.println(new Emp1().salary);
   new Emp1().show();
   System.out.println(new Emp1());
   System.out.println(new Emp1().hashCode());
 }
} 