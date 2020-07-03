package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class base {
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
	 Properties prop= new Properties();	
	 // to not hard code drivers you would use System.getProperty("user.dir") this will print the current project path 
	 //FileInputStream fis=new FileInputStream ("C:\\Users\\kirkd\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
	 
	 //prop.load(fis);
	 //mvn test -Dbrowser=firefox
	 
	String browserName= System.getProperty("browser");
	 //String browserName=prop.getProperty("browser");
	 System.out.println(browserName);
	 
	
	//if(browserName.equals("FirefoxDriver"))
		//if(browserName.contains("Firefox"))
	 {
		System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");
		FirefoxOptions options =new FirefoxOptions();
		//if(browserName.contains("headless"))
		driver=new FirefoxDriver(options);
		options.addArguments("headless");
		 //execute in firefoxdriver 
	 }
	 
	//else if (browserName.equals("chrome"))
	 {
		
		 
	 }
	// else if (browserName.equals("IE"))
	 {
		 
	 
	 }
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
	TakesScreenshot ts=	(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;
}	
	}

