package fc_TestCases;

import org.testng.annotations.Test;

import fc_Pages.LoginPage;
import fc_Utills.BaseClass;

public class fc_TC_001 extends BaseClass {

	
		@Test
		public void TC_001 ()  {
		
		
			
			driver.get(BaseUrl);
			logger.info("Enter Url");
			
			LoginPage lp = new LoginPage(driver);
			lp.setusername(uname);
			logger.info("Enter Username");
			lp.setpassword(pwd);
			logger.info("Enter password");
			lp.clicksubmit();
			logger.info("sucsessfully Logedin");
			
	        driver.close();
	
}
	 
}
