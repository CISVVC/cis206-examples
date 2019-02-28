public class Main
{
   public static void main(String args[])
   {

      String document = "Airplanes";

      if(!(document.equals("Trucks") || document.equals("Cars")))
         System.out.println("Does not contain Trucks or Cars");
      else
         System.out.println("Contains Trucks or Cars");

      if( !(document.equals("Trucks")) && !(document.equals("Cars")) )
         System.out.println("Does not contain Trucks or Cars");
      else
         System.out.println("Contains Trucks or Cars");
   }
}
