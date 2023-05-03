public class mylinkedlist
{
  public static class Node
 {
   int data;
   Node next;
  }
 public static void main(String[] args)
 {
  Node obj1 = new Node();
  Node obj2 = new Node();
  Node obj3 = new Node();
  Node obj4 = new Node();
 
 obj1.data = 13;
 obj2.data = 45;
 obj3.data = 34;
 obj4.data = 78;
 
 obj1.next = obj2;
 obj2.next = obj3;
 obj3.next = obj4;
 obj4.next = null;
  
for(int i = 1;i<= 4;i++)
{
 System.out.println(obj1.data+" data");
 obj1 = obj1.next;
}
}
}