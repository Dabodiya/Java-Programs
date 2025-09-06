import java.util.*;
import java.io.*;
class Test11
{
    public static void main(String... hgjhj)
	{
	  ArrayList<Student2> al=new ArrayList<Student2>();
	  al.add(new Student2("Himanshu",23,"MCA"));
	  al.add(new Student2("Deepaak",21,"MCA"));
	  al.add(new Student2("Anirudh",24,"MCA"));
	  System.out.println("Sorting by name ");
	  Collections.sort(al,new NameCompare());
	  for(Student2 st: al)
	  {
	    System.out.println(st.name+" "+st.age+" "+st.course);
	  }
	System.out.println("Sorting by Age");
	Collections.sort(al,new AgeCompare());
	for(Student2 st : al)
	{
	  System.out.println(st.name+" "+st.age+" "+st.course);
	}
	}
}