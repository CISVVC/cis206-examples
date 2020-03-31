public class Main
{

/**
 * This method is used to return the square of the given number
 * @param x this is the number to square
 * @return double this returns the square of the given number
 */
   public static double square(double x)
   {
      return x * x;
   }

/**
 * This method is used to return the cube of the given number
 * @param x this is the number to cube
 * @return double this returns the cube of the given number
 */
   public static double cube(double x)
   {
      return x * x * x;
   }

/**
 * This method is adds 2 given integers
 * @param x this is the first integer
 * @param y this is the second integer
 * @return int this returns the sum of the 2 given numbers
 */
   public static int add(int x,int y) {
        return x + y;
   }

   public static void main(String[] args)
   {


      System.out.printf("value\tsquare\tcube\tvalue+(value+2)\n");
      for(int i=1;i<10;i++)
      {
         System.out.printf("%d\t%d\t%d\t%d\n",
                           (int)i,(int)square(i),(int)cube(i),add(i,i+2));
      }

   }
}
