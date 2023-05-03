import java.util.Stack;

public class stak
{
 int size;
 int arr[];
 int top;
stak(int size)
{
 this.size = size;
 this.arr = new int[size];
 this.top = top;
 }
 public boolean isEmpty()
{
 return (top == -1);
}
 public boolean isFull()
{
 return (size-1 == top);
}
public int peek()
{
 if(!this.isEmpty())
{
 return arr[top];
}
 else
{
 System.out.println("stack is empty");
 return -1;
 }
}
public void push(int element)
{
 if(!isFull())
{
 top++;
 arr[top] = element;
 System.out.println("pushed element is ;"+element);
  }
 else
{
 System.out.println("Stack is overflow");
}
}
public int pop()
{
if (!isEmpty())
{
int stktop = top;
top--; 
System.out.println("popped element is;"+arr[stktop]);
return arr[stktop];
}
else
{
System.out.println("stack is empty");
return -1;
}
}

public static void main(String[] args)
{
 stak obj = new stak(10);
System.out.println(".........");

 obj.push(100);
 obj.push(200);
 obj.push(300);
 obj.push(400);
 obj.push(500);
 

System.out.println(".........");
 
 obj.pop();
}
