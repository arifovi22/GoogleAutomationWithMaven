package cucumberStepsDefination;



import googleAutomationTest.Generic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CucumberSteps {
	Generic genericInstance;

	@Given("I am in google home page and click search")
	public void i_am_in_google_home_page_and_click_search() throws Exception {
		genericInstance = Generic.getInstance();
		genericInstance.browser();
		genericInstance.getGooglePage().maximizeWindow();
		genericInstance.getGooglePage().url();

	}

	@Then("I write {string} click search and landing on specific search result")
	public void i_write_search_option_and_click_search(String value) {
		genericInstance.getGooglePage().search(value);

	}

	@When("From the search result I select a result")
	public void from_the_search_result_I_select_a_result() throws InterruptedException {
		genericInstance.getGooglePage().scrollDown();
		genericInstance.getGooglePage().selectSearchItem();
	String expected =	genericInstance.getGooglePage().getText();
		Assert.assertEquals(expected,"Fountain pen");
		genericInstance.close();

	}

	@Then("I see {string} in the top")
	public void i_see_in_the_top(String expected) {
		System.out.println((genericInstance.getGooglePage().getTextAbout()));
		String actual = (genericInstance.getGooglePage().getTextAbout());
		Assert.assertEquals(expected, actual);
		genericInstance.close();
	}
	
	
	
	
	
	
	
	
	
}
