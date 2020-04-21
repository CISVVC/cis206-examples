
public class Main {

   public static void  main(String args[]) {
      BankAccount joes_account = new BankAccount();
      BankAccount lisas_account = new BankAccount(499.95);
      System.out.println("Joe's account balance: "+joes_account.get_balance());
      System.out.println("Lisa's account balance: "+lisas_account.get_balance());
   }
}
