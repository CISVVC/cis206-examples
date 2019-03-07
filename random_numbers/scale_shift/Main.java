public class Main
{

   public static void main(String[] args) { 
      for (int i = 1; i <= 10; i++) {
         double r = Math.random();
         int roll = (int)(r * 10) % 6 + 1;
         System.out.println(roll);
      }
   }
}
