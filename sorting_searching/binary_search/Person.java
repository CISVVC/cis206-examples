public class Person implements Comparable<Person>
{
   private String lastname;

   public Person(String lastname)
   {
      this.lastname = lastname;
   }

   public String getLastName()
   {
      return this.lastname;
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

   @Override
   public int compareTo(Person p)
   {
      return lastname.compareTo(p.lastname);
   }

}
