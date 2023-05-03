class multicatch5
{
 public static void main(String[] args)
{
 try
{
  int a[] = new int[5];
 a[5] = 30/0;
 System.out.println(a[10]);
 }
 catch(Exception e)
{
 System.out.println("main exception");
 }
 catch(ArrayIndexOutOfBoundsException e)
{
 System.out.println("index exception");
}
catch(ArithmeticException e)
{
 System.out.println("arithmatic exception");
 }
System.out.println("Exception executed");
 }
}