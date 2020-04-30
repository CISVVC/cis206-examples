/**
 * File: Main.java
 * Description: Demonstrate using an object that throws an Exception
**/ 

public class Main {

   public static void main(String args[]) {
//      try {
         MyObject mb = new MyObject();
         mb.someFunction();
//      } 
//      catch (ArrayIndexOutOfBoundsException e) {
//         System.out.println("Thrown  :" + e);
//      }
      System.out.println("Out of the try catch block");
   }
}
