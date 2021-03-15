package com.gw.qa.util;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.gw.qa.base.ReadExcelSheet;

public class ObjectsRepo {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static EventFiringWebDriver eDriver;
	public static WebEventListener eventListener;
	public static Properties prop;
	public static String centerName;
	public static ChromeOptions chromeOptions;
	public static Properties property;
	public static Logger Log;
	String configReader = "config//config.properties";
	public static Properties pro;
	
	public static ReadExcelSheet reader;
	public static Workbook book;
	public static Sheet sheet;


}
