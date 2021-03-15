package Guidwire.PolicyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewSubmission {
	public WebDriver driver;
	By accountnumber=By.xpath("//input[@name='NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-Account']");
	By accountoverride=By.xpath("//div[@id='NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-Account-SelectAccount']//span[@class='gw-icon']");
    By selectpolicy=By.xpath("//div[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-0-addSubmission']");
	By next=By.xpath("//div[text()='Next']");
	By qualification=By.id("SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_1");
   
	public NewSubmission(WebDriver driver) {
		this.driver=driver;
	}
	


	public WebElement getAccountNumber()
	{
		return driver.findElement(accountnumber);
	}
	

	public WebElement getAccountOverride()
	{
		return driver.findElement(accountoverride);
	}
	

	public WebElement getSelectPolicy()
	{
		return driver.findElement(selectpolicy);
	}

	public WebElement getNext()
	{
		return driver.findElement(next);
	}

	public WebElement getQualification()
	{
		return driver.findElement(qualification);
	}
	
}
