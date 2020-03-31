/*
 * Program will print out roman numeral equivalents of arabic numerals
*/
public class Main
{
   /**
    * This function will return roman digits based on the place value
    */

   public static String rDigits(String low,String mid,String high,int digit)
   {
      String v;
      switch(digit) 
      {
         case 9:
            v = low + high;
            break;
         case 8:
            v = mid + low + low + low;
            break;
         case 7:
            v = mid + low + low;
            break;
         case 6:
            v = mid + low;
            break;
         case 5:
            v = mid;
            break;
         case 4:
            v = low+mid;
            break;
         case 3:
            v = low+low+low;
            break;
         case 2:
            v = low+low;
            break;
         case 1:
            v = low;
            break;
         default:
            v = "error";
      }
      return v;
   }

   public static String getDigits(int digit,int place) {
      String v = "";
      switch(place)
      {
         case 1000:
            v =  rDigits("","","M",digit);
            break;
         case 100:
            v =  rDigits("C","D","M",digit);
            break;
         case 10:
            v =  rDigits("X","L","C",digit);
            break;
         case 1:
            v =  rDigits("I","V","X",digit);
            break;
      }
      return v;

   }

   public static int places(int d)
   {
      if(d >=1000) {
         return 1000;
      }
      else if(d >=100) {
         return 100;
      }
      else if(d >=10) {
         return 10;
      }
      else if(d >=1) {
         return 1;
      }
      return 0;

   }
// 2100
// 101   CI
   public static String roman(int i)
   {
      String v="";
      if(i >= 1000)
      {
         v += getDigits(i/1000,places(i));
         i = i % 1000;
      }
      if(i >= 100)
      {
         v += getDigits(i/100,places(i));
         i = i % 100;
      }
      if(i >= 10)
      {
         v += getDigits(i/10,places(i));
         i = i % 10;
      }
      if(i >= 1)
      {
         v += getDigits(i,places(i));
      }

      
      return v;
   }

   public static void main(String[] args)
   {
      for(int i = 1;i < 101;i++) {
          System.out.printf("%d -> %s\n",i,roman(i));
      }
   }
}

