public class Employee
{
   private String fullname;

   public Employee(String fullname)
   {
      this.fullname = fullname;
   }

   public boolean equals(Employee e)
   {
      return this.fullname.equals(e.fullname);
   }

   public int hashCode()
   {
      return this.fullname.hashCode();
   }


   public String toString()
   {
      return "Employee.name = " + this.fullname;
   }

}
