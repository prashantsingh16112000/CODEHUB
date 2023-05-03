class tst1
{

public static void main(String args[])
{
try
   { 
     Thread.sleep(1000);
     System.out.println("run thread slowly");
  }
 
 catch(InterruptedException e)
{
 System.out.println(e);
   }
  System.out.println("nominated thread");
  
     
}
  } 
