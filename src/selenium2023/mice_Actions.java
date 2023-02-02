package selenium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mice_Actions {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(800);
		driver.manage().window().maximize();
		
		// click on create new Account
		
		
		Actions a= new Actions(driver);
		Thread.sleep(2000);
		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		
		a.click(create).perform();
		Thread.sleep(2000);
		
		// first name
		
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		Thread.sleep(2000);
		//a.sendKeys(name, "Suhas");	
		a.click(name);
		Thread.sleep(2000);
		a.keyDown(Keys.SHIFT).sendKeys("s").build().perform();
		Thread.sleep(1000);
		a.keyUp(Keys.SHIFT).sendKeys("uhas").build().perform();
		Thread.sleep(1000);
		
		// last name
		
	WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
	Thread.sleep(1000);
	a.click(LastName).perform();
	Thread.sleep(1000);
	

	
	
	a.keyDown(Keys.SHIFT).sendKeys("p").build().perform();
	Thread.sleep(1000);
	a.keyUp(Keys.SHIFT).sendKeys("owar").build().perform();
	Thread.sleep(1000);
	
	
	// mail
	
	WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	a.click(mail).perform();
	Thread.sleep(1000);
	a.sendKeys("suhaspowar2856@gmail.com").perform();
	
	/// re enter password
	Thread.sleep(1000);
	WebElement reEnterMail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	Thread.sleep(1000);
	a.click(reEnterMail).perform();
	Thread.sleep(1000);
	a.sendKeys("suhaspowar2856@gmail.com").perform();
	Thread.sleep(1000);
	
	//password set
	Thread.sleep(1500);
	WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	Thread.sleep(1500);
	a.click(pwd).perform();
	Thread.sleep(1500);
	a.sendKeys("Suhas@123").perform();
	Thread.sleep(1500);
	
	// day select  for Birthday 
	
	WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	
	a.click(day).perform();
	Thread.sleep(1500);
	//a.sendKeys(Keys.ARROW_DOWN).perform();
	
	for(int i=28;i<=31;i++) {
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1500);
	}
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1500);
		
		
		// section of month
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		a.click(month).perform();
		Thread.sleep(1500);
		for(int j=1;j<=6;j++) {
			
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
			a.sendKeys(Keys.ENTER).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


