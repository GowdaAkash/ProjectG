package com.gw.qa.PolicyCenter;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.gw.qa.actions.AppMethods;
import com.gw.qa.actions.GenericMethods;
import com.gw.qa.base.TestBase;
import com.gw.qa.reportListener.ExtentFactory;
import com.gw.qa.util.TestUtil;
import com.gw.qa.util.xpathUtils;

public class PolicyCenterTestCases extends TestBase{

	GenericMethods gMethods = new GenericMethods();
	
	
	@BeforeTest
	public void init() {
		
		initialization();
		AppMethods.logIn();
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}
 
	@Test(dataProvider="getTestData")
	public void createCompanyAccount(String accountType,String accountName,String firstName,String lastName,String companyName,
			String createAccount, String accountCounter,String homePhone,String primaryPhone,String primaryEmail,String country,String address1,
			String address2,String city,String state,String zipCode,String addressType,String organization,String producerCode,String officePhone,String name) {
             
		//extentTest = extent.createTest("Create account for " + accountType );
		
		
		try {
			//clicking on create new account
			WebElement accountIcon = driver.findElement(By.xpath(xpathUtils.accountDDIcon));
			gMethods.clickOn(driver, accountIcon, 30);
			WebElement newAccount = driver.findElement(By.xpath(xpathUtils.createNewAccount));
			gMethods.clickOn(driver, newAccount, 30);
			
			test.log(Status.PASS, "Clicked new account from 'Account tab'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			//entering company name
			WebElement companyText = driver.findElement(By.xpath(xpathUtils.companyName_xpath));
			gMethods.sendKeys(driver, companyText, 30, companyName);
			
			//click Search button
			WebElement searchButton = driver.findElement(By.xpath(xpathUtils.searchButton));
			gMethods.clickOn(driver, searchButton, 30);
			test.log(Status.PASS, "Searching with company name '"+companyName+"' in 'Account Information' page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			WebElement createNewAccount_Button = driver.findElement(By.xpath(xpathUtils.createNewAccount_Button));
			gMethods.clickOn(driver, createNewAccount_Button, 30);
			
			if(accountType!=null) {
				WebElement newAccountType = driver.findElement(By.xpath("//div[@aria-label='"+accountType+"']"));
				gMethods.clickOn(driver, newAccountType, 30);
				test.log(Status.PASS, "Selecting '"+accountType+"' from 'Create New Account' dropdown");
			}
		} catch (Exception e) {
			//ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable to select '"+accountType+"' from 'Create New Account' dropdown");
			//ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Error logs : " +e.getMessage());
		}
		
		
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
