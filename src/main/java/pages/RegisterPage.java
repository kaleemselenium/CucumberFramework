package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	public @FindBy(id = "customer_firstname")
	WebElement txtFirstName;
	
	public @FindBy(id = "customer_lastname")
	WebElement txtLastName;
	
	public @FindBy(id = "passwd")
	WebElement txtPassword;
	
	public @FindBy(id = "address1")
	WebElement txtAddress;
	
	public @FindBy(id = "city")
	WebElement txtCity;
	
	public @FindBy(id = "id_state")
	WebElement ddState;
	
	public @FindBy(id = "postcode")
	WebElement txtPostCode;
	
	public @FindBy(id = "phone_mobile")
	WebElement txtMobileNumber;
	
	public @FindBy(id = "submitAccount")
	WebElement btnSubmit;
	
	public RegisterPage() {
		super();
	}
	
	public void fillMandatoryFields() {
		txtFirstName.sendKeys("Kamran");
		txtLastName.sendKeys("Khubaib");
		txtPassword.sendKeys("123456");
		txtAddress.sendKeys("Hounslow");
		txtCity.sendKeys("London");
		ddState.sendKeys("Alabama");
		txtPostCode.sendKeys("12345");
		txtMobileNumber.sendKeys("0712345678");
		btnSubmit.click();
	}
}
