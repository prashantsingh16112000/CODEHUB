class throwdemo
{
  static void method()
{
 try
{
 System.out.println("caught method");
 throw new NullPointerException("throws exception");
 }
 catch(NullPointerException e)
{
 throw e;
 }
    }
 public static void main(String[] args)
{
  try
{
  method();
}
catch(NullPointerException e)
{
 System.out.println(e);
    }
  }
 }
 