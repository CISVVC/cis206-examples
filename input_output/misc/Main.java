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
      System.out.println("This is output");

      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a double value: ");
      double d = input.nextDouble();
      System.out.print("Enter an integer value: ");
      double i = input.nextInt();

      System.out.println("The double value is: "+d+"\n And the integer value is: "+i);
      double square = d * d;

      System.out.println("The square of d is: "+square);

   }

}
