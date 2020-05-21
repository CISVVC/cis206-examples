import java.util.LinkedList;

public class ListUtils<T>
{
   public static<T> void print(LinkedList<T> l)
   {
      for(T data : l)
      {
         System.out.println(data);
      }
   }
}
