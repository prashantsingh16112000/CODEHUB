public class Main
{
 static void Checkage(int age)
{
 if (age < 18)
{
  System.out.println("Access Denied:");
}
else
{
  System.out.println("Access Granted");
}
 
}
public static void main(String[] args)
{

Checkage(2);
}
  }