package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class DefaultPage {
	public DefaultPage(){
		PageFactory.initElements(Driver.getDriver(),this);
	}
	@FindBy(linkText = "Hotel Management")
	public WebElement hotelManagement;
	@FindBy(partialLinkText = "Room reservations")
	public WebElement roomReservations;
}
