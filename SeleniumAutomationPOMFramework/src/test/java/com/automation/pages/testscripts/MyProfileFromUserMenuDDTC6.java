package com.automation.pages.testscripts;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.AutomationBaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.MyProfilePage;
import com.automation.utility.AutomationConstants;
import com.automation.utility.PropertiesUtility;

public class MyProfileFromUserMenuDDTC6 extends AutomationBaseTest {
	
	PropertiesUtility propUtil = new PropertiesUtility();
	
	@Test
	public void testMyProfile() {
		
		Properties appDataProperties = propUtil.loadPropFile(AutomationConstants.APP_DATA_PROPERTIES_FILE_PATH);
		getURL(appDataProperties.getProperty("app.url"));
		
        LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName(appDataProperties.getProperty("valid.userid"));
		loginPage.enterPassword(appDataProperties.getProperty("valid.password"));
		driver = loginPage.performLogin();
		
		
		HomePage homePage = new HomePage(driver);
		String actualTitle = homePage.getCurrentPageTitle();
		log.info("Home Page title ="+actualTitle);
		Assert.assertEquals(actualTitle, appDataProperties.getProperty("homepage.title"));
		driver = homePage.clickUserMenuDD();
		
		String menuText= homePage.getMenuTxt();
	    log.info(menuText);
		
		MyProfilePage myProfile=new MyProfilePage(driver);	
		/*String actualProfilePgTitle = myProfile.getCurrentPageTitle();
		log.info("Actual Profile Page title ="+actualProfilePgTitle);
		Assert.assertEquals(actualProfilePgTitle, appDataProperties.getProperty("profilepage.title"));*/
		
		myProfile.clickMyProfile();		
		myProfile.clickModeratorField();
		myProfile.clickEditProfileLink();
		myProfile.clickAboutTab();
		myProfile.enterLastName(appDataProperties.getProperty("update.profile.lastname"));
		myProfile.clickSaveAll();
		myProfile.clickFeedTab();
		myProfile.clickPostLink();
		myProfile.clickPostContent();
		myProfile.clickShareButton();
		myProfile.clickfileUpload();
		myProfile.chatterUpload();
		myProfile.clickChatterFile();
		myProfile.clickShareUpload();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
