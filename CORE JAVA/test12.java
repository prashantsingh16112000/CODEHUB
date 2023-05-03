class student
{
int id;
String name;
float fee;

student(int id,String name,float fee)
{
this.id = id;
this.name = name;
this.fee = fee;
}
 
 void display()
{
 System.out.println(id +" "+ name +" "+ fee);
}
  }
  
class test12
{
 public static void main(String[] args)
{
 student s1 = new student(111,"ayush",20000f);
 student s2 = new student(222,"prashant",30000f);
 s1.display();
 s2.display();
}
  }