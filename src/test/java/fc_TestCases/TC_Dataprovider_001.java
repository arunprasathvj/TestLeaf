package fc_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import fc_Pages.LoginPage;
import fc_Utills.BaseClass;
import fc_Utills.ExcelUtills;

public class TC_Dataprovider_001   {
	static WebDriver driver ;
	
	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test(dataProvider ="testdata")
	public void Logintest(String username , String password) {
		driver.get("http://leaftaps.com/opentaps");
		LoginPage lp = new LoginPage (driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		lp.clicklogout();
	}
	
	@DataProvider(name= "testdata")
	public static Object [][] getdata() {
 String excelpath ="./data/TC001.xlsx";
  Object data [][] =testdata(excelpath , "Sheet1");
	return data;
	}
	public static Object [][] testdata(String excelpath , String sheetname) {

		ExcelUtills excel= new ExcelUtills(excelpath , sheetname );
		int rowcount = excel.getrowcount();
		int columcount = excel.getcolumcount();
		
		Object data[][] = new Object[rowcount-1][columcount];
		for (int i =1; i<rowcount ;i++) {
			for(int j=0;j<columcount; j++) {
				
				String celldata = excel.getstringcelldata(i, j);
				data [i-1][j]=celldata;
				
			}
			
			
		}
		return data;
}
	@AfterTest
public static void teardown() {
	
	driver.quit();
	
}	
}

	