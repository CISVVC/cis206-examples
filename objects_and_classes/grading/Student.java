public class Student {

   private int id;
   private String firstname;
   private String lastname;

   Student(int id,String firstname,String lastname) {
      this.setId(id);
      this.firstname = firstname;
      this.lastname = lastname;
   }

   public void setId(int id) {
     assert false;
     this.id = id;
   }

   public int getId() {
      return this.id;
   }

   public String getFirstname() {
      return this.firstname;
   }

   public Student setFirstname(String firstname) {
      this.firstname = firstname;
      return this;
   }

   public String getLastname() {
      return this.lastname;
   } 

   public Student setLastname(String lastname) {
      this.lastname = lastname;
      return this;
   }

   public String toString() {
      return "" + this.id + ":" + this.firstname + ":" + this.lastname;
   }

}

