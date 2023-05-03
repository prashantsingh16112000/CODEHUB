class collegefaculty
{
 String designation = "professor";
 String department = "AIIT";
 public void does()
{
  System.out.println(" is teaching");
 }
}
class faculty extends collegefaculty
{
  String subject = "java";
public void teach()
{
 System.out.println("but he is hacking");
 }
public static void main(String[] args)
{
 faculty obj = new faculty();
 System.out.println(obj.designation);
 System.out.println(obj.department);
 obj.does();
 System.out.println(obj.subject);
 obj.teach();
 }
}