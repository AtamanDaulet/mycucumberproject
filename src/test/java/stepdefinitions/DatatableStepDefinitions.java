package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DataTablesPages;
import utilities.Driver;

public class DatatableStepDefinitions {
	DataTablesPages dataTablesPages = new DataTablesPages();

	@Given("user is on the datatables page")
	public void user_is_on_the_datatables_page() {
		Driver.getDriver().get("https://editor.datatables.net/");
	}

	@Given("use clicked on the new button")
	public void use_clicked_on_the_new_button() {
dataTablesPages.newButton.click();

	}
	@When("user enters the firstname")
	public void user_enters_the_firstname() {
dataTablesPages.firstName.sendKeys("John");

	}
	@When("user enters the lastname")
	public void user_enters_the_lastname() {
dataTablesPages.lastName.sendKeys("Walker");

	}
	@When("user enters the position")
	public void user_enters_the_position() {
dataTablesPages.position.sendKeys("SDET");

	}
	@When("user enters the office")
	public void user_enters_the_office() {
		dataTablesPages.office.sendKeys("LA");

	}
	@When("user enters the extension")
	public void user_enters_the_extension() {
		dataTablesPages.extension.sendKeys("567");

	}
	@When("user enters the startdate")
	public void user_enters_the_startdate() {
		dataTablesPages.startDate.sendKeys("2021-03-01");

	}
	@When("user enters the salary")
	public void user_enters_the_salary() throws InterruptedException {
		dataTablesPages.salary.sendKeys("200000");
		Thread.sleep(1000);
	}
	@When("user clicks on the create button")
	public void user_clicks_on_the_create_button() {
		dataTablesPages.createButton.click();

	}
	@When("user search for the first name")
	public void user_search_for_the_first_name() {
		dataTablesPages.searchBox.sendKeys("John");

	}
	@Then("verify the name field contains the firstname")
	public void verify_the_name_field_contains_the_firstname() throws InterruptedException {
		Thread.sleep(1000);
		String firstName = dataTablesPages.nameField.getText();
		Assert.assertEquals(firstName,"John Walker");

	}
//---------------parameters--------------

	@When("user enters the firstname {string}")
	public void user_enters_the_firstname(String string) {
		dataTablesPages.firstName.sendKeys(string);
	}

	@When("user enters the lastname {string}")
	public void user_enters_the_lastname(String string) {
		dataTablesPages.lastName.sendKeys(string);
	}

	@When("user enters the position {string}")
	public void user_enters_the_position(String string) {
		dataTablesPages.position.sendKeys(string);
	}
	@When("user enters the office {string}")
	public void user_enters_the_office(String string) {
		dataTablesPages.office.sendKeys(string);
	}
	@When("user enters the extension {string}")
	public void user_enters_the_extension(String string) {
		dataTablesPages.extension.sendKeys(string);
	}

	@When("user enters the startdate {string}")
	public void user_enters_the_startdate(String string) {
		dataTablesPages.startDate.sendKeys(string);
	}

	@When("user enters the salary {string}")
	public void user_enters_the_salary(String string) throws InterruptedException {
		dataTablesPages.salary.sendKeys(string);
		Thread.sleep(1000);
	}

	@When("user search for the firstname {string}")
	public void user_search_for_the_firstname(String string) {
		dataTablesPages.searchBox.sendKeys(string);
	}

	@Then("verify the name field contains the firstname {string}")
	public void verify_the_name_field_contains_the_firstname(String string) throws InterruptedException {
		Thread.sleep(1000);
		String firstName = dataTablesPages.nameField.getText();
		Assert.assertTrue(firstName.contains(string));
	}

}
