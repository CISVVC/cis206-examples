import java.util.Scanner;
public class Main
{
   public static int promptChoice()
   {
   }

   public static int promptSeat()
   {
      System.out.print("Enter the seat: ");
      Scanner input = new Scanner(System.in);
      int seat = input.nextInt();
      return seat;
   }

   public static int promptPrice()
   {
      System.out.print("Enter the price: ");
      Scanner input = new Scanner(System.in);
      int price = input.nextInt();
      return price;
   }

   public static void main(String [] args)
   {
      int choice = promptChoice();
      if(choice == 0 ) // then user wants to choose a seat
      {
         int seat = promptSeat();
      }
      else if(choice == 1 ) //then user want to choose by price
      {
         int price  = promptPrice();
      }

   }
}
