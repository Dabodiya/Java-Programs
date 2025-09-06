import java.util.*;
class Arraylist
{
  public static void main(String... k)
  {
    ArrayList<Integer>ar=new ArrayList<Integer>();
	ar.add(2);
	ar.add(2);
	ar.add(3);
	ar.add(6);
	ar.add(8);
	ar.add(2);
	ar.add(2);
	ar.add(3);
	ar.add(6);
	ar.add(8);
	int sum=0;
	for(int s:ar)
	{
		sum=sum+s;
		System.out.println(s);
	}
	System.out.println(sum);
  }
}