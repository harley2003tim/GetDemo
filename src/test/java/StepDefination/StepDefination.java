package StepDefination;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class StepDefination extends base {

	
		
		@Given("^Initialize the browser with Firefox$")
		public void initialize_the_browser_with_firefox() throws IOException {
		    // Write code here that turns the phrase above into concrete actions
			   driver =initializeDriver();
		  
		}


		//Some other steps were also undefined:

		@Given("Navigate to QAclickacademy site")
		public void navigate_to_site(String arg1) {
		    // Write code here that turns the phrase above into concrete actions
			driver.get(arg1);
		}
		@Given("Click on Login link in home page to land on Secure sign on Page")
		public void click_on_login_link_in_home_page_to_land_on_secure_sign_on_page() {
		    // Write code here that turns the phrase above into concrete actions
			LandingPage l= new LandingPage(driver);
			l.getLogin().click();
		    
		}
		@When("User enters login and password and logs in")
		public void user_enters_and_and_logs_in(String arg1, String arg2) {
		    // Write code here that turns the phrase above into concrete actions
			 LoginPage lp1= new LoginPage(driver);
			   lp1.getEmail().sendKeys(arg1);
			   lp1.getPassword().sendKeys(arg2);
			   lp1.getLogin().click();
			  
		   
		}
		@Then("Verify that the user is successfully logged in")
		public void verify_that_the_user_is_successfully_logged_in() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("testing");
		}
	
		



		// TODO Auto-generated method stub

	}


