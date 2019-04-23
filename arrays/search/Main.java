public class Main
{

   public static void fillArray(int [] array)
   {
      array[0] = 2;
      array[1] = 3;
      array[2] = 5;
      array[3] = 7;
      array[4] = 11;
      array[5] = 13;
   }

   public static void printArray(int [] array)
   {
      for(int i=0;i<array.length;i++)
      {
         System.out.printf("%d ",array[i]);
      }
      System.out.println();
   }

/**
 *
 */
   public static int search(int [] array,int key)
   {
      int found=-1;
      for(int i = 0;i < array.length; i++)
      {
         if(array[i] == key)
         {
            found = i;
            break;
         }
      }
      return found;

   }

   public static void main(String [] args)
   {
      int [] array = new int[10];
      fillArray(array);
      System.out.println("The position that 11 occurs is: " + search(array,11)); 
   }

}
