class examplepc
{
 private int var;

public examplepc()
{
 this.var = 10;
}
public examplepc(int num)
{
 this.var = num;
}
public int run()
 {
   return var;
 }
 public static void main(String[] args)
{
 examplepc obj = new examplepc();
 examplepc obj2 = new examplepc(100);
 System.out.println("value of var is"+obj2.run());
 System.out.println("value of var is"+obj.run());
}
 }