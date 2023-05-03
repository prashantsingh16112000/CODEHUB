class Mythread
{
 public static void main(String[] argvs)
{
 Mythread m1 = new Mythread("thread is running");
 m1.start();
 String str = m1.getName();
System.out.println(str);
}
  }
