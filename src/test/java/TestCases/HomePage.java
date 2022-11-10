package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.Baseclass_Amazon;
import PageObjects.AmazonHomepageLocators;
import PageObjects.CartPageLocators;
import Utilities.DataproviderClass;

@Listeners(Utilities.Listener.class)  
public class HomePage extends Baseclass_Amazon{
	
	
	@Test 
	@Parameters({"search_amazon"})
	public void SelectFromSearchDropdown(String option) {
		AmazonHomepageLocators  amazonhomepage = PageFactory.initElements(driver, AmazonHomepageLocators.class);
		Select test_select = new Select(amazonhomepage.search_list_id);
	    test_select.selectByVisibleText(option);
	}
	
//	@Test(groups= {"SmokeTest"})  
//	public void Test2() {
//		System.out.print("Test 2");
//		
//	}
//	
//	@Test
//	public void clickOnCartButton() {
//		AmazonHomepageLocators amazonhomepage = PageFactory.initElements(driver, AmazonHomepageLocators.class);
//		CartPageLocators cart = PageFactory.initElements(driver, CartPageLocators.class);
//		amazonhomepage.cart_button.click();
//		cart.go_to_fresh_cart_button.click();
//		
//	}
	
//	@Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)  
//	public void Test3(String id,String name ) {
//		System.out.println(name);
//		
//	}
	

}
