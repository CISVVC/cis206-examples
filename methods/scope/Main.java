public class Main
{
    private static int x = 100;

    public static void foo2()
    {
        System.out.println("In foo2() x = " + x);
    }

    public static void foo()
    {
        int x = 10;
        System.out.println("In foo() x = " + x);
        System.out.println("In foo() Main.x = " + Main.x);
    }

    public static void main(String[] args)
    {
        int x = 20;
	if(x == 20)
	{
		int y = 100;
		System.out.println(y);
	}

        foo(); 
        foo2(); 
    }
}
