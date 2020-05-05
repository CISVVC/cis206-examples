import java.util.ArrayList;

public class Main
{
   public static void main(String args[])
   {
      ArrayList<Rice> ricebowl = new ArrayList<Rice>();
      
      ricebowl.add(new Snap());
      ricebowl.add(new Crackle());
      ricebowl.add(new Pop());

      for(Rice rice : ricebowl)
      {
         rice.talk();
         System.out.println(rice);
      }



   } 

}
