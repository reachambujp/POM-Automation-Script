package com.automation.pages.testscripts;

import java.util.Properties;

import org.testng.annotations.Test;

import com.automation.base.AutomationBaseTest;
import com.automation.pages.LoginPage;
import com.automation.utility.AutomationConstants;
import com.automation.utility.PropertiesUtility;

public class ForgotYourPasswordTestCase4A extends AutomationBaseTest {
	
	PropertiesUtility propUtil = new PropertiesUtility();
	
	@Test
	public void testForgotPassword() {
		
		Properties appDataProperties = propUtil.loadPropFile(AutomationConstants.APP_DATA_PROPERTIES_FILE_PATH);
		getURL(appDataProperties.getProperty("app.url"));
		
		LoginPage loginPage = new LoginPage(driver);

		loginPage.forgetYourPasswordField();
		loginPage.resetUserNameField(appDataProperties.getProperty("reset.username"));
		loginPage.clickContinueButton();
	}

}
