public class Student {

   private int id;
   private String firstname;
   private String lastname;

   Student(int id,String firstname,String lastname) {
      this.id = id;
      this.firstname = firstname;
      this.lastname = lastname;
   }

   public int getId() {
      return this.id;
   }

   public String getFirstname() {
      return this.firstname;
   }

   public String getLastname() {
      return this.lastname;
   } 

   public String toString() {
      return "" + this.id + ":" + this.firstname + ":" + this.lastname;
   }

}

