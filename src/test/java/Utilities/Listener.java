package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import org.testng.ISuiteListener;
import org.testng.ITestContext;

public class Listener implements  ITestListener,ISuiteListener {
	
	TakeScrenshot_Utilities tc = new TakeScrenshot_Utilities();
	
	public void onTestStart(ITestResult result) {  
	// TODO Auto-generated method stub  
	}  
	  

	public void onTestSuccess(ITestResult result) { 
	// TODO Auto-generated method stub  
	System.out.println("Success of test cases and its details are : "+result.getName());  
	}  
	  

	public void onTestFailure(ITestResult result) {  
	// TODO Auto-generated method stub  
		
		try {
			tc.capturescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  

	public void onTestSkipped(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  

 
	public void onStart(ITestContext context) {  
	// TODO Auto-generated method stub  
	}  
	  
 
	public void onFinish(ITestContext context) {  
	// TODO Auto-generated method stub  
	}  
}
