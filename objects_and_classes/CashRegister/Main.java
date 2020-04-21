public class Main {

   public static void display(CashRegister reg) {
      System.out.printf("Item %d: $%.2f\n",reg.get_count(),reg.get_total());
   }
   
   public static void main(String arg[]) {
      CashRegister register1 = new CashRegister();
      register1.clear();
      register1.add_item(1.95);
      display(register1);
      register1.add_item(0.95);
      display(register1);
      register1.add_item(2.50);
      display(register1);
   }

}

