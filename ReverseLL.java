class ReverseLL     // Reverse a linked list
{
   static class Node
   {
     int data;
	 Node next;
	 Node prev;
	 Node(int x)
	 {
	   data=x;
	 }
   }
   static void reverse(Node head)
   {
	   Node current=head;
	   Node prev=null;
	   Node temp;
	   while(current!=null)
	   {
		   temp=current.next;
		   current.next=prev;
		   prev=current;
		   current=temp;
	   } 
	   printLL(prev);
   }
   static void printLL(Node curr)
   {
	   while(curr!=null)
	   {
		   System.out.println(curr.data);
		   curr=curr.next;
	   }
   }
   public static void main(String []daf)
   {
	   Node n1=new Node(10);
	   Node n2=new Node(20);
	   Node n3=new Node(30);
	   Node n4=new Node(40);
	   Node n5=new Node(50);
	   Node head=n1;
	   n1.next=n2;
	   n2.next=n3;
	   n3.next=n4;
	   n4.next=n5;
	   //System.out.println("Enter the value of k -");
	   //int k=new java.util.Scanner(System.in).nextInt();
	   reverse(head);
   }
}