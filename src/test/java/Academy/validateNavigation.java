package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;

import java.io.IOException;

import pageObject.LandingPage;

import resources.Base;

public class validateNavigation extends Base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
	}
	

	@Test
	public void basePageNavigation() throws IOException {
		
		LandingPage l = new LandingPage(driver);
		AssertJUnit.assertTrue(l.NavBar().isDisplayed());

	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
