/*
Put the header comment here
*/
public class Main
{

  public static String rem_dups(String s) {
    if(s.length() <= 1) return s;
    // s = s[0] + s[1] + s[2] + . . .
    if(s.charAt(0) == s.charAt(1))
       return rem_dups(s.substring(1));
    return s.charAt(0) + rem_dups(s.substring(1));
   }

   public static void main(String[] args)
   {
      System.out.println(rem_dups("aaaabbbbbcccccdddddeeeeffffhhhhiiiijjjj"));

   }
}

