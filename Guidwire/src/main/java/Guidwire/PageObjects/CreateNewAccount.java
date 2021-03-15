package Guidwire.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAccount {
	
	public WebDriver driver;
	public CreateNewAccount(WebDriver driver) {
		this.driver = driver;
	}


	By selectcompany=By.id("NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Company");
    By name=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-GlobalContactNameInputSet-Name']");
    By officephone=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']");
    By fax=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']");
    By email1=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-EmailAddress1']");
    By email2=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-EmailAddress2']");
    By address1=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']");
    By address2=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']");
	By address3=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']");
    By organization=By.xpath("//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer']");
	By organizationoverride=By.xpath("//div[@id='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer-SelectOrganization']//span[@class='gw-icon']");
    By updatebutton=By.xpath("//div[text()='pdate']");
	public WebElement getSelectCompany()
	{
		return driver.findElement(selectcompany);
	}

	public WebElement getName()
	{
		return driver.findElement(name);
	}
	
	
	public WebElement getOfficePhone()
	{
		return driver.findElement(officephone);
	}

	public WebElement getFax()
	{
		return driver.findElement(fax);
	}

	public WebElement getEmail1()
	{
		return driver.findElement(email1);
	}

	public WebElement getEmail2()
	{
		return driver.findElement(email2);
	}
     public WebElement getAddress1()
	{
		return driver.findElement(address1);
	}
	public WebElement getAddress2()
	{
		return driver.findElement(address2);
	}
	public WebElement getAddress3()
	{
		return driver.findElement(address3);
	}
	public WebElement getOrganization()
	{
		return driver.findElement(organization);
	}
	public WebElement getOrganizationOverride()
	{
		return driver.findElement(organizationoverride);
	}
	public WebElement getUpdateButton()
	{
		return driver.findElement(updatebutton);
	}
	
	
}
