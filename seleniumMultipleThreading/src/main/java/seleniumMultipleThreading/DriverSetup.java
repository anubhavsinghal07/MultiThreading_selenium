package seleniumMultipleThreading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSetup {
	public WebDriver driver;

	// set up the method to initialize driver object
	public WebDriver setUp(String browsertype) throws Exception {

		if (browsertype.contains("IE")) {
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			System.setProperty("WebDriver.ie.driver", "Selenium\\IEDriverServer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
		} else if (browsertype.contains("Firefox")) {
			// System.setProperty("WebDriver.firefox.marionette","Selenium\\geckodriver\\geckodriver.exe");
		} else if (browsertype.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\MyLearnings\\downloads\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		return driver;

	}

	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
