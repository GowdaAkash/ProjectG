package Guidwire.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AccountInformation {
	public WebDriver driver;

	public AccountInformation(WebDriver driver) {
		this.driver = driver;
	}

	By companyname=By.xpath("//div[@class='gw-value']/div/div/input");
	By firstnameexactmatch=By.cssSelector("input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-FirstNameExact']");
	By lastnameexactmatch=By.xpath("//input[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-LastNameExact']");
	By country=By.cssSelector("select[name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']");
	By city=By.xpath("//input[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']");
	By override=By.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon']");
	By country1=By.xpath("//input[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']");
    By zipcode=By.xpath("//input[@placeholder='#####-####']");
    By search=By.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']");
	By outside=By.id("NewAccount-NewAccountScreen-NewAccountSearchDV-5");

    
  
    public WebElement getComapanyName()
	{
		return driver.findElement(companyname);
	}
	public WebElement getFirstnameExactMatch()
	{
		return driver.findElement(firstnameexactmatch);
	}
	public WebElement getLastnameExactMatch()
	{
		return driver.findElement(lastnameexactmatch);
	}
	
	

	public WebElement getCity()
	{
		return driver.findElement(city);
	}
	public WebElement getOverRide()
	{
		return driver.findElement(override);
	}
	public WebElement getCountry1()
	{
		return driver.findElement(country1);
	}
	public WebElement getZipCode()
	{
		return driver.findElement(zipcode);
	}
	
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	

	public WebElement getOutside()
	{
		return driver.findElement(outside);
	}
	
	
	
}
