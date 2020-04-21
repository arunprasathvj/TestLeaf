package fc_Utills;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	Readconfig read = new Readconfig ();
	public String BaseUrl=read.geturl();
	public String uname = read.getusername();
	public String pwd= read.getpassword();
	
	
	
	public static WebDriver driver;
	
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		
if(br.equals("chrome"))
{
		System.setProperty("webdriver.chrome.driver", read.getchromepath());
		driver = new ChromeDriver();
		}
else if (br.equals("firefox")) {

    System.setProperty("webdriver.gecko.driver",read.getfirefoxpath());
   

  driver = new FirefoxDriver();
}
else if (br.equals("ie")) {
	System.setProperty("webdriver.ie.driver", read.getiepath());
	driver = new InternetExplorerDriver();
	
}
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 logger = Logger.getLogger("My Test ");
    PropertyConfigurator.configure("Log4J.properties");
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

	
	
     	@AfterClass
		public void teardown () {
			
			driver.quit();
			
		}

		
	}
	


