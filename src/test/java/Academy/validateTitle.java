package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObject.LandingPage;
import resources.Base;

public class validateTitle extends Base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
	}
	
	@Test
	public void validateTitlePage()
	{
		LandingPage l = new LandingPage(driver);
		System.out.println(l.getTitle());
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
