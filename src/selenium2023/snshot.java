package selenium2023;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class snshot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(800);
		driver.manage().window().maximize();
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       String ran= RandomString.make(4);
		File dest= new File("D:\\New folder\\screenshot\\rapper."+ran+"png");
org.openqa.selenium.io.FileHandler.copy(Source, dest);
		
		
		
		
		
		
		
	}

}
