package selenium2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dynamicElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions c= new ChromeOptions();
		c.addArguments("--disable-notifications");
				
				
				WebDriver driver= new ChromeDriver(c);
				driver.navigate().to("https://www.google.com/");
				Thread.sleep(1500);
				
				driver.findElement(By.name("q")).sendKeys("tom");
				Thread.sleep(1500);
				 List<WebElement> rolls = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
				 Thread.sleep(1500);
				
				 
				for (WebElement r:rolls) {
					 System.out.println(r.getText());
					 }
				 Thread.sleep(1500);
				 for (WebElement s:rolls) {
					 String exp ="tome ai";
					 String act =s.getText();
					 
					 if (exp.equals(act)) {
						s.click();
						break;
					 }
					 
				 }
				 
				 Thread.sleep(4500);

       driver.quit();
	}

}
