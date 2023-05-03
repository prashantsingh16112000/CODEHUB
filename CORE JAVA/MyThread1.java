class MyThread1
{
 public static void main(String[] args)
{
 Thread t = new Thread("thread is running");
 t.start();
 String str = t.getName();
System.out.println(str);
}
  }
