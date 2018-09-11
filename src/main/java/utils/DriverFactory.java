package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.deps.difflib.myers.MyersDiff;
import pages.CreateAnAccountPage;
import pages.LandingPage;
import pages.MyAccountPage;
import pages.RegisterPage;

public class DriverFactory {

	public static WebDriver driver;
	public static LandingPage landingPage;
	public static RegisterPage registerPage;
	public static CreateAnAccountPage createAnAccount;
	public static MyAccountPage myAccountPage;

	public WebDriver getDriver() {
		try {

			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "chrome":
				if (null == driver) {

					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			landingPage = PageFactory.initElements(driver, LandingPage.class);
			registerPage = PageFactory.initElements(driver, RegisterPage.class);
			createAnAccount = PageFactory.initElements(driver, CreateAnAccountPage.class);
			myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
		}
		return driver;
	}
}
