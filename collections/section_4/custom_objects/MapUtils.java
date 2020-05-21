import java.util.Map;

public class MapUtils<T,T2>
{
   public static<T,T2> void print(Map<T,T2> map)
   {
      for(T key : map.keySet())
      {
         T2 value = map.get(key);
         System.out.println("Key:"+key+" Value:"+value);
      }
   }
}
