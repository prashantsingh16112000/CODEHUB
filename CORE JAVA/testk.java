class testk
{

testk()
{
  System.out.println("1");
  new testk(10);
  System.out.println("5");
}
 testk(int data)
{
  System.out.println("2");
  new testk(210,20);
  System.out.println("4");
}
testk(int data, int temp)
{
  System.out.println("3");
}

public static void main(String[] args)
{
 testk obj = new testk();
}

 }