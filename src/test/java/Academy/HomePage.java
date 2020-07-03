package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger Log =LogManager.getLogger(base.class.getName());
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String UserName, String Password) throws IOException{
	
	
	
		System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");		
		driver=new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com");
		//one is inheritance
		//creating objectto that class and invoke methods of it
		  LandingPage l= new LandingPage(driver);
			LoginPage lp=l.getLogin().click;         //driver.findElementBy(css()
		   LoginPage lp1= new LoginPage(driver);
		   lp1.getEmail().sendKeys(UserName);
		   lp1.getPassword().sendKeys(Password);
		   Log.info(Password);
		   		   
		   lp1.getLogin().click();
		  ForgotPassword fp= lp1.forgotPassword();
		  fp.getEmail().sendKeys("littleredshoes65@yahoo.com");
		  ((ForgotPassword) fp).sendMeInstructions().click();
	}
	@DataProvider
	public Object[][] getData()
	{
		//row stands for how many different data types test should run
		//column stands for how many values per each test
		//Array size is 5 (starts with 0)
		//0,1,2,3,4
		
		//0 row
				Object[][] data=new Object[1][2];
		data[0][0]="littleredshoes65@yahoo.com";
		data[0][1]="pwtest";
		//data[0][2]="Restricted User";
		//1st row
		
		/*data[1][0]="dktest@dktest.com";
		data[1][1]="pswrd";
		data[1][2]="Non Restricted User";*/
		
		return data;
	}
		 
		}
	

