package googleAutomationPages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MasterPage {
	WebDriver driver;

	public MasterPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void click(String locators){
		if (locators.contains("Id")) {
			driver.findElement(By.id(locators.split(":")[1])).click();
		}  else if (locators.contains("Xpath")) {
			driver.findElement(By.xpath(locators.split(":")[1])).click();
		} else if (locators.contains("CssSelector")) {
			driver.findElement(By.cssSelector(locators.split(":")[1])).click();
		}
	}

	public void sendKeys(String locators, String value) {
		if (locators.contains("Id")) {
			driver.findElement(By.id(locators.split(":")[1])).sendKeys(value);
		} else if (locators.contains("Xpath")) {
			driver.findElement(By.xpath(locators.split(":")[1])).sendKeys(value);
		} else if (locators.contains("CssSelector")) {
			driver.findElement(By.cssSelector(locators.split(":")[1])).sendKeys(value);
		}
	}

	public String getTxt(String locators) {
		String expected = null;
		if (locators.contains("Id")) {
			expected = driver.findElement(By.id(locators.split(":")[1])).getText();
		} else if (locators.contains("Xpath")) {
			expected = driver.findElement(By.xpath(locators.split(":")[1])).getText();
		} else if (locators.contains("CssSelector")) {
			expected = driver.findElement(By.cssSelector(locators.split(":")[1])).getText();
		}
		return expected;

	}

	public List<String> getElementsText(String locators) {
		List<String> actualelements = new ArrayList<>();

		if (locators.contains("Id")) {
			List<WebElement> elements = driver.findElements(By.id(locators.split(":")[1]));
			for (int i = 0; i < elements.size(); i++) {
				System.out.println(elements.get(i).getText());
				actualelements.add(elements.get(i).getText());
			}
		}  else if (locators.contains("Xpath")) {
			List<WebElement> elements = driver.findElements(By.xpath(locators.split(":")[1]));
			for (int i = 0; i < elements.size(); i++) {
				System.out.println(elements.get(i).getText());
				actualelements.add(elements.get(i).getText());
			}
		} else if (locators.contains("CssSelector")) {
			List<WebElement> elements = driver.findElements(By.cssSelector(locators.split(":")[1]));
			for (int i = 0; i < elements.size(); i++) {
				System.out.println(elements.get(i).getText());
				actualelements.add(elements.get(i).getText());
			}
		}
		return actualelements;

	}

	public void scrollDown(int scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + scroll + ")");

	}


	
	

	
	
	
	
	
	
	
	
	

}