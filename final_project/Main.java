import java.io.File;
import java.io.FileNotFoundException;

/*
 *
Put the header comment here
*/
public class Main
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File f = new File("owid-covid-data.csv");
      CSVParser csvfile = new CSVParser(f);
   }
}

