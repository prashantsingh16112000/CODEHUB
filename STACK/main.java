class main
{
 static void towerofHanoi(int n, char source, char auxilary, char destination)
 {
  if(n==0)
 {
  return;
 }
 towerofHanoi(n-1,source,auxilary,destination);
 System.out.println("move disk from" +source+ "to auxilary"+auxilary+ "then to destination" +destination);
 towerofHanoi(n-1,source,auxilary,destination);
 }
public static void main(String[] args)
 {
 int N = 4;
  towerofHanoi(N,'A','B','c');
  }
}