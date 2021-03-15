package com.gw.qa.reportListener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.gw.qa.util.ObjectsRepo;

public class ListenersImplementation extends ObjectsRepo implements ITestListener {

	public void onTestStart(ITestResult result) {
		// creating test name
		test = extent.createTest(result.getMethod().getMethodName());
		ExtentFactory.getInstance().setExtent(test);
	}

	public void onTestSuccess(ITestResult result) {
		// creating pass status
		ExtentFactory.getInstance().getExtent().log(Status.PASS, "Test Case: "+result.getMethod().getMethodName()+ " is Passed.");
		ExtentFactory.getInstance().removeExtentObject();
	}

	public void onTestFailure(ITestResult result) {
		// creating fail status
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+ " is Failed.");
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, result.getThrowable());

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy HH-mm-ss");
		// get current date
		Date date = new Date();
		String actualDate = format.format(date);
		String screenShotPath = System.getProperty("user.dir") + "\\Screenshots\\ExtentReport_" + actualDate + ".jpeg";

		File dest = new File(screenShotPath);
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ExtentFactory.getInstance().getExtent().addScreenCaptureFromPath(screenShotPath, "Test case failure screenshot");
		ExtentFactory.getInstance().removeExtentObject();
		

	}

	public void onTestSkipped(ITestResult result) {
		ExtentFactory.getInstance().getExtent().log(Status.SKIP, "Test Case: "+result.getMethod().getMethodName()+ " is skipped.");
		ExtentFactory.getInstance().removeExtentObject();

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// setup method called
		try {
			extent = ExtentReportNG.setupExtentReport();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void onFinish(ITestContext context) {
		// close extent report
		extent.flush();

	}

}
