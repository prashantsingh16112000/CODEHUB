class poly
{
 
 void run(String a,int b)
{
 System.out.println(" two int method");
}
void run(int a, float b, String c)
{
System.out.println("three int method");
}

public static void main(String[] args)
{
 poly obj = new poly();
 obj.run(2,3.0f,"om");
}
  }
