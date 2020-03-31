public class Main
{

   
   public static double square(double x)
   {
      return x * x;
   }

   public static double cube(double x)
   {
      return x * x * x;
   }

   public static int add(int x,int y) {
        return x + y;
   }

   public static void main(String[] args)
   {


      for(int i=1;i<10;i++)
      {
         System.out.printf("%d\t%d\n",(int)square(i),(int)cube(i));
      }

   }
}
