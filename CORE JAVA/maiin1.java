class main12
{
 int id;
 String name;
 static String college = "ITS";
 
  static void change()
{
 college = "SRM";
}
 main12(int i , String n)
{
 id = i;
 name = n;
 }
 void display()
{
 System.out.print(id +" "+ name +" "+ college);
 }
}
 class main1
{
 public static void main(String[] args)
{
 main12.change();
 main12 obj = new main12(111,"prashant");
 obj.display();
}
  }
