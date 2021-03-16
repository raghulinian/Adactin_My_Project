package com.Adactin_Project;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class_adactin {
	public static WebDriver driver;     

	public static WebDriver getBrowser(String type) {
        	  
        	if(type.equalsIgnoreCase("chrome")) {
        		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver1.exe");
        	
      	driver=new ChromeDriver();
        	
        	}
        	else if(type.equalsIgnoreCase("firefox")) {
        		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
        		driver=new FirefoxDriver();
        	}
        	
        	driver.manage().window().maximize();
        	 return driver; 
          }
	
    public static void clickonElement(WebElement element) {
		element.click();
		
	}
	
	
	public static void inputValueElement(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void login(WebElement element) {
		element.click();
		
		
	}
	
	
	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}
	
	public static void movetoElement(WebElement element, String string) {
	Actions act = new Actions(driver);
	act.moveToElement(element).build().perform();
	}
	
//	public static void clickonElement1(WebElement element) {
//	element.click();
//	}
	
	public static void dropDown(WebElement element,String type,int value) {
		Select s=new Select(element);
		if(type.equalsIgnoreCase("select")) {
			s.selectByIndex(value);
		}
	
	
	else if (type.equalsIgnoreCase("getoptions")) {
		System.out.println("***List of options***");
		List<WebElement> options = s.getOptions();
		
		for (WebElement tooptions : options) {
			String text = tooptions.getText();
		    System.out.println(text);
		}
		
	}
	else if(type.equalsIgnoreCase("multiple")) {
		boolean multiple = s.isMultiple();
	    System.out.println(multiple);
	    }
	
	
	else if(type.equalsIgnoreCase("multiple select")) {
		for(int i=0;i<8;i++) {
			if(i==value) {
				s.selectByIndex(i);
				System.out.println(i);
			}
		}
			
	}
	else if(type.equalsIgnoreCase("first select")) {
		
	    WebElement firstSelected = s.getFirstSelectedOption();
 		String text = firstSelected.getText();
 		System.out.println(text);
	}
		
	else if(type.equalsIgnoreCase("all select")){
		List<WebElement> allSelected = s.getAllSelectedOptions();
		for (WebElement selected : allSelected) {
			String text = selected.getText();
			System.out.println(selected.getText());
	       }
		
		}	
		
	}

	public static void timeout(int s) {
		driver.manage().timeouts().pageLoadTimeout(s, TimeUnit.SECONDS);
	}
	
	public static void maximize(){
	driver.manage().window().maximize();
	}
	
	public static void frame(WebElement element) {
	driver.switchTo().frame(element);
	}
		
	public static void  getcurrenturl(String url) {
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
    }	
	
	public static void gettitle(String title) {
	String title1 = driver.getTitle();
	System.out.println(title1);
    }
	
	public static void geturl(String url){
	driver.get(url);	
	}
	
	public static void navigate1(String url) {
    driver.navigate().to(url);
    }
    
	public static void back() {
	driver.navigate().back();
	    }
	
	public static void forward() {
	driver.navigate().forward();
	    }
	
	public static void refresh() {
	driver.navigate().refresh();
	    }
	

	
	public static void is(WebElement element,String type) {
	 if(type.equalsIgnoreCase("enabled")) {
	     boolean enabled = element.isEnabled();
	     System.out.println(enabled);
	}
	 else if(type.equalsIgnoreCase("displayed")) {
	boolean displayed = element.isDisplayed();
	System.out.println(displayed);
	}
	else if(type.equalsIgnoreCase("selected")) {
		boolean selected = element.isSelected();
		System.out.println(selected);
		}
	}
	public static void quit() {
		driver.quit();
	}
	
	
	public static void close() {
		driver.close();
	}
	
    public static void gettext(WebElement element) {
    	String text = element.getText();
    	System.out.println(text);
    }
    
    public static void windowshandle(String mytitle) {
    	Set<String> allid = driver.getWindowHandles();
    	for(String id : allid) {
    		String title=driver.switchTo().window(id).getTitle();
    		System.out.println(title);
    	}
    	for(String id : allid) {
    		if(driver.switchTo().window(id).getTitle().equals(mytitle)) {
    			break;
    		}
    	}
    }
    
    public static void screenshot(String name) throws Throwable{
    TakesScreenshot ts=(TakesScreenshot) driver; //narrow casting
	 
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 
	 File destination = new File(System.getProperty("user.dir")+"C:\\Users\\Raghul\\eclipse-workspace\\Selenium testing\\Snapshot\\snap.png");
	
	
	 FileUtils.copyFile(source, destination);
    }
}
