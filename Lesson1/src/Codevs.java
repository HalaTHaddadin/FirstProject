import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Codevs {
 
	WebDriver driver= new ChromeDriver();
	
	
	@BeforeTest
	public void mySetup()
	{
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/2/loginPage/login.html");
		
	}
	@Test
	public void myTest() {
		
		System.out.println(driver.getTitle());		
		
		WebElement UserName= driver.findElement(By.name("username"));
		WebElement Password= driver.findElement(By.xpath("//input[@name='password']"));
WebElement LoginButton=driver.findElement(By.cssSelector(".L"));

		UserName.sendKeys("Helo Hala");	
	    Password.sendKeys("1234");	
        LoginButton.click();
}}
