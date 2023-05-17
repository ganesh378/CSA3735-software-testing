package testing;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
public class Daystoweeksyears 
{
	public static void main(String args[]) 
	{ 
		int m, year, week, day; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of days:"); 
		m = s.nextInt(); 
		year = m / 365; 
		assertTrue(2==year);
		System.out.println("No. of years:"+year);
		week = m / 7;
		System.out.println("No. of weeks:"+week); 
		day = m; 
		System.out.println("No. of days:"+day);
		}
}