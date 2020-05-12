public class Main {

   public static void display(CashRegister reg) {
      System.out.printf("Item %d: $%.2f\n",reg.getCount(),reg.getTotal());
   }
   
   public static void main(String arg[]) {
      CashRegister register1 = new CashRegister();
      CashRegister register2 = new CashRegister();
      System.out.println(register1);
      System.out.println(register2);
      register1.clear();
      register1.addItem(1.95);
      display(register1);
      register1.addItem(0.95);
      display(register1);
      register1.addItem(2.50);
      display(register1);

      System.out.println("The instances of CashRegister "+CashRegister.instanceCount());
   }

}

