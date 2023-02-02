package selenium2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
//		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
//		Thread.sleep(800);
		
//		//implicit wait
//		
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		// hidden divison popup
//		 
//		 WebElement hiddenDivPopup = driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']"));
//		

		
driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_");
Thread.sleep(800);

WebDriverWait w= (WebDriverWait) new 
WebDriverWait(driver, Duration.ofSeconds(30));         

WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));




//	w.until(ExpectedConditions.elementToBeClickable(hiddenDivPopup)).click();
//hiddenDivPopup.click();
	w.until(ExpectedConditions.elementToBeClickable(male))	.click();
		

	}

}
