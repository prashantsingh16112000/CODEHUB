class over
{
 void run()
{
 System.out.println("first method");
 }
}
 class methodover extends over
{
 void run()
{
 System.out.println("second method");
 }
 public static void main(String[] args)
{
 over obj = new over();
methodover obj1 = new methodover();
 obj.run();
 obj1.run();
   }
 }