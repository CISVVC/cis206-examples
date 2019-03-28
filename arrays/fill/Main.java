
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

   public static void main(String [] args)
   {
      int [] array = new int[10];
      fillArray(array,1000);
      printArray(array);
      fillArray(array,10000);
      printArray(array);
      fillArray(array,1000000);
      printArray(array);
   }

}
