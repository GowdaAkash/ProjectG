package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PolicyInfo {
	public WebDriver driver;
	
	 public PolicyInfo(WebDriver driver) {
		 this.driver=driver;
	}
 
By calenderclick=By.id("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded_dateIcon");
By calenderdate=By.xpath("//tbody/tr[2]/td[4]");
By estimatedpremium=By.xpath("//input[@name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-estimatedPremiumInput']");
By policyinfonext=By.xpath("//div[text()='Next']");
public WebElement getCalenderClick()
		{
			return driver.findElement(calenderclick);
		}
public WebElement getCalenderDate()
{
	return driver.findElement(calenderdate);
}
public WebElement getEstimatedPremium()
{
	return driver.findElement(estimatedpremium);
}
public WebElement getPolicyInfoNext()
{
	return driver.findElement(policyinfonext);
}

}
