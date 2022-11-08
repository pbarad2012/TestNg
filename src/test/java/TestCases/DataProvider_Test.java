package TestCases;

import org.testng.annotations.DataProvider;

public class DataProvider_Test {
	
	@DataProvider(name="data")
	public static Object[][] getDataFromDataprovider(){
		return new Object[][] {
			{"Name_1","Prakash"},
			{"Name_2","Barad"},
			{"Name_3","Prakash"},
			{"Name_4","Barad"},
			{"Name_5","Prakash"},
			{"Name_6","Barad"}
		};
		
		
	}

}
