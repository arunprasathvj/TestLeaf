package fc_Utills;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties prop;
	public Readconfig () {
		
		
		
		File src = new File ("./Configuration/config.properties");
		  try {
			  FileInputStream fls = new FileInputStream (src);
			  prop = new Properties();
			  prop.load(fls);
			  
		  }
		  catch (Exception e) {
				 
				 System.out.println("esception is "+e.getMessage());
				 
			 }
		
	}

	public String  geturl() {
		
		String url  = prop.getProperty("BaseUrl");
		return url ;
	}
	public String getusername() {
		String username = prop.getProperty("uname") ;
		return username ;
		
	}
	
	public String getpassword() {
		
		String password = prop.getProperty("pwd");
		return password ;
		
	}
	
	public String getchromepath () {
		
		String chromepath = prop.getProperty("chromepath");
		return chromepath ;
		
	}
	
	public String getfirefoxpath () {
		
		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
		
	}
	
	
	
	public String getiepath() {
		String IEpath = prop.getProperty("IEpath");
		return IEpath;
		
		
	} 
	
	
	
	
	
	
	
	
	
}
