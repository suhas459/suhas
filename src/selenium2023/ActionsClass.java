package selenium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		//single click
		//double click
		//context click(right click)
		//scroll down 
		//move to element
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(800);
		driver.manage().window().maximize();
		
		//single click 
		
		WebElement hotel = driver.findElement(By.xpath("(//span[contains(@class,'chNavIcon app')])[2]"));
		Thread.sleep(800);
		//hotel.click(); :- normal click 
		
		
		Actions a= new Actions (driver);
		Thread.sleep(800);
		a.click(hotel).perform(); 
		
//		// double click
//WebElement im =driver.findElement(By.xpath("(//p[@class='font20 latoBlack blackText appendBottom3'])[1]"));
//		
//		Thread.sleep(2800);
//		//a.click(image).build().perform();
//		im.click();
	Thread.sleep(3800);
		
		// scroll by Actions class
	
	WebElement all = driver.findElement(By.xpath("//span[text()='All Offers']"));
	Thread.sleep(800);
	a.scrollByAmount(0, 9800).perform();
	//a.scrollToElement(all).perform();
//JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeAsyncScript("arguments[0].scrollIntoView(true)",all);		
		
	
a.contextClick(all).build().perform();
		

	}

}
