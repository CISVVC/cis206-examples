import java.util.Scanner;

/**
   This program shows a simple quiz with two question types.
*/
public class Main
{
   public static void main(String[] args)
   {
      first.setAnswer("James Gosling");      

      ChoiceQuestion second = new ChoiceQuestion("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);

      presentQuestion(first);
      presentQuestion(second);
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(Question q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
}

