package com.gw.qa.PolicyCenter;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gw.qa.actions.AppMethods;
import com.gw.qa.actions.GenericMethods;
import com.gw.qa.base.TestBase;

public class NewSubmisstionPerson extends TestBase {

	GenericMethods gMethods = new GenericMethods();
	AppMethods aMethods = new AppMethods();
	 
		@BeforeTest
		public void init() {

			initialization();
			AppMethods.logIn();

		}

		@Test
		public void createNewSubmissionPerson() 
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			AppMethods.createNewSubmissonPerson();
			
			
		}
		
		

}
