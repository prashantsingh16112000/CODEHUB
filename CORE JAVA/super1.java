class animal
{
 String color = "white";
}

class dog extends animal
{
  String color = "black";

void printcolor()
{
 System.out.println(color);
 System.out.println(super.color);
}
   }

class super1
{
 public static void main(String[] args)
{
 dog d = new dog();
 d.printcolor();
 } 
    }