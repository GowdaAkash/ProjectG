package com.gw.qa.actions;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.gw.qa.base.ReadExcelSheet;
import com.gw.qa.base.TestBase;
import com.gw.qa.util.TestUtil;
import com.gw.qa.util.xpathUtils;

public class AppMethods extends TestBase {

	public static GenericMethods gMethods;

	static ReadExcelSheet reader = new ReadExcelSheet(
			System.getProperty("user.dir") + "\\src\\main\\java\\com\\gw\\qa\\testdata\\Test Data.xlsx");

	// login to the application
	public static void logIn() {
		gMethods = new GenericMethods();
		// lunch the url
		driver.get(property.getProperty("url"));
		// entering user name
		WebElement userNameText = driver.findElement(By.xpath(xpathUtils.userName_xpath));
		String userName = property.getProperty("userName");
		gMethods.sendKeys(driver, userNameText, 30, userName);

		// entering password
		WebElement passWordText = driver.findElement(By.xpath(xpathUtils.passWord_xpath));
		gMethods.sendKeys(driver, passWordText, 30, property.getProperty("passWord"));

		// click login button
		WebElement loginButton = driver.findElement(By.xpath(xpathUtils.login_Button));
		gMethods.clickOn(driver, loginButton, 30);

	}

	/*
	 * Author : Aakash
	 */
	public void createAccountTab() {
		WebElement accountIcon = driver.findElement(By.xpath(xpathUtils.accountDDIcon));
		gMethods.clickOn(driver, accountIcon, 30);
		WebElement newAccount = driver.findElement(By.xpath(xpathUtils.createNewAccount));
		gMethods.clickOn(driver, newAccount, 30);
	}

	// create accountinformation for person
	public static void createAccountInformationPerson() {

		String firstName = reader.getCellData("Create Account", "First Name", 2);
		String lastName = reader.getCellData("Create Account", "Last Name", 2);
		WebElement firstName1 = driver.findElement(By.xpath(xpathUtils.firstName));
		gMethods.sendKeys(driver, firstName1, 30, firstName);

		WebElement lastName1 = driver.findElement(By.xpath(xpathUtils.LastName));
		gMethods.sendKeys(driver, lastName1, 30, lastName);
	}

	// create accountinformation for company
	public static void createAccountInformationCompany() {
		String companyname = reader.getCellData("Create Account", "Company Name", 3);
		WebElement companyname1 = driver.findElement(By.xpath(xpathUtils.companyName_xpath));
		gMethods.sendKeys(driver, companyname1, 30, companyname);
	}

	// clicking on search
	public static void search() {
		WebElement search = driver.findElement(By.xpath(xpathUtils.searchButton));
		gMethods.clickOn(driver, search, 30);
	}

	// clicking on createnewaccount button
	public static void createNewAccountButton() {
		WebElement createNewAccountButton = driver.findElement(By.xpath(xpathUtils.createNewAccount_Button));
		gMethods.clickOn(driver, createNewAccountButton, 30);

	}

	// create account for person
	public static void createNewPersonAccount() throws InterruptedException {

		WebElement newPerson = driver.findElement(By.xpath(xpathUtils.newPerson));
		gMethods.clickOn(driver, newPerson, 30);

		String homephone = reader.getCellData("Create Account", "Home Phone", 2);
		WebElement homephone1 = driver.findElement(By.xpath(xpathUtils.homephoneainfo));
		gMethods.sendKeys(driver, homephone1, 30, homephone);
		String address1 = reader.getCellData("Create Account", "Address 1", 2);
		String address2 = reader.getCellData("Create Accoumt", "Address 2", 2);
		WebElement Address1 = driver.findElement(By.xpath(xpathUtils.address1));
		gMethods.sendKeys(driver, Address1, 10, address1);

		WebElement Address2 = driver.findElement(By.xpath(xpathUtils.address2));
		gMethods.sendKeys(driver, Address2, 10, address2);

		String city = reader.getCellData("Create Account", "City", 2);
		WebElement city1 = driver.findElement(By.xpath(xpathUtils.city));
		gMethods.sendKeys(driver, city1, 10, city);

		String country = reader.getCellData("Create Account", "Country", 2);
		WebElement country1 = driver.findElement(By.xpath(xpathUtils.country));
		gMethods.sendKeys(driver, country1, 10, country);

		String state = reader.getCellData("Create Account", "State", 2);
		WebElement state1 = driver.findElement(By.xpath(xpathUtils.stateinfo));
		GenericMethods.selectValueFromDropDownByText(state1, state);

		String zipcode = reader.getCellData("Create Account", "Zipcode", 2);
		WebElement zipcode1 = driver.findElement(By.xpath(xpathUtils.zipCode));
		gMethods.sendKeys(driver, zipcode1, 10, zipcode);

		String addresstype = reader.getCellData("Create Account", "Address Type", 2);
		WebElement addresstype1 = driver.findElement(By.xpath(xpathUtils.addressType));
		GenericMethods.selectValueFromDropDownByText(addresstype1, addresstype);

		WebElement searchorganization = driver.findElement(By.xpath(xpathUtils.organizationSeachIcon));
		gMethods.clickOn(driver, searchorganization, 10);

		String organizationname = reader.getCellData("Create Account", "Organization", 2);
		WebElement organizationname1 = driver.findElement(By.xpath(xpathUtils.organizationName));
		gMethods.sendKeys(driver, organizationname1, 10, organizationname);

		WebElement organizationsearchbutton = driver.findElement(By.xpath(xpathUtils.organizationSearchButton));
		gMethods.clickOn(driver, organizationsearchbutton, 10);

		WebElement organizationselect = driver.findElement(By.xpath(xpathUtils.selectButton));
		gMethods.clickOn(driver, organizationselect, 10);

		String producercode = reader.getCellData("Create Account", "Producer Code", 2);
		WebElement producercode1 = driver.findElement(By.xpath(xpathUtils.ProducerCodeDropdown));
		GenericMethods.selectValueFromDropDownByText(producercode1, producercode);

	}

