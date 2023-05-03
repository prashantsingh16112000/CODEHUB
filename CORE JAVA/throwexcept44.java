class throwexcept44
{
  static void fun()
{
 try
    {
     throw new NullPointerException("demo");
      }
 catch(NullPointerException e)
    {
      System.out.println("hello");
        
      }
   }
 public static void main(String[] args)
  {
   try
      {
        fun();
        }
   catch(NullPointerException e)
     {
       System.out.println("no hello");
      }
 }
} 