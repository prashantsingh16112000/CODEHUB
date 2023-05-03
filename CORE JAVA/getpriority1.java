class getpriority1 extends Thread
{
 public void run()
{
 System.out.println("execution started:");
  }
 public static void main(String[] args)
 { 
   getpriority1 t1 = new getpriority1();
   getpriority1 t2 = new getpriority1();
   getpriority1 t3 = new getpriority1();

   t1.run();
   t2.run();
   t3.run();

  

   System.out.println("get the first priortiy:"+t1.getPriority());
   System.out.println("get the second priority:"+t2.getPriority());
   System.out.println("get the third priority:"+t3.getPriority());
 
   t1.setPriority(3);
   t2.setPriority(5);
   t3.setPriority(8);

   System.out.println("after getting priority: "+t1.getPriority());
   System.out.println("after getting priority: "+t2.getPriority());
   System.out.println("after getting priority: "+t3.getPriority());
  
   System.out.println("name of thread: "+Thread.currentThread().getName());
   System.out.println("main priority: "+Thread.currentThread().getPriority());

   Thread.currentThread().setPriority(10);

   System.out.println("thread name: "+Thread.currentThread().getPriority());
    }

   }