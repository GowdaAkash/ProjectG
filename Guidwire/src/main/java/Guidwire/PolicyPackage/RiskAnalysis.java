package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RiskAnalysis {
	public WebDriver driver;
	 public RiskAnalysis(WebDriver driver) {
		 this.driver=driver;
	}
	 By risknext=By.xpath("//div[normalize-space()='Next']");
	 public WebElement getRisknext()
	 {
	 	return driver.findElement(risknext);
	 }
}
