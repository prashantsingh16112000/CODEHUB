class exception3
{
 public static void main(String[] args)
{
try
{
 String s = null;
System.out.println(s.length());
}
catch(ArrayIndexOutOfBoundsException e)
 {
  System.out.println("Array Index of bounds error");
    }
catch(ArithmeticException e)
{
 System.out.println("ArithmeticException occurs");
  }
 
  catch(Exception e)
{
 System.out.println("parent exception occur");
 }
 System.out.println("after handled");
}
 }
