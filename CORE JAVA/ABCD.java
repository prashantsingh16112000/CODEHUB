class ABCD
{
 static void method()
{
 System.out.println("i am in method");
}
 int method(int a)
{
 System.out.println("i am int method");
 return 1;
}

 public static void main(String[] args)
{

 ABCD obj = new ABCD();
 obj.method(2);
}
  }
