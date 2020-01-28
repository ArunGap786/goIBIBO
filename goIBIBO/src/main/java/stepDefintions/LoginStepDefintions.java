package stepDefintions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.HomePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefintions extends HomePage {

	@Given("^Log into the application$")
	public void log_into_the_application() {
		
		TestBase.initialization();

	}

	@Then("^Verify whether the active Tab is Flights$")
	public void verify_whether_the_active_Tab_is_Flights() {
		// Write code here that turns the phrase above into concrete actions
		String title = validateHomePageTitle();
		WebElement Flights = driver.findElement(By.xpath(".//span[text()='Flights']/../.."));
		String exp = "active";
		Assert.assertTrue(Flights.getAttribute("class").contains(exp));
	}
}
