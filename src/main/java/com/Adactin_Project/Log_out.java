package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_out {
	
public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='logout']")
    private WebElement logout;
	
	public Log_out(WebDriver driver2) {
			this.driver=driver;
			PageFactory.initElements(driver2, this);
		}
	public WebElement getLogout() {
		return logout;
	}
	
	
	
}
