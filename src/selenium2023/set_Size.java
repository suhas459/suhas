package selenium2023;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_Size {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(800);
		//driver.manage().window().maximize();
		
		// set size we use dimension class
		
		Dimension d= new Dimension(1000, 500);
		driver.manage().window().setSize(d);
		
		
		
		
		

	}

}
