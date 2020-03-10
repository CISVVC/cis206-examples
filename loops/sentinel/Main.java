/*
Put the header comment here
*/
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int data = input.nextInt();
      int UPPER = 100;
      int LOWER = 80;
      int count = 0;
      while(data != -1)
      {
         if(data >= 80 && data <= 100)
         {
            count++;
         }
         data  = input.nextInt();
      }
      System.out.println("There are " + count + " numbers between " + LOWER + " and " + UPPER);

   }
}

