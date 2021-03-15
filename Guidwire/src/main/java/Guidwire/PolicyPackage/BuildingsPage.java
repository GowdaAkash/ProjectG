package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuildingsPage {
	public WebDriver driver;
	 public BuildingsPage(WebDriver driver) {
		 this.driver=driver;
	}
By add=By.xpath("//div[@data-gw-shortcut='{\"id\":\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPLocationBuildingsLV_tb-Add\",\"key\":\"A\",\"op\":\"fireevent\",\"panel\":\"C\"}']//div[@class='gw-label']");
public WebElement getAdd()
{
	return driver.findElement(add);
}
}
