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
       System.out.println("c:\Code\Main.java");
       Scanner input = new Scanner(file);

       while(input.hasNextLine())
       {
          String buffer = input.nextLine();
          String[] values = buffer.split(";");

          String name = values[0];
          String category = values[1];
          String sale_amount = values[2];
          String date = values[3];

          System.out.println("Name :" + name);
          System.out.println("Category :" + category);
          System.out.println("Sale Amount :" + sale_amount);
          System.out.println("Date :" + date);
          System.out.println("******************");
       }

    }

}
