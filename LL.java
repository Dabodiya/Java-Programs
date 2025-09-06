class LL
{
  static class Node
  {
    int data;
    Node next;
    Node(int data)
	{
		this.data=data;
	}
  }
  static void insert(Node head,int c)
  {
	  System.out.println("Enter the insertion position -");
	  int pos=new java.util.Scanner(System.in).nextInt();
	  if(pos<=c)
	  {
	  System.out.print("Enter the data of node - ");
	  int d=new java.util.Scanner(System.in).nextInt();
	  Node n3=new Node(d);
	  if(pos==0)
	  {
		  n3.next=head;
		  head=n3;
		  c++;
	  }
	  else 
	  {
		  Node prev=head;
		  for(int i=0;i<pos-1;i++)
		  {
			  prev=prev.next;
		  }
				  n3.next=prev.next;
				  prev.next=n3;
				  c++;
	  }
	 }
	  else
		  System.out.println("Invalid position");
	  traverse(head,c);
  }
  static void delete(Node head,int c)
  {
	  System.out.println("Enter the delete position - ");
	  int pos=new java.util.Scanner(System.in).nextInt();
	  if(pos<=c)
	  {
		  if(pos==0)
		  {
			  head=head.next;
			  c--;
		  }
		  else
		  {
			  Node cur=head;
			  for(int i=0;i<pos-1;i++)
			  {
					cur=cur.next; 					 
			  }
			  cur.next=cur.next.next;
			  c--;
              traverse(head,c);
		  }
	  }
	  else
	  {
		  System.out.println("Invalid position for deletion.");
	  }
  }
  static void traverse(Node head,int c)
  {
	  Node curr=head;
	  while(curr!=null)
	  {
		  System.out.println(curr.data);
		  curr=curr.next;
	  }
	  selection(head,c);
  }
  static void search(Node head)
  {
	  System.out.println("Enter the search element - ");
	  int sea=new java.util.Scanner(System.in).nextInt();
	  int c=0;
	  Node curr=head;
	  while(curr!=null)
	  {
		  if(sea==curr.data)
		  {
			  System.out.println("Element found - "+curr.data);
			  c=1;
		  }
		  curr=curr.next;
	  }
	  if(c==0)
	  {
		  System.out.println("Element Not found");
	  }
	  selection(head,c);
  }
  static void selection(Node head,int c)
  {
	  System.out.println("For insertion press 1 :");
	  System.out.println("For deletion press 2 :");
	  System.out.println("For searching press 3 :");
	  System.out.println("For Exit press 4 ");
	  System.out.println(" - Select an option from above - ");
	  int select=new java.util.Scanner(System.in).nextInt();
	  switch(select)
	  {
		  case 1: insert(head,c);
		  break;
		  case 2 : delete(head,c);
		  break;
		  case 3 : search(head);
		  break;
		  case 4: System.exit(0);
		  default : System.out.println("Wrong selection");
	  }
  }
  public static void main(String... jhg)
  {
	  System.out.println("Enter the data of head node - ");
	  int data=new java.util.Scanner(System.in).nextInt();
	  int c=0;
      Node n1=new Node(data);
	  c++;
	  Node head=n1;
	  selection(head,c);
  }
}