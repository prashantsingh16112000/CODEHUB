class selectionsort
{
 void sort(int arr[])
{
 int n = arr.length;
for(int i = 0; i < n-1;i++)
 {
   int minele = i;
 for(int j = i+1;j < n;j++)
  {
    if(arr[j] < arr[minele])
    {
       minele = j;
    
    int temp = arr[minele];
      arr[minele] = arr[i];
      arr[i] = temp;
     }
    }
   }
 }      
static void printArray(int arr[])
 {
  int n = arr.length;
  for(int i = 0;i < n; i++)
  {
    System.out.println(arr[i]+"  ");
     System.out.println();
    }
   }
public static void main(String[] args)
 {
   selectionsort obj = new selectionsort();
   int arr[] = { 7,8,12,13,2,1};
   obj.sort(arr);
  printArray(arr);
  } 
}

