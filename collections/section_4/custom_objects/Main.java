import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

/**
   This program demonstrates a map that maps names to colors.
*/
public class Main
{
   public static void main(String[] args)
   {      
      Map<String, Employee> employees = new HashMap<String, Employee>();
      employees.put("fred", new Employee("Fred"));
      employees.put("barney", new Employee("Barney"));
      employees.put("wilma", new Employee("Wilma"));
      employees.put("betty", new Employee("Betty"));

      // Print all keys and values in the map
      MapUtils.<String,Employee>print(employees);

   }
}
