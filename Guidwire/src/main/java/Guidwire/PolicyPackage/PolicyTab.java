package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PolicyTab {

	public WebDriver driver;
	 By newsubmission=By.xpath("//div[normalize-space()='New Submission']");

	 public PolicyTab(WebDriver driver) {
		 this.driver=driver;
	}

	public WebElement getNewSubmission()
		{
			return driver.findElement(newsubmission);
		}
}
