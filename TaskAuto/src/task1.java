import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class task1 {
	
	WebDriver driver = new EdgeDriver();

	String TheWebsite = "https://www.saucedemo.com/";
	
	String UserName = "standard_user";
	String Password = "secret_sauce";


	@BeforeTest
	
	public void mySetup()

	{
		driver.manage().window().maximize();
		driver.get(TheWebsite);
		
	}

	@Test()
	public void login() throws InterruptedException {
		WebElement UserNameInput = driver.findElement(By.id("user-name"));
		WebElement PasswordInput = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UserNameInput.sendKeys(UserName);
		PasswordInput.sendKeys(Password);
		LoginButton.click();

	}
	
	@Test(priority=1)
	public void print()
	{
		List<WebElement> Print = driver.findElements(By.className("inventory_item_name"));
		
		for(int i=0;i<Print.size();i++)
		{String Prints=Print.get(i).getText();
		System.out.println(Prints.charAt(0));
		
		

	}
	}
	@Test(priority=2)
	public void TTest()
	{
		List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
	{
	
	for(int i = 0 ; i < ItemsNames.size();i++) {
		
		String itemName = ItemsNames.get(i).getText();
		
		if(itemName.startsWith("S")) {
			continue ; 
		}else {
			System.out.println(itemName);
		}
		
	}}}

@Test(priority=3)
public void TtTest()
{
	List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
{

	for(int i = 1 ; i < ItemsNames.size();i=i+2) {
		
		
		System.out.println(ItemsNames.get(i).getText());
		
	
}}}
@Test(priority=4)
public void TttTest()
{
	List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
{

	for(int i = 0 ; i < ItemsNames.size();i=i+2) {
		
		
		System.out.println(ItemsNames.get(i).getText());
		
	
}}}
@Test(priority=5)
public void TtttTest()
{
	List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
{

for(int i = 0 ; i < ItemsNames.size();i++) {
	
	if(ItemsNames.get(i).getText().equals("Sauce Labs Fleece Jacket")) {
		
		break ; 
	}
	System.out.println(ItemsNames.get(i).getText());
}}}
@Test(priority=5)
public void TttttTest()
{
	List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
{for(int i = 0 ; i < ItemsNames.size();i++) {
	
	if(ItemsNames.get(i).getText().equals("Sauce Labs Fleece Jacket")) {
		
		break ; 
	}
	System.out.println(ItemsNames.get(i).getText());

}}}
	@AfterTest
	public void after() {}
	
	}

