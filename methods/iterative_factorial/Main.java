public class Main
{
   /*
    *  0! = 1
    *  1! = 1
    *  n! = n * (n-1) * (n-2) . . . * 1
    *  n! = n * (n-1)!
    *
    *  5! = 5 * 4 * 3 * 2 * 1
    *     = 120
    */


    public static int fact(int n)
    {
        if(n == 0) 
	   return 1;
        else	
           return n * fact(n-1);
    }


    public static void main(String[] args)
    {
	// fact(5) = 120
	System.out.println("0! = " + fact(0));
	System.out.println("5! = " + fact(5));

    }
}
