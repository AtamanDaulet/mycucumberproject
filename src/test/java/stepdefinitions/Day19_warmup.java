package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class Day19_warmup {
	GooglePage googlePage = new GooglePage();
	@When("user search for {string}")
	public void user_search_for(String string) {
		googlePage.searchInput.sendKeys(string + Keys.ENTER);
	}
	@Then("user closes the application")
	public void user_closes_the_application() {
		Driver.closeDriver();
	}

}
