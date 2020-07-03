package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
//adding logs
//generating html reports
//screenshots on failure
//JEnkins integration
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateNavigationBar extends base {
	public WebDriver driver;
	public static Logger Log =LogManager.getLogger(base.class.getName());
	@Test
	public void basePageNavigation() throws IOException{
	
	
		
		System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");		
		driver=new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/");
		//one is inheritance
		//creating objectto that class and invoke methods of it
		  LandingPage l= new LandingPage(driver);
		  //compare the text from the browser with actual text-if miss matched -Error-
		  Assert.assertTrue(l.getNavigationBar().isDisplayed());
		 //Assert.assertFales(false);
		  Log.info("Navigation Bar is displayed");
	}
		}
	
	
