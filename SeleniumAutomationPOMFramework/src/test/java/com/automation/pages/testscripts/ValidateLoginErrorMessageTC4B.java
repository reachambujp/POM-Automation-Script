package com.automation.pages.testscripts;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.AutomationBaseTest;
import com.automation.pages.LoginPage;
import com.automation.utility.AutomationConstants;
import com.automation.utility.PropertiesUtility;

public class ValidateLoginErrorMessageTC4B extends AutomationBaseTest  {
	
	PropertiesUtility propUtil = new PropertiesUtility();
	
	@Test
	public void testValidateLoginError() {
		
		Properties appDataProperties = propUtil.loadPropFile(AutomationConstants.APP_DATA_PROPERTIES_FILE_PATH);
		getURL(appDataProperties.getProperty("app.url"));
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterWrongUserName(appDataProperties.getProperty("invalid.userid"));
		loginPage.enterWrongPasswordName(appDataProperties.getProperty("invalid.password"));
		loginPage.performLogin();
		
		//Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		

		WebElement errorMessage=driver.findElement(By.xpath("//*[@id=\"error\"]"));
		String expectedErrorMessage = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actualErrorMessage = errorMessage.getText();
		
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
		log.info("Test Passed");
		
		
		
		
	}

}
