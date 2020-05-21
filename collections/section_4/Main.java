import java.awt.Color;
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
      Map<String, Color> favoriteColors = new TreeMap<String, Color>();
      favoriteColors.put("Juliet", Color.BLUE);
      favoriteColors.put("Romeo", Color.GREEN);
      favoriteColors.put("Adam", Color.RED);
      favoriteColors.put("Eve", Color.BLUE);

      // Print all keys and values in the map

      //Set<String> keySet = favoriteColors.keySet();
      for (String key : favoriteColors.keySet())
      {
         Color value = favoriteColors.get(key);
         System.out.println(key + " : " + value);
      }
   }
}
