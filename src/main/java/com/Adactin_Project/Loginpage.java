package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage {
	public static WebDriver driver;
	 @FindBy(xpath="//input[@id='username']")
		private WebElement Username;
		
	    @FindBy(xpath="//input[@id='password']")
	   	private WebElement passw;
	    
	    @FindBy(xpath="//input[@name='login']")
	   	private WebElement login;
		
	    public Loginpage(WebDriver driver2) {
			this.driver=driver;
			PageFactory.initElements(driver2, this);
		}

		public WebElement getUsername() {
			return Username;
		}

		public WebElement getPassw() {
			return passw;
		}

		public WebElement getLogin() {
			return login;
		}

	
	
	
	    
	
	
	
	
	
	

}
