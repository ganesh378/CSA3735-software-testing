package testing;
import static org.junit.Assert.assertTrue;
import java.util.Scanner; 
public class square_cube_of_decimal 
{
	public static void main(String[] args) 
	{ 
	Scanner s=new Scanner(System.in); 
	System.out.println("Enter an number"); 
	double n=s.nextDouble(); 
	double a=0.0,b=0.0; 
	a=n*n; 
	b=n*n*n; 
	System.out.println("The square of number="+a); 
	System.out.println("The square of number="+b); 
	assertTrue(25.0==a);
	assertTrue(125.0==b);
	}
}
