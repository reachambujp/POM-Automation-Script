package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.pages.base.BasePage;

public class LoginPage extends BasePage{
	
	
	@FindBy(xpath = "//input[@id='username']") WebElement userNameElement;
	@FindBy(xpath = "//input[@id='password']") WebElement passwordNameElement;
	@FindBy(xpath = "//input[@id='rememberUn']") WebElement clickRememberChkBox;
	@FindBy(xpath = "//input[@id='Login']") WebElement clickLoginButton;
	@FindBy(xpath = "//a[@id='forgot_password_link']")WebElement forgetYourPassword;
	@FindBy(id = "un") WebElement resetUserName;
	@FindBy(id = "continue" ) WebElement continueButton;
	@FindBy(xpath = "//input[@id='username']") WebElement wrongUserNameElement;
	@FindBy(xpath = "//input[@id='password']") WebElement wrongPasswordNameElement;
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUserName(String userName) {
		
		enterTextValue(userNameElement,userName,"userNameElement");
		log.info("Entered enterUserName");
		//report.logTestinfo("Entered Username");
	}
	public void enterPassword(String password) {
		
		enterTextValue(passwordNameElement,password,"passwordNameElement");
		log.info("Entered enterPassword");
		//report.logTestinfo("Entered Password");
	}
	public void selectRememberMe() {
		
		clickAction(clickRememberChkBox,"clickRememberChkBox");
		log.info("Entered selectRememberMe");
		//report.logTestinfo("Entered selectRememberMe");
	}
	public WebDriver performLogin() {
		log.info("Entered performLogin");
		clickAction(clickLoginButton,"clickLoginButton");
		log.info("Entered performLogin");
		//report.logTestinfo("Entered performLogin");
		//report.logTestPassed("Passed");
		return driver;
	}
	
	public void forgetYourPasswordField() {
		
		clickAction(forgetYourPassword, "forgetYourPasswordField");
		log.info("Entered forgetYourPasswordField");
		//report.logTestinfo("Entered forgetYourPasswordField");
	}
	
	public void resetUserNameField(String userName) {
		enterTextValue(resetUserName, userName, "Reset UserMenu");
		log.info("Entered Reset UserName Field");
		//report.logTestinfo("Entered Reset UserName Field");
	}
	
	public void clickContinueButton() {
		clickAction(continueButton, "Continue Button");
		log.info("Clicked Continue Button");
		//report.logTestinfo("Clicked Continue Button");
	}
	
	public void enterWrongUserName(String wrongUserName) {
		enterTextValue(wrongUserNameElement, wrongUserName, "WrongUserName");
		log.info("Entered Wrong username");
		
	}
	
	public void enterWrongPasswordName(String wrongPasswordName) {
		enterTextValue(wrongPasswordNameElement, wrongPasswordName, "Wrong Password Name");
		log.info("Entered Wrong password");
		
	}
}
