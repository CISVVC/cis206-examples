public class BankAccount {

   private double balance;

   public BankAccount() { // Sets balance to 0
      balance = 0;
   }
   public BankAccount(double initial_balance) { // Sets balance to initial_balance
      balance = initial_balance;   
   }

   public void deposit(double amount){
      balance = balance + amount;
   }

   public void withdraw(double amount){
      balance = balance - amount;
   }

   public double get_balance(){
      return balance;
   }

}
