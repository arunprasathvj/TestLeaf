package fc_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 WebDriver ldriver;
		
		public HomePage (WebDriver rdriver) {
			ldriver=rdriver;
			
			 PageFactory.initElements(rdriver, this);
			
			
		}
		 
		@FindBy(xpath="//*[@id=\"label\"]/a")
		WebElement btncrmsfa;
		
		@FindBy(xpath="//*[@id=\"ext-gen602\"]")
		WebElement btncreatlead;
		
		

       public void clickcrmsfa () {
    	   btncrmsfa.click();
       }
    	   
    	   public void clickcreatlead () {
        	   btncreatlead.click();
        	   
       }
}