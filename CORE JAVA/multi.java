class multi implements Runnable
{
public void run()
{
 System.out.println ("thread is running:");
}
 public static void main(String[] args)
{
 multi m = new multi();
 Thread t = new Thread(m);
 t.start();
}
  }