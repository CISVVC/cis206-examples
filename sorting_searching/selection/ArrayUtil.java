public class ArrayUtil
{
   public static void swap(int [] a,int from,int to)
   {
      int temp=a[from];
      a[from] = a[to];
      a[to] = temp;
   }


   public static void print(int[] a)
   {
      for(int i=0;i<a.length;i++)
         System.out.print(a[i] + " ");
      System.out.println();
   }
}
