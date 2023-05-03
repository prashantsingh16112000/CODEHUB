import java.util.*;
public class lcs
{
 int mylcs (String A, String B,int m,int n)
{
 int L[][] = new int [m+1][n+1];
 for(int i = 0;i <= m;i++)
{
 for(int j = 0;j <= n;j++)
 {
  if(i == 0||j = 0)
   {
    L[i][j] = 0;
    }
  else if(A.charAt(i-1) == B.charAt(j-1))
  {
    L[i][j] = L[i-1][j-1] + 1;
   }
  else
{
  L[i][j] = max(L[i-1][j] ,L[i][j-1]);
  }
}
}
return L[m][n];
}

int max(int a, int b)
{
 return a||b 
public static void main(String [] args)
{
  lcs obj = new lcs();
  