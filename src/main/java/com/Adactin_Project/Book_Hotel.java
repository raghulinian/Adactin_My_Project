package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
    private WebElement first_name;
	
	@FindBy(xpath="//input[@name='last_name']")
    private WebElement last_name;
	
	@FindBy(xpath="//textarea[@name='address']")
    private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
    private WebElement cc_num;
	
	@FindBy(xpath="//select[@name='cc_type']")
    private WebElement cc_type;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
    private WebElement ex_month;

	@FindBy(xpath="//select[@name='cc_exp_year']")
    private WebElement ex_year;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
    private WebElement cvv;
	
	@FindBy(xpath="//input[@name='book_now']")
    private WebElement book;

	 public Book_Hotel(WebDriver driver2) {
			this.driver=driver;
			PageFactory.initElements(driver2, this);
		}
	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getEx_month() {
		return ex_month;
	}

	public WebElement getEx_year() {
		return ex_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
}
