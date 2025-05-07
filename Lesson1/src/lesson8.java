import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lesson8<JavascriptExcecutor> {


	WebDriver driver= new ChromeDriver();

	Random Rand=new Random();
	@BeforeTest
	public void mySetup() {
		
		driver.get("https://codenboxautomationlab.com/practice/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1,enabled=false)
	public void myTest() throws InterruptedException {
		
		WebElement autoCompleteDataFied =driver.findElement(By.id("autocomplete"));
		
		String [] Countries = {"jo","ja","sy","ye"};
		
				int randomIndex= Rand.nextInt(Countries.length);
				
				System.out.println(randomIndex);
		autoCompleteDataFied.sendKeys(Countries[randomIndex]);
		
		Thread.sleep(1000);
		autoCompleteDataFied.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

	}
	@Test(priority=2,enabled=false)
	public void SelectTag() throws InterruptedException {
		
		
		WebElement TheSelector=driver.findElement(By.id("dropdown-class-example"));
		Select mySelect=new Select(TheSelector);
		
		//mySelect.selectByIndex(2);
		
		//mySelect.selectByValue("option3");
		
		mySelect.selectByVisibleText("Selenuim");
		
		
		System.out.println(TheSelector.findElement(By.tagName("option")).getSize());

	}
	@Test(priority=3,enabled=false)
	public void CheckBox() throws InterruptedException {
		WebElement DivOfCheckBox= driver.findElement(By.id("checkbox-example"));		
		
		List<WebElement> AllCheckBoxes= driver.findElements(By.tagName("Label"));	
		
		//Add Check Boxes one by one
		
		AllCheckBoxes.get(0).click();
		AllCheckBoxes.get(1).click();
		AllCheckBoxes.get(2).click();
		
		
		//Randomly we need
		
		int randomIndex=Rand.nextInt(AllCheckBoxes.size());
		int randomIndex1=Rand.nextInt(AllCheckBoxes.size());	
		int randomIndex2=Rand.nextInt(AllCheckBoxes.size());


		//Add one CheckBoxe Randomly
		AllCheckBoxes.get(randomIndex).click();

		//Add two CheckBoxe Randomly
				AllCheckBoxes.get(randomIndex1).click();
				AllCheckBoxes.get(randomIndex2).click();
			
				//all check boxes
				
				for (int i=0; i<AllCheckBoxes.size();i++)
				{
					AllCheckBoxes.get(i).click();
				}
			
}
	@Test(priority =4 , enabled = false)
	public void RadioButton() {

		List<WebElement> AllRadioButton = driver.findElements(By.className("radioButton"));

		int totalRadioButtons = driver.findElements(By.className("radioButton")).size();

		// this is to select random radio button
		int RandomRadioButtonIndex = Rand.nextInt(totalRadioButtons);

		AllRadioButton.get(RandomRadioButtonIndex).click();

		/*
		 * __ if you need to select spcific raido button to be clicked __
		 * 
		 * AllRadioButton.get(0).click(); AllRadioButton.get(1).click();
		 * AllRadioButton.get(2).click();
		 * 
		 */
	}
	
	@Test(priority =5, enabled = false)
	public void Swich_Windows() throws InterruptedException {
		
		WebElement SwitchWindowButton=driver.findElement(By.id("openwindow"));
		SwitchWindowButton.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> windowList=new ArrayList<>(handles);
	Thread.sleep(2000);	
		driver.switchTo().window(windowList.get(1));

		System.out.println(driver.getTitle());
		 

		WebElement Home=driver.findElement(By.xpath("//*[@id=\"menu-item-9660\"]/a/span[1]"));
		Home.click();
		 Thread.sleep(2000);
		 
        driver.switchTo().window(windowList.get(0));
		
		System.out.println(driver.getTitle());
		
	}
	
	@Test(priority = 6, enabled = false)
	public void Switch_Tab_Example() throws InterruptedException {
		WebElement SwitchTabButton = driver.findElement(By.id("opentab"));

		SwitchTabButton.click();

		Set<String> handles = driver.getWindowHandles();

		List<String> TabList = new ArrayList<>(handles);

		driver.switchTo().window(TabList.get(1));

		Thread.sleep(2000);

		System.out.println(driver.getTitle());

		driver.switchTo().window(TabList.get(0));
		Thread.sleep(2000);

		System.out.println(driver.getTitle());
	}
	@Test(priority =7, enabled = false)
	public void Alert_Example() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement InputName =driver.findElement(By.id("name"));
InputName.sendKeys("Hala");
Thread.sleep(2000);

		WebElement Alert =driver.findElement(By.id("alertbtn"));
		
		Alert.click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		
	}
	@Test(priority =8, enabled = false)
	public void Confirm_Example() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement InputName =driver.findElement(By.id("name"));
		InputName.sendKeys("Hala");
		Thread.sleep(2000);

		WebElement Confirm =driver.findElement(By.id("confirmbtn"));
		Confirm.click();
		Thread.sleep(2000);

		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

		
}
	@Test(priority =9,enabled = false)
	public void Table() throws InterruptedException {
		
		WebElement Table = driver.findElement(By.id("product"));
		
		List<WebElement> AllRows= Table.findElements(By.tagName("tr"));	
		List<WebElement> AllData= Table.findElements(By.tagName("td"));	

		
//		int randomRow = 	Rand.nextInt(AllRows.size());
//	System.out.println(AllRows.get(randomRow).getText());
		
		
		//for(int i=0;i<AllRows.size();i++) {
			
			
			//System.out.println(AllRows.get(i).getText());
	//	}
		
//	for(int i=0;i<AllData.size();i++) {
			
			
		//	System.out.println(AllData.get(i).getText());
		//}
		//print instructor only
				for(int i=0;i<AllData.size();i=i+3) {
					System.out.println(AllData.get(i).getText());}
				
				//print prices only
				for(int i=2;i<AllData.size();i=i+3) {
					System.out.println(AllData.get(i).getText());}
		
	}
	
	@Test(priority =10,enabled = false)
	public void Element_Displayed () throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 1650)");

		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		js1.executeScript("alert('help')");
		Thread.sleep(2000);

		WebElement HideButton =driver.findElement(By.id("hide-textbox"));
			 
			 HideButton.click();
				Thread.sleep(2000);

 WebElement ShowButton =driver.findElement(By.id("show-textbox"));
			 
 ShowButton.click();
}
	@Test(priority =11,enabled = false)
	public void Enabled_Disabled() throws InterruptedException {
			 WebElement DisButton =driver.findElement(By.id("hide-textbox"));
			 
			 DisButton.click();
				Thread.sleep(2000);

 WebElement EnButton =driver.findElement(By.id("show-textbox"));
			 
 EnButton.click();
 
 WebElement Input = driver.findElement(By.id("enabled-example-input"));
 Input.sendKeys("hello");
}
	@Test(priority =12,enabled = false)
	public void MouseHover() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 1750)");
		Thread.sleep(2000);

		WebElement S =driver.findElement(By.id("mousehover"));
		Actions action=new Actions(driver);
		
		action.moveToElement(S).click().perform();
		
		//WebElement Top =driver.findElement(By.partialLinkText("To"));
		
		//Top.click();
		//WebElement Top1 =driver.findElement(By.partialLinkText("Top"));
//Top1.click();

WebElement Reload =driver.findElement(By.linkText("Reload"));
Reload.click();
		
//refresh Selenium 

driver.navigate().refresh();

	} 
	@Test(priority =13,enabled = false)
	public void Calender() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 1850)");
		Thread.sleep(2000);
		
		
		WebElement CalenderTab=driver.findElement(By.linkText("Booking Calendar"));
		CalenderTab.click();
		
		Thread.sleep(2000);
	Set<String> handles=driver.getWindowHandles();
		
		List<String> windowList=new ArrayList<>(handles);
	Thread.sleep(2000);	
		driver.switchTo().window(windowList.get(1));
		
		WebElement TheTable=driver.findElement(By.cssSelector(".datepick-inline"));
		
		List<WebElement> tds=TheTable.findElements(By.tagName("td"));
		
		for(int i = 0;i<tds.size();i++)
		{
			System.out.println(tds.get(i).getText());		
		
	}
	}
	@Test(priority =14)
	
	public void iFrame() throws InterruptedException {	

	
	
	}}

