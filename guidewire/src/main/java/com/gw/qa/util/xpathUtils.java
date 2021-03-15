package com.gw.qa.util;

public class xpathUtils {
	
	public static final String pc_url = "http://wsamzn-u3f21gga:8180/pc/PolicyCenter.do";
	
	public static final String userName_xpath = "//input[@name='Login-LoginScreen-LoginDV-username']";
	public static final String passWord_xpath = "//input[@name='Login-LoginScreen-LoginDV-password']";
	public static final String login_Button = "//div[normalize-space()='Log In']";
	public static final String createNewAccount = "//div[@id='TabBar-AccountTab-AccountTab_NewAccount']//div[@class='gw-label'][normalize-space()='New Account']";
	public static final String accountDDIcon = "//div[@id='TabBar-AccountTab']//div[@class='gw-icon gw-icon--expand']";
	
	public static final String companyNameExactMatch="//input[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-CompanyNameExact']";
	public static final String firstName="//input[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName']";
	public static final String LastName="//input[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-LastName']";
	
	public static final String countryainfo="//select[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']";
	public static final String cityainfo="//input[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']";
	public static final String stateinfo="//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']";
	public static final String homephoneainfo="//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']";
	
	public static final String companyName_xpath = "//input[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalContactNameInputSet-Name']";
	public static final String searchButton = "//div[@id='NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
	
	public static final String createNewAccount_Button = "//div[@data-gw-shortcut='{\"id\":\"NewAccount-NewAccountScreen-NewAccountButton\",\"key\":\"A\",\"op\":\"openmenu\",\"panel\":\"C\"}']";
	public static final String newAccountType = "//div[@aria-label='+AccountType+']";
	public static final String newPerson = "//div[normalize-space()='Person']";
	
	public static final String officePhone = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']";
	public static final String fax = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']";
	public static final String primaryEmail = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-EmailAddress1']";
	public static final String secondaryEmail = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-EmailAddress2']";
	public static final String coundryDropdown = "//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']";
	public static final String address1 = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']";
	public static final String address2 = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']";
	public static final String address3 = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']";
	public static final String city = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']";
	public static final String cityOverrideIcon = "//div[@id='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon']//span[@class='gw-icon gw-svg-icon gw-svg-icon-autofill gw-font-icon']";
	public static final String country = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']";
	public static final String stateDropdown = "//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']";
	public static final String zipCode = "//input[@placeholder='#####-####']";
	public static final String addressType = "//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressType']";
	public static final String description = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressDescription']";
	public static final String organizationType = "//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-OrgType']";
	public static final String descOfBusiness = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-DescriptionOfBusiness']";
	public static final String fein = "//input[@placeholder='##-#######']";
	public static final String accountNickName = "//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-Nickname']";
	public static final String preferredLanguage = "//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-PrimaryLanguage']";
	public static final String industryCodeSearch = "//div[@id='CreateAccount-CreateAccountScreen-CreateAccountDV-IndustryCode-SelectIndustryCode']//span[@class='gw-icon']";
	public static final String industryCode = "//input[@name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-Code']";
	public static final String industryClassification = "//input[@name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-Classification']";
	public static final String industrySeachButton = "//div[@id='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
	public static final String selectButton = "//div[normalize-space()='Select']";
	public static final String organizationSeachIcon = "//div[@id='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer-SelectOrganization']//span[@class='gw-icon']";
	public static final String organizationName = "//input[@name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-GlobalContactNameInputSet-Name']";
	public static final String organizationSearchButton = "//div[@id='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
	public static final String ProducerCodeDropdown = "//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-ProducerCode']";
	public static final String updateButton = "//div[@data-gw-shortcut='{\"id\":\"CreateAccount-CreateAccountScreen-ForceDupCheckUpdate\",\"key\":\"U\",\"op\":\"fireevent\",\"panel\":\"C\"}']//div[@class='gw-label']";
	
	public static final String accountnumber="//div[@id='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountNumber']";
	public static final String newcompany="//div[@aria-label='Company']";
	public static final String policytab="//div[@id='TabBar-PolicyTab']//div[@class='gw-icon gw-icon--expand']";
	public static final String newsubmissiontab="//div[@data-gw-shortcut='{\"id\":\"AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission\",\"key\":\"B\",\"op\":\"fireevent\",\"panel\":\"W\"}']//div[@class='gw-label']";
	public static final String accountstatus="//div[@id='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountStatus']";
	public static final String actionstab="//div[@id='AccountFile-AccountFileMenuActions']//div[@class='gw-action--inner']";
    public static final String summarytab="//div[@class='gw-action--inner']//div[@class='gw-label gw-hasIcon'][normalize-space()='Summary']";
    public static final String accounttab="//div[@id='TabBar-AccountTab']//div[@class='gw-icon gw-icon--expand']";
    public static final String accountnumbersearch="//input[@name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']";
  
    public static final String accountnumbersearchicon="//div[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']//span[@class='gw-icon']";
    public static final String desktoptab="//div[@data-gw-shortcut='{\"id\":\"TabBar-DesktopTab\",\"key\":\"K\",\"op\":\"openmenu\",\"panel\":\"N\"}']//div[@class='gw-label']";
    public static final String accounttabbar="//div[@data-gw-shortcut='{\"id\":\"TabBar-AccountTab\",\"key\":\"C\",\"op\":\"openmenu\",\"panel\":\"N\"}']//div[@class='gw-label']";
    public static final String quotetype="//select[@name='NewSubmission-NewSubmissionScreen-ProductSettingsDV-QuoteType']";
    public static final String personalauto="//div[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-8-addSubmission']";

    public static final String offeringselectionn="//select[@name='SubmissionWizard-OfferingScreen-OfferingSelection']";
    public static final String next="//div[normalize-space()='Next']";		
}