import java.util.*;
class ArrayListEx
{
	public static void main(String... k)
	{
		ArrayList al=new ArrayList<String>();
		al.add("Himanshu");
		al.add("Deepak");
		al.add("Anirudh");
		al.add("Ankit");
		al.add("Dhananjay");
		for(String str:al)
		{
			System.out.println(str);
		}
	}
}
class ArrayListNew extends ArrayListEx
{
	 public static void main(String... j)
	 {
		 ArrayList al=new ArrayList<int> ();
         al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
        for(int str:al)
		{
			System.out.println(str);
		}		
	 }
}