class student5
{
 int id;
 String name;
 int age;

student5(int i,String n,int a)
{
id = i;
name = n;
age = a;
System.out.println(id +" "+ name +" "+ age);

}
student5(student5 s)
{
 id = s.id;
 name = s.name;
 age =s.age;
System.out.println(id +" "+ name +" "+ age);
}
public static void main(String[] args)
{
 
 student5 obj1 = new student5(12,"vansh",20);
 student5 obj2 = new student5(obj1);
}
  }