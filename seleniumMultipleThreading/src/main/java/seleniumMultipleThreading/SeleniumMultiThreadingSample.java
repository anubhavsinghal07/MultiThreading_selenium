package seleniumMultipleThreading;

import java.time.LocalDateTime;


import org.openqa.selenium.WebDriver;

public class SeleniumMultiThreadingSample extends Thread {

	private WebDriver driver;
	private String Url;
	private String browsertype;

	public SeleniumMultiThreadingSample(String name, String browsertype) {

		super(name); // Thread class constructor that takes a String argument creates a Thread with a specific name
		this.browsertype = browsertype;
		// System.out.println( Thread.currentThread().getState());
	}

	@Override
	public void run() {
		System.out.println("Thread- Started" + Thread.currentThread().getName() + " " + LocalDateTime.now()
				+ " Thraed Status: " + Thread.currentThread().getState());
		try {

			// Thread.sleep(1000);
			DriverSetup obj1 = new DriverSetup();
			obj1.setUp(browsertype);
			TestCases obj = new TestCases(obj1.driver);
			obj.testGoogleSearch("https://www.google.co.in");
			obj1.tearDown();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}