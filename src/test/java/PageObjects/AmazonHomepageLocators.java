package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass_Amazon;

public class AmazonHomepageLocators extends Baseclass_Amazon{
		
	public AmazonHomepageLocators(WebDriver driver) {
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using="searchDropdownBox123")
	public WebElement search_list_id;
	

	@FindBy(how = How.ID, using="nav-cart-text-container")
	public WebElement cart_button;
	
	
}
