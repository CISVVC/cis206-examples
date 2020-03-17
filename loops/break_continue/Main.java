/*
Put the header comment here
*/
public class Main
{
   public static void main(String[] args)
   {
      String s = "abcdegfhijkl";
      
      int length = s.length();
      int count =0;
      while(true)
      {
         if(count > length-1) 
            break;
         System.out.println(s.charAt(count));
         count++;
      }

      for(int i=0;i < 10;i++)
      {
         if(i == 4)
            continue;
         System.out.println(i);
      }

   }
}

