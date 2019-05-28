
public class Person implements Comparable
{
   private String lastname;

   public Person(String lastname)
   {
      this.lastname = lastname;
   }

   @Override
   public int compareTo(Person r)
   {
      return this.lastname.compareTo(r.lastname);
   }

   public void setLastName(String lastname)
   {
      this.lastname = lastname;
   }

   @Override
   public String toString()
   {
      return this.lastname;
   }
}
