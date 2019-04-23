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
       File file = new File("input.txt");

       Scanner input = new Scanner(file);

       while(input.hasNextInt())
       {
           int number = input.nextInt();
           System.out.println(number);    
       }

    }

}
