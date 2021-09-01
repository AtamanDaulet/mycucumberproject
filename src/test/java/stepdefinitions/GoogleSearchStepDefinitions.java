package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearchStepDefinitions {
	GooglePage googlePage= new GooglePage();
	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

//	TC_01 iphone search
	@Given("user is on google home page")
	public void user_is_on_google_home_page() {
		Driver.getDriver().get("https://www.google.com/");
	}

	@When("user search iPhone")
	public void user_search_i_phone() throws InterruptedException {
		googlePage.searchInput.sendKeys("iPhone" + Keys.ENTER);
	}
	@Then("verify the result has iPhone")
	public void verify_the_result_has_i_phone() {
		String title = Driver.getDriver().getTitle().toLowerCase();
		Assert.assertTrue(title.contains("iphone"));
	}
//	TC_02 Tea Pot search
	@When("user search Tea Pot")
	public void user_search_tea_pot() {
		googlePage.searchInput.sendKeys("Tea Pot" + Keys.ENTER);
	}
	@Then("verify the result has Tea Pot")
	public void verify_the_result_has_tea_pot() {
		String title = Driver.getDriver().getTitle().toLowerCase();
		Assert.assertTrue(title.contains("tea pot"));
	}
//	TC_03 flower search
	@When("user search flower")
	public void user_search_flower() {
		googlePage.searchInput.sendKeys("flower" + Keys.ENTER);
	}
	@Then("verify the result has flower")
	public void verify_the_result_has_flower() {
		String title = Driver.getDriver().getTitle().toLowerCase();
		Assert.assertTrue(title.contains("flower"));
	}
	//	TC_04 bmw  search
	@When("user search bmw")
	public void user_search_bmw() {
		googlePage.searchInput.sendKeys("bmw" + Keys.ENTER);
	}
	@Then("verify the result has bmw")
	public void verify_the_result_has_bmw() {
		String title = Driver.getDriver().getTitle().toLowerCase();
		Assert.assertTrue(title.contains("bmw"));
	}
	@When("user search {string}")
	public void user_search(String string) {
googlePage.searchInput.sendKeys(string + Keys.ENTER);

	}

	@Then("verify the result has {string}")
	public void verify_the_result_has(String string) {
		wait.until(ExpectedConditions.visibilityOf(googlePage.countResult));
		String title = Driver.getDriver().getTitle().toLowerCase();
		Assert.assertTrue(title.contains(string));
	}



}
