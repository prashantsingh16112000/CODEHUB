 public class test
{
  static class pair
  {
   int min;
   int max;
  }
 static pair getminmax(int arr[] , int n)
 {
   pair minmax = new pair();
   int i;
 

 if(n == 1)
  {
    minmax.max = arr[0];
    minmax.min = arr[0];
   }

if(arr[0] > arr[1])
 {
   minmax.max = arr[0];
   minmax.min = arr[1];
  }
else
 {
   minmax.max = arr[1];
   minmax.min = arr[0];
  }
for( i = 2; i < n; i++)
 {
  if(arr[i] > minmax.max)
   {
      minmax.max = arr[i];
    }
  else if(arr[i] < minmax.min)
  {
    minmax.min = arr[i];
    }
 }
return minmax;
}
public static void main(String[] args)
 {
   int arr[] = {22,33,44,1,55,66};
   int arr_size = 6;
  pair minmax = getminmax(arr,arr_size);
  System.out.println("max element is " +minmax.max);
  System.out.println("min element is " +minmax.min);
 }
}