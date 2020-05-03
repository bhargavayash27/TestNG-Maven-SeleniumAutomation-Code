package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
//	By LogIn = By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");
	By emailID= By.xpath("//input[@type='email']");
	By Password= By.xpath("//input[@type='password']");
	By LogIn= By.xpath("//input[@value='Log In']");
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement enterEmailID()
	{
		return driver.findElement(emailID);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement clickOnLogin()
	{
		return driver.findElement(LogIn);
	}

}
