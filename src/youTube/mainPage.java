package youTube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage {

	@FindBy(xpath="//input[@id='search']") private WebElement search;
	@FindBy(xpath="//button[@id='search-icon-legacy']")  private WebElement icon;
	
	public mainPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void searchOnMainPage() throws InterruptedException {
		Thread.sleep(1500);
		search.sendKeys("maharashtra chi hasy jatra new Episode");
		icon.click();
		
	}
	
	
}
