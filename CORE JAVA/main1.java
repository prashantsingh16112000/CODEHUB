class main1
{
 int id;
 String name;
 static String college = "ITS";
 
 main1(int i , String n)
{
 id = i;
 name = n;
 }
 static void change()
{
 college = "SRM";
}
 void display()
{
 System.out.print(id +" "+ name +" "+ college);
 }
 public static void main(String[] args)
{
 main1.change();
 main1 obj = new main1(111,"prashant");
 obj.display();
 obj.change();
}
  }
