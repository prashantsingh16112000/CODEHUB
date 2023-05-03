class A
{
 int add(int a,int b)
{
 return a+b;
}
  }
class B extends A
{
  int sub(int a,int b)
{
  return a-b;
}
  }
class C extends B
{
 int mul(int a,int b)
{
 return a*b;
 }
   }
 class D extends C
{
 int div(int a,int b)
{
  return a/b;
}
  }
class E extends D
{
 int mod(int a,int b)
 {
   return a%b;
  }
    }
 
 class demo
{
 public static void main(String[] args)
{
 E obj = new E();
 int result1 = obj.add(2,4);
 int result2 = obj.sub(4,2);
 int result3 = obj.mul(3,4);
 int result4 = obj.div(6,2);
 int result5 = obj.mod(7,2);
System.out.println("result1 ="+result1);
System.out.println("result2 ="+result2);
System.out.println("result3 ="+result3);
System.out.println("result4 ="+result4);
System.out.println("result5 ="+result5);
}
  } 
