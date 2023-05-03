class rarray
{
 
 static int[] get()
{
 return new int[]{22,33,44,55,66};
}
 
 public static void main(String[] args)
{
  int arr[] = get();
  
  for(int i=0;i<arr.length;i++)
{
 System.out.println(arr[i]);
  }
    }
       }