import java.util.*;
class ArrayListEx
{
	public static void Stringtype()
	{
		ArrayList<String>al=new ArrayList<String>();
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
		 ArrayList<int>al1=new ArrayList<int>();
         al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
        for(int str:al)
		{
			System.out.println(str);
		}	
         ArrayListEx.Stringtype();		
	 }
}