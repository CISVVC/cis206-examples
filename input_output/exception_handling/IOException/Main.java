import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
/*
Put the header comment here
*/
public class Main
{
	public static double[] readData(Scanner in) throws IOException {
		int numberOfValues = in.nextInt();   // NoSuchElementException
		double[] data = new double[numberOfValues];
		for (int i = 0; i < numberOfValues; i++)
		{
			data[i] = in.nextDouble();         // NoSuchElementException
		}  
		if (in.hasNext())
		{
			throw new IOException("End of file expected");
		}
		return data;
   }

   public static void main(String[] args) throws FileNotFoundException
   {
		File f = new File("input.dat");
		Scanner s = new Scanner(f);
		try {
		   readData(s);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(NoSuchElementException e) {
			System.out.println(e);
		}

   }
}

