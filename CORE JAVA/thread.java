class multi extends thread
{
 public void run()
{
System.out.println("thread is running...");
  }
public static void main(String[] args)
{
 multi obj = new multi();
 obj.start();
}
  }