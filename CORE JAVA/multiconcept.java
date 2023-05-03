class multithread1 extends Thread
{
  public void run()
{
  for(int i=5;i>=1;i--)
{
 System.out.println(i);
  
   try
      {
        Thread.sleep(1000);
       }
    catch(InterruptedException e)
    {
      }
    }
   }
  }
 
class multiconcept
{
   public static void main(String []args)
{
  multithread1 obj1 = new multithread1();
  multithread1 obj2 = new multithread1();
  obj1.start();
  obj2.start();
   }
 }