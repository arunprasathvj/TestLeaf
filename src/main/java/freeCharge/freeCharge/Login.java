package freeCharge.freeCharge;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps");
				 
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				String text = driver.getTitle();
				System.out.println(text);
                String data= "Leaftaps - TestLeaf Automation Platform";
                
				if (text.equals(data)) {
					System.out.println("pass");
					
				}
				else {
					System.out.println("faill");
					
				}
				driver.close();
				
				
	}

}
