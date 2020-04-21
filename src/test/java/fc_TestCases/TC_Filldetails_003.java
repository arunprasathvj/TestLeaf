package fc_TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fc_Pages.LoginPage;
import fc_Utills.BaseClass;

public class TC_Filldetails_003   {
    WebDriver driver ;
	@Test
	public void filldetails() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		LoginPage lp = new LoginPage(driver);
		
		FileInputStream fls = new FileInputStream("./data/TC001.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook (fls);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		for(int i = 1 ; i< 3 ; i++) {
			
			XSSFRow row = sheet.getRow(i);
			String username = row.getCell(0).getStringCellValue();
			String password  = row.getCell(1).getStringCellValue();

			lp.setusername(username);
			lp.setpassword(password);
			lp.clicksubmit();
			lp.clicklogout();
			
		}
	
		
		driver.quit();
		
	}

	
}
