import java.util.Scanner;

public class Main
{
   public static void main(String args[])
   {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a word : ");
         String mystring =  input.next();
         System.out.println("You entered: " + mystring);

         System.out.print("Enter a sentence : ");
         mystring =  input.nextLine();
         System.out.println("You entered: " + mystring);
   }
}
