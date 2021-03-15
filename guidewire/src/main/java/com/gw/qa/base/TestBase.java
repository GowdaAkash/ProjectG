 package com.gw.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;
import com.gw.qa.util.ObjectsRepo;
import com.gw.qa.util.TestUtil;
import com.gw.qa.util.WebEventListener;

public class TestBase extends ObjectsRepo {

	
	// Config reader definition
	public static void ConfigReader() {
		try {
			File src = new File(System.getProperty("user.dir") + "/src/main/java/com/gw/qa/config/Config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is ==" + e.getMessage());
		}
	}

	// Method to get the URL from config file
	public static String getURL() {
		try {
			File src = new File(System.getProperty("user.dir") + "/src/main/java/com/gw/qa/config/Config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is ==" + e.getMessage());
		}

		String url = pro.getProperty("URL");
		return url;
	}

	public TestBase() {

		try {
			property = new Properties();
			FileInputStream inputStream = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/gw/qa/config/Config.properties");
			property.load(inputStream);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void setLog4j() {
		TestUtil.setDateForLog4j();
	}

	public static void initialization() {
		String browserName = property.getProperty("Browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("WebDriver.ie.driver", System.getProperty("user.dir") + "");
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("WebDriver.firefox.driver", System.getProperty("user.dir") + "");
			driver = new InternetExplorerDriver();
		}

		eDriver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		eDriver.register(eventListener);
		driver = eDriver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
}
