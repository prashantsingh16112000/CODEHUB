import java.util.Stack;

class stack2
{
 public static void main(String[] args)
{
 
  Stack<Integer>stk = new Stack<>();
  stk.push(23);
  stk.push(34);
  stk.push(45);
  stk.push(67);
  stk.push(78);
  stk.push(90);
  stk.push(120);
 
  System.out.println("top element is element :"+stk.peek());
  System.out.println("elements are");
  
  while(!stk.isEmpty())
   {
    int data = stk.pop();
    System.out.println("element is :"+data);
    }

 
  }
 }
 