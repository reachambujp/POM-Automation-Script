
package com.automation.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.utility.ExtentReportUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

//launch browser
//enter url
//enter fields value
//click action
//clear field data
//close browser
//refresh browser

public class AutomationBaseTest {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Logger log;
	protected ExtentReportUtility report = ExtentReportUtility.getInstance();

	@BeforeTest
	public void setParamsBeforeTest() {
		log = LogManager.getLogger(AutomationBaseTest.class.getName());
	}

	@AfterMethod
	public void tearDownAfterMethod() {
		driver.quit();
	}

	@BeforeMethod
	@Parameters("browserName")
	public void setBeforeTestMethod(@Optional("chrome") String browName) {
		launchBrowser(browName);

	}

	public void launchBrowser(String browserName) {
		browserName = browserName.toLowerCase();
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			log.info("Chrome broswer opened");
			// report.logTestinfo("Broswer launched");
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			log.info("Edge broswer opened");
			// report.logTestinfo("Broswer launched");

			break;
		}
	}

	public void getURL(String url) {
		driver.get(url);
		log.info("URL launched");
		// report.logTestinfo("URL launched");
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	/*
	 * public static void refreshBrowser(WebDriver driver) { this.driver=driver;
	 * driver.navigate().refresh(); System.out.println("Refresh sucess");
	 * 
	 * }
	 */

}
