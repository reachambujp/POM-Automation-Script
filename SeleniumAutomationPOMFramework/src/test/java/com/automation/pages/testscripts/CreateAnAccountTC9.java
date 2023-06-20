package com.automation.pages.testscripts;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.AutomationBaseTest;
import com.automation.pages.AccountPage;
import com.automation.pages.LoginPage;
import com.automation.utility.AutomationConstants;
import com.automation.utility.PropertiesUtility;

public class CreateAnAccountTC9 extends AutomationBaseTest {
	
	PropertiesUtility propUtil = new PropertiesUtility();
	
	@Test
	public void createAccount () {
		
		Properties appDataProperties = propUtil.loadPropFile(AutomationConstants.APP_DATA_PROPERTIES_FILE_PATH);
		getURL(appDataProperties.getProperty("app.url"));

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterUserName(appDataProperties.getProperty("valid.userid"));
		loginPage.enterPassword(appDataProperties.getProperty("valid.password"));
		loginPage.selectRememberMe();
		driver = loginPage.performLogin();
		
		AccountPage accountpage = new AccountPage(driver);
		/*String actualAccountPgTitle = accountpage.getPageTitle();
		log.info("Actual Account Page title ="+actualAccountPgTitle);
		Assert.assertEquals(actualAccountPgTitle, appDataProperties.getProperty("accountpage.title"));*/
		
		accountpage.clickAccountPage();
		accountpage.popUpWindow();
		accountpage.clickNewLink();
		accountpage.enterAccountName(appDataProperties.getProperty("account.name"));
		accountpage.selectFromTypeLink();
		accountpage.selectFromCustomerPriority();
		accountpage.saveButton();
		
		
		
		
		
	}

}
