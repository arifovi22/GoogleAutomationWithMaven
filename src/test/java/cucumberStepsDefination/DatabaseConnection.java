package cucumberStepsDefination;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import google.util.ConnectWithDatabase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DatabaseConnection {
	ConnectWithDatabase connect;

	@Given("I am connect with MySql")
	public void i_am_connect_with_MySql() throws SQLException {
		String sqlCommand ="select Name, CountryCode from city where Name = 'Rajshahi'";
				//select Name, CountryCode from city where Name = 'Rajshahi'";
				//"select Name, CountryCode from city where Name = 'Colatina'";
				//"select Name from city;";
				
		String firstValue = "Name";
		String secondValue = "CountryCode";
			

		ConnectWithDatabase.forSelectCommand(sqlCommand, firstValue, secondValue);

	}

	@When("I check data with database")
	public void i_check_data_with_database() throws SQLException {
		String sqlCommand = "select Name, CountryCode from city where Name = 'Rajshahi'";
		String firstValue = "Name";
		String secondValue = "CountryCode";
		List<String> actual = ConnectWithDatabase.verifyValue(sqlCommand, firstValue, secondValue);
		String value  = "Rajshahi";
				String value1 =	"BGD";
		List<String> expected  = new ArrayList<>();
		expected.add( value +value1);
		
			
 		//Map<String, String> actual = ConnectWithDatabase.verifyValue(sqlCommand, firstValue, secondValue);
		Assert.assertEquals(actual, expected);


	}

}
