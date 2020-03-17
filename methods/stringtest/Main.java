public class Main
{

  public static String scramble(String s1) 
  {
	 String build; 
	 build = String.valueOf(s1.charAt(0)) + String.valueOf(s1.charAt(s1.length() - 1));
	 return build;
  }

   public static void main(String args[])
   {
	   String s = "This is a sentence";
           System.out.println(scramble(s));
   }
}
