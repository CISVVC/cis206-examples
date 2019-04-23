public class Main
{

   
   public static double square(double x)
   {
      double  result = x * x;
      return result;
   }

   public static double cube(double x)
   {
      double  result = x * x * x;
      return result;
   }

   public static void main(String args[])
   {
   
      for(int i=1;i<10;i++)
      {
         System.out.printf("%d\t%d\n",(int)square(i),(int)cube(i));
      }

   }
}
