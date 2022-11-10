package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass_Amazon {
	public static WebDriver driver;
	
	@BeforeSuite
	public void OpenBroswer() throws IOException {
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Resources\\Driver\\chromedriver1.exe");  
	    driver=new ChromeDriver();  
	    // Launch website  
	    FileInputStream fileread = new FileInputStream(System.getProperty("user.dir") + "\\Resources\\TestData\\FileData.properties");
	    Properties pro = new Properties();
	    pro.load(fileread);
	    driver.get(pro.getProperty("URL")); 
	    driver.manage().window().maximize();
		
	}
	
	@AfterSuite
	public void CloseBrowser() {
		 driver.close();
		
	}
	
}
