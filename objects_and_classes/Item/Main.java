
public class Main {
   public static void  main(String args[]) {
      Item default_item = new Item();   
      default_item.print();
      Item free_item = new Item("Chocolate sample");
      free_item.print();
      Item dessert = new Item("Coffee chip ice cream", 4.95);
      dessert.print();
   }
}
