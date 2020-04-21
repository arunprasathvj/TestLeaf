package fc_Utills;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Reporting extends TestListenerAdapter {

	     
		 ExtentReports extent;
		 ExtentTest logger;
		 WebDriver driver;
		
	      
		
		public void onTestStart(ITestResult result) {
		{
			String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
			String repname = "Test-Report" +timestamp  +".html";
		    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/" +repname );
			
		    extent = new ExtentReports();
		    
		    extent.attachReporter(reporter);
		    
		    logger=extent.createTest("LoginTest");
		}
		}

		public void onTestSuccess(ITestResult result) {
			
			logger = extent.createTest(result.getName());
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
			
			
		}

		public void onTestFailure(ITestResult result) {
			logger = extent.createTest(result.getName());
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
			
		}
			
	

		public void onTestSkipped(ITestResult result) {
			logger = extent.createTest(result.getName());
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));
			
			
			
		}
	
	public void onFinish(ITestResult result) {
		extent.flush();
		
	}
	
	
}
