import java.util.HashSet;
import java.util.Iterator;

public class Main
{

   public static void main(String [] args)
   {
      HashSet<Integer> li = new HashSet<Integer>();
      HashSet<String> list = new HashSet<String>();

      li.add(13);
      li.add(10);
      li.add(14);
      li.add(12);
      li.add(11);

      Iterator<Integer> intIter = li.iterator();

      while(intIter.hasNext())
      {
         int i = intIter.next();
         System.out.println(i);
      }
      /*
      for(int i : li)
         System.out.println(i);
         */

      list.add("string 1");
      list.add("string 2");
      list.add("string 3");
      list.add("string 4");

   }
}
