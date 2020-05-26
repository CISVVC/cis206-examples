import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 *
Put the header comment here
*/
public class Main
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File f = new File("owid-covid-data.csv");
      try {
         Scanner covid_data = new Scanner(f);
         while(covid_data.hasNextLine())
         {
            String line = covid_data.nextLine();
            System.out.println(line);
         }
         covid_data.close();
      }
      catch(FileNotFoundException e) {
        System.out.println("Problem with file"); 
      }


   }
}

