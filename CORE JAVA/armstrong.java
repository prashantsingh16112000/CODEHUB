class armstrong
{
 public static void main(String[] args)
{
  int num,rem,sum=0,original;
  num = 153;
  original=num;
  while(num!=0)
{
  rem = num % 10;
  sum = sum+rem*rem*rem;
  num = num/10;
  }
 if(sum == original)
{
 System.out.println("armstrong number");
 }
 else
{
 System.out.println("not armstrong number");
  }
    }
      }