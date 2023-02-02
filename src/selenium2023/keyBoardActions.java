package selenium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://mdbootstrap.com/docs/standard/extended/dropdown-button/");
		Thread.sleep(800);
		driver.manage().window().maximize();
		
		
		Actions a= new Actions(driver);
		
		WebElement bootStrp= driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']"));
		Thread.sleep(1500);
		a.scrollToElement(bootStrp).perform();
		Thread.sleep(1500);
		a.click(bootStrp).perform();
		Thread.sleep(1500);
a.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(1500);
a.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
	}

}
