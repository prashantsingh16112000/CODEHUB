 class student
{
 int rollno ;
 String name ; 
 static String college = "Amity" ; 

 student(int r,String n)
{
 rollno = r;
 name = n;
 }
void display()
{
System.out.println( rollno+ " " +name+ " " +college);
}
  }

class university
{
public static void main(String[] args)
{
 student S1 = new student(123,"vansh");
 student S2 = new student(234,"samrat");
 
 S1.display();
 S2.display();
}
  }
 