package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	public @FindBy(className = "page-heading")
	WebElement txtMyAccount;
	
	public MyAccountPage() {
		super();
	}
	
	public void verifyMessage() {
		assertEquals(txtMyAccount.getText(), "MY ACCOUNT"); ;
	}

}
