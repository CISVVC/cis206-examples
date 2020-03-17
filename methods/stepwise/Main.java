public class Main
{

   
   public static String digit(int i)
   {
      String result;
      if(i == 1)
         result = "one";
      else if(i == 2)
         result = "two";
      else if(i == 3)
         result = "three";
      else if(i == 4)
         result = "four";
      else if(i == 5)
         result = "five";
      else
         result = "";
      return result;
   }

   public static void main(String args[])
   {
         int a = 241;
         System.out.println(digit(a / 100)); 
         System.out.println(digit(a / 10 % 10)); 
         System.out.println(digit(a % 10)); 
         //System.out.println(digit(a));
   }
}
