public class bubblesort
{
public static void printArray(int arr[])
{
 for(int  i = 0;i < arr.length;i++)
{
 System.out.println(arr[i]+" ");
 }
System.out.println();
}
 
public static void main(String[] args)
{
int arr[] = {7,8,3,1,2};
 int n = arr.length;
 for(int i = 0;i<n-1;i++)
{
 for(int j = 0;j<n-i-1;j++)
{
 if(arr[j]>arr[j+1])
{
 int temp = arr[j];
 arr[j]= arr[j+1];
 arr[j+1]= temp;
     }
   }
 }
printArray(arr);
  }
 }
