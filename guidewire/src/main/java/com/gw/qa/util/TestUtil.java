package com.gw.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.gw.qa.base.ReadExcelSheet;
import com.gw.qa.base.TestBase;

public class TestUtil extends TestBase {

	
	// Data Provider utility is used for reading data from excel... should be used
	// @DataProvider
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;

		try {
			file = new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;
	}

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new ReadExcelSheet(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\gw\\qa\\testdata\\PCTestDataSheet.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("PC_AccountCreation"); rowNum++) {
   
			String accountType = reader.getCellData("PC_AccountCreation", "Account Type", rowNum);
			
			String accountName = reader.getCellData("PC_AccountCreation", "Account Name", rowNum);
			String firstName = reader.getCellData("PC_AccountCreation", "First Name", rowNum);
			String lastName = reader.getCellData("PC_AccountCreation", "Last Name", rowNum);
			String companyName = reader.getCellData("PC_AccountCreation", "Company Name", rowNum);
			String createAccount = reader.getCellData("PC_AccountCreation", "Create New Account", rowNum);
			String accountCounter = reader.getCellData("PC_AccountCreation", "AccountCounter", rowNum);
			String homePhone = reader.getCellData("PC_AccountCreation", "Home Phone", rowNum);
			String primaryPhone = reader.getCellData("PC_AccountCreation", "Primary Phone", rowNum);
			String primaryEmail = reader.getCellData("PC_AccountCreation", "Primary Email", rowNum);

			String country = reader.getCellData("PC_AccountCreation", "Country", rowNum);
			String address1 = reader.getCellData("PC_AccountCreation", "Address 1", rowNum);
			String address2 = reader.getCellData("PC_AccountCreation", "Address 2", rowNum);
			String city = reader.getCellData("PC_AccountCreation", "City", rowNum);
			String state = reader.getCellData("PC_AccountCreation", "State", rowNum);
			String zipCode = reader.getCellData("PC_AccountCreation", "Zipcode", rowNum);

			String addressType = reader.getCellData("PC_AccountCreation", "Address Type", rowNum);
			String organization = reader.getCellData("PC_AccountCreation", "Organization", rowNum);
			String producerCode = reader.getCellData("PC_AccountCreation", "Producer Code", rowNum);
			String officePhone = reader.getCellData("PC_AccountCreation", "Office Phone", rowNum);
			String name = reader.getCellData("PC_AccountCreation", "Name", rowNum);

			
			Object obj[] = { accountType, accountName, firstName, lastName, companyName, createAccount, accountCounter,
					homePhone, primaryPhone, primaryEmail, country, address1, address2, city, state, zipCode,
					addressType, organization, producerCode, officePhone, name };
			myData.add(obj);

		}

		return myData;

	}

	public void waitForElement(WebDriver driver, int TimeOutInSeconds, WebElement Element) {

		WebDriverWait wait = new WebDriverWait(driver, TimeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	// Extent Report
	public static String getSystemDate() {
		DateFormat dateFormate = new SimpleDateFormat("_ddMMyyy_HHmmss");
		Date date = new Date();
		return dateFormate.format(date);
	}

	// Extent reports - failed screenshots
	public static String getScreenShotForReports(String screenshotName, WebDriver driver) throws IOException {
		String dateFormate = new SimpleDateFormat("_ddMMyyy_HHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/FailedTestScreenShot/" + screenshotName + dateFormate
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;

	}

	// Extent Report-2
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		// We have generated Date now.
		String dateName = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// After execution, you could see a folder "FailedTestsScreenshots"
		// Under Source folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public static void setDateForLog4j() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("_ddMMyyyy_HHmmss");
		System.setProperty("current_date", dateFormat.format(new Date()));
		PropertyConfigurator.configure("./src/main/resources/log4j.properties");
	}

	// Screenshot Generic Function
	public static void takeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/Screenshots/" + System.currentTimeMillis() + ".png"));
	}

	// capture screenshots in word document
	public void captureScreenShotInWord() {

		try {

			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			File filePath = new File(System.getProperty("user.dir") + "/Images/");
			XWPFDocument docx = new XWPFDocument();
			FileOutputStream out = new FileOutputStream(System.getProperty("user.dir") + "/wordImages/"
					+ getClass().getName() + "_" + formater.format(calendar.getTime()) + ".docx");
			for (File file : filePath.listFiles()) {

				if (file.getName().endsWith(".png")) {
					XWPFRun run = docx.createParagraph().createRun();
					InputStream pic = new FileInputStream(file.getAbsolutePath());
					run.addBreak();
					run.addPicture(pic, XWPFDocument.PICTURE_TYPE_PNG, file.getName(), Units.toEMU(450),
							Units.toEMU(450));
					pic.close();
					file.delete();

				}
			}
			docx.write(out);
			out.flush();
			out.close();
			docx.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String captureScreenshot(WebDriver driver,String testName) {
		String currentDateAndTime = new Date().toString().replaceAll(":", "_");
		String dest=System.getProperty("user.dir") + "\\Screenshots\\"+testName+currentDateAndTime+".png";
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File(dest);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dest;
	}

}
