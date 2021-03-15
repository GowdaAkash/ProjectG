package Guidwire.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePolicyCenter {

	public WebDriver driver;

	By username = By.xpath("//div[@class='gw-vw--value']/input");
	By password =By.xpath("//input[@type='password']");
	By login=By.xpath("//*[text()='Log In']");
	

	public LoginPagePolicyCenter(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getUserName()
	{
		return driver.findElement(username);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	

	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
}
