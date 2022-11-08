package Testng.TestingTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
  
	public WebDriver driver;
	
	@BeforeSuite
	public void OpenBroswer() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\TestingTestng\\Resources\\Driver\\chromedriver.exe");  
	    driver=new ChromeDriver();  
	    // Launch website  
	    driver.get("https://www.amazon.in/"); 
		
	}
	
	@Test(priority=2)
  public void test1() {
		
		System.out.println("Test1");
	    Select test_select = new Select(driver.findElement(By.id("searchDropdownBox")));
	    System.out.println(test_select.getOptions().toString());
	    test_select.selectByValue("search-alias=amazon-devices");
	   
  }

	@Test(priority=1)
	  public void test2() {
		System.out.println("Test2");
	    Select test_select = new Select(driver.findElement(By.id("searchDropdownBox")));
	    System.out.println(test_select.getOptions().toString());
	    test_select.selectByVisibleText("Books");
	  }
	
	@Test(priority=3)
	  public void test3() {
		System.out.println("Test3");
	    Select test_select = new Select(driver.findElement(By.id("searchDropdownBox")));
	    System.out.println(test_select.getOptions().toString());
	    test_select.selectByIndex(3);
	  }
	
	@AfterSuite
	public void CloseBrowser() {
		 driver.close();
		
	}
	
}
