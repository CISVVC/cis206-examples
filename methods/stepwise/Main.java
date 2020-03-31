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
      else if(i == 6)
         result = "six";
      else if(i == 7)
         result = "seven";
      else if(i == 8)
         result = "eight";
      else if(i == 9)
         result = "nine";
      else if(i == 0)
         result = "zero";
      else
         result = "invalid";
      return result;
   }

   public static void main(String args[])
   {
         int a = 241;
         System.out.println(digit(a / 10000 % 10)); 
         System.out.println(digit(a / 1000 % 10)); 
         System.out.println(digit(a / 100 % 10)); 
         System.out.println(digit(a / 10 % 10)); 
         System.out.println(digit(a % 10)); 
   }
}
