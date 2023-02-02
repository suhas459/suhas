package selenium2023;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(800);
	
		
		// to set position of desktop we use Point class
		
		Point p= new Point(500, 800);
		
		driver.manage().window().setPosition(p);		
			}

}
