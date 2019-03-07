import java.util.Scanner;

public class Main
{
   public static void main(String args[])
   {
      int response; 
      Scanner input = new Scanner(System.in);
      do
      {
         System.out.println("1. Email ");
         System.out.println("2. Web Browser ");
         System.out.println("3. Talk ");
         System.out.println("");
         System.out.println("0. Quit ");
         response =  input.nextInt();
         if(response == 1)
         {
            System.out.println("Start the email system");
         }
         else if(response == 2)
         {
            System.out.println("Start the Web Browser system");
         }
         else if(response == 3)
         {
            System.out.println("Start the Talk system");
         }
         else if(response != 0)
         {
            System.out.println("Invalid choice");
         }
      } while(response != 0);

   }
}
