class animal
{
 void eat()
{
 System.out.println("eating...");
}
  }
 
class dog extends animal
{
 void eat()
{
 System.out.println("eating bread..");
}
 void bark()
{
 System.out.println("barking...");
}
 void work()
{
 eat();
 bark();
 super.eat();
}
  }

 class super2
{
 public static void main(String[] args)
{
 dog d = new dog();
 d.work();

}
  }