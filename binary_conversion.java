package testing;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
public class binary_conversion 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int decimal=in.nextInt();
		String binary=Integer.toBinaryString(decimal);
		System.out.println("binary is:"+binary);
		System.out.println("octal is:");
		System.out.println(Integer.toOctalString(decimal));
		assertTrue(14==decimal);
	}
}
