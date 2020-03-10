/*
Put the header comment here
*/
public class Main
{
   public static void main(String[] args)
   {
      String string1 = "Hello";
      String string2 = new String("Hello");

      if(string1 == string2)
      {
         System.out.println("They are referring to the same thing");
      }
      else
      {
         System.out.println("They are not referring to the same thing");
      }

      if(string1.equals(string2))
      {
         System.out.println("They are equal");
      }
      else
      {
         System.out.println("They are not equal");
      }

   }
}

