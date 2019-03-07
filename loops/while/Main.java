public class Main
{
   public static void main(String args[])
   {
      /*
        Start with a year value of 0, a variable for interest and a starting balance of 10000.
        Repeat the following steps while the balance is less than $20000
            Add 1 to the year value
            Compute the interest as a balance of 0.05 (5%)
            Add the interest to the balance
         Report the final year value as the answer
       */
      double TARGET = 20000.00;
      double INTEREST_RATE = 0.05;
      double balance = 10000;
      int year = 0;
      while(balance < TARGET)
      {
         year += 1;
         double interest = balance * INTEREST_RATE; 
         balance += interest;
      }

      System.out.println("Target met at year: " + year);

   }
}
