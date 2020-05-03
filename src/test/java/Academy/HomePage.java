package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class HomePage extends Base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
	}
	
	@Test(dataProvider="getdata")
	public void basePageNavigation(String username,String password) throws IOException
	{
		
		 LandingPage l = new LandingPage(driver);
		 l.getLogin().click();
		LoginPage lp= new LoginPage(driver);
		lp.enterEmailID().sendKeys(username);
		lp.enterPassword().sendKeys(password);
		lp.clickOnLogin().click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="yash.yash.bhargava@gmail.com";
		data[0][1]="rajeneetu";
		
		return data;
		
	}

}
