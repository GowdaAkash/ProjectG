package com.gw.qa.actions;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.gw.qa.base.TestBase;

public class GenericMethods extends TestBase {

	// Switching to Frame
	public void switchToFrame() {
		driver.switchTo().frame("");
	}

	// Explicit Wait to Click on any Element
	public void clickOn(WebDriver driver, WebElement element, int timeout) {
		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.click();
	}

	// Explicit Wait for Sending Data to any Element.
	public void sendKeys(WebDriver driver, WebElement element, int timeout,  String value) {
		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.sendKeys(value);
	}
	

	// Highlight the Element using Java Script.
	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", element);
	}

	// Handle Frames with ID
	public void switchToFrame(int frame) {
		try {
			driver.switchTo().frame(frame);
			System.out.println("Navigated to Frame with Id " + frame);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to Locate Frame with Id " + frame + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to Navigate to Frame with Id " + frame + e.getStackTrace());
		}
	}

	// Generic Function to Handle Multiple Windows Or Switch Between Multiple
	// Windows
	public void switchWindow(WebDriver driver, String firstWindow, String secondWindow) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windows : windowHandles) {
			if (!windows.equals(firstWindow) && !windows.equals(secondWindow)) {
				driver.switchTo().window(windows);
			}
		}
	}

	// Scroll to Particular Element
	public static void scrollSpecificElement(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	// Element Display or Not
	public static void displayElement(WebElement element) {
		boolean elementDisplayed = element.isDisplayed();
		if (elementDisplayed) {
			System.out.println("Element is Displayed");
		} else {
			System.out.println("Element is not Displayed");
		}
	}

	// Element is Enable or Not
	public static void enableElement(WebElement element) {
		boolean elementEnabled = element.isEnabled();
		if (elementEnabled) {
			System.out.println("Element is Enabled in Page");
		} else {
			System.out.println("Element is not Enabled in Page");
		}
	}

	// Select Value from Dropdown by using SelectByVisibleTest Method
	public static void selectValueFromDropDownByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	// Select Value from Dropdown by using SelectByIndex Method
	public static void selectValueFromDropDownByIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

	// Select Value from Dropdown by using SelectByValue Method
	public static void selectValueFromDropDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// Print all the Values from Dropdown and Select a Value from Dropdown
	public static void selectDropDownValue(String xpathValue, String value) {
		List<WebElement> monthList = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());

		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
			if (monthList.get(i).getText().equals(value)) {
				monthList.get(i).click();
				break;
			}
		}
	}

	// Function to Accept an Alert Pop-Up
	public static void acceptAlertPopup() throws InterruptedException {
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.accept();
			System.out.println("Alert Accepted Successfully");
		} catch (Exception e) {
			System.out.println("Something Went Wrong -- Please Check" + e.getMessage());
		}
	}

	// Function to Dismiss an Alert Pop-Up
	public static void dismissAlertPopup() throws InterruptedException {
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.dismiss();
			System.out.println("Alert Dismissed Successfully");
		} catch (Exception e) {
			System.out.println("Something Went Wrong -- Please Check" + e.getMessage());
		}
	}

	// Click on Element using Actions Class
	public void clickOnElementUsingActions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	// Method to Click on Element using JavaScript
	public void clickOnElementUsingJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// Method to Match Value with List of Elements and Click on it
	public void clickOnMatchingValue(List<WebElement> listOfElements, String valueToBeMatched) {
		for (WebElement element : listOfElements) {
			if (element.getText().equalsIgnoreCase(valueToBeMatched)) {
				element.click();
				return;
			}
		}
	}

	// Select Calendar Date Or Data Picker Using Java Script Executor
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateValue) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);
	}

	// Function to Mouse Hover and Click Or Select an Element using Actions Class
	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	// Function to Drag and Drop using Actions Class
	public static void dragAndDrop(WebDriver driver, WebElement elementOne, WebElement elementTwo) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(elementOne, elementTwo).release().build().perform();
	}

	// Function to Right Click using Actions Class
	public static void rightClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}

	// Function to Double Click using Actions Class
	public static void doubleClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	// Click on Element Using Java Script
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	// Refresh Browser Using Java Script
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	// Get Title Using Java Script.
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	// Scroll Down the Page Using Java Script
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
