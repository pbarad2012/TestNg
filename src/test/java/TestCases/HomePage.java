package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClass.Baseclass_Amazon;
import PageObjects.AmazonHomepageLocators;
import PageObjects.CartPageLocators;

public class HomePage extends Baseclass_Amazon{
	
	
	@Test
	public void SelectFromSearchDropdown() {
		AmazonHomepageLocators  amazonhomepage = PageFactory.initElements(driver, AmazonHomepageLocators.class);
		Select test_select = new Select(amazonhomepage.search_list_id);
	    test_select.selectByValue("search-alias=amazon-devices");
		
	}
	
	@Test
	public void clickOnCartButton() {
		AmazonHomepageLocators amazonhomepage = PageFactory.initElements(driver, AmazonHomepageLocators.class);
		CartPageLocators cart = PageFactory.initElements(driver, CartPageLocators.class);
		amazonhomepage.cart_button.click();
		cart.go_to_fresh_cart_button.click();
		
	}
	

}
