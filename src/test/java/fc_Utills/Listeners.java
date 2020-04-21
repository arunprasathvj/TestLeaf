package fc_Utills;

import org.testng.ITestContext;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
   
	public void onTestStart(ITestResult result) {
	System.out.println("Testcases are  started and are details " +result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcases sucsessfully pass and are details " +result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcases are  Failed and are details " +result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcases are Skipped and are details " +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
