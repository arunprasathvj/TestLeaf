package fc_Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver) {
		ldriver=rdriver;
		
		 PageFactory.initElements(rdriver, this);
		
		
	}
	 
	@FindBy(id ="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//*[@type=\"submit\"]")
	WebElement btnlogin ;
	@FindBy (className="decorativeSubmit")
	WebElement btnlogout;
	
	
	public void setusername (String uname){
		txtusername.sendKeys(uname);
		
	}
	
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
		
		
	}
	
	public void clicksubmit() {
		btnlogin.click();
	}
	public void clicklogout() {
		btnlogout.click();
	}
	
}
