public class Main
{
   public static void main(String[] args)
   {
      final int NUMBER_OF_TRIES = 1000000;
      int hits = 0;
      for (int i = 0; i < NUMBER_OF_TRIES; i++)
      {
         double ylow = Math.random() * 2.0;
         double alpha = Math.random() * Math.PI;
         double yhigh = ylow + Math.sin(alpha);
         if (yhigh > 2.0)
         {
            hits++;
         }
      }
      System.out.printf("%d tries %d hits ratio is: %f", 
         NUMBER_OF_TRIES, hits,
         NUMBER_OF_TRIES / (double) hits);
   }
}
