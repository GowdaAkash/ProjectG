package com.gw.qa.PolicyCenter;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gw.qa.actions.AppMethods;
import com.gw.qa.actions.GenericMethods;

import com.gw.qa.base.TestBase;
import com.gw.qa.util.xpathUtils;

public class CreateAccountTestCase extends TestBase {

	GenericMethods gMethods = new GenericMethods();
	AppMethods aMethods = new AppMethods();
  
	@BeforeTest
	public void init() {

		initialization();
		AppMethods.logIn();

	}

	
	@Test(priority=2)
	public void createPersonAccount() throws InterruptedException
	{
		aMethods.createAccountTab();
		AppMethods.createAccountInformationPerson();
		AppMethods.search();
		AppMethods.createNewAccountButton();
		AppMethods.createNewPersonAccount();
		AppMethods.clickupdate(); 
		AppMethods.writeDataIntoExcelPerson();
		    
	}
	
	@Test( priority=3)
	public void createCompanyAccount() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		aMethods.createAccountTab();
		AppMethods.createAccountInformationCompany();
		AppMethods.search();
		AppMethods.createNewAccountButton();
		AppMethods.createNewCompanyAccount();
		AppMethods.clickupdate(); 
		AppMethods.writeDataIntoExcelCompany();
	}
	

	

}
