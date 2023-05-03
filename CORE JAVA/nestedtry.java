class nestedtry
{
 public static void main(String[] args)
{
 try{
   
    try{
     System.out.println("divides by zero");
     int a = 30/0;
      }
     catch(ArithmeticException e)
       {
         System.out.println("mathematics exception");
        }
    try{
       int a[] = new int[5];
        a[5] = 10;
        }
      catch(ArrayIndexOutOfBoundsException e)
       {
         System.out.println("array exception");
         }
        System.out.println("end nested try block");
      }
  catch(Exception e)
    {
     System.out.println(e);
      }
   System.out.println("excution ended");
  }
 }