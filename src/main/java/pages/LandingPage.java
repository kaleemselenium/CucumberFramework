package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {
	
	public @FindBy(className = "login")
	WebElement btnSignIn;
	
	public LandingPage() {
		super();
	}
	
	public void openURL() {
		getDriver().get("http://automationpractice.com/");
	}
	public void clickSignIn() {
		btnSignIn.click();
	}
}
