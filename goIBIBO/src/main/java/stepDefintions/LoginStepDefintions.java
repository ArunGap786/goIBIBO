package stepDefintions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefintions {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^Log into the application$")
	public void log_into_the_application() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\BDDEx\\chromedriver72\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		String title = driver.getTitle();
		Assert.assertEquals(
				"Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off", title);
	}


	@Then("^Verify whether the active Tab is Flights$")
	public void verify_whether_the_active_Tab_is_Flights() {
		// Write code here that turns the phrase above into concrete actions
		
		
		

	}

}
