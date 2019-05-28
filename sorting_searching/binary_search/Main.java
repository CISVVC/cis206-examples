import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main
{
   public static void main(String [] args) throws FileNotFoundException
   {

      File f = new File("telephonedata.csv");
      Scanner file_in = new Scanner(f);
      int line_number = 0;
      //Person [] telephone_list = new Person[1000];
      ArrayList<Person> telephone_list = new ArrayList<Person>();
      while(file_in.hasNext())
      {
         if(line_number != 0)
         {
            String line = file_in.nextLine();
            String [] field = line.split(",");
            //telephone_list[line_number-1].setLastName(field[2]);
            telephone_list.add(new Person(field[2]));
            // field[0] is the id
            // field[1] is the first_name
            // field[2] is the last_name
            // field[3] is the phone_number
            System.out.println(line);
         }
         line_number++;
      }
      Collections.sort(telephone_list);
      for(Person p : telephone_list)
         System.out.println(p);
   }
}
