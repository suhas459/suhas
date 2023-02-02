package selenium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptionsClass {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");
ChromeOptions co= new ChromeOptions();
co.addArguments("--incognito");
co.addArguments("--disable-notification")	;	
		
		WebDriver driver= new ChromeDriver(co);
		driver.navigate().to("https://www.facebook.com/login/?privacy");
		Thread.sleep(800);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("9156892856");
		Thread.sleep(800);
		driver.findElement(By.id("pass")).sendKeys("Suhas@123");
		Thread.sleep(800);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(800);
		
	}

}
