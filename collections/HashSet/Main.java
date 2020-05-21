import java.util.HashSet;
import java.util.Iterator;

public class Main
{

   public static void main(String [] args)
   {
      HashSet<Integer> li = new HashSet<Integer>();
      HashSet<String> list = new HashSet<String>();
      HashSet<Employee> empl = new HashSet<Employee>();

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

      list.add("string 1");
      list.add("string 2");
      list.add("string 3");
      list.add("string 4");
      for(String s : list)
         System.out.println(s);

      empl.add(new Employee("Fred"));
      empl.add(new Employee("Barney"));
      empl.add(new Employee("Wilma"));
      empl.add(new Employee("Betty"));

      for(Employee e : empl)
         System.out.println(e);



   }
}
