
public class Item {

   private String description; // Constructed with string::string()
   private double price = 0; // Data member with initializer; a C++ 11 feature

   public Item() {
   }

   public Item(String a_description) {
      description = a_description;
   }

   public Item(String a_description,double a_price) {
      description = a_description;
      price = a_price;
   }

   public void print() {
      System.out.printf("Description: %s Price: %.2f\n",description, price);
   }
}
