class exception2
{
 public static void main(String[] args)
{
try
{
 int a[]=new int[5];
System.out.println(a[5]);
}
catch(ArithmeticException e)
{
 System.out.println("Arithmetic Exception occurs");
}
 catch(ArrayIndexOutOfBoundsException e)
{
 System.out.println("Array out of index occur");
  }
 catch(Exception e)
{
 System.out.println(e);
 }
 System.out.println("code executed");
 }
   }