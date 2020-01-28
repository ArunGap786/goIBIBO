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

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefintions extends HomePage {
	String fromplace;
	String toplace;

	@Given("^User logs into the application$")
	public void user_logs_into_the_application() {

		TestBase.initialization();

	}

	@Then("^Verify whether the active Tab is \"(.*)\"$")
	public void verify_whether_the_active_Tab_is_Flights(String tabname) {
		isActive(tabname);

	}

	@Given("^user selects the \"(.*)\" link$")
	public void user_selects_the_link(String tabname) {
		// clickTab(tabname);

	}

	@Then("^verfiy whether the active tab is \"(.*)\"$")
	public void verify_the_active_tab(String tabname) {
		isActive(tabname);

	}

	@When("^User selects one way and flight details from \"(.*)\" and to \"(.*)\"$")
	public void User_selects_one_way_and_flight_details(String fromplace, String toplace) throws InterruptedException {
		this.fromplace=fromplace;
		this.toplace=toplace;
		enterDetails(fromplace, toplace);

	}

	@And("^User swaps the places$")
	public void And_User_swaps_the_places() throws InterruptedException {
		swap();
		Thread.sleep(5000);
	}

	@Then("^places should be swapped$")
	public void places_should_be_swapped() {

		Assert.assertTrue(enteredFromPlace().equalsIgnoreCase("(" + toplace + ")"));
		Assert.assertTrue(enteredDestinationPlace().equalsIgnoreCase("(" + fromplace + ")"));
	}

	@And("^close the browser$")
	public void close_the_browser() {
		close();
	}

}
