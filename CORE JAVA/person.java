 class people {
 private String name;

 public String getName()
{
 return name;
 }
 public void setName(String newName)
{
 this.name = newName;
 }
}
  class person{
 public static void main(String[] args)
 {
  people obj = new people();
  obj.setName("john");
 System.out.println(obj.getName());
}
  }  
 