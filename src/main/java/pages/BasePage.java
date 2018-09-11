package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;

public class BasePage extends DriverFactory {

	protected WebDriverWait wait;
	protected JavascriptExecutor jsExecutor;
	
	public BasePage() {
		this.wait = new WebDriverWait(driver, 15);
		jsExecutor = ((JavascriptExecutor) driver);
	}
}
