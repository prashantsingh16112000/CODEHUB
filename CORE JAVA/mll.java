public class mll
{
 Node head;

 class Node
{
 int data;
 Node next;
public Node(int data)
{
 this.data = data;
 next = null;
 }
}
public void run()
{
 Node n = head;
 while(n!= null)
{
 System.out.println(n.data);
 n = n.next;
}
}
public static void main(String[] args)
{
 mll obj = new mll();
 
 Node first = obj.new Node(10);
 obj.head = first;
 Node second = obj.new Node(20);
 first.next = second;
 Node third = obj.new Node(30);
 second.next = third;
 obj.run();
 }
}