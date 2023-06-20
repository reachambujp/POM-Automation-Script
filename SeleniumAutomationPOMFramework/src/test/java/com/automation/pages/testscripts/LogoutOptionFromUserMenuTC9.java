package com.automation.pages.testscripts;

import java.util.Properties;

import org.testng.annotations.Test;

import com.automation.base.AutomationBaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utility.AutomationConstants;
import com.automation.utility.PropertiesUtility;

public class LogoutOptionFromUserMenuTC9 extends AutomationBaseTest{
	
	PropertiesUtility propUtil = new PropertiesUtility();
	
	@Test
	public void logoutOptionFromUM() {
		
		Properties appDataProperties = propUtil.loadPropFile(AutomationConstants.APP_DATA_PROPERTIES_FILE_PATH);
		getURL(appDataProperties.getProperty("app.url"));

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterUserName(appDataProperties.getProperty("valid.userid"));
		loginPage.enterPassword(appDataProperties.getProperty("valid.password"));
		loginPage.selectRememberMe();
		driver = loginPage.performLogin();
		
		HomePage homepage=new HomePage(driver);
		homepage.clickUserMenuDD();
		homepage.clicklogOutLabel();
		
		
		
	}

}
