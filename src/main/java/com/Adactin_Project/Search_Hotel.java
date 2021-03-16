package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
      public static WebDriver driver;
      
    @FindBy(xpath="//select[@name='location']")
    private WebElement location;
    
    @FindBy(xpath="//select[@name='hotels']")
    private WebElement hotels;

	
    @FindBy(xpath="//select[@name='room_type']")
    private WebElement room_type;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement room_nos;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement date;
	
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement date_out;
	
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDate_out() {
		return date_out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	
}
