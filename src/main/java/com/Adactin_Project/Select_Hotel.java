package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
       public static WebDriver driver;
	
       @FindBy(xpath="//input[@name='radiobutton_0']")
       private WebElement radio;
	
     
       @FindBy(xpath="//input[@name='continue']")
       private WebElement cont;

       public Select_Hotel(WebDriver driver2) {
			this.driver=driver;
			PageFactory.initElements(driver2, this);
		}
	public WebElement getRadio() {
		return radio;
	}


	public WebElement getCont() {
		return cont;
	}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}
