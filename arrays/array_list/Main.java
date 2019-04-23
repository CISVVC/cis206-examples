import java.util.ArrayList;


public class Main
{
   public static void print_list(ArrayList<String> names)
   {
      for(String name  : names)
         System.out.printf("%s ", name );
      System.out.println();
   }


   public static void main(String [] args)
   {
      ArrayList<String> names = new ArrayList<String>();


      names.add("Fred");
      names.add("Barney");
      names.add("Wilma");
      names.add("Betty");

      print_list(names);

   }
}

