class exceptdemo
{
 public static void main (String[] args)
{
System.out.println("Execution Started");
 try{
 int n1 = Integer.parseInt(args[0]);
 int n2 = Integer.parseInt(args[1]);
 System.out.println("Excution Started...");
 System.out.println("Entered integers are"+n1+"and"+n2);
   int div = n1/n2;
 System.out.println("Answer is"+div);
 }
 catch(IndexOutOfBoundsException e)
{
 System.out.println("input only two integers");
 e.printStackTrace();
 }
 catch(ArithmeticException e)
{
 e.printStackTrace();
 System.out.println("n2 should not be zero");
}
 catch(NumberFormatException e)
{
 e.printStackTrace();
 System.out.println("input should be integer not String value");
 }
 catch(IllegalArgumentException e)
{
 e.printStackTrace();
 System.out.println("input should be strictly integers");
}
 catch(Exception e)
{
 e.printStackTrace();
 System.out.println(e.getMessage());
 }
  System.out.println("Excution Ended");
 }
   }