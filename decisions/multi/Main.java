import java.util.Scanner;


public class Main
{
   public static void main(String args[])
   {
      // Determine if the pH measurement is acidic, basic or neutral
      //
      //
      double pH;
      Scanner input = new Scanner(System.in);
      pH = input.nextDouble();

      //double EPSILON = 0.000001;


      if (pH < 7.0)
         System.out.println("pH is acidic");
      else if (pH > 7.0)
         System.out.println("pH is basic");
      else
         System.out.println("pH is neutral");
      
   }

}
