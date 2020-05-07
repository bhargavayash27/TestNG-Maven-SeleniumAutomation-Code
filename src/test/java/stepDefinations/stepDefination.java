package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.portalHomePage;
import resources.Base;

public class stepDefination extends Base{
	
	@Given("^Initialize Browser with Chrome$")
	public void initialize_Browser_with_Chrome() throws Throwable {
	    
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    
		driver.get(arg1);
	    
	}

	@Given("^Click on login link in home page to land on Secure Sign In page$")
	public void click_on_login_link_in_home_page_to_land_on_Secure_Sign_In_page() throws Throwable {
		LandingPage l = new LandingPage(driver);
		/*if(l.getpopupsize().size()>0)
		{
			l.getpopup().click();
		} */
		
		
		 l.getLogin().click();
		
	}
	
	@When("^user enters (.+) and (.+) and log In$")
    public void user_enters_and_and_log_in(String username, String password) throws Throwable {
		LoginPage lp= new LoginPage(driver);
		lp.enterEmailID().sendKeys(username);
		lp.enterPassword().sendKeys(password);
		lp.clickOnLogin().click();
    }

	@Then("^Verify user is successfully logged In$")
	public void verify_user_is_successfully_logged_In() throws Throwable {
		
		portalHomePage p= new portalHomePage(driver);
		Assert.assertTrue(p.getSearchBox().isDisplayed());
	    
	    
	}

}
