
public class Main
{

   public static void fillArray(int [] array,int scale)
   {
      for(int i=0;i<array.length;i++)
      {
         array[i] = (int)(Math.random() * scale) + 1;
      }
   }

   public static void printArray(int [] array)
   {
      for(int i=0;i<array.length;i++)
      {
         System.out.printf("%d ",array[i]);
      }
      System.out.println();
   }
   
   public static int sumArray(int [] array)
   {
      int total = 0;
      for (int element : array)
      {
           total = total + element;
      }
      return total;

   }
   
   public static int average(int [] array)
   {
      return sumArray(array) / array.length;
   }

   public static void main(String [] args)
   {
      int [] array = new int[10];
      fillArray(array,1000);
      printArray(array);

      System.out.println("The sum is: " + sumArray(array));
      System.out.println("The average is: " + average(array));
   }

}
