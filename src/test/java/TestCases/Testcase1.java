package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.Baseclass_Amazon;

@Listeners(Test_Listener.class)
public class Testcase1 extends Baseclass_Amazon{
	
//	@Test
//	@Parameters({"first_name","ID"})
//	public void Test_Case1(String name, String id) {
//		
//		System.out.println(name + " " + id);
//		
//	}
	
//	@Test(dataProvider="data",dataProviderClass=DataProvider_Test.class)
//	public void usecase_of_data_provider(String key, String value) {
//		
//		System.out.println(key + " " + value);
//		
//	}
	
	@Test(groups={"Integration"})
	public void usecase_of_groups() {
		System.out.println(System.getProperty("user.dir"));
		
	}
	
	@Test(groups={"Integration"})
	public void usecase_of_group2() {
		
		
	}
	
	
	@Test
	public void usecase_of_groups3() {
		
		
	}
	
	@Test
	public void usecase_of_groups4() {
		
		
	}
	
	@Test(groups={"Integration"})
	public void usecase_of_groups5() {
		
		
	}

}
