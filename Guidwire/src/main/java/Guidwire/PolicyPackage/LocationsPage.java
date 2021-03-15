package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationsPage {
public WebDriver driver;
	
	public LocationsPage(WebDriver driver) {
		this.driver=driver;
	}
	By newlocation=By.xpath("//div[text()='New Loc']");
	By address1=By.xpath("//input[@name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']");
	By city=By.xpath("//input[@name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']");
	By country=By.xpath("//input[@name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']");
	By cityoverride=By.xpath("//div[@id='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon']//span[@class='gw-icon gw-svg-icon gw-svg-icon-autofill gw-font-icon']");
	By autofillcode=By.xpath("//div[@id='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink']");
	By territorycode=By.xpath("//input[@name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode']");
	By ok=By.xpath("//div[@class='gw-label'][normalize-space()='OK']");
	By next=By.xpath("//div[normalize-space()='Next']");
	public WebElement getNewLocation()
	{
		return driver.findElement(newlocation);
	}

	public WebElement getAddress1()
	{
		return driver.findElement(address1);
	}

	public WebElement getCity()
	{
		return driver.findElement(city);
	}

	public WebElement getCountry()
	{
		return driver.findElement(country);
	}

	
	public WebElement getCityOverride()
	{
		return driver.findElement(cityoverride);
	}
	public WebElement getAutofillcode()
	{
		return driver.findElement(autofillcode);
	}
	public WebElement geTeterritorycode()
	{
		return driver.findElement(territorycode);
	}
	public WebElement getOk()
	{
		return driver.findElement(ok);
	}
	
	public WebElement getNext()
	{
		return driver.findElement(next);
	}
	
	
}
