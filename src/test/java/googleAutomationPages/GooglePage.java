package googleAutomationPages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import google.util.ReadConfigFile;


public class GooglePage extends MasterPage {
	
	String search = "Xpath://input[@class='gLFyf gsfi']";
	String wiki ="Xpath://h3[contains(text(),'Wikipedia')]";
	String wikiTextString = "Id:firstHeading";
	String about="Xpath://a[text()='About']";
	
	
	
	public GooglePage(WebDriver driver) {
		super(driver);
	}

	public void url(){
		driver.get(ReadConfigFile.readProperties().get("Url"));
		
	}
	
	
	public void search(String value) {
		
		sendKeys(search, value+Keys.ENTER);
	}
	
	public void scrollDown() throws InterruptedException {
		scrollDown(2700);
		Thread.sleep(3000);
		
	}
	public void selectSearchItem() {
		click(wiki);	
	}
	
	public String getText() {
		String actual =	getTxt(wikiTextString);
		return actual;
	}
	
	public String getTextAbout() {
	String actual =	getTxt(about);
	return actual;
	}
	
	
	
	
	

}
