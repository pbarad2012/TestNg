package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass_Amazon;

public class CartPageLocators extends Baseclass_Amazon{
	
	public CartPageLocators(WebDriver driver) {
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID,using="a-autoid-0-announce")
	public WebElement go_to_fresh_cart_button;
	
}
