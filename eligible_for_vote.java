package testing;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
public class eligible_for_vote 
{
	public static void main(String[] args)
	{
		int a,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter age:");
		a=scan.nextInt();
		if(a>=18)
		{
			System.out.print("person is eligible for vote");
		}
		else
		{
			n=(18-a);
			System.out.println("person eligible for vote after"+n+"years");
			assertTrue(a==n);
		}
	}
}
