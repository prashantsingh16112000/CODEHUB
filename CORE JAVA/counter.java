class counter
{
int id;
String name;
int age;

counter(int i,String n)
{
 id = i;
 name = n;
 }
counter(int i,String n,int a)
{
 id = i;
 name = n;
 age = a; 
 }
void display()
{
System.out.println(id +" "+ name +" "+ age);
 }
   
public static void main(String[] args)
{
counter obj = new counter(123,"vansh");
counter obj1 = new counter(234,"samrat",23);
obj.display();
obj1.display();
}
  }
