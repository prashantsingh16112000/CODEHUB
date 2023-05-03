class exception5
{
 public static void main(String[] args)
{ 
 try
{

try
{
 
try
{
 int a[]={5,3,6,2,7};
 System.out.println(a[10]);
}
catch(ArithmeticException e)
{
 System.out.println("Arithmetic error occurs");
 System.out.println("try3");
}
   }
catch(ArithmeticException e)
{
 System.out.println("Array error occurs");
  System.out.println("try2");
 }
  }
catch(ArrayIndexOutOfBoundsException e)
{
 System.out.println(e);
 System.out.println("try1");
}
 catch(Exception e)
{
 System.out.println(e);
  System.out.println("after handled");
 }

  }
    }