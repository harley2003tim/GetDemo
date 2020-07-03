package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	private By signin=By.cssSelector("a[href*='sign_in']");
	private By title=By.cssSelector(".text-center>h2");
	private By Navbar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	


	public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 LoginPage lp= new LoginPage(driver);
		 return lp;
	}
	
	public WebElement getNavigationBar()
	{
		System.out.println("Trying to identify navigation bar");
		return driver.findElement(Navbar);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
}
