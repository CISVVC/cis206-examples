import java.util.LinkedList;

public class Main
{
   public static void main(String [] args)
   {


      LinkedList<Integer> li = new LinkedList<Integer>();
      li.add(13);
      li.add(10);
      li.add(14);
      li.add(12);
      li.add(11);
      ListUtils.<Integer>print(li);


      LinkedList<String> string_list = new LinkedList<String>();
      list.add("string 1");
      list.add("string 2");
      list.add("string 3");
      list.add("string 4");
      ListUtils.<Integer>print(string_list);

      
      LinkedList<Employee> employees = new LinkedList<Employee>();
      employees.add(new Employee("Fred"));
      employees.add(new Employee("Barney"));
      employees.add(new Employee("Wilma"));
      employees.add(new Employee("Betty"));
      
      ListUtils.<Employee>print(employees);

   }
}
