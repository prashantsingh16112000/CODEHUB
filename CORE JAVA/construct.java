public class construct 
{
 int modelyear;
 String modelname;

public construct(int year, String name)
{
modelyear = year;
modelname = name;
}

 public static void main(String[] args)
{
construct myobj = new construct(1967 , "porsche");
System.out.println(myobj.modelyear +" "+ myobj.modelname);
 } 
   }