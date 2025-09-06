class DeleteLL
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
  static void delete(Node head,int c)
  {
	  System.out.println("Enter the position to delete - ");
	  int position=new java.util.Scanner(System.in).nextInt();
	  if(position<=c && position>=1)
	  {
		  if(position==1)
		  {
			  head=head.next;
			  c--;
		  }
          else
		  {
			  Node cur=head;
			  for(int i=1;i<position-1;i++)
			  {
				cur=cur.next;  
			  }
			  cur.next=cur.next.next;
			  c--;
		  }
		  Node tra=head;
		  while(tra!=null)
		  {
			  System.out.println(tra.data);
			  tra=tra.next;
		  }
	  }
	  else
		  System.out.println("Enter valid position");
  }
  public static void main(String []fad)
  {
	  int c=0;
	  Node n1=new Node(11);
	  c++;
	  Node n2=new Node(21);
	  c++;
	  Node n3=new Node(31);
	  c++;
	  Node n4=new Node(41);
	  c++;
	  Node n5=new Node(51);
	  c++;
	  Node head=n1;
	  n1.next=n2;
	  n2.next=n3;
	  n3.next=n4;
	  n4.next=n5;
	  delete(head,c);
  }
}