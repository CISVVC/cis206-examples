import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
 * https://docs.oracle.com/javase/8/docs/api/java/io/File.html
 * https://docs.oracle.com/javase/8/docs/api/java/io/FileNotFoundException.html
 */

public class Main
{

    public static void main(String args[]) throws FileNotFoundException
    {
       File file = new File("records.txt");

       Scanner input = new Scanner(file);
       input.useDelimiter("");

       String currentWord = "";
       while(input.hasNext())
       {
          String c = input.next();
          if(! c.equals(";")) {
             currentWord += c;
          }
          else {
            System.out.println(currentWord);
            currentWord = "";
          }
       }
       System.out.print(currentWord);

    }

}
