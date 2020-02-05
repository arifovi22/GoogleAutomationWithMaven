package googleAutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import google.util.ReadConfigFile;
import googleAutomationPages.GooglePage;



public class Generic {
	private static Generic instance;
	
	WebDriver driver;
	public GooglePage home;

	private Generic() {

	}

	public static Generic getInstance() {
		if (instance == null)
			instance = new Generic();

		return instance;

	}
	
	public WebDriver browser() {
		
	String readBrowser	=(String)ReadConfigFile.readProperties().get("Browser");
		
		if (driver ==  null) {
			if (readBrowser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Arif\\eclipse project\\google.AutomateWithMaven\\Browsers\\chromedriver.exe");	
				driver = new ChromeDriver();
			}else if (readBrowser.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Arif\\eclipse project\\google.AutomateWithMaven\\Browsers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		return driver;
		
	} 
	
	public GooglePage getGooglePage() {
		if (home == null) 
			home = new GooglePage(driver);
			return home;
		
	}
	
	public void close() {
		if (driver !=  null) 
			driver.close();
	
		
	}
	

}
