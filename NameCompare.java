import java.util.*;
class NameCompare implements Comparator<Student2> 
{
  public int compare(Student2 s1,Student2 s2)
  {
    return s1.name.compareTo(s2.name);
  }
}