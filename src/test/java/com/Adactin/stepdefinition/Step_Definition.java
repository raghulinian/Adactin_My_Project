package com.Adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Adactin.runner.Runner;
import com.Adactin_Project.Base_class_adactin;
import com.Adactin_Project.Loginpage;
import com.Adactin_Project.Search_Hotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_class_adactin {
	public static WebDriver driver = Runner.driver;
	
	
	Loginpage login = new Loginpage(driver);
	Search_Hotel hotel = new Search_Hotel(driver);
	
	
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		geturl("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username in Usernae Field$")
	public void user_Enter_The_Username_in_Usernae_Field() throws Throwable {
	   inputValueElement(login.getUsername(),"raghulinian");
	}

	@When("^user Ener The Password In Password Field$")
	public void user_Ener_The_Password_In_Password_Field() throws Throwable {
	   inputValueElement(login.getPassw(),"12345678");
	}

	@Then("^user Click On the Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_the_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	    clickonElement(login.getLogin());
	}


	
	
	
	
}