	// create newsubmission for person
	public static void policyNewSubmissionTab() {
		WebElement policytab = driver.findElement(By.xpath(xpathUtils.policytab));
		gMethods.clickOn(driver, policytab, 10);
		WebElement newsubmissontab = driver.findElement(By.xpath(xpathUtils.newsubmissiontab));
		gMethods.clickOn(driver, newsubmissontab, 10);
	}

	// clicking on update button
	public static void clickupdate() throws InterruptedException {
		WebElement search = driver.findElement(By.xpath(xpathUtils.updateButton));
		gMethods.clickOn(driver, search, 30);

	}

	public static void writeDataIntoExcelPerson() {
		String accountnumber = driver.findElement(By.xpath(xpathUtils.accountnumber)).getText();
		String accountstatus = driver.findElement(By.xpath(xpathUtils.accountstatus)).getText();
		reader.setCellData("Create Account", "Account Number", 2, accountnumber);
		reader.setCellData("Create Account", "Account Status", 2, accountstatus);
	}

	public static void createNewCompanyAccount() {

		WebElement newCompany = driver.findElement(By.xpath(xpathUtils.newcompany));
		gMethods.clickOn(driver, newCompany, 30);

		String officephone = reader.getCellData("Create Account", "Office Phone", 3);
		WebElement officephone1 = driver.findElement(By.xpath(xpathUtils.officePhone));
		gMethods.sendKeys(driver, officephone1, 30, officephone);

		String primaryemail = reader.getCellData("Create Account", "Primary Email", 3);
		WebElement primaryemail1 = driver.findElement(By.xpath(xpathUtils.primaryEmail));
		gMethods.sendKeys(driver, primaryemail1, 30, primaryemail);

		String country = reader.getCellData("Create Account", "Country", 3);
		WebElement country1 = driver.findElement(By.xpath(xpathUtils.country));
		gMethods.sendKeys(driver, country1, 10, country);

		String address1 = reader.getCellData("Create Account", "Address 1", 3);
		WebElement Address1 = driver.findElement(By.xpath(xpathUtils.address1));
		gMethods.sendKeys(driver, Address1, 10, address1);

		String city = reader.getCellData("Create Account", "City", 3);
		WebElement city1 = driver.findElement(By.xpath(xpathUtils.city));
		gMethods.sendKeys(driver, city1, 10, city);

		String state = reader.getCellData("Create Account", "State", 3);
		WebElement state1 = driver.findElement(By.xpath(xpathUtils.stateinfo));
		GenericMethods.selectValueFromDropDownByText(state1, state);

		String zipcode = reader.getCellData("Create Account", "Zipcode", 3);
		WebElement zipcode1 = driver.findElement(By.xpath(xpathUtils.zipCode));
		gMethods.sendKeys(driver, zipcode1, 10, zipcode);

		String addresstype = reader.getCellData("Create Account", "Address Type", 3);
		WebElement addresstype1 = driver.findElement(By.xpath(xpathUtils.addressType));
		GenericMethods.selectValueFromDropDownByText(addresstype1, addresstype);

	}

	// writing account number and account status into excel sheet
	public static void writeDataIntoExcelCompany() {

		String accountnumbercompany = driver.findElement(By.xpath(xpathUtils.accountnumber)).getText();
		String accountstatuscompany = driver.findElement(By.xpath(xpathUtils.accountstatus)).getText();
		reader.setCellData("Create Account", "Account Number", 3, accountnumbercompany);
		reader.setCellData("Create Account", "Account Status", 3, accountstatuscompany);
	}

	// cr
	public static void createNewSubmissonPerson() {
		WebElement accounttab = driver.findElement(By.xpath(xpathUtils.accounttab));
		gMethods.clickOn(driver, accounttab, 10);
		String accountnumber = reader.getCellData("Create Account", "Account Number", 2);
		WebElement accountnumbersearch = driver.findElement(By.xpath(xpathUtils.accountnumbersearch));
		gMethods.sendKeys(driver, accountnumbersearch, 30, accountnumber);
		WebElement accountnumbersearchicon = driver.findElement(By.xpath(xpathUtils.accountnumbersearchicon));
		gMethods.clickOn(driver, accountnumbersearchicon, 30);
		WebElement actionstab = driver.findElement(By.xpath(xpathUtils.actionstab));
		gMethods.clickOn(driver, actionstab, 10); 
		WebElement newsSubmissionbuton=driver.findElement(By.xpath(xpathUtils.newsubmissiontab));
		gMethods.clickOn(driver, newsSubmissionbuton, 10);
	    WebElement personalauto=driver.findElement(By.xpath(xpathUtils.personalauto));
	    gMethods.clickOn(driver, personalauto, 30);
	    WebElement next=driver.findElement(By.xpath(xpathUtils.next));
	    gMethods.clickOn(driver, next, 30);
	
	}
	
	
	// logOut from the application
	public void logOut() {

	}

}
