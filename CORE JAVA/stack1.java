import java.util.Stack;

 class stack1
  {
    public static void main (String[] args)
  {
    
  Stack<Integer> stk = new Stack<>();
  
  boolean result = stk.empty();
  System.out.println("is stack is empty ? "+result);

  stk.push(12);
  stk.push(34);
  stk.push(45);
  stk.push(67);
 
 System.out.println("stack is : "+stk);

  result = stk.empty();
  System.out.println("is stack is empty ? "+result);
 
  }
 } 