/**
 * File: Main.java
 * Description: Input/Output Example
 *
 */
import java.util.Scanner;

public class Main
{

   public static void main(String args[])
   {
      double milePerMeter = 0.0006213712;
      double feetPerMeter = 3.28084;
      double inchesPerMeter = 39.37008;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter number of meters:");

      double meters = input.nextDouble();


      System.out.println("miles: " + meters * milePerMeter);
      System.out.println("feet: " + meters * feetPerMeter);
      System.out.println("inches: " + meters * inchesPerMeter);
   }

}
