import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main
{

   public static int bin_search(String key,ArrayList<Person> list,int low,int high)
   {
      int mid = low + (high - low) / 2;
      if(mid >= 0 && mid <= high)
      {
         if(list.get(mid).getLastName().equals(key))
            return mid;
         if(list.get(mid).getLastName().compareTo(key) > 0 )
            return bin_search(key,list,low,mid-1);
         else 
            return bin_search(key,list,mid+1,high);
      }
      return -1;
   }

   public static void main(String [] args) throws FileNotFoundException
   {
      File f = new File("telephonedata.csv");
      Scanner file_in = new Scanner(f);
      int line_number = 0;
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
         }
         line_number++;
      }
      Collections.sort(telephone_list,new PersonComparator());
      int index=0;
      for(Person p : telephone_list)
      {
         System.out.println(""+index+": "+p);
         index++;
      }
      System.out.println("Wrightim -> " + bin_search("Wrightim",telephone_list,0,telephone_list.size()-1));
   }
}
