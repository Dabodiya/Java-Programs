class InsertLL
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
	   System.out.println("Enter a position to insert -");
	   int position=new java.util.Scanner(System.in).nextInt();
	   if(position<=c && position>=0)
	   {
		   System.out.println("Enter the data - ");
		   int d=new java.util.Scanner(System.in).nextInt();
		   Node nod=new Node(d);
		   if(position==0)
		   {
			   nod.next=head;
			   head=nod;
			   c++;
		   }
		   else
		   {
			   Node prev=head;
			   for(int i=0;i<position-1;i++)
			   {
				   prev=prev.next;
			   }
			   nod.next=prev.next;
			   prev.next=nod;
			   c++;
		   }
	   }
	   else
		   System.out.println("Invalid Position");
	   System.out.println("Linked list is - ");
	   Node curr=head;
	   while(curr!=null)
	   {
		   System.out.println(curr.data);
		   curr=curr.next;
	   }
   }
   public static void main(String... hgvdu)
   {
	   int c=0;
	   Node n1=new Node(10);
	   c++;
	   Node n2=new Node(20);
	   c++;
	   Node n3=new Node(30);
	   c++;
	   Node n4=new Node(40);
	   c++;
	   Node n5=new Node(60);
	   c++;
	   Node head=n1;
	   n1.next=n2;
	   n2.next=n3;
	   n3.next=n4;
	   n4.next=n5;
	   insert(head,c);
   }
}