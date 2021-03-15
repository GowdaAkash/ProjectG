package Guidwire;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Guidwire.PageObjects.AccountInformation;
import Guidwire.PageObjects.CreateNewAccount;
import Guidwire.PageObjects.LoginPagePolicyCenter;
import Guidwire.PageObjects.SearchAccount;
import Guidwire.PolicyPackage.BuildingsPage;
import Guidwire.PolicyPackage.BusinessOwnerLine;
import Guidwire.PolicyPackage.DetailsPage;
import Guidwire.PolicyPackage.LocationsPage;
import Guidwire.PolicyPackage.Modifiers;
import Guidwire.PolicyPackage.NewSubmission;
import Guidwire.PolicyPackage.PolicyInfo;
import Guidwire.PolicyPackage.PolicyTab;
import Guidwire.PolicyPackage.RiskAnalysis;
import Guidwire.resources.base;

public class CreatingAccount extends base {

	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	//
	@Test
	public void createAccount() throws InterruptedException, IOException {

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 
		
		LoginPagePolicyCenter lg = new LoginPagePolicyCenter(driver);
		lg.getUserName().sendKeys("su");
		lg.getPassword().sendKeys("gw");
		lg.getLogin().click();
		SearchAccount s = new SearchAccount(driver);
		s.getAccountTab().click();
		s.getNewAccount().click();
		AccountInformation a = new AccountInformation(driver);
		a.getComapanyName().sendKeys("AACompany");
		a.getFirstnameExactMatch().click();
		a.getLastnameExactMatch().click();
		Select s1 = new Select(driver.findElement(By.cssSelector(
				"select[name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']")));
		s1.selectByVisibleText("United States");
		a.getZipCode().sendKeys("99501");

		Select s2 = new Select(driver.findElement(By.cssSelector(
				"select[name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']")));
		s2.selectByVisibleText("Alaska");

		WebElement element = driver.findElement(By.id(
				"NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(element).click().perform();

		WebElement elements = driver.findElement(By.xpath("//div[@role='button']//div[@class='gw-label']"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(elements).click().perform();

	
			CreateNewAccount ca = new CreateNewAccount(driver);
			ca.getSelectCompany().click();
			ca.getName().sendKeys("");
			ca.getOfficePhone().sendKeys("9876546710");
			ca.getFax().sendKeys("9675432144");
			ca.getEmail1().sendKeys("akash@123");
			ca.getEmail2().sendKeys("akashbr@123");

			Select s3 = new Select(driver.findElement(By.cssSelector(
					"select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']")));
			s3.selectByVisibleText("United States");

			ca.getAddress1().sendKeys("2201 A Street, Nouthwest Washington, DC 20520,");
			ca.getAddress2().sendKeys("2201 B Street, Nouthwest Washington, DC 20520,");
			ca.getAddress3().sendKeys("2201 c Street, Nouthwest Washington, DC 20520,");

			Select s4 = new Select(driver.findElement(
					By.xpath("//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressType']")));
			s4.selectByVisibleText("Other");

			ca.getOrganization().sendKeys("ACV Property Insurance");
			ca.getOrganizationOverride().click();
			ca.getUpdateButton().click();
					
			String accountnumber=driver.findElement(By.xpath("//div[@id='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountNumber']/div/div")).getText();
					
		
		WebElement policyelement=driver.findElement(By.xpath("//div[@id='TabBar-PolicyTab']//div[@class='gw-icon gw-icon--expand']"));
	    Actions a5=new Actions(driver);
	    a5.moveToElement(policyelement).click().perform();
	     
	    PolicyTab p = new PolicyTab(driver);
	    p.getNewSubmission().click();
	    
	    NewSubmission ns=new NewSubmission(driver);
	    ns.getAccountNumber().sendKeys(accountnumber);
	    ns.getAccountOverride().click();
	    ns.getSelectPolicy().click();
	    Select s5 = new Select(driver.findElement(By.xpath("//select[@name='SubmissionWizard-OfferingScreen-OfferingSelection']")));
	    s5.selectByIndex(1);
	    ns.getNext().click();
	    ns.getQualification().click();
	    ns.getNext().click();
	    PolicyInfo pi=new PolicyInfo(driver);
	    pi.getCalenderClick().click();
	    pi.getCalenderDate().click();
	    pi.getEstimatedPremium().sendKeys("5000");
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement commonownership=driver.findElement(By.cssSelector("select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-OrganizationType']"));
	    js.executeScript("arguments[0].scrollIntoView();", commonownership);
	    Select s6=new Select(commonownership);
	    s6.selectByIndex(1);
	    
	    pi.getPolicyInfoNext().click(); 
	    WebElement smallbusinesstype=driver.findElement(By.xpath("//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLineDV-SmallBusinessType']"));
	    
	    Select s7=new Select(smallbusinesstype);
	    s7.selectByIndex(1);
	    BusinessOwnerLine bo=new BusinessOwnerLine(driver);
	    bo.getAdditonaCoverages().click();
	    bo.getAlaskaattorneyFeesLimit().sendKeys("5000");
	    bo.getBusinessOwnerLineNext().click();
	    
	   
	  
	}

	@Test
	public void newLoactions() throws InterruptedException
	{
		LocationsPage lg=new LocationsPage(driver);
		lg.getNewLocation().click();
		Select s = new Select(driver.findElement(By.xpath("//select[@name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']")));
		s.selectByIndex(1);
		lg.getAddress1().sendKeys("2201 A Street, Nouthwest Washington, DC 20520,");
		lg.getCity().sendKeys("Anchorage");
		lg.getCountry().sendKeys("Anchorage");
		Thread.sleep(3000);
		Select s1 =new Select(driver.findElement(By.xpath("//select[@name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']")));
		s1.selectByIndex(1);
		lg.getAutofillcode().click();
		lg.getOk().click();
		
		lg.getNext().click();
		
		}
	@Test
	public void obuildings()
	{
		BuildingsPage bg=new BuildingsPage(driver);
		bg.getAdd().click();
	}
	
	@Test
	public void psearch() throws InterruptedException
	{
		DetailsPage dg=new DetailsPage(driver);
		dg.getSearch().click();
		dg.getCode().sendKeys("0001");
		dg.getClassification().sendKeys("Restaurant-Fast Food - Cafes");
		dg.getClasscodesearch().click();
		Thread.sleep(2000);
		dg.getSelect().click();
		dg.getPremiumamountbasics().sendKeys("5000");
		dg.getBuildinglimit().sendKeys("5000");
		dg.getBusinesspersonalpropertylimit().sendKeys("5000");
		dg.getUpdatebuilding().click();
		dg.getBuildnext().click();
	}
	@Test
	public void qmodifiers()
	{
		Modifiers m=new Modifiers(driver);
		m.getConsiderationspolicy().sendKeys("0.03");
		m.getOverallclick().click();
		m.getModifiersnext().click();
	}
	
	@Test
	public void rriskanalyzis()
	{
		RiskAnalysis r=new RiskAnalysis(driver);
		Select s2=new Select(driver.findElement(By.xpath("//select[@name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-RiskEvaluationPanelSet-UserViewFilter']")));
		s2.selectByIndex(1);
		r.getRisknext().click();
	}
	
	}
	
		
	
     
		
		
		
	
	


