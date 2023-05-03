import java.util.Scanner;

class demo 
{
 
public int add(int i,int j,int k)
{
 int sum = i+j+k;
 System.out.print(sum);
return sum;
 }
   }

public class Example1
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);

  demo obj = new demo();
  System.out.print("enter first number:  ");
  int i = sc.nextInt();
  System.out.print("enter second number:  ");
  int j = sc.nextInt();
  System.out.print("enter third number:  ");
  int k = sc.nextInt();
  obj.add(i,j,k);
  }
     }