package runCucumberTest;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		 features = {"Cucumber"}, 
		// features = {"Cucumber/homePage.feature"}, 
		// features = {"src/test/resources/AllTestFeatures/order.feature"}, 
		glue={"cucumberStepsDefination","googleAutomationTest","google.util"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}, 
		monochrome=true,
		dryRun = false
		//tags = { "@test1"}
		)

public class RunCucumberTest extends AbstractTestNGCucumberTests {
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	

}
