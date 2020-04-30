
public class MyObject {
   public void someFunction() throws ArrayIndexOutOfBoundsException
   {
      //throw new Exception("Never use a Generic Exception, but this does demonstrate it");
      int [] ar = new int[2];
      System.out.println(ar[3]);
   }
}
