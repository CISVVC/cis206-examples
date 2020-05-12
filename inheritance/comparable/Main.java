import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/**
   This program demonstrates the measurable BankAccount and Country classes.
*/
public class Main
{
   public static void main(String[] args)
   {
      ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
      accounts.add(new BankAccount(0));
      accounts.add(new BankAccount(1000));
      accounts.add(new BankAccount(500));
      accounts.add(new BankAccount(100));
      accounts.add(new BankAccount(20000));
      System.out.println("Before Sort:");
      for(BankAccount b : accounts)
      {
         System.out.println(b);
      }
      Collections.sort(accounts);
      System.out.println("After Sort:");
      for(BankAccount b : accounts)
      {
         System.out.println(b);
      }

/*
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 514000);
      countries[2] = new Country("Belgium", 30510);
      */

   }

   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      if (objects.length == 0) { return 0; }
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      return sum / objects.length;
   }
}
