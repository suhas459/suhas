package selenium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_"
				+ "win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(800);
		
		// dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		//System.out.println();
		Select s= new Select(dropdown);
		s.selectByValue("option2");
		
		//is displayed
		WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).isDisplayed());
		WebElement tbox = driver.findElement(By.id("displayed-text"));
		tbox.sendKeys("hii good morning");
		
		//isEnable
		WebElement button = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		System.out.println(button.isEnabled());
		button.click();
		button.sendKeys("i am displayed.");
		
		//is selected
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		System.out.println(checkbox.isSelected());
		checkbox.click();

	}
	
	
}
