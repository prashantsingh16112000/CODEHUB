class mythread implements Runnable
 {
   public void run()
   {
     try{
         for(int i=5;i>0;i--)
            {
              System.out.println("child thread running"+i);
               Thread.sleep(500);
              }
          }
      catch(InterruptedException e)
       {
          System.out.println("child interrupted");
        }
    System.out.println("exiting child class");
  }
}
  class threaddemo1
 {
   public static void main(String[] args)
{
     new mythread();
   try{
       for(int i=5;i>0;i--)  
          { 
            System.out.println("main thread running"+i);
             Thread.sleep(500);
           }
       }
   catch(InterruptedException e)
       {
         System.out.println("main interrupted");
         }
     System.out.println("exiting main class");
    }
 }