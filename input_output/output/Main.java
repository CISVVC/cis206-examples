import java.io.File;
import java.io.PrintWriter;
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
       PrintWriter out = new PrintWriter("output.txt");

       while(input.hasNextLine())
       {
          String buffer = input.nextLine();
          String[] values = buffer.split(";");

          String name = values[0];
          String category = values[1];
          String sale_amount = values[2];
          String date = values[3];

          out.println("Name :" + name);
          out.println("Category :" + category);
          out.println("Sale Amount :" + sale_amount);
          out.println("Date :" + date);
          out.println("******************");
       }
       out.close();

    }

}
