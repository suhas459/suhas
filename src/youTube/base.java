package youTube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
protected	WebDriver driver;
	public void launchTheYouTube() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		 driver= new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(800);
		driver.manage().window().maximize();
		
		
		
		
	}
	
	
}
