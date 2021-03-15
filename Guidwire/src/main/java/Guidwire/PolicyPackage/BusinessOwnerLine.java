package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusinessOwnerLine {
	public WebDriver driver;
	
	public BusinessOwnerLine(WebDriver driver) {
		this.driver=driver;
	}
	By businessownerline=By.xpath("//div[text()='Next']");
	By alaskaattorneyfeeslimit=By.xpath("//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-AdditionalCoveragesPanelSet-AdditionalCoveragesDV-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']");
	By additonalcoverages=By.xpath("//div[text()='Additional Coverages']");

	public WebElement getAlaskaattorneyFeesLimit()
	{
		return driver.findElement(alaskaattorneyfeeslimit);
	}
	
	public WebElement getBusinessOwnerLineNext()
	{
		return driver.findElement(businessownerline);
	}
	public WebElement getAdditonaCoverages()
	{
		return driver.findElement(additonalcoverages);
	}
}
