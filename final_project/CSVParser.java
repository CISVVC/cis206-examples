import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVParser
{

      private final int ISO_CODE = 0;
      private final int DATE = 2;

      public CSVParser(File f) throws FileNotFoundException
      {
         try {
            Scanner covid_data = new Scanner(f);
            String header = covid_data.nextLine();
            while(covid_data.hasNextLine())
            {
               String line = covid_data.nextLine();
               String record[] = line.split(",");
               String date = record[DATE];
               System.out.println(record[ISO_CODE] + ":");
               for(String s : record)
                  System.out.println("       "+s);
               System.out.println();

            }
            covid_data.close();
         }
         catch(FileNotFoundException e) {
           System.out.println("Problem with file"); 
         }
      }
}
