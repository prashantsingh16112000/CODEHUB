class MyThread extends Thread
 {
  public void run()
{
 System.out.println("current thread name"+Thread.currentThread().getName());
   for(int i=5;i>0;i--)
   {
     System.out.println("running thread"+i);
    }
 System.out.println("current thread called");
 }
   }
 class threadstart
{
 public static void main(String[] args)
{
 MyThread t = new MyThread();
 try{
     t.start();
     t.start();
  }
  catch(IllegalThreadStateException e)
{
  }
 }
   }