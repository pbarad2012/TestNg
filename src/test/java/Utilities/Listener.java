package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import org.testng.ISuiteListener;
import org.testng.ITestContext;

public class Listener implements  ITestListener,ISuiteListener {
	
	ExtentReports reports = new ExtentReports(System.getProperty("user.dir") + "/testreport/report.html",true);
	ExtentTest test = reports.startTest("Testing Report");
	
	TakeScrenshot_Utilities tc = new TakeScrenshot_Utilities();
	
	public void onTestStart(ITestResult result) {  
	// TODO Auto-generated method stub  
		test.log(LogStatus.INFO, "Test Name is:" + result.getTestName());

	}
	  

	public void onTestSuccess(ITestResult result) { 
	// TODO Auto-generated method stub  
			test.log(LogStatus.PASS, "This Test Case is Passed" + result.getTestName());
			System.out.println("Success of test cases and its details are : "+result.getName());  
	}  
	  

	public void onTestFailure(ITestResult result) {  
	// TODO Auto-generated method stub  
		
		String path = null;
		try {
			path = tc.capturescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Path is" + path);
		test.log(LogStatus.FAIL, test.addScreenCapture(path));
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
		reports.flush();
	}  
}
