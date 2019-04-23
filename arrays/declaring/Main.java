public class Main
{


   public static void print_array(double [] values)
   {
      //for(int i=0;i<values.length;i++)
      //   System.out.printf("%.2f ",values[i]);
      for(double value : values)  // using the enhanced for loop
         System.out.printf("%.2f ",value);
      System.out.println();
   }

   public static double average(double [] array_values)
   {
      double sum = 0;

      array_values[2] = 1.8;
      for(int i=0;i<array_values.length;i++)
         sum += array_values[i];

      return sum / array_values.length;
   }

   public static void main(String [] args)
   {
      //double [] values = new double [4];
      double [] values = {1.2,1.3,1.4,1.5};

      values[0] = 1.2;
      values[1] = 1.3;
      values[2] = 1.4;
      values[3] = 1.5;
      print_array(values);
      System.out.println("The average is: " + average(values));
      print_array(values);
      System.out.println("The average is: " + average(values));
      print_array(values);

   }
}
