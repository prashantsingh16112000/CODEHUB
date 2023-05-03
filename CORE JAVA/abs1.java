abstract class bike
{
 abstract void display();
}
class abs1 extends bike
{
 void display()
{
 System.out.println("abstraction");
 }
 public static void main(String[] args)
{
 bike obj = new abs1();
 obj.display();
 }  
   }