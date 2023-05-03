class amy
{
 public static void main(String args[])
{
  new B();
  new A();
}
  }
 class A
{
 A()
{
 System.out.println("i m in A");
}
  }
class B extends A
{
 B()
{
 System.out.println("i am in B");
}
 }