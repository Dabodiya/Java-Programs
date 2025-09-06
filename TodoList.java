import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.Collections;
import java.util.Comparator;
class MyList 
{
   ArrayList<String> tasks;
   ArrayList<Integer> priority;
}
public class TodoList extends MyList 
{

  public TodoList() 
  {
    tasks = new ArrayList<String>();
	priority=new ArrayList<Integer>();
  }

  public void addTask(String task) 
  {
      tasks.add(task);
	  priority.add(0);
  }
  
   public void addPrior() 
  {
    System.out.println("To-Do List:");
  for (int i = 0; i < tasks.size(); i++) 
  {
    System.out.println( tasks.get(i));
	priority.set(i,new Scanner(System.in).nextInt());
  }
    System.out.println();
  }

  public void removeTask(int index) 
  {
    tasks.remove(index);
  }

public void printTasks() 
{
  //Collections.sort(tasks,new CustomComparator());
  System.out.println("To-Do List:");
  for (int i = 0; i < tasks.size(); i++) 
  {
    System.out.println((i+1) + ". " + tasks.get(i) +" "+ priority.get(i));
  }
    System.out.println();
}

 public void makeChoice()
 {
  Scanner scanner = new Scanner(System.in);
  TodoList todoList = new TodoList();
   	  int tas=0;
     while (true) 
      {
		if(tas<3)
        {
         System.out.println("Enter 'add' to add a task : \nEnter 'remove' to remove a task : \nEnter 'print' to print the list : \nOr Enter 'exit' to quit : ");
		}
		else
		{
		  System.out.println("Enter 'add' to add a task : \nEnter 'remove' to remove a task : \nEnter 'print' to print the list : \nEnter 'p' to set priority of task : \nOr Enter 'exit' to quit : ");
		}
        String input = scanner.nextLine();
        
        if (input.equals("add")) 
        {
           System.out.println("Enter the task to add:");
           String task = scanner.nextLine();
		   tas++;
		   todoList.addTask(task);
		   System.out.println("Task added.\n");
        } 
        else if(input.equals("remove")) 
        {
          System.out.println("Enter the index of the task to remove:");
          int index = scanner.nextInt();
          scanner.nextLine();
          todoList.removeTask(index-1);
          System.out.println("Task removed.\n");
        } 
        else if(input.equals("print")) 
        {
          todoList.printTasks();
        } 
        else if(input.equals("exit"))
        {
           break;
        } 
		else if(input.equals("p"))
		{
			todoList.addPrior();
		}
        else 
        {
           System.out.println("Invalid input. Please try again.\n");
        }
   }
 }
public static void main(String[] args) 
{
  TodoList todoList = new TodoList();
  System.out.println("Welcome to your To-Do List!");
  todoList.makeChoice();
  System.out.println("GOOD JOB YOU DID IT!");
 }
}