package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class Accounts extends DriverFactory {
	
	@Given("^I am on landing page$")
	public void i_am_on_landing_page() throws Throwable {
		landingPage.openURL();
	}

	@Given("^I click on Sign in$")
	public void i_click_on_Sign_in() throws Throwable {
	    landingPage.clickSignIn();
	}

	@When("^I press create an account button after populating email address$")
	public void i_press_create_an_account_button_after_populating_email_address() throws Throwable {
	    createAnAccount.clickCreateAnAccount();
	}

	@When("^fill all the mandatory fields with valid data$")
	public void fill_all_the_mandatory_fields_with_valid_data() throws Throwable {
	    Thread.sleep(5000);
		registerPage.fillMandatoryFields();
	}

	@Then("^successful message should be shown$")
	public void successful_message_should_be_shown() throws Throwable {
	    myAccountPage.verifyMessage();
	}
}
