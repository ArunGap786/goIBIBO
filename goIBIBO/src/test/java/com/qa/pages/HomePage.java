package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	// PageFactory

	@FindBy(xpath = ".//span[text()='Flights']/")
	WebElement flights;
	@FindBy(xpath = "(.//span[text()='Hotels'])[1]")
	WebElement Hotels;
	@FindBy(xpath = "(.//span[text()='Hotels'])[2]")
	WebElement GoStaysHotels;
	@FindBy(xpath = ".//span[text()='Bus']")
	WebElement Bus;
	@FindBy(xpath = ".//span[text()='IRCTC Trains']")
	WebElement IRCTC_Trains;
	@FindBy(xpath = "//span[text()='Cabs']")
	WebElement Cabs;
	@FindBy(className = "hdrMoreLink")
	WebElement moreLink;
	
	 public HomePage() {
		PageFactory.initElements(driver, this);
	}
	 
	 public String validateHomePageTitle() {
		return driver.getTitle();		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
