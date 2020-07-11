package seleniumMultipleThreading;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class TestCases {
	WebDriver driver;

	public TestCases(WebDriver driver) {
		this.driver = driver;
	}

	public void testGoogleSearch(String URL) throws Exception {

		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String actualtitle = driver.getTitle();
		String expectedTitle = "Google";
		if (actualtitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("The expected title matched" + " " + LocalDateTime.now());
		} else {
			System.out.println(" Actual: '" + actualtitle + "' But Expected: '" + expectedTitle + "' ");

		}
	}
}
