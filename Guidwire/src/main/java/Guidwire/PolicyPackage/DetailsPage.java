package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailsPage {
	public WebDriver driver;
	 public DetailsPage(WebDriver driver) {
		 this.driver=driver;
	}
	By search=By.xpath("//div[@id='BOPBuildingPopup-BOPSingleBuildingDetailScreen-BOPBuilding_DetailsDV-BOPBuildingClassCodeRange-BOPBuildingClassCodePicker']");
    By code=By.xpath("//input[@name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-BOPClassCodeSearchDV-Code']");
    By classification=By.xpath("//input[@name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-BOPClassCodeSearchDV-Classification']");
	By classcodesearch=By.xpath("//div[@id='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-BOPClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']");
	By select=By.xpath("//div[@id='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-0-_Select']//div[@aria-label='Select']");
	By premiumamountbasics=By.xpath("//input[@name='BOPBuildingPopup-BOPSingleBuildingDetailScreen-BOPBuilding_DetailsDV-BasisAmount']");
	By buildinglimit=By.xpath("//input[@name='BOPBuildingPopup-BOPSingleBuildingDetailScreen-BOPBuilding_DetailsDV-0-CoverageInputSet-CovPatternInputGroup-BOPBldgCovLimit-CovTermDirectInputSet-DirectTermInput']");
	By businesspersonalpropertylimit=By.xpath("//input[@name='BOPBuildingPopup-BOPSingleBuildingDetailScreen-BOPBuilding_DetailsDV-1-CoverageInputSet-CovPatternInputGroup-BOPPersonalPropCovLimit-CovTermDirectInputSet-DirectTermInput']");
	By updatebuilding=By.xpath("//div[normalize-space()='U']");
    By buildnext=By.xpath("//div[normalize-space()='Next']");
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	
	public WebElement getCode()
	{
		return driver.findElement(code);
	}
	

	public WebElement getClassification()
	{
		return driver.findElement(classification);
	}
	public WebElement getClasscodesearch()
	{
		return driver.findElement(classcodesearch);
	}
	public WebElement getSelect()
	{
		return driver.findElement(select);
	}
	public WebElement getPremiumamountbasics()
	{
		return driver.findElement(premiumamountbasics);
	}

	public WebElement getBuildinglimit()
	{
		return driver.findElement(buildinglimit);
	}
	
	public WebElement getBusinesspersonalpropertylimit()
	{
		return driver.findElement(businesspersonalpropertylimit);
	}
	public WebElement getUpdatebuilding()
	{
		return driver.findElement(updatebuilding);
	}
	public WebElement getBuildnext()
	{
		return driver.findElement(buildnext);
	}
	
	
}
