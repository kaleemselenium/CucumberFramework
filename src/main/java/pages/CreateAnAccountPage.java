package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage extends BasePage{
	Random random = new Random();
	
	public @FindBy(id = "email_create")
	WebElement txtEmail;
	
	public @FindBy(id = "SubmitCreate")
	WebElement btnCreateAnAccount;
	
	public CreateAnAccountPage() {
		super();
	}
	public void clickCreateAnAccount() {
		
		txtEmail.sendKeys("ktest"+random.ints(2,1000).findFirst().getAsInt()+"@test.com");
		btnCreateAnAccount.click();
	}

}
