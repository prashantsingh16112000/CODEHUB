public class Overmethod
{
 static int OmethodInt(int x,int y)
{
 return x+y;
}
 static float Omethodfloat(float x,float y)
{
return x+y;
}
public static void main(String[] args)
{
int num1 = OmethodInt(4,5);
float num2 = Omethodfloat(55,66);
System.out.println("int: "+ num1);
System.out.println("float: "+ num2);
} 
  }
