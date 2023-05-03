class MyThread2 implements Runnable
{
 public void run()
 {
System.out.println("thread is running");
  }
 public static void main(String[] args)
 {
   Runnable r1 = new MyThread2();
   Thread t1 = new Thread(r1,"this is thread");
   t1.start();
   String str = t1.getName();
  System.out.println(str);
  }
    }
   

