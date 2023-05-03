import java.util.Arrays;

  class stack2
 {
 private  int maxsize;
 private String[] stackArray;
 private int top;

 public stack2(int size)
{
 this.maxsize = size;
 this.stackArray = new String[maxsize];
 this.top = -1;
 }
public String push(String element)
{
   return stackArray[++top] = element;
 }
public String pop(String element)
{
 if(isEmpty())
{
 System.out.println("stack is underflow");
 System.exit(-1);
 }
 System.out.println("popping element:"+readtop());
 return stackArray[top--];
}
 public String readtop()
{
 return stackArray[top];
 }
 public boolean isEmpty()
{
 return (top == -1);
 }
public boolean isFull()
{
 return (top == maxsize-1);
 }
 public void printstack()
{
System.out.println(Arrays.toString(stackArray));
}
}
 public class stak2
{


 public static void main(String[] args)
{
 stack2 obj = new stack2(10);
System.out.println("is stack empty: "+obj.isEmpty());
obj.push("red ball");
obj.push("green ball");
obj.push("orange ball");
obj.push("white ball");
obj.printstack();
System.out.println("is stack empty: "+obj.isEmpty());

while(!obj.isEmpty())
{
 obj.pop(obj.readtop());
 System.out.println("is my stack empty: "+obj.isEmpty());
 }
}
}
