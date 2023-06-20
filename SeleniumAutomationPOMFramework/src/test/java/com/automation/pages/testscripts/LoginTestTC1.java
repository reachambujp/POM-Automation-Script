package com.automation.pages.testscripts;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.AutomationBaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utility.AutomationConstants;
import com.automation.utility.PropertiesUtility;

public class LoginTestTC1 extends AutomationBaseTest {

	PropertiesUtility propUtil = new PropertiesUtility();

	@Test
	public void loginToSalesForceTestScript() {

		Properties appDataProperties = propUtil.loadPropFile(AutomationConstants.APP_DATA_PROPERTIES_FILE_PATH);
		getURL(appDataProperties.getProperty("app.url"));

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterUserName(appDataProperties.getProperty("valid.userid"));
		loginPage.enterPassword(appDataProperties.getProperty("valid.password"));
		loginPage.selectRememberMe();
		driver = loginPage.performLogin();

		HomePage homePage = new HomePage(driver);
		String actualTitle = homePage.getCurrentPageTitle();
		log.info("Home Page title ="+actualTitle);
		Assert.assertEquals(actualTitle, appDataProperties.getProperty("homepage.title"));
		log.info("Before DD Selection");
		homePage.clickUserMenuDD();
		log.info("Before logout");
		homePage.clicklogOutLabel();

	}

}
