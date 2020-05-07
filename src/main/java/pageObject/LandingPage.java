package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By LogIn = By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");
	By Title= By.xpath("//h2[contains(text(),'Featured Courses')]");
	By NavBar= By.xpath("//a[contains(text(),'Contact')]");
	By popup= By.name("//button[text()='NO THANKS']");

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(LogIn);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	public WebElement NavBar()
	{
		return driver.findElement(NavBar);
	}
	public List<WebElement> getpopupsize()
	{
		return driver.findElements(popup);
	}
	public WebElement getpopup()
	{
		return driver.findElement(popup);
	}

}
