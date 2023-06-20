package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class MyProfilePage extends BasePage  {
	

	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[1]")WebElement myProfile;
	//@FindBy(id= "moderatorMutton") WebElement moderatorLink ;
	@FindBy(xpath = "//a[@title='User Action Menu']") WebElement moderatorLink ;
	
	@FindBy(xpath = "//*[@id=\"chatterTab\"]/div[1]/div/div[1]/div[1]/div/ul/li[2]/a") WebElement editProfileLink;
	@FindBy(xpath = "//*[@id=\"aboutTab\"]/a") WebElement aboutTab;
	@FindBy(id = "lastName") WebElement lastNameEle;
	@FindBy(xpath="//input[@value='Save All']") WebElement saveAllEle;
	@FindBy(id="profileTab_sfdc.ProfilePlatformFeed")WebElement feedTab;
	@FindBy(xpath = "//*[@id=\"publisherAttachTextPost\"]/span[1]") WebElement postLink;
	@FindBy(xpath="//*[@id=\"cke_43_contents\"]/iframe")WebElement postContent ;
	@FindBy(id = "publishersharebutton")WebElement shareButton;
	@FindBy(xpath="//*[@id=\"publisherAttachContentPost\"]/span[1]")WebElement fileUpload;
	@FindBy(id="chatterUploadFileAction")WebElement chatterUploadFile;
	@FindBy(id="chatterFile")WebElement chatterFile;
	@FindBy(id="publishersharebutton")WebElement shareUploadButton;
	
	public MyProfilePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickMyProfile() {
		clickAction(myProfile,"MyProfile");
		//waitElementToBeClickable(myProfile, "myprofileuserdrpdwn ");
		
	}
	
	public void clickModeratorField(){		
		try {
		Thread.sleep(3000);
		clickAction(moderatorLink, "Moderator Link");
		//fluentWaitForVisibility(moderatorLink, "moderatorLink");
		log.info("Clicked Moderator link");
		}catch(Exception ex) {
			log.error("Error occured while clicking moderator field");
		}
	}
	
	public void clickEditProfileLink() {
		clickAction(editProfileLink, "Edit Profile");
		//fluentWaitForVisibility(editProfileLink, "editProfileLink");
		log.info("Clicked Edit Profile link");
		
	}
	
	public void clickAboutTab() {
		
		switchFrame("aboutMeContentId");
		
		clickAction(aboutTab, "aboutTab");
		log.info("Clicked AboutTab");
	}
	
	public void enterLastName(String lastName) {
		enterTextValue(lastNameEle, lastName, "LastName");
		fluentWaitForVisibility(lastNameEle, "lastNameEle");
		log.info("Update lastname");	
		
	}
	
	public void clickSaveAll() {
		clickAction(saveAllEle, "Save All");
		log.info("clicked save all button");
		
	}
	
	public void clickFeedTab() {
		clickAction(feedTab, "Feed Tab");
		log.info("clicked FeedTab");
	}
	
	public void clickPostLink() {
		clickAction(postLink, "Post Link");
		log.info("clicked Post Link");
		
	}
	
	public void clickPostContent() {
		clickAction(postContent, "Post Content");
		performAction("Hello World");
		log.info("Action perform");
	}

	public void clickShareButton() {
		clickAction(shareButton, "Share Button");
		log.info("Post content sucessful");
	}
	
	public void clickfileUpload() {
		clickAction(fileUpload, "FileUpload");
		log.info("File uploaded sucessful");
		
	}
	
	public void chatterUpload() {
		clickAction(chatterUploadFile, "Chatter Uploaded");
		log.info("chatterUploadFile clicked");
		
	}
	
	public void clickChatterFile() {
		
		enterTextValue(chatterFile, "C:\\Users\\manis\\OneDrive\\Desktop\\heart1.png", "chatterFile");
	}
	
	public void clickShareUpload() {
		clickAction(shareUploadButton, "Upload File");
		getScreenShotOfThePage();
		log.info("File upload sucessful");
		
	}
	
	
	public String getCurrentPageTitle() {
		return getPageTitle();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}
