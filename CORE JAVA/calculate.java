class calculate
{
 
 static void cube(int x)
{
 int result = x*x*x;
 System.out.println(result);
}
 
 public static void main(String[]args)
{
  calculate obj = new calculate();
  obj.cube(4);
}
  }