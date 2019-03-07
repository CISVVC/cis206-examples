public class Main
{
   public static void main(String args[])
   {
      for(int i=0;i < 1000;i++)
      {
         if(i == 5)
            continue;
         System.out.println(i+1);
         if(i > 10)
            break;
      }

   }
}
