package testing;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import java.util.Scanner;
public class string_comparison
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter username:");
		String str1=in.nextLine();
		System.out.println("re-enter username:");
		String str2=in.nextLine();
		assertEquals(str1,str2);
	}
}