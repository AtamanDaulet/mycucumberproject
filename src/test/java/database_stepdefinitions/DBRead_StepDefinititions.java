package database_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;

public class DBRead_StepDefinititions {
	String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2;" +
				"user=Ahmet_User;password=Ahmet123!";
	String username = "Ahmet_User";
	String password = "Ahmet123!";
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	@Given("user connects to the database")
	public void user_connects_to_the_database() throws SQLException {
		connection = DriverManager.getConnection(url,username,password);
	}
	@Given("user gets {string} from {string} table")
	public void user_gets_prices_from_tHOTELROOM_table(String string, String string2) throws SQLException {
		statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
		resultSet = statement.executeQuery("Select "+string + " from "+ string2);
	}


	@Given("user reads all rows in the {string} column")
	public void user_reads_all_rows_in_the_Price_column(String string) throws SQLException {
//		skipping 2 rows
//		resultSet.next();
//		resultSet.next();

//		Object obj1 = resultSet.getObject(string);
//		System.out.println(obj1);
//		resultSet.next();
//		String str = resultSet.getString(string);
//		System.out.println(str);

//		while (resultSet.next()){
//			Object obj = resultSet.getObject(string);
//			System.out.println(obj);
//		}

		// Go to row 5
//		resultSet.absolute(5);
//		// go to first row
//		resultSet.first();
//		// go to last row
//		resultSet.last();

	}
	@Then("users gets the value in row {int} in {string} column and verifies the value is {string}")
	public void users_gets_the_value_in_row_in_column_and_verifies_the_value_is
					(Integer int1, String string, String string2) throws SQLException {
		resultSet.absolute(int1);
		Object dataInRow2 = resultSet.getObject(string);
		Assert.assertEquals(string2, dataInRow2.toString());

	}
}
