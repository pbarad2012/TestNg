package Utilities;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
	@DataProvider(name="SearchProvider")
    public static Object[][] getDataFromDataprovider(){
        return new Object[][] {
        	 { "name1", "Prakash" },
             { "name2", "Barad" }
        };  
}
	
}
