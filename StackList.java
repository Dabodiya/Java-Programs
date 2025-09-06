import java.util.*;
class StackList
{
	public static void main(String... l)
	{
		Stack<Character>s=new Stack<Character>();
		s.push('h');
		s.push('i');
		s.push('m');
		s.push('a');
		s.push('n');
		s.push('s');
		s.push('h');
		s.push('u');
		//s.pop();
		Iterator<Character> i=s.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
	}
}