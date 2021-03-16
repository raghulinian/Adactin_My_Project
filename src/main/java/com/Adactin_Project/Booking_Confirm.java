package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm {
    
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='my_itinerary']")
    private WebElement itinerary;
	
	 public Booking_Confirm(WebDriver driver2) {
			this.driver=driver;
			PageFactory.initElements(driver2, this);
		}

	public WebElement getItinerary() {
		return itinerary;
	}
	
	

}
