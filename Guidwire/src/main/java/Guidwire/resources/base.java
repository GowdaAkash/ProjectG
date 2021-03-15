package Guidwire.resources;




import java.io.FileInputStream; 
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		 prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\EclipseMyWorkSpace\\Guidwire\\src\\main\\java\\Guidwire\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);

		try {
			if (browserName.equals("chrome")) {

				System.setProperty("webdriver.chrome.driver","D:\\GoogleChrome\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserName.equals("firefox")) {

				System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browserName.equals("IE")) {
				System.setProperty("webdriver.ie.driver", "D:\\WebDrivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	
}

