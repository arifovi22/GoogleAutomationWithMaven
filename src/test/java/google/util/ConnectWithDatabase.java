package google.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnectWithDatabase {

	public static void forSelectCommand(String sqlCommand, String firstValue, String secondValue) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");

			String username = ReadConfigFile.readProperties().get("UserName");
			String passWord = ReadConfigFile.readProperties().get("PassWord");

			// making connection
			Connection connect;

			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", username, passWord);
			System.out.println("Connect to server");

			// this Statement helps to execute any Quarry for database
			Statement statement = connect.createStatement();
			ResultSet result = statement.executeQuery(sqlCommand);

			while (result.next()) {
				// have to change getString parameter value by quarries:
				String firstName = result.getString(firstValue);

				// firstname
				String countryCode = result.getString(secondValue);

				System.out.println(firstName);
				System.out.println(countryCode);

			}
			connect.close();

		} catch (Exception e) {

		}

	}

	//public static void forSelectAllComand() {
	public static void main(String[] args) {
		
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String username = ReadConfigFile.readProperties().get("UserName");
			String passWord = ReadConfigFile.readProperties().get("PassWord");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", username, passWord);
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			
			
			
			ResultSet rs = stmt.executeQuery("select * from city");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	
	
	
	
	
	
	
	public static List<String> verifyValue(String sqlCommand, String firstValue, String secondValue) {
		List<String> actualelements = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");

			String username = ReadConfigFile.readProperties().get("UserName");
			String passWord = ReadConfigFile.readProperties().get("PassWord");

			// making connection
			Connection connect;

			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", username, passWord);
			System.out.println("Connect to server");

			// this Statement helps to execute any Quarry for database
			Statement statement = connect.createStatement();
			ResultSet result = statement.executeQuery(sqlCommand);

			while (result.next()) {
				// have to change getString parameter value by quarries:

				String firstName = result.getString(firstValue);

				// firstname
				String countryCode = result.getString(secondValue);
				System.out.println(statement);

				actualelements.add(firstName + countryCode);

			}
		} catch (Exception e) {

		}

		return actualelements;
	}

	/*
	 * public void connectDb() { try { Class.forName("com.mysql.jdbc.Driver"); }
	 * catch (ClassNotFoundException e) {
	 * 
	 * e.printStackTrace(); } System.out.println("Driver loaded...");
	 * 
	 * String username = ReadConfigFile.readProperties().get("UserName"); String
	 * passWord = ReadConfigFile.readProperties().get("PassWord");
	 * 
	 * 
	 * 
	 * 
	 * // making connection Connection connect; try { connect =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/world",username,
	 * passWord);
	 * 
	 * //connection strings: //jdbc:mysql://localhost:3306/world","root", "4141ovi"
	 * //jdbc:mysql://localhost:3306/hr", "root", "4141ovi"
	 * System.out.println("Connect to server");
	 * 
	 * // this Statement helps to execute any Quarry for database Statement
	 * statement = connect.createStatement();
	 * 
	 * 
	 * // it will store the result set of the quarry ResultSet result = statement.
	 * executeQuery("select Name, CountryCode from city where Name = 'Rajshahi'");
	 * // sql quarries: //select Name, CountryCode from city where Name = 'Rajshahi'
	 * //select * from hrusers
	 * 
	 * 
	 * while (result.next()) { //have to change getString parameter value by
	 * quarries: String firstName = result.getString("Name");
	 * 
	 * //firstname String countryCode = result.getString("CountryCode");
	 * 
	 * System.out.println(firstName); System.out.println(countryCode);
	 * 
	 * }} catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 */
}
