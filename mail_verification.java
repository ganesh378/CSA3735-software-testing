package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class mail_verification
{
public static void main(String[] args) 
	 {	
		System.out.println("hai");
		System.setProperty("webdriver.chrome.driver","D:\\Sellinium and junit\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();				
		driver.get("https://www.gmail.com");
		WebElement username=driver.findElement(By.id("txtusername"));
		System.out.println(username);
		WebElement password=driver.findElement(By.id("txtpassword"));
		System.out.println(password);
		WebElement login=driver.findElement(By.name("btnlogin"));
		System.out.println(login);
		username.sendKeys(".");
		password.sendKeys("");
		login.click();
      }
}