package youTube;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends base {
  
	mainPage mp;
	
	
	@BeforeMethod
	public void stepsToLaunch() throws InterruptedException {
		launchTheYouTube();
	 mp= new mainPage(driver);
		
		
	 
	}
	
	@Test
  public void f() {
		Reporter.log("Successfully launch the youtube", true);
		
  }
	
	@Test
	public void g () {
		Reporter.log(" hii gm ", true);
	}
	
	
	@AfterMethod
	public void CloseTheBrowser() throws InterruptedException {
		Thread.sleep(5000);
		mp.searchOnMainPage();
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
