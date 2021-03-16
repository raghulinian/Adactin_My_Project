package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Project.Base_class_adactin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\Adactin\\feature",glue="com\\Adactin\\stepdefinition")


public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		driver = Base_class_adactin.getBrowser("chrome");
	}
	
	
	@AfterClass
	public static void teardown() {
//		Base_class_adactin.close();
	}
	
	
	


}
