package selenium2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("");
		Thread.sleep(800);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frm1");
		
		
		
		
		
		
		

	}

}
