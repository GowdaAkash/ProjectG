package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Modifiers {

	public WebDriver driver;
	 public Modifiers(WebDriver driver) {
		 this.driver=driver;
	}
	 
	 By considerationspolicy=By.xpath("//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-0-CreditDebit']");
	 By modifiersnext=By.xpath("//div[normalize-space()='Next']");
	 By overallclick=By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-CreditDebitFooter']//div[@class='gw-vw--value gw-align-h--right']");
	 
	 public WebElement getConsiderationspolicy()
	 {
	 	return driver.findElement(considerationspolicy);
	 }
	 public WebElement getModifiersnext()
	 {
	 	return driver.findElement(modifiersnext);
	 }
	 public WebElement getOverallclick()
	 {
	 	return driver.findElement(overallclick);
	 }
}
