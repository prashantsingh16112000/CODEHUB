class exception1
{
 public static void main(String[] args)
{
try
{
 int arr[] = {1,22,33,44,55};

 System.out.println(arr[10]);
 }
 catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println(e);
    }
   System.out.println("after exception handled");
  }
    }