package Guidwire.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAccount {
	public WebDriver driver;

	public SearchAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	By accountTab=By.xpath("//div[@id='TabBar-AccountTab']/div[3]");
	By newaccount=By.id("TabBar-AccountTab-AccountTab_NewAccount");
	

	public WebElement getAccountTab()
	{
		return driver.findElement(accountTab);
	}
	

	public WebElement getNewAccount()
	{
		return driver.findElement(newaccount);
	}

	
	
}
