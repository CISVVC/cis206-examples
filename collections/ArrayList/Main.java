import java.util.ArrayList;

public class Main
{
   public static void main(String [] args)
   {
      ArrayList<Integer> li = new ArrayList<Integer>();
      ArrayList<String> list = new ArrayList<String>();

      li.add(13);
      li.add(10);
      li.add(14);
      li.add(12);
      li.add(11);

      for(int i=0;i<li.size();i++)
         System.out.println(li.get(i));
      
      for(int my_number : li)
         System.out.println(my_number);

      list.add("string 1");
      list.add("string 2");
      list.add("string 3");
      list.add("string 4");

   }
}
