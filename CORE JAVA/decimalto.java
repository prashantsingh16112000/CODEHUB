class decimalto
{
 public static void main(String[] args)
{
 int rem,num=1100,sum=0,i=0;
 while(num!=0)
{
 rem= num%10;
 sum= sum+rem*(int)Math.pow(2,i);
 num= num/10;
 i++;
 }
System.out.println(sum);
 }
   }