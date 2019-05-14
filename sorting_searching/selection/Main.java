
public class Main
{
   /**
   Sorts an array, using selection sort.
   @param a the array to sort
   */
   public static void sort(int[] a)
   {
      for (int i = 0; i < a.length - 1; i++)
      {
         int minPos = minimumPosition(a, i);
         ArrayUtil.swap(a, minPos, i);
      }
   }


   public static int minimumPosition(int [] a,int from)
   {
      int min = from;
      for(int i=from+1;i<a.length;i++)
         if(a[i] < a[min])
            min = i;
      return min;
   }

   public static void main(String [] args)
   {
      int [] array = {23,45,67,89,12,13,14,1,2};
      ArrayUtil.print(array);
      sort(array);
      ArrayUtil.print(array);
   }

}
