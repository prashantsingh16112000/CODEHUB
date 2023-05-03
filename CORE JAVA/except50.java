import java.io.FileNotFoundException;
import java.io.PrintWriter;

class except50
{
 public static void main(String[] args)
{
  try
    {
     PrintWriter pw;
     pw = new PrintWriter("jtp.txt");
     System.out.println("saved");
    }
 catch(FileNotFoundException e)
{
 System.out.println(e);
 }
 System.out.println("file saved successfully");
}
   } 
  