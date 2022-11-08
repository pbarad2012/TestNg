package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass_Amazon {
	public WebDriver driver;
	
	@BeforeSuite
	public void OpenBroswer() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\TestingTestng\\Resources\\Driver\\chromedriver.exe");  
	    driver=new ChromeDriver();  
	    // Launch website  
	    driver.get("https://www.amazon.in/"); 
		
	}
	
	@AfterSuite
	public void CloseBrowser() {
		 driver.close();
		
	}
	
}
