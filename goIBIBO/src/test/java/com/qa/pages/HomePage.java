package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class HomePage extends TestBase {

	// PageFactory
	//// ul[@class='mainLinks']//a[@href='/hotels/']

	@FindBy(xpath = "//ul[@class='mainLinks']/li[1]")
	WebElement Flights;
	@FindBy(xpath = "//ul[@class='mainLinks']/li[2]")
	WebElement Hotels;
	@FindBy(xpath = "//ul[@class='mainLinks']/li[3]")
	WebElement GoStaysHotels;
	@FindBy(xpath = "//ul[@class='mainLinks']/li[4]")
	WebElement Bus;
	@FindBy(xpath = "//ul[@class='mainLinks']/li[5]")
	WebElement IRCTC_Trains;
	@FindBy(xpath = "//ul[@class='mainLinks']/li[6]")
	WebElement Cabs;
	@FindBy(xpath = "//ul[@class='mainLinks']/li[7]")
	WebElement moreLink;

	@FindBy(id = "oneway")
	WebElement oneway;
	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement From;
	@FindBy(xpath = "//input[@placeholder='Destination']")
	WebElement Destination;
	@FindBy(id = "departureCalendar")
	WebElement DepartCal;

	@FindBy(xpath = "//input[@placeholder='Destination']/preceding-sibling::i[1]")
	WebElement swap;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails(String FromPlace, String DestinationPlace) throws InterruptedException {
		From.sendKeys(FromPlace);
		Thread.sleep(5000);
		From.sendKeys(Keys.ARROW_DOWN);
		Destination.sendKeys(DestinationPlace);
		Thread.sleep(5000);
		Destination.sendKeys(Keys.ARROW_DOWN);		
	}
	
	public void swap() {
		swap.click();
	}
	
	public String enteredFromPlace() {
		return From.getAttribute("value");		
	}
	public String enteredDestinationPlace() {
		return Destination.getAttribute("value");		
	}
	
	
	

	public void clickTab(String tabname) {
		switch (tabname) {

		case "Flights":
			Flights.click();
			break;
		case "Hotels":
			Hotels.click();
			break;
		case "GoStaysHotels":
			GoStaysHotels.click();
			break;
		case "Bus":
			Bus.click();
			break;
		case "IRCTC Trains":
			IRCTC_Trains.click();
			break;
		case "Cabs":
			Cabs.click();
			break;
		default:
			moreLink.click();
		}
	}

	public void isActive(String tabname) {
		String exp = "active";
		switch (tabname) {

		case "Flights":
			Assert.assertTrue(Flights.getAttribute("class").contains(exp));
			break;
		case "Hotels":
			Assert.assertTrue(Hotels.getAttribute("class").contains(exp));
			break;
		case "GoStaysHotels":
			Assert.assertTrue(GoStaysHotels.getAttribute("class").contains(exp));
			break;
		case "Bus":
			Assert.assertTrue(Bus.getAttribute("class").contains(exp));
			break;
		case "IRCTC Trains":
			Assert.assertTrue(IRCTC_Trains.getAttribute("class").contains(exp));
			break;
		case "Cabs":
			Assert.assertTrue(Cabs.getAttribute("class").contains(exp));
			break;

		}

	}

}
