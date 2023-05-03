class array1
{
 static void min(int arr[])
{
 int min = arr[3];
 for(int i=2;i<arr.length;i++)

 if(min < arr[i])
{
 min = arr[i];
System.out.println(min);

 } 
     }
public static void main(String [] args)
{
 int a[] = {22,11,18,12};
  min(a);
  }
     }
 