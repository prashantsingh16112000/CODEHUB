class DEMO
{
 int num1;
 int num2;
 int sum;

public int add()
{
 sum = num1 + num2;
System.out.print(sum);
return sum;
}
  } 

public class ADD1
{
public static void main(String[] args)
{
DEMO obj = new DEMO();
obj.num1 = 20;
obj.num2 = 40;
obj.add();
}
  }
