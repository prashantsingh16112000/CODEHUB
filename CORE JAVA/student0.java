class student0
{
 int id;
 String name;

student0(int i,String n)
{
 id = i;
 name = n;
}
student0()
{
 }
void display()
{
System.out.println(id+" "+name);
}

public static void main(String[] args)
{
 student0 s1 = new student0(111,"vansh");
 student0 s2 = new student0();
 student0 s3 = new student0();
 s2.id = s1.id;
 s2.name = s1.name;
 s3.id = s2.id;
 s3.name = s2.name;
 s1.display();
 s2.display();
 s3.display();
}
  }
 
 

