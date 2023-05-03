class exception12
{
 public static void main(String[] args)
{
 String name = args[0];
 int marks1 = Integer.parseInt(args[1]);
 int marks2 = Integer.parseInt(args[2]);
 int marks3 = Integer.parseInt(args[3]);
 int marks4 = Integer.parseInt(args[4]);
 int marks5 = Integer.parseInt(args[5]);
 try
  {
   if(marks1<0 || marks1>100)
   { 
    throw new NumberFormatException("marks1");
    }
   if(marks2<0 || marks2>100)
   {
    throw new NumberFormatException("marks2");
    }
   if(marks3<0 || marks3>100)
   {
    throw new NumberFormatException("marks3");
   }
   if(marks4<0 || marks4>100)
   {
    throw new NumberFormatException("marks4");
    }
   if(marks5<0 || marks5>100) 
   {
    throw new NumberFormatException("marks5");
   }
  }
catch(NumberFormatException e)
 {
   e.printStackTrace();
 }
   
  System.out.println("student name :"+name);

   System.out.println("first subject marks :"+marks1);
   System.out.println("second subject marks :"+marks2);
   System.out.println("third subject marks :"+marks3);
   System.out.println("fourth subject marks :"+marks4);
   System.out.println("fifth subject marks :"+marks5);
    }
   }