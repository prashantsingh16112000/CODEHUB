class anarray
{ 
  
  static void parray(int arr[])
{
  for(int i=0;i<arr.length;i++)
{
  System.out.println(arr[i]);
  }

     }
 public static void main(String[] args)
{
  parray(new int[]{33,44,55,66,77});
}

   }